package com.java.treinamento.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.treinamento.model.Currency;
import com.java.treinamento.repository.CurrencyRepository;

@Service
public class CurrencyService {
	
	@Autowired
	private CurrencyRepository currencyRepositoory;

	public List<Currency> findAll() {
		// TODO Auto-generated method stub
		return currencyRepositoory.findAll();
	}

	public Optional<Currency> findById(Integer id) {
		// TODO Auto-generated method stub
		return currencyRepositoory.findById(id);
	}

}