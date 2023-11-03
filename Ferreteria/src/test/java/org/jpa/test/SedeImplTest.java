package org.jpa.test;

import java.util.List;
import org.jpa.bean.Administrador;
import org.jpa.bean.Sede;
import org.jpa.dao.SedeImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SedeImplTest {
    
    public SedeImplTest() {
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
     * Test of Registrar method, of class SedeImpl.
     */
@Test
public void testRegistrarSede() {
    System.out.println("Registrar Sede");
    String idAdministrador = "7"; // Obtener el ID del Administrador de la base de datos
    Sede sede = new Sede("22", "Carlos", "Calle 210", 974856213, new Administrador(idAdministrador)); // Asociar la Sede con el Administrador
    SedeImpl instance = new SedeImpl();
    instance.Registrar(sede);
    // Agrega aserciones o validaciones para verificar si el registro fue exitoso
}

@Test
public void testActualizarSede() {
    System.out.println("Actualizar Sede");
    String idAdministrador = "4"; // Obtener el ID del Administrador de la base de datos
    Sede sede = new Sede("1", "Cameos", "Calle 210", 974856213, new Administrador(idAdministrador)); // Asociar la Sede con el Administrador
    SedeImpl instance = new SedeImpl();
    instance.Actualizar(sede);
    // Agrega aserciones o validaciones para verificar si la actualización fue exitosa
}

@Test
public void testEliminarSede() {
    System.out.println("Eliminar Sede");
    String idAdministrador = "7"; // Obtener el ID del Administrador de la base de datos
    Sede sede = new Sede("22", "Carlos", "Calle 210", 974856213, new Administrador(idAdministrador)); // Asociar la Sede con el Administrador
    SedeImpl instance = new SedeImpl();
    instance.Eliminar(sede);
    // Agrega aserciones o validaciones para verificar si la eliminación fue exitosa
}
@Test
public void testListarSedes() {
    System.out.println("Listar Sedes");
    SedeImpl instance = new SedeImpl();
    List<Sede> result = instance.Lista();
    assertNotNull(result); // Verifica que la lista no sea nula
    assertFalse(result.isEmpty()); // Verifica que la lista no esté vacía
    // Puedes agregar otras aserciones o validaciones si es necesario
}

    
}
