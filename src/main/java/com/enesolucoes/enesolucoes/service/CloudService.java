package com.enesolucoes.enesolucoes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.enesolucoes.enesolucoes.dto.PlanDTO;
import org.springframework.stereotype.Service;

@Service
public class CloudService implements CloudServiceInterface {

    private final Logger logger = Logger.getLogger(CloudService.class.getName());

    public List<PlanDTO> getAllPlans() {
        logger.info("Get all Plans");
        List<PlanDTO> plans = new ArrayList<PlanDTO>();
        return plans;
    }

    public PlanDTO getPlan(Long cod) {
        logger.info("Get plan x");
        PlanDTO plan = new PlanDTO();
        return plan;
    }

    public PlanDTO savePlan(PlanDTO plan) {
        logger.info("saving plan");
        validatePlan(plan);
        //Call save webservice
        PlanDTO teste = new PlanDTO();
        return teste;
    }

    private void validatePlan(PlanDTO plan) {
        logger.info("Validating plan");
    }
}