package br.com.buildproject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloWorldController {

  @GetMapping
  public ResponseEntity<String> helloWorld() {
    return ResponseEntity.ok("Hello World");
  }
}
