package com.odm.okr.repository;

import com.odm.okr.entity.KrEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface KrRepository extends JpaRepository<KrEntity, Long> {
  
}