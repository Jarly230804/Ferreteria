package org.jpa.interfaces;

import java.util.List;

 
public interface iMetodos<T> {
    
    
    public void Registrar( T t);
    
    public void Actualizar( T t);
    
    public List<T>Lista();
    
    public void Eliminar( T t);
            
    
}
