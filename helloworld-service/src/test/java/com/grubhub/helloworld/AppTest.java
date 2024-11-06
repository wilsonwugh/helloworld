
package com.grubhub.helloworld;

import io.micrometer.core.instrument.MeterRegistry;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = { App.class },
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        properties = {
                "discovery.enabled=false",
                "messaging.enabled=false",
                "rpc.enabled=false"
        })
public class AppTest {
  @Autowired
  MeterRegistry meterRegistry;

  @LocalServerPort
  private int port;

  @Autowired
  private TestRestTemplate restTemplate;

  @Test
  void happyPath() {
    assertThat(meterRegistry).isNotNull();

    assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/helloworld/ping", String.class))
        .contains("pong");
  }
}
