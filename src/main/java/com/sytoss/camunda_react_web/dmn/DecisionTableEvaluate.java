package com.sytoss.camunda_react_web.dmn;

import org.camunda.bpm.dmn.engine.*;
import org.camunda.bpm.engine.*;
import org.camunda.bpm.engine.delegate.*;
import org.camunda.bpm.engine.variable.*;
import org.springframework.stereotype.*;

import java.util.*;
import java.util.logging.*;

@Component
public class DecisionTableEvaluate implements JavaDelegate {

    protected final static Logger LOGGER = Logger.getLogger(DecisionTableEvaluate.class.getName());
    public static String nameCar;

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        DecisionService decisionService = delegateExecution.getProcessEngine().getDecisionService();

        String typeVehical = (String) delegateExecution.getVariable("typeVehicle");

        VariableMap variables = (VariableMap) delegateExecution.getVariables();

        DmnDecisionTableResult decisionResult;

        if (Objects.equals(typeVehical, "Car")) {
            decisionResult = decisionService.evaluateDecisionTableByKey("car", variables);
        } else if (Objects.equals(typeVehical, "Scooter")) {
            decisionResult = decisionService.evaluateDecisionTableByKey("scooter", variables);
        } else if (Objects.equals(typeVehical, "Bike")) {
            decisionResult = decisionService.evaluateDecisionTableByKey("bike", variables);
        } else {
            throw new Exception("error");
        }

// or if the decision is implemented as decision table then you can also use
        String vehicle = decisionResult.getSingleEntry();
        nameCar = vehicle;

    }
}
