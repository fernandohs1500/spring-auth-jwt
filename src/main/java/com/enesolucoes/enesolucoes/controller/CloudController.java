package com.enesolucoes.enesolucoes.controller;

import java.util.List;

import javax.validation.Valid;

import com.enesolucoes.enesolucoes.dto.PlanDTO;
import com.enesolucoes.enesolucoes.service.CloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudController {

    private final CloudService cloudService;

    @Autowired
    public CloudController(CloudService cloudService) {
        this.cloudService = cloudService;
    }

    @GetMapping(path = "/all")
    public ResponseEntity<?> getAllPlans() {
        List<PlanDTO> plans = cloudService.getAllPlans();
        return new ResponseEntity<>(plans, HttpStatus.OK);
    }

    @GetMapping(path = "/plans/{cod}")
    public ResponseEntity<?> getPlanByCod (@PathVariable("cod") Long cod) {
        return new ResponseEntity<>(cloudService.getPlan(cod), HttpStatus.OK);
    }

    @PutMapping(path = "/plans")
    public ResponseEntity<?> savePlan(@Valid @RequestBody PlanDTO plan) {
        return new ResponseEntity<>(cloudService.savePlan(plan), HttpStatus.CREATED);
    }

}