package com.firm.firm.service.jpa;

import com.firm.firm.domain.Service;
import com.firm.firm.repository.ServiceRepository;
import com.firm.firm.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


@Component
public class ServiceService implements BaseService<Service,Long, JpaRepository<Service, Long>> {

  @Autowired
  ServiceRepository serviceRepository;

  @Override
  public JpaRepository<Service, Long> repository() {
    return serviceRepository;
  }
}
