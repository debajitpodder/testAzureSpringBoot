package com.example.demotest.domain.repository;

import com.example.demotest.domain.entity.Authors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AuthorsRepo extends JpaRepository<Authors, Long> {

}

