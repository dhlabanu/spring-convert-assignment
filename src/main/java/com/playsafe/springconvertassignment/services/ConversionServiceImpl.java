package com.playsafe.springconvertassignment.services;

import org.springframework.stereotype.Service;

@Service
public class ConversionServiceImpl implements ConversionService {

    @Override
    public Double kelvinToCelsius(Double kelvin) {
        return kelvin - 273.15F;
    }

    @Override
    public Double poundsToKilos(Double pounds) {
        return pounds * 0.454;
    }

    @Override
    public Double milesToKm(Double miles) {
        return miles * 1.60934;
    }
}
