package com.example.demotest.domain.repository;


import com.example.demotest.domain.entity.Publishers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublishersRepo extends JpaRepository<Publishers, Long> {
}
