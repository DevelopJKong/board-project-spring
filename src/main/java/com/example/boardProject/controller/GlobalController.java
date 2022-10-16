package com.example.boardProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class GlobalController {

  public String home() {
    return "index";
  }
}
