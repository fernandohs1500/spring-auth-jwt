package com.enesolucoes.enesolucoes.service;

import java.util.List;

import com.enesolucoes.enesolucoes.dto.PlanDTO;

public interface CloudServiceInterface {

    List<PlanDTO> getAllPlans();
    PlanDTO getPlan(Long cod);
    PlanDTO savePlan(PlanDTO plan);
}