package com.firm.firm.controller;

import com.firm.firm.domain.Worker;
import com.firm.firm.service.jpa.WorkerService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/workers")
@CrossOrigin("http://localhost:3000")
public class WorkerController extends BaseController<Worker, Long, WorkerService> {

  private WorkerService workerService;

  public WorkerController(WorkerService workerService) {
    this.workerService = workerService;
  }

  @Override
  WorkerService service() {
    return workerService;
  }
}
