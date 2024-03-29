package com.learning.microservices.limitapi.controller;

import com.learning.microservices.limitapi.bean.Limits;
import com.learning.microservices.limitapi.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController public class LimitsController {

    @Autowired private Configuration configuration;

    @GetMapping("/limits") public Limits retrieveLimits() {
      //return new Limits(1, 1000);
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}
