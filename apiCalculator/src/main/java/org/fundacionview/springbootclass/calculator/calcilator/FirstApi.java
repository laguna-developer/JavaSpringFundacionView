package org.fundacionview.springbootclass.calculator.calcilator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstApi{

    @GetMapping("/")
    String returnApi(){
        return "Hello World";
    }
}