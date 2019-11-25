package com.firm.firm.service;

import org.springframework.beans.BeanUtils;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BaseService<E,ID, Storage extends JpaRepository<E, ID>> {

  default List<E> findAll() {
    return repository().findAll();
  }

  default E save(E entity) {
    return repository().save(entity);
  }

  default E update(ID id, E entity) {
//    E updatedEntity = repository()
//        .findById(id)
//        .map(dbEntity -> {
//          BeanUtils.copyProperties(entity, dbEntity);
//          return dbEntity;
//        })
//        .get();
    return repository().save(entity);
  }


  default Optional<E> findById(ID id) {
    return repository().findById(id);
  }

  default void deleteById(ID id) {
    repository().deleteById(id);
  }

  Storage repository();

}
