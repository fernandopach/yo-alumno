/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.elementos.controller;

/**
 *
 * @author campitos
 */
public class ServicioSuperficie {
    
    Superficie superficie;

    public ServicioSuperficie() {
    }

    public ServicioSuperficie(Superficie superficie) {
        this.superficie = superficie;
    }
    
    public String servicioArea(){
         Cuadrado d=new Cuadrado();
         d.setLado(5);
        return d.calcularArea();
    }
    
}
