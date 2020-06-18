package com.playsafe.springconvertassignment.controllers;

import com.playsafe.springconvertassignment.services.ConversionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ap/converter")
public class ConversionController {

    private final ConversionService conversionService;

    public ConversionController(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @GetMapping("/kelvin_to_celsius/{kelvin}")
    public String calculateKelvinToCelsius(@PathVariable Double kelvin){
        Double celsius = conversionService.kelvinToCelsius(kelvin);
        return kelvin + " K = " + celsius + " °C";
    }

    @GetMapping("/pounds_to_kilos/{pounds}")
    public String calculatePoundsToKilos(@PathVariable Double pounds){
        Double kilograms = conversionService.poundsToKilos(pounds);
        return pounds + " lb " +  kilograms + " kg";
    }

    @GetMapping("/miles_to_km/{miles}")
    public String calculateMilesToKm(@PathVariable Double miles){
        Double kilometres = conversionService.milesToKm(miles);
        return miles + " miles = " + kilometres + " km";
    }

}
