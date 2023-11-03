package org.jpa.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.jpa.bean.Administrador;
import org.jpa.servicio.Conectar;
import org.jpa.interfaces.iMetodos;

public class AdministradorImpl implements iMetodos<Administrador>{

    private EntityManager entityManager(){
    return Conectar.getConectar().getEmf().createEntityManager();
    }
    
    EntityManager em = entityManager();
    
  
    @Override
    public void Registrar(Administrador admin) {
        try {
            em.getTransaction().begin();
            em.persist(admin);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
     } 

    @Override
    public void Actualizar(Administrador admin) {
        try {
            em.getTransaction().begin();
            em.merge(admin);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
     }

    @Override
    public List<Administrador> Lista() {
        
        Query query = em.createQuery("SELECT a FROM Administrador a");
        return  query.getResultList();
     }

    @Override
    public void Eliminar(Administrador admin) {       
        try {
            em.getTransaction().begin();
            em.remove(em.merge(admin));
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
     }

}
