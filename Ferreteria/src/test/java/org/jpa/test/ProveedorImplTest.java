package org.jpa.test;

import java.util.List;
import org.jpa.bean.Proveedor;
import org.jpa.dao.ProveedorImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ProveedorImplTest {
    
    public ProveedorImplTest() {
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
     * Test of Registrar method, of class ProveedorImpl.
     */
@Test
public void testRegistrarProveedor() {
    System.out.println("Registrar Proveedor");
    Proveedor proveedor = new Proveedor("1", "Juan Manuel", "juan@gmail.com", "Calle Mercedes","985632145");
    ProveedorImpl instance = new ProveedorImpl();
    instance.Registrar(proveedor);
    // Agrega aserciones o validaciones para verificar si el registro fue exitoso
}

@Test
public void testActualizarProveedor() {
    System.out.println("Actualizar Proveedor");
    Proveedor proveedor = new Proveedor("1", "Juan Gabrile", "juan@gmail.com", "Calle Mercedes","985632145");
    ProveedorImpl instance = new ProveedorImpl();
    instance.Actualizar(proveedor);
    // Agrega aserciones o validaciones para verificar si la actualización fue exitosa
}

@Test
public void testListarProveedores() {
    System.out.println("Listar Proveedores");
    ProveedorImpl instance = new ProveedorImpl();
    List<Proveedor> result = instance.Lista();
    assertNotNull(result); // Verifica que la lista no sea nula
    // Agrega otras aserciones o validaciones si es necesario
}

@Test
public void testEliminarProveedor() {
    System.out.println("Eliminar Proveedor");
    Proveedor proveedor = new Proveedor("1", "Juan Gabrile", "juan@gmail.com", "Calle Mercedes","985632145");
    ProveedorImpl instance = new ProveedorImpl();
    instance.Eliminar(proveedor);
    // Agrega aserciones o validaciones para verificar si la eliminación fue exitosa
}

    
}
