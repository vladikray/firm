package com.firm.firm.domain;

import javax.persistence.Entity;


@Entity
public class Service extends BaseEntity {

  private String description;


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
