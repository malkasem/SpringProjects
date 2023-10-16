package com.springsApplications.simpleApplication.repositories;

import com.springsApplications.simpleApplication.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
