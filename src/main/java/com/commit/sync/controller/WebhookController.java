package com.commit.sync.controller;

import com.commit.sync.model.Commit;
import com.commit.sync.model.Repository;
import com.commit.sync.service.EventoService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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
  public ResponseEntity<Repository> handleWebhook(@RequestBody Repository repository) {
    System.out.println("Repositorio Recebido: " + repository);

    return ResponseEntity.status(HttpStatus.OK).body(repository);
  }

}
