package com.odm.okr.repository;

import java.util.Collection;

import com.nytimes.spg.okr.server.model.Kr;
import com.nytimes.spg.okr.server.model.Objective;
import com.odm.okr.entity.ObjectiveEntity;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ObjectiveRepository extends JpaRepository<ObjectiveEntity, Long> {
  
}