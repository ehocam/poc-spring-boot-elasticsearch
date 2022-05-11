# poc-spring-boot-elasticsearch
Demo for Spring Boot and ElasticSearch

# Setup
- You can clone this repository in your computer or enter docker-compose directory: https://github.com/ehocam/docker-elk
- In main directory, you should run below command.
```
docker compose up -d
```
- You can access kibana via browser : http://localhost:5601
  - UserName : elastic
  - Password : Aa123456

# Upload Sample Data

- Once you open kibana page (http://localhost:5601/app/home#/tutorial_directory/fileDataViz) you can upload sample data in project (MOCK_DATA.csv)

That's All.

- Sample Export Url : http://localhost:8080/first_name
- Sample 2 Export Url : http://localhost:8080/first_name_2
