package com.practice.controllers;

import com.practice.model.Currency;
import com.practice.repo.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping("currency")
public class CurrencyController {

    @Autowired
    private CurrencyRepository currencyRepository;

    @PostMapping
    public String add(@RequestParam String Name, @RequestParam String date, Map<String, Object> model){
        return
    }
}
