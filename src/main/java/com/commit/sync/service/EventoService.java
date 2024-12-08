package com.commit.sync.service;

import com.commit.sync.model.Commit;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class EventoService {
  public List<Commit> evento(Commit commit){
    List<Commit> commitList =new ArrayList<>();
    commitList.add(commit);
    return commitList;
  }
}
