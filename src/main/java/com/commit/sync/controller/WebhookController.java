package com.commit.sync.controller;

import com.commit.sync.model.Commit;
import com.commit.sync.service.EventoService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class WebhookController {

  @PostMapping("/webhook")
  public ResponseEntity<String> handleWebhook(@RequestBody String payload) {
    // Faça o processamento do payload aqui
    System.out.println("Payload recebido: " + payload);

    // Retorne uma resposta para confirmar o recebimento
    return ResponseEntity.status(HttpStatus.OK).body("Webhook recebido com sucesso!");
  }
}
