package org.jpa.test;

import java.math.BigDecimal;
import java.util.List;
import org.jpa.bean.Comprobante;
import org.jpa.bean.Detallecomprobante;
import org.jpa.bean.Producto;
import org.jpa.dao.DetalleComprobanteImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DetalleComprobanteImplTest {
    
    public DetalleComprobanteImplTest() {
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
     * Test of Registrar method, of class DetalleComprobanteImpl.
     */
@Test
public void testRegistrarDetalleComprobante() {
    System.out.println("Registrar Detalle Comprobante");
    String idComprobante = "1";
    String idProducto = "1";
    Detallecomprobante detalle = new Detallecomprobante("1", 1, new BigDecimal("10"), new BigDecimal("10"), new Comprobante(idComprobante), new Producto(idProducto));
    DetalleComprobanteImpl instance = new DetalleComprobanteImpl();
    instance.Registrar(detalle);
    // Agrega aserciones o validaciones para verificar si el registro fue exitoso
}

@Test
public void testActualizarDetalleComprobante() {
    System.out.println("Actualizar Detalle Comprobante");
    String idComprobante = "1";
    String idProducto = "1";
    Detallecomprobante detalle = new Detallecomprobante("1", 1, new BigDecimal("10"), new BigDecimal("10"), new Comprobante(idComprobante), new Producto(idProducto));
    DetalleComprobanteImpl instance = new DetalleComprobanteImpl();
    instance.Actualizar(detalle);
    // Agrega aserciones o validaciones para verificar si la actualización fue exitosa
}

@Test
public void testListarDetalleComprobantes() {
    System.out.println("Listar Detalle Comprobantes");
    DetalleComprobanteImpl instance = new DetalleComprobanteImpl();
    List<Detallecomprobante> result = instance.Lista();
    assertNotNull(result); // Verifica que la lista no sea nula
    // Agrega otras aserciones o validaciones si es necesario
}

@Test
public void testEliminarDetalleComprobante() {
    System.out.println("Eliminar Detalle Comprobante");
    String idComprobante = "1";
    String idProducto = "1";
    Detallecomprobante detalle = new Detallecomprobante("1", 1, new BigDecimal("10"), new BigDecimal("10"), new Comprobante(idComprobante), new Producto(idProducto));
    DetalleComprobanteImpl instance = new DetalleComprobanteImpl();
    instance.Eliminar(detalle);
    // Agrega aserciones o validaciones para verificar si la eliminación fue exitosa
}

    
}
