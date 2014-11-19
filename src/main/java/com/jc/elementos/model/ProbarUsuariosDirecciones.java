/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.elementos.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author campitos
 */
public class ProbarUsuariosDirecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    SessionFactory factory=    HIbernateUtilidades.getSessionFactory();
     Session sesion=              factory.openSession();
     Transaction tranza=    sesion.beginTransaction();
        
        
        
        
        
        
        
        
        
        Usuario u=new Usuario();
        Direccion d=new Direccion();
        
        d.setCalle("calle de la amaregura3");
        d.setColonia("Colonia de avon3");
        d.setCp(55130);
        d.setEstado("Ebriedad3");
        //Importante ligar al usuario anterior esta direccion
        d.setIdUsuario(u);
        
        u.setDireccion(d);
        u.setEdad(43);
        u.setNombre("Juan carlitos3");
        u.setSueldo(40002f);
        
        sesion.save(u);
        sesion.save(d);
        tranza.commit();
        sesion.close();
        System.out.println("todo se guardo bien!!");
        
       
    }
    
}
