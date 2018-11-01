package org.spring.boot.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {
  @RequestMapping("/")
  public String hello ()
  {
	  System.out.println("hello world");
	  
	  return "hello world";
  }
}
