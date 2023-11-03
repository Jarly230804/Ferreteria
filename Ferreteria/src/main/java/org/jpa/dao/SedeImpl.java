package org.jpa.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.jpa.bean.Sede;
import org.jpa.interfaces.iMetodos;
import org.jpa.servicio.Conectar;


public class SedeImpl implements iMetodos<Sede>{
    private EntityManager entityManager(){
    return Conectar.getConectar().getEmf().createEntityManager();
    }
    EntityManager em = entityManager();
    
    @Override
    public void Registrar(Sede sede){
          try {
            em.getTransaction().begin();
            em.persist(sede);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
     }

    @Override
    public void Actualizar(Sede sede) {
         try {
            em.getTransaction().begin();
            em.merge(sede);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public List<Sede> Lista() {
        Query query = em.createQuery("SELECT s FROM Sede s");
        return  query.getResultList();
     }

    @Override
    public void Eliminar(Sede sede) {
        try {
            em.getTransaction().begin();
            em.remove(em.merge(sede));
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
     }
    
}
