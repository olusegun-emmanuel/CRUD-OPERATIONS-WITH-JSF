package com.tcs.assignment2.repository;


import com.tcs.assignment2.entity.SkillEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository<SkillEntity, Long> {
}
