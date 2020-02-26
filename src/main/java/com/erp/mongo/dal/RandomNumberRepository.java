package com.erp.mongo.dal;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.erp.mongo.model.RandomNumber;



@Repository
public interface RandomNumberRepository extends MongoRepository<RandomNumber, String> {
}


