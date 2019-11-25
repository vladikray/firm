package com.firm.firm.service.jpa;

import com.firm.firm.domain.Worker;
import com.firm.firm.repository.WorkerRepository;
import com.firm.firm.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


@Component
public class WorkerService implements BaseService<Worker,Long , JpaRepository<Worker, Long>> {

  @Autowired
  WorkerRepository workerRepository;

  @Override
  public JpaRepository<Worker, Long> repository() {
    return workerRepository;
  }

}
