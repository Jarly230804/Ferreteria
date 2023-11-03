package org.jpa.test;

import java.util.List;
import org.jpa.bean.Administrador;
import org.jpa.dao.AdministradorImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AdministradorImplTest {
    
    public AdministradorImplTest() {
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
     * Test of Registrar method, of class AdministradorImpl.
     */
     @Test
public void testRegistrar() {
    System.out.println("Registrar");
    Administrador admin = new Administrador("7", "Juan Lopez Quispe", "78564235", "juan@gmail.com", "986568958");
    AdministradorImpl instance = new AdministradorImpl();
    instance.Registrar(admin);
    // Agrega aserciones o validaciones para verificar si el registro fue exitoso
}

@Test
public void testActualizar() {
    System.out.println("Actualizar");
    Administrador admin = new Administrador("4", "Juan Lopez Quispe", "78564235", "juan@gmail.com", "986568958");
    AdministradorImpl instance = new AdministradorImpl();
    instance.Actualizar(admin);
    // Agrega aserciones o validaciones para verificar si la actualización fue exitosa
}

@Test
public void testLista() {
    System.out.println("Lista");
    AdministradorImpl instance = new AdministradorImpl();
    List<Administrador> result = instance.Lista();
    assertNotNull(result); // Verifica que la lista no sea nula
    // Agrega otras aserciones o validaciones si es necesario
}

@Test
public void testEliminar() {
    System.out.println("Eliminar");
    Administrador admin = new Administrador("4", "Juan Lopez Quispe", "78564235", "juan@gmail.com", "986568958");
    AdministradorImpl instance = new AdministradorImpl();
    instance.Eliminar(admin);
    // Agrega aserciones o validaciones para verificar si la eliminación fue exitosa
}

    
}
