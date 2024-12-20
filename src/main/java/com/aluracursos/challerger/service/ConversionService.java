package com.aluracursos.challerger.service;

import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class ConversionService {

    private final ExchangeRateService exchangeRateService;

    public ConversionService(ExchangeRateService exchangeRateService) {
        this.exchangeRateService = exchangeRateService;
    }

    public double convert(String fromCurrency, String toCurrency, double amount) {
        Map<String, Object> rates = exchangeRateService.getExchangeRates(fromCurrency);
        Map<String, Double> conversionRates = (Map<String, Double>) rates.get("conversion_rates");
        double rate = conversionRates.get(toCurrency);
        return amount * rate;
    }
}
