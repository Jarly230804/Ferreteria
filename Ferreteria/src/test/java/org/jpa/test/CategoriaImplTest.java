package org.jpa.test;

import java.util.List;
import org.jpa.bean.Categoria;
import org.jpa.dao.CategoriaImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CategoriaImplTest {
    
    public CategoriaImplTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of Registrar method, of class CategoriaImpl.
     */
  @Test
public void testRegistrar() {
    System.out.println("Registrar");
    Categoria categoria = new Categoria("2", "Herramienta");
    CategoriaImpl instance = new CategoriaImpl();
    instance.Registrar(categoria);
    // Agrega aserciones o validaciones para verificar si el registro fue exitoso
}

    /**
     * Test of Actualizar method, of class CategoriaImpl.
     */
@Test
public void testActualizar() {
    System.out.println("Actualizar");
    Categoria categoria = new Categoria("2", "Herramienta Actualizada");
    CategoriaImpl instance = new CategoriaImpl();
    instance.Actualizar(categoria);
    // Agrega aserciones o validaciones para verificar si la actualización fue exitosa
}


    /**
     * Test of Lista method, of class CategoriaImpl.
     */
@Test
public void testLista() {
    System.out.println("Lista");
    CategoriaImpl instance = new CategoriaImpl();
    List<Categoria> result = instance.Lista();
    assertNotNull(result); // Verifica que la lista no sea nula
    // Agrega otras aserciones o validaciones si es necesario
}


    /**
     * Test of Eliminar method, of class CategoriaImpl.
     */
@Test
public void testEliminar() {
    System.out.println("Eliminar");
    Categoria categoria = new Categoria("2", "Herramienta Actualizada");
    CategoriaImpl instance = new CategoriaImpl();
    instance.Eliminar(categoria);
    // Agrega aserciones o validaciones para verificar si la eliminación fue exitosa
}

    
}
