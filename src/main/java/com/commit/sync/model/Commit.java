package com.commit.sync.model;

import lombok.Data;

@Data
public class Commit {

  private  String id;
  private  String message;
  private  String timestamp;
  private  String url;
  private  String author;

}
