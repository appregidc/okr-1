package com.odm.okr.entity;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class KrEntity {
  @Id
  private Long id;
  private String description;
  private String baseline;
  private String majorInitiatives;
  private Integer score;
  private Long objectiveId;
  private Long createdBy;
  private Instant created;
  private Instant updated;
  private Long updatedBy;
  private String status;
}