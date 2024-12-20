package com.aluracursos.challerger.controller;

import com.aluracursos.challerger.service.ConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ConversionController {

    private final ConversionService conversionService;

    @Autowired
    public ConversionController(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @GetMapping("/convert")
    public double convert(@RequestParam String from, @RequestParam String to, @RequestParam double amount) {
        return conversionService.convert(from, to, amount);
    }
}
