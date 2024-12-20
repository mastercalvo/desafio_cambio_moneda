package com.aluracursos.challerger.controller;

import com.aluracursos.challerger.service.ExchangeRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class ExchangeRateController {

    @Autowired
    private ExchangeRateService exchangeRateService;

    @GetMapping("/exchange-rate/{baseCurrency}")
    public Map<String, Object> getExchangeRate(@PathVariable String baseCurrency) {
        return exchangeRateService.getExchangeRates(baseCurrency);
    }
}
