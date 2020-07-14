package com.odm.okr.resource;

import javax.validation.Valid;

import com.nytimes.spg.okr.server.api.KrApi;
import com.nytimes.spg.okr.server.model.Kr;
import org.modelmapper.ModelMapper;

import org.springframework.http.ResponseEntity;

public class KrResource implements KrApi {

  private ModelMapper mapper;

  public KrResource(ModelMapper map) {
    this.mapper = map;
  }

  @Override
  public ResponseEntity<Void> addKr(@Valid Kr arg0) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ResponseEntity<Void> deleteKr(Long arg0) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ResponseEntity<Void> updateKr(@Valid Kr arg0) {
    // TODO Auto-generated method stub
    return null;
  }
  
}