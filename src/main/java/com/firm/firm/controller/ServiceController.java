package com.firm.firm.controller;

import com.firm.firm.domain.Service;
import com.firm.firm.service.jpa.ServiceService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/services")
@CrossOrigin("http://localhost:3000")
public class ServiceController extends BaseController<Service, Long, ServiceService> {

  private ServiceService serviceService;

  public ServiceController(ServiceService serviceService) {
    this.serviceService = serviceService;
  }

  @Override
  ServiceService service() {
    return serviceService;
  }
}
