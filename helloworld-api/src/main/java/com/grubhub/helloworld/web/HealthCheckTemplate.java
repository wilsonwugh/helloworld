package com.grubhub.helloworld.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface HealthCheckTemplate {

    @RequestMapping(value = "/helloworld/ping", method = RequestMethod.GET)
    ResponseEntity<String> ping();

    @RequestMapping(value = "/helloworld/healthcheck", method = RequestMethod.GET)
    ResponseEntity<String> healthCheck();
}
