package com.odm.okr.repository;

import com.odm.okr.entity.ObjectiveEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ObjectiveRepository extends JpaRepository<ObjectiveEntity, Long> {
  
}