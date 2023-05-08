/*package com.zuul.zuulServer.Actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Map;*/
/*
@Component
//@Endpoint(id = "my-health")
public class ClientsHealthCheck implements HealthIndicator {

    /*Map<String, Object> healthMap = new LinkedHashMap<>();
    @ReadOperation
    public Map<String, Object> health() {
        healthMap.put("MyHealth", "Working");
        return healthMap;
    }
    @ReadOperation
    public String getHealth(@Selector String name) {
        return healthMap.get(name).toString();
    }
    @WriteOperation
    public void writeOperation(@Selector String name) {
        //TODO this write operation
    }
    @DeleteOperation
    public void deleteOperation(@Selector String name){
        //TODO delete operation
    }*/
/*
    @Override
    public Health health() {

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Map> response = restTemplate.getForEntity("http://localhost:8090/zuul-payments/actuator/health", Map.class);
        Map<String, Object> respMap = response.getBody();

        String status = (String) respMap.get("status");

        if (status.equals("UP")) {
            return Health.up().build();
        }

        return Health.down().build();

    }

}*/
