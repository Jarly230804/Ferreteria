package org.jpa.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.jpa.bean.Comprobante;
import org.jpa.interfaces.iMetodos;
import org.jpa.servicio.Conectar;

 
public class ComprobanteImpl implements iMetodos<Comprobante>{
    private EntityManager entityManager(){
    return Conectar.getConectar().getEmf().createEntityManager();
    }
    EntityManager em = entityManager();
    
    @Override
    public void Registrar(Comprobante comprobante){
          try {
            em.getTransaction().begin();
            em.persist(comprobante);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
     }

    @Override
    public void Actualizar(Comprobante comprobante) {
         try {
            em.getTransaction().begin();
            em.merge(comprobante);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public List<Comprobante> Lista() {
        Query query = em.createQuery("SELECT c FROM Comprobante c");
        return  query.getResultList();
     }

    @Override
    public void Eliminar(Comprobante comprobante) {
        try {
            em.getTransaction().begin();
            em.remove(em.merge(comprobante));
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
     }
}
