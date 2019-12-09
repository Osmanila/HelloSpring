package com.example.demo;

import org.springframework.stereotype.Controller;

@Controller
public class Main {
   public String homePage(){
       return "index";
   }
}
