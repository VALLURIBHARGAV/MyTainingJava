package com.system.exchange.services;

import com.system.exchange.Repositories.CurrencyRepository;
import com.system.exchange.model.Currency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CurrencyService {

    @Autowired
    private CurrencyRepository currencyRepository;

    public List<Currency> getAllCurrencies() {
        return currencyRepository.findAll();
    }

    public Optional<Currency> getCurrencyByCode(String code) {
        return currencyRepository.findById(code);
    }

    public Currency createCurrency(Currency currency) {
        return currencyRepository.save(currency);
    }

    public Currency updateCurrency(Currency currency) {
        return currencyRepository.save(currency);
    }

    public void deleteCurrency(String code) {
        currencyRepository.deleteById(code);
    }
}
