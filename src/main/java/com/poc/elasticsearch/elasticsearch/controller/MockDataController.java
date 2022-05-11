package com.poc.elasticsearch.elasticsearch.controller;

import com.poc.elasticsearch.elasticsearch.model.MockModel;
import com.poc.elasticsearch.elasticsearch.service.MockDataService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public record MockDataController(MockDataService mockDataService) {

    @RequestMapping("/first_name")
    @ResponseBody
    public Page<MockModel> first_name() {
       return mockDataService.findByFirstName("Nels", PageRequest.of(0, 10));
    }

    @RequestMapping("/first_name_2")
    @ResponseBody
    public Page<MockModel> findByFirstNameContaining() {
        return mockDataService.findByFirstNameContaining("a", PageRequest.of(0, 100));
    }
}
