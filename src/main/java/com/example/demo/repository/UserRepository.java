package com.example.demo.repository;

import com.example.demo.pojo.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository     // spring bean
public interface UserRepository extends CrudRepository<User, Integer> {
}
