package org.jpa.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.jpa.bean.Empleado;
import org.jpa.interfaces.iMetodos;
import org.jpa.servicio.Conectar;

 
public class EmpleadoImpl implements iMetodos<Empleado>{
     private EntityManager entityManager(){
    return Conectar.getConectar().getEmf().createEntityManager();
    }
    EntityManager em = entityManager();
    
    @Override
    public void Registrar(Empleado empleado){
          try {
            em.getTransaction().begin();
            em.persist(empleado);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
     }

    @Override
    public void Actualizar(Empleado empleado) {
         try {
            em.getTransaction().begin();
            em.merge(empleado);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public List<Empleado> Lista() {
        Query query = em.createQuery("SELECT e FROM Empleado e");
        return  query.getResultList();
     }

    @Override
    public void Eliminar(Empleado empleado) {
        try {
            em.getTransaction().begin();
            em.remove(em.merge(empleado));
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
     }
    
}
