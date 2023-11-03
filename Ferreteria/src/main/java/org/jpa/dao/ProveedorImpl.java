package org.jpa.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.jpa.bean.Proveedor;
import org.jpa.interfaces.iMetodos;
import org.jpa.servicio.Conectar;

public class ProveedorImpl implements iMetodos<Proveedor>{
    
    private EntityManager entityManager(){
    return Conectar.getConectar().getEmf().createEntityManager();
    }
    
    EntityManager em = entityManager();

    @Override
    public void Registrar(Proveedor proveedor){
          try {
            em.getTransaction().begin();
            em.persist(proveedor);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
     }

    @Override
    public void Actualizar(Proveedor proveedor) {
         try {
            em.getTransaction().begin();
            em.merge(proveedor);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public List<Proveedor> Lista() {
        Query query = em.createQuery("SELECT p FROM Proveedor p");
        return  query.getResultList();
     }

    @Override
    public void Eliminar(Proveedor proveedor) {
        try {
            em.getTransaction().begin();
            em.remove(em.merge(proveedor));
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
     }
}