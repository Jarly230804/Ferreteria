package org.jpa.test;

import java.util.List;
import org.jpa.bean.Empleado;
import org.jpa.bean.Sede;
import org.jpa.dao.EmpleadoImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class EmpleadoImplTest {
    
    public EmpleadoImplTest() {
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
     * Test of Registrar method, of class EmpleadoImpl.
     */
@Test
public void testRegistrarEmpleado() {
    System.out.println("Registrar Empleado");
    String idSede="1";
    Empleado empleado = new Empleado("1", "", "48563214", "carlos@gmail", "Calle Manuel", new Sede(idSede));
    EmpleadoImpl instance = new EmpleadoImpl();
    instance.Registrar(empleado);
    // Agrega aserciones o validaciones para verificar si el registro fue exitoso
}

@Test
public void testActualizarEmpleado() {
    System.out.println("Actualizar Empleado");
    String idSede="1";
    Empleado empleado = new Empleado("1", "", "48563214", "carlos@gmail", "Calle Manuel", new Sede(idSede));
    EmpleadoImpl instance = new EmpleadoImpl();
    instance.Actualizar(empleado);
    // Agrega aserciones o validaciones para verificar si la actualización fue exitosa
}

@Test
public void testListarEmpleados() {
    System.out.println("Listar Empleados");
    EmpleadoImpl instance = new EmpleadoImpl();
    List<Empleado> result = instance.Lista();
    assertNotNull(result); // Verifica que la lista no sea nula
    // Agrega otras aserciones o validaciones si es necesario
}

@Test
public void testEliminarEmpleado() {
    System.out.println("Eliminar Empleado");
    String idSede="1";
    Empleado empleado = new Empleado("1", "", "48563214", "carlos@gmail", "Calle Manuel", new Sede(idSede));
    EmpleadoImpl instance = new EmpleadoImpl();
    instance.Eliminar(empleado);
    // Agrega aserciones o validaciones para verificar si la eliminación fue exitosa
}

    
}
