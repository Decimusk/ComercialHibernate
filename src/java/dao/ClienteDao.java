/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Clientes;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Ing. Guillermo Pérez
 */
public class ClienteDao {
    
    public void ingresarClientes(Clientes c){
        SessionFactory sf = null;
        Session sesion = null;
        Transaction tx = null;
        try{
            sf = HibernateUtil.getSessionFactory();
            sesion = sf.openSession();
            tx = sesion.beginTransaction();
            sesion.save(c);
            tx.commit();
            sesion.close();
        }catch(HibernateException ex){
            tx.rollback();
            throw new RuntimeException("");
        }
    }
    
}
