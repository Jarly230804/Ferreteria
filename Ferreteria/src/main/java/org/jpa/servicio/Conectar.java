 
package org.jpa.servicio;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conectar {
    private static final Conectar conectar = new Conectar();
    
    private final EntityManagerFactory emf;
    
    private Conectar(){
        emf=Persistence.createEntityManagerFactory("PU");        
    }

    public static Conectar getConectar() {
        return conectar;
    }

    public EntityManagerFactory getEmf() {
        return emf;
    }
    
    
}
