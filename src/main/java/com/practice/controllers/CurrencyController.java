package com.practice.controllers;

import com.practice.model.Currency;
import com.practice.repo.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/currency")
public class CurrencyController {

    @Autowired
    private CurrencyRepository currencyRepository;

    @GetMapping
    public String main(Map<String, Object> model){
        Iterable<Currency> currencies = currencyRepository.findAll();
        model.put("currencies", currencies);
        return "main";
    }
    @PostMapping
    public String add(@RequestParam int ID, @RequestParam String CharCode,
                      @RequestParam String Name, @RequestParam int Nominal,
                      @RequestParam int Value, Map<String, Object> model){
        Currency currency = new Currency(ID, CharCode, Name, Nominal, Value);

        currencyRepository.save(currency);

        Iterable<Currency> currencies = currencyRepository.findAll();
        model.put("currencies", currencies);

        return "main";
    }
}
