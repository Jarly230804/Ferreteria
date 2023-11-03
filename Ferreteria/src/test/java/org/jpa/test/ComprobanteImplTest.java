package org.jpa.test;

import java.util.Date;
import java.util.List;
import org.jpa.bean.Cliente;
import org.jpa.bean.Comprobante;
import org.jpa.dao.ComprobanteImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ComprobanteImplTest {
    
    public ComprobanteImplTest() {
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
     * Test of Registrar method, of class ComprobanteImpl.
     */
@Test
public void testRegistrarComprobante() {
    System.out.println("Registrar Comprobante");
    java.util.Date utilDate = new java.util.Date();
    Date fecha = new Date(utilDate.getTime());
    String idCliente ="1";
    Comprobante comprobante = new Comprobante("1", "1", fecha, "boleta",new Cliente(idCliente));
    ComprobanteImpl instance = new ComprobanteImpl();
    instance.Registrar(comprobante);
    // Agrega aserciones o validaciones para verificar si el registro fue exitoso
}

@Test
public void testActualizarComprobante() {
    System.out.println("Actualizar Comprobante");
    java.util.Date utilDate = new java.util.Date();
    Date fecha = new Date(utilDate.getTime());
    String idCliente ="1";
    Comprobante comprobante = new Comprobante("2", "2", fecha, "boleta",new Cliente(idCliente));
    ComprobanteImpl instance = new ComprobanteImpl();
    instance.Actualizar(comprobante);
    // Agrega aserciones o validaciones para verificar si la actualización fue exitosa
}

@Test
public void testListarComprobantes() {
    System.out.println("Listar Comprobantes");
    ComprobanteImpl instance = new ComprobanteImpl();
    List<Comprobante> result = instance.Lista();
    assertNotNull(result); // Verifica que la lista no sea nula
    // Agrega otras aserciones o validaciones si es necesario
}

@Test
public void testEliminarComprobante() {
    System.out.println("Eliminar Comprobante");
    java.util.Date utilDate = new java.util.Date();
    Date fecha = new Date(utilDate.getTime());
    String idCliente ="1";
    Comprobante comprobante = new Comprobante("2", "2", fecha, "boleta",new Cliente(idCliente));
    ComprobanteImpl instance = new ComprobanteImpl();
    instance.Eliminar(comprobante);
    // Agrega aserciones o validaciones para verificar si la eliminación fue exitosa
}

    
}
