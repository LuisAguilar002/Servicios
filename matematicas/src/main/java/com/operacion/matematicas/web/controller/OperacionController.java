package com.operacion.matematicas.web.controller;


import com.operacion.matematicas.DTO.Numeros;
import com.operacion.matematicas.service.interfase.Num;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("operacion")
public class OperacionController {

    @Autowired
    private Num numeros;


    @PostMapping("resta")
    public String resta(@RequestBody Numeros num){
        return numeros.Resta(num.getA(), num.getB());
    }

    @PostMapping("suma")
    public String suma(@RequestBody Numeros num){
        return numeros.Suma(num.getA(), num.getB());
    }


}
