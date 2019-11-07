package br.com.empresa.dao;

import br.com.empresa.connnections.ConnectionFactory;
import br.com.empresa.models.Depto;
import javax.persistence.EntityManager;

/**
 *
 * @author Nestor
 */
public class DeptoDao {

    public void InsereDepto(Depto depto){
        EntityManager em = new ConnectionFactory().getConnection();
        em.getTransaction().begin();
        em.persist(depto);
        em.getTransaction().commit();
        em.close();
    } 
}