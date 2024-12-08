package com.commit.sync.controller;

import com.commit.sync.model.Commit;
import com.commit.sync.service.EventoService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = "api/v1/webhook",produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class Webhook {

  private EventoService eventoService;


  @PostMapping
  public ResponseEntity<List<Commit>> evento(@RequestBody Commit commit) {
    var evento = eventoService.evento(commit);
    return ResponseEntity.status(HttpStatus.CREATED).body(evento);
  }

}
