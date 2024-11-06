package com.grubhub.helloworld.controller.rest;

import com.grubhub.helloworld.web.HealthCheckTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController implements HealthCheckTemplate {
    @Override
    public ResponseEntity<String> ping() {
        return new ResponseEntity<>("pong", HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> healthCheck() {
        return new ResponseEntity<>("Accepted", HttpStatus.ACCEPTED);
    }
}
