package com.zuul.zuulServer.Actuator;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@RestControllerEndpoint(id = "controller-endpoint")
public class CustomEndpoint {

    @GetMapping("/my-endpoint")
    public @ResponseBody ResponseEntity customEndPoint(){
        return  new ResponseEntity<>("Something from my controller", HttpStatus.OK);
    }

}
