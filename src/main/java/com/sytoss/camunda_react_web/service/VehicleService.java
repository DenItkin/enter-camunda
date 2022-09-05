package com.sytoss.camunda_react_web.service;

import com.sytoss.camunda_react_web.dmn.*;
import com.sytoss.camunda_react_web.entity.*;
import com.sytoss.camunda_react_web.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

    public Vehicle getVehicle() {
        return vehicleRepository.findByModel(DecisionTableEvaluate.nameCar);
    }
}
