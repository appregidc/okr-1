package com.odm.okr.entity;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ObjectiveEntity {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  private String description;
  private Long organizationId;
  private Long parentId;
  private String status;
  private Long createdBy;
  private Instant created;
  private Long updatedBy;
  private Instant updated;
}