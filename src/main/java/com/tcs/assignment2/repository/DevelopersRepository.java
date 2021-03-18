package com.tcs.assignment2.repository;

import com.tcs.assignment2.entity.DeveloperEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevelopersRepository extends JpaRepository<DeveloperEntity, Long> {

}
