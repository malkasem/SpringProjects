package com.springsApplications.simpleApplication.repositories;

import com.springsApplications.simpleApplication.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AutherRepository extends CrudRepository<Author, Long> {
}
