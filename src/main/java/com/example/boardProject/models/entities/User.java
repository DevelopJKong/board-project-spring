package com.example.boardProject.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@SuperBuilder
public class User {

  private Long id;
  private String email;
  private String password;
  private Boolean verified;
}
