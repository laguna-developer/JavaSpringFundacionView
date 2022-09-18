package org.fundacionview.javaspring.inventory.app.infraestructure;

import org.fundacionview.javaspring.inventory.app.domain.Good;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodController {

    @GetMapping("/good")
    public Good getGood(){
        Good good = new Good("Item Zapato");
        return good;
    }
}
