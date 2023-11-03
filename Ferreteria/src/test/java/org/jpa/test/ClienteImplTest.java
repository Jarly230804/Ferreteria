package org.jpa.test;

import java.util.List;
import org.jpa.bean.Cliente;
import org.jpa.bean.Empleado;
import org.jpa.dao.ClienteImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ClienteImplTest {
    
    public ClienteImplTest() {
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
     * Test of Registrar method, of class ClienteImpl.
     */
@Test
public void testRegistrarCliente() {
    System.out.println("Registrar Cliente");
    String idEmpleado = "1";
    Cliente cliente = new Cliente("1", "Juan", "Av 54 Cerro Colorado", "dni", 54623154,new Empleado(idEmpleado));
    ClienteImpl instance = new ClienteImpl();
    instance.Registrar(cliente);
    // Agrega aserciones o validaciones para verificar si el registro fue exitoso
}

@Test
public void testActualizarCliente() {
    System.out.println("Actualizar Cliente");
    String idEmpleado = "1";
    Cliente cliente = new Cliente("1", "Juan", "Av 54 Cerro Colorado", "dni", 54623154,new Empleado(idEmpleado));
    ClienteImpl instance = new ClienteImpl();
    instance.Actualizar(cliente);
    // Agrega aserciones o validaciones para verificar si la actualización fue exitosa
}

@Test
public void testListarClientes() {
    System.out.println("Listar Clientes");
    ClienteImpl instance = new ClienteImpl();
    List<Cliente> result = instance.Lista();
    assertNotNull(result); // Verifica que la lista no sea nula
    // Agrega otras aserciones o validaciones si es necesario
}

@Test
public void testEliminarCliente() {
    System.out.println("Eliminar Cliente");
    String idEmpleado = "1";
    Cliente cliente = new Cliente("1", "Juan", "Av 54 Cerro Colorado", "dni", 54623154,new Empleado(idEmpleado));
    ClienteImpl instance = new ClienteImpl();
    instance.Eliminar(cliente);
    // Agrega aserciones o validaciones para verificar si la eliminación fue exitosa
}

    
}
