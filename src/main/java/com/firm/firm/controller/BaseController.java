package com.firm.firm.controller;


import com.firm.firm.domain.BaseEntity;
import com.firm.firm.service.BaseService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public abstract class BaseController<Entity extends BaseEntity,
    ID extends Long,
    Service extends BaseService<Entity,ID, JpaRepository<Entity, ID>>> {

  @GetMapping
  public List<Entity> findAll() {
    return service().findAll();
  }

  @GetMapping("/{id}")
  public Optional<Entity> findById(@PathVariable ID id) {
    return service().findById(id);
  }

  @PostMapping
  public Entity create(@RequestBody Entity Entity) {
    return service().save(Entity);
  }

  @PutMapping("/{id}")
  public Entity update(@PathVariable ID id, @RequestBody Entity Entity) {
    return service().update(id, Entity);
  }

  @DeleteMapping("/{id}")
  public void deleteById(@PathVariable ID id) {
    service().deleteById(id);
  }

  abstract Service service();

}
