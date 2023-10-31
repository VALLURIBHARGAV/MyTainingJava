package com.system.exchange.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.system.exchange.model.Currency;
import com.system.exchange.services.CurrencyService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/currencies")
public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

    @GetMapping
    public List<Currency> getAllCurrencies() {
        return currencyService.getAllCurrencies();
    }

    @GetMapping("/{code}")
    public Optional<Currency> getCurrencyByCode(@PathVariable String code) {
        return currencyService.getCurrencyByCode(code);
    }

    @PostMapping
    public Currency createCurrency(@RequestBody Currency currency) {
        return currencyService.createCurrency(currency);
    }

    @PutMapping
    public Currency updateCurrency(@RequestBody Currency currency) {
        return currencyService.updateCurrency(currency);
    }

    @DeleteMapping("/{code}")
    public void deleteCurrency(@PathVariable String code) {
        currencyService.deleteCurrency(code);
    }
}
