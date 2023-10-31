package com.system.exchange.Repositories;



import com.system.exchange.model.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<Currency, String> {

	Currency findByCurrencyCode(String toCurrency);
    // You can add custom query methods if needed
}

