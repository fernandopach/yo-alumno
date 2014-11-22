/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.elementos.model;

import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.CriteriaQuery;

/**
 *
 * @author campitos
 */
public class ProbarUsuariosDirecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {

        
       
       
        
        
        /*
        
        Usuario u=new Usuario();
        Direccion d=new Direccion();
        
        d.setCalle("calle de la amaregura");
        d.setColonia("Colonia de avon3");
        d.setCp(55130);
        d.setEstado("Ebriedad3");
        //Importante ligar al usuario anterior esta direccion
        d.setIdUsuario(u);
        ArrayList<Direccion> direcciones=new ArrayList<Direccion>();
        u.setDireccionList(direcciones);
        u.setEdad(43);
        u.setNombre("Juan carlitos3");
        u.setSueldo(40002f);
        
       DAOUsuarioImpl du=new DAOUsuarioImpl();
                      du.agregarUsuario(u);
       DAODireccionImpl di=new DAODireccionImpl();     
                        di.agregarDireccion(d);
               
        */
       SessionFactory factory= HIbernateUtilidades.getSessionFactory();
   Session sesion=    factory.openSession();
  Transaction tranza= sesion.beginTransaction();
 
Criteria cri=sesion.createCriteria(Usuario.class);
ArrayList<Direccion> usuarios= (ArrayList<Direccion>)cri.list();

ObjectMapper mapper=new ObjectMapper();


System.out.println(mapper.writeValueAsString(usuarios));
  
  tranza.commit();
  sesion.close();
     
        System.out.println("todo se guardo bien!!");
        
       
    }
    
}
