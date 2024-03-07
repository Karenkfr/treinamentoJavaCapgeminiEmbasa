package com.java.treinamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.treinamento.model.Currency;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {

}
