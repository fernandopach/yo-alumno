/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.elementos.model;

/**
 *
 * @author campitos
 */


import java.util.List;
import org.hibernate.Query;
 
/**
 * 
 * Esta clase contiene las operaciones basicas para insertar
 * actualizar y borrar un registro en la tabla cliente Mapeado con ayuda
 * de hibernate
 */
public class DAOUsuarioImpl extends DAO{
 
       
    /**
     *         este metodo sirve para guardar un cliente
     * @param cliente Este parametro se le deve pasar a este metodo para 
     * que se guarde un nuevo cliente 
     * 
     */
    public void agregarUsuario(Usuario u) {
    begin();
    getSession().save(u);
    commit();
    close();
    
    }
 
       /**
        * Este metodo obtiene todos los registros de la tabla cliente 
        * @return Este metodo nos regresa todos los clientes
        */
    public List<Usuario> buscarTodosClientes() {
        begin();
        Query q = getSession().createQuery("from Cliente");
        List<Usuario> usuarios = (List<Usuario>)q.list();
        commit();
        close();
         
return usuarios; 
        
      
    }
    /**
     * Este metodo borra un cliente
     * @param p Se le debe pasar un parametro de tipo cliente para ser borrado
     */
 public void borrarCliente(Usuario u){
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
     Query q = getSession().createQuery("from Usuario where id = :id");
        q.setInteger("id",id);
        Usuario u = (Usuario)q.uniqueResult();
        commit();
        close();
return u;  
   
  }  }
  
 
  

