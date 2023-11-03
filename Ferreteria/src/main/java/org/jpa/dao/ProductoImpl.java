package org.jpa.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.jpa.bean.Producto;
import org.jpa.interfaces.iMetodos;
import org.jpa.servicio.Conectar;


public class ProductoImpl implements iMetodos<Producto>{
    private EntityManager entityManager(){
    return Conectar.getConectar().getEmf().createEntityManager();
    }
    EntityManager em = entityManager();
    
    @Override
    public void Registrar(Producto producto){
          try {
            em.getTransaction().begin();
            em.persist(producto);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
     }

    @Override
    public void Actualizar(Producto producto) {
         try {
            em.getTransaction().begin();
            em.merge(producto);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public List<Producto> Lista() {
        Query query = em.createQuery("SELECT p FROM Producto p");
        return  query.getResultList();
     }

    @Override
    public void Eliminar(Producto producto) {
        try {
            em.getTransaction().begin();
            em.remove(em.merge(producto));
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
     }
    
    
}
