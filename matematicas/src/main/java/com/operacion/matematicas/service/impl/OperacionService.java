package com.operacion.matematicas.service.impl;


import com.operacion.matematicas.service.interfase.Num;
import org.springframework.stereotype.Service;

@Service
public class OperacionService implements Num {




    public String Suma(int a, int b) {
        int resultado = a + b;
        return "La suma de " + a + " y " + b + " es: " + resultado;
    }

    @Override
    public String Resta(int a, int b) {
        int resultado = a - b;
        return  "La resta de " + a + " y " + b + " es: " + resultado;
    }
}
