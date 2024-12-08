package com.commit.sync.model;

import java.util.ArrayList;
import lombok.Data;

@Data
public class Root{
  private String ref;
  private ArrayList<Commit> commits;
}
