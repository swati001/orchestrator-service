package com.app.payment.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/payment")
public class Orchestrator {

  @Autowired
  private OrchestratorService orchestratorService;
  
  @GetMapping("/get")
  public ResponseEntity<String> getPayment(){
    return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
  }
}
