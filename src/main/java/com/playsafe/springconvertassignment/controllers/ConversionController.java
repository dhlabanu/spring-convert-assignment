package com.playsafe.springconvertassignment.controllers;

import com.playsafe.springconvertassignment.services.ConversionService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.DecimalMin;

@Validated
@RestController
@RequestMapping("/api/converter")
public class ConversionController {

    private final ConversionService conversionService;

    public ConversionController(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    // No negative temperature in Kelvin
    @GetMapping("/kelvin_to_celsius/{kelvin}")
    public String calculateKelvinToCelsius(@PathVariable @DecimalMin("0.0") Double kelvin){
        Double celsius = conversionService.kelvinToCelsius(kelvin);
        return kelvin + " K = " + celsius + " °C";
    }

    @GetMapping("/pounds_to_kilos/{pounds}")
    public String calculatePoundsToKilos(@PathVariable @DecimalMin("0.0") Double pounds){
        Double kilograms = conversionService.poundsToKilos(pounds);
        return pounds + " lb = " +  kilograms + " kg";
    }

    @GetMapping("/miles_to_km/{miles}")
    public String calculateMilesToKm(@PathVariable @DecimalMin("0.0") Double miles){
        Double kilometres = conversionService.milesToKm(miles);
        return miles + " miles = " + kilometres + " km";
    }

}
