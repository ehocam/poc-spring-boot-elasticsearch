package com.poc.elasticsearch.elasticsearch.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

@Document(indexName = "mock_data")
public class MockModel {

    @Id
    @Field("id")
    public String id;

    @Field("first_name")
    public String firstName;

    @Field("last_name")
    public String lastName;

    @Field("email")
    public String email;

    @Field("gender")
    public String gender;

    @Field("ip_address")
    public String ipAddress;

    @Field("country")
    public String country;

    @Field(name = "create_date")
    public String createDate;

    @Field(name = "update_date")
    public String updateDate;
}
