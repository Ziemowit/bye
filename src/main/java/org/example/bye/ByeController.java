package org.example.bye;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ByeController {

  private final String MSG = "Bye version4";

  @GetMapping("/hello")
  public String hello() {
    return MSG;
  }

}
