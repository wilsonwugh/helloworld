package com.grubhub.helloworld.controller.rest;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HealthCheckControllerTest {

    private HealthCheckController testSubject;

    @BeforeEach
    void setup() {
        testSubject = new HealthCheckController();
    }

    @Test
    void healthCheck() {
        ResponseEntity<String> result = testSubject.healthCheck();
        assertEquals(HttpStatus.ACCEPTED, result.getStatusCode());
    }

    @Test
    void ping() {
        ResponseEntity<String> result = testSubject.ping();
        assertEquals(HttpStatus.OK, result.getStatusCode());
        assertEquals("pong", result.getBody());
    }
}
