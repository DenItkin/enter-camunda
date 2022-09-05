package com.sytoss.camunda_react_web.repository;

import com.sytoss.camunda_react_web.entity.Client;
import org.springframework.data.repository.*;

public interface ClientRepository extends CrudRepository<Client, Long> {
}
