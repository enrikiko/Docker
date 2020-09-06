package com.eramos.mongodb.springwebmongodb.repository;

import com.eramos.mongodb.springwebmongodb.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UsersRepository extends MongoRepository<Users,  Integer> {
}
