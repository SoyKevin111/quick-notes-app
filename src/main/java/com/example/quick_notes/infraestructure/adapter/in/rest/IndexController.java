package com.example.quick_notes.infraestructure.adapter.in.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

   @RequestMapping(value = "/**/{path:[^\\.]*}")
   public String redirect() {
      return "forward:/index.html";
   }
}
