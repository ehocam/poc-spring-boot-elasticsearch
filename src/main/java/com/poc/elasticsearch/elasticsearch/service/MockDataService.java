package com.poc.elasticsearch.elasticsearch.service;

import com.poc.elasticsearch.elasticsearch.model.MockModel;
import com.poc.elasticsearch.elasticsearch.repository.MockDataRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public record MockDataService(MockDataRepository mockDataRepository) {

    public Page<MockModel> findByFirstName(String name, Pageable pageable) {
        return mockDataRepository.findByFirstName(name, pageable);
    }

    public Page<MockModel> findByFirstNameContaining(String name, Pageable pageable) {
        return mockDataRepository.findByFirstNameContaining(name, pageable);
    }

}
