package org.jpa.test;

import java.math.BigDecimal;
import java.util.List;
import org.jpa.bean.Categoria;
import org.jpa.bean.Producto;
import org.jpa.bean.Proveedor;
import org.jpa.dao.ProductoImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ProductoImplTest {
    
    public ProductoImplTest() {
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
     * Test of Registrar method, of class ProductoImpl.
     */
@Test
public void testRegistrarProducto() {
    System.out.println("Registrar Producto");
    String idCategoria = "1";                 
    String idProveedor ="1";
    Producto producto = new Producto("1", "Martillo", new BigDecimal("10"), new BigDecimal("12"), 15,new Categoria(idCategoria), new Proveedor(idProveedor));
    ProductoImpl instance = new ProductoImpl();
    instance.Registrar(producto);
    // Agrega aserciones o validaciones para verificar si el registro fue exitoso
}

@Test
public void testActualizarProducto() {
    System.out.println("Actualizar Producto");
    String idCategoria = "1";                 
    String idProveedor ="1";
    Producto producto = new Producto("1", "Martillo", new BigDecimal("10"), new BigDecimal("12"), 15,new Categoria(idCategoria), new Proveedor(idProveedor));
    ProductoImpl instance = new ProductoImpl();
    instance.Actualizar(producto);
    // Agrega aserciones o validaciones para verificar si la actualización fue exitosa
}

@Test
public void testListarProductos() {
    System.out.println("Listar Productos");
    ProductoImpl instance = new ProductoImpl();
    List<Producto> result = instance.Lista();
    assertNotNull(result); // Verifica que la lista no sea nula
    // Agrega otras aserciones o validaciones si es necesario
}

@Test
public void testEliminarProducto() {
    System.out.println("Eliminar Producto");
    String idCategoria = "1";                 
    String idProveedor ="1";
    Producto producto = new Producto("1", "Martillo", new BigDecimal("10"), new BigDecimal("12"), 15,new Categoria(idCategoria), new Proveedor(idProveedor));
    ProductoImpl instance = new ProductoImpl();
    instance.Eliminar(producto);
    // Agrega aserciones o validaciones para verificar si la eliminación fue exitosa
}

    
}
