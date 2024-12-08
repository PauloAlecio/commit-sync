package com.commit.sync.model;

import java.util.Date;
import lombok.Data;

@Data
public class Commit {

  private  String id;
  private  String message;
  private Date timestamp;
  private  String url;
  private  Author author;


}
