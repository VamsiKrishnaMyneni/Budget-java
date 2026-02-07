package com.budget.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BudgetController {

    @RequestMapping("")
    public String Greet(){
        return "welcome to java world, mr, vamsi krishna myneni";
    }

}
