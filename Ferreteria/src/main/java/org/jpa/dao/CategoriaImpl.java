package org.jpa.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.jpa.bean.Categoria;
import org.jpa.interfaces.iMetodos;
import org.jpa.servicio.Conectar;


public class CategoriaImpl implements iMetodos<Categoria>{
    private EntityManager entityManager(){
    return Conectar.getConectar().getEmf().createEntityManager();
    }
    
    EntityManager em = entityManager();

    
    @Override
    public void Registrar(Categoria categoria) {
        try {
            em.getTransaction().begin();
            em.persist(categoria);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
     }

    @Override
    public void Actualizar(Categoria categoria) {
         try {
            em.getTransaction().begin();
            em.merge(categoria);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
     }
    @Override
    public List<Categoria> Lista() {
        Query query = em.createQuery("SELECT c FROM Categoria c");
        return  query.getResultList();
        
     }

    @Override
    public void Eliminar(Categoria categoria) {
         try {
            em.getTransaction().begin();
            em.remove(em.merge(categoria));
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

     
}
