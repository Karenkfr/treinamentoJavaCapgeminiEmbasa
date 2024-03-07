package com.java.treinamento.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.treinamento.model.Currency;
import com.java.treinamento.service.CurrencyService;

@RestController
@RequestMapping("/currencies")
public class CurrencyController {

	@Autowired
	private CurrencyService currencyService;
	
	@GetMapping
	public ResponseEntity<List<Currency>> findAll(){return ResponseEntity.ok(currencyService.findAll());}

	@GetMapping("/{id}")
	public ResponseEntity<Optional<Currency>> findById(@PathVariable Integer id){
		Optional<Currency> currency = currencyService.findById(id);
		return currency != null ? ResponseEntity.ok(currency) : ResponseEntity.notFound().build();
	}
}
