package com.practice.controllers;

import com.practice.repo.DayCurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DayCurrencyController {
    @Autowired
    private DayCurrencyRepository dayCurrencyRepository;
}
