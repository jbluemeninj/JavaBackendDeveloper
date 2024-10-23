package com.jbluemeninj.apis;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HolaMundoController {

    @RequestMapping("/hola")
    public String holaMundo() {
        return "¡Hola, Mundo!";
    }

}
