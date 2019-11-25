package com.firm.firm.controller;

import com.firm.firm.domain.Skill;
import com.firm.firm.service.jpa.SkillService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/skills")
@CrossOrigin("http://localhost:3000")
public class SkillController extends BaseController<Skill, Long, SkillService> {

  private SkillService skillService;

  public SkillController(SkillService skillService) {
    this.skillService = skillService;
  }

  @Override
  SkillService service() {
    return skillService;
  }
}
