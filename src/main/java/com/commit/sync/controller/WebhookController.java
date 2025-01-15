package com.commit.sync.controller;

import com.commit.sync.model.Repository;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1")
public class WebhookController {

  private static final Logger logger = LoggerFactory.getLogger(WebhookController.class);

  @PostMapping("/webhook")
  public ResponseEntity<Map<String, Object>> handleWebhook(@RequestBody Map<String, Object> payload) {
    System.out.println("Repositorio Recebido: " + payload);
    logger.info("Event: {}",payload);

    return ResponseEntity.status(HttpStatus.OK).body(payload);
  }

}
