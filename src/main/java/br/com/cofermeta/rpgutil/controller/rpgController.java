package br.com.cofermeta.rpgutil.controller;

import br.com.cofermeta.rpgutil.model.HelloWorld;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController

public class rpgController implements Serializable {
    public static final long serialVersionUID = 202209301653L;

    @GetMapping(value = "/principal")
    public String first(){
        HelloWorld aux = new HelloWorld(1, "HELLO WORLD!");

        return aux.getNome() + " " + aux.getId();
    }

}
