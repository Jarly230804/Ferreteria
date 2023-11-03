package org.jpa.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.jpa.bean.Cliente;
import org.jpa.interfaces.iMetodos;
import org.jpa.servicio.Conectar;


public class ClienteImpl implements iMetodos<Cliente>{
    
    private EntityManager entityManager(){
    return Conectar.getConectar().getEmf().createEntityManager();
    }
    EntityManager em = entityManager();
    
    @Override
    public void Registrar(Cliente cliente){
          try {
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
     }

    @Override
    public void Actualizar(Cliente cliente) {
         try {
            em.getTransaction().begin();
            em.merge(cliente);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public List<Cliente> Lista() {
        Query query = em.createQuery("SELECT c FROM Cliente c");
        return  query.getResultList();
     }

    @Override
    public void Eliminar(Cliente cliente) {
        try {
            em.getTransaction().begin();
            em.remove(em.merge(cliente));
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
     }
}
