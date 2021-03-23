package com.keonetc.mongodbRestAPI;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface employeeRepository extends MongoRepository<employee, Integer> {
}
