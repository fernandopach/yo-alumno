/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.elementos.model;

import static com.jc.elementos.model.DAO.close;
import static com.jc.elementos.model.DAO.getSession;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author campitos
 */
public class DAODireccionImpl extends DAO{
 
       
    /**
     *         este metodo sirve para guardar un cliente
     * @param cliente Este parametro se le deve pasar a este metodo para 
     * que se guarde un nuevo cliente 
     * 
     */
    public void agregarDireccion(Direccion d) {
    begin();
    getSession().save(d);
    commit();
    close();
    
    }
 
       /**
        * Este metodo obtiene todos los registros de la tabla cliente 
        * @return Este metodo nos regresa todos los clientes
        */
    public List<Direccion> buscarTodosDirecciones() {
        begin();
        Query q = getSession().createQuery("from Direccion");
        List<Direccion> usuarios = (List<Direccion>)q.list();
        commit();
        close();
         
return usuarios; 
        
      
    }
    /**
     * Este metodo borra un cliente
     * @param p Se le debe pasar un parametro de tipo cliente para ser borrado
     */
 public void borrarDireccion(Direccion u){
            begin();
             getSession().delete(u);
            commit();
            close();
 }   
        /**
         * Este metodo busca un cliente por medio de su Id
         * @param id Este parametro es el Id del cliente que se quiere buscar
         * @return El tipo de retorno es el cliente buscado
         */
  public Usuario buscarPorId(int id){
      begin();
     Query q = getSession().createQuery("from Direccion where id = :id");
        q.setInteger("id",id);
        Usuario u = (Usuario)q.uniqueResult();
        commit();
        close();
return u;  
   
  }  }
  
 
  

