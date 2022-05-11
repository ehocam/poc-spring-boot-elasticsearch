package com.poc.elasticsearch.elasticsearch.repository;

import com.poc.elasticsearch.elasticsearch.model.MockModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MockDataRepository extends ElasticsearchRepository<MockModel, String> {

    Page<MockModel> findByFirstName(String name, Pageable pageable);

    Page<MockModel> findByFirstNameContaining(String name,Pageable pageable);

}
