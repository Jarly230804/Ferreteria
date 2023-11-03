 package org.jpa.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.jpa.bean.Detallecomprobante;
import org.jpa.interfaces.iMetodos;
import org.jpa.servicio.Conectar;

 
public class DetalleComprobanteImpl implements iMetodos<Detallecomprobante>{
    private EntityManager entityManager(){
    return Conectar.getConectar().getEmf().createEntityManager();
    }
    EntityManager em = entityManager();
    
    @Override
    public void Registrar(Detallecomprobante detalle){
          try {
            em.getTransaction().begin();
            em.persist(detalle);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
     }

    @Override
    public void Actualizar(Detallecomprobante detalle) {
         try {
            em.getTransaction().begin();
            em.merge(detalle);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public List<Detallecomprobante> Lista() {
        Query query = em.createQuery("SELECT d FROM Detallecomprobante d");
        return  query.getResultList();
     }

    @Override
    public void Eliminar(Detallecomprobante detalle) {
        try {
            em.getTransaction().begin();
            em.remove(em.merge(detalle));
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
     }
    
}
