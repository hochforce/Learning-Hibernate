package br.com.empresa.connnections;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Nestor
 */
public class ConnectionFactory {

    private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("empresaPU");

    public EntityManager getConnection() {
        return factory.createEntityManager();
    }

}
