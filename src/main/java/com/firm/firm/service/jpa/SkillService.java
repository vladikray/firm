package com.firm.firm.service.jpa;

import com.firm.firm.domain.Skill;
import com.firm.firm.repository.SkillRepository;
import com.firm.firm.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public class SkillService implements BaseService<Skill, Long, JpaRepository<Skill, Long>> {

  @Autowired
  SkillRepository skillRepository;

  @Override
  public JpaRepository<Skill, Long> repository() {
    return skillRepository;
  }
}
