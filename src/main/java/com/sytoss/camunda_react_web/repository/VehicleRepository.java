package com.sytoss.camunda_react_web.repository;

import com.sytoss.camunda_react_web.entity.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

import java.util.*;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    @Query(value = "select id_vehicle, model, price, description from vehicle where model = :model", nativeQuery = true)
    Vehicle findByModel(@Param("model") String model);
}
