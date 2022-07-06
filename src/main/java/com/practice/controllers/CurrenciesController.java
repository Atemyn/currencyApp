package com.practice.controllers;

import com.practice.dao.CurrencyDAO;
import com.practice.model.Currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/currencies")
public class CurrenciesController {
    private final CurrencyDAO currencyDAO;

    @Autowired
    public CurrenciesController(CurrencyDAO currencyDAO) {
        this.currencyDAO = currencyDAO;
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("currency", currencyDAO.index());
        return "people/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("currency", currencyDAO.show(id));
        return "currencies/show";
    }

    @GetMapping("/new")
    public String newCurrency(@ModelAttribute("currency") Currency currency) {
        return "currencies/new";
    }

    @PostMapping()
    public String create(@ModelAttribute("currency") @Valid Currency currency,
                         BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "currencies/new";

        currencyDAO.save(currency);
        return "redirect:/currencies";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id) {
        currencyDAO.delete(id);
        return "redirect:/currencies";
    }
}
