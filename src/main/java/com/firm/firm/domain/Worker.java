package com.firm.firm.domain;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Worker extends BaseEntity {

  private String secondName;
  private String selfDescription;

  @OneToMany
  private List<Service> services;

  @OneToMany
  private List<Skill> skills;


  public String getSecondName() {
    return secondName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  public String getSelfDescription() {
    return selfDescription;
  }

  public void setSelfDescription(String selfDescription) {
    this.selfDescription = selfDescription;
  }

  public List<Service> getServices() {
    return services;
  }

  public void setServices(List<Service> services) {
    this.services = services;
  }

  public List<Skill> getSkills() {
    return skills;
  }

  public void setSkills(List<Skill> skills) {
    this.skills = skills;
  }
}
