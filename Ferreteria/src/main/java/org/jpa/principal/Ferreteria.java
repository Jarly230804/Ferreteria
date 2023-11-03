package org.jpa.principal;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import org.jpa.bean.Administrador;
import org.jpa.bean.Categoria;
import org.jpa.bean.Cliente;
import org.jpa.bean.Comprobante;
import org.jpa.bean.Detallecomprobante;
import org.jpa.bean.Empleado;
import org.jpa.bean.Producto;
import org.jpa.bean.Proveedor;
import org.jpa.bean.Sede;
import org.jpa.dao.CategoriaImpl;
import org.jpa.dao.ClienteImpl;
import org.jpa.dao.ComprobanteImpl;
import org.jpa.dao.DetalleComprobanteImpl;
import org.jpa.dao.EmpleadoImpl;
import org.jpa.dao.AdministradorImpl;
import org.jpa.dao.ProductoImpl;
import org.jpa.dao.ProveedorImpl;
import org.jpa.dao.SedeImpl;

 
public class Ferreteria {
    
    public static void main(String[] args) {
        System.out.println("JPA");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Elige la operación a realizar:");
            System.out.println("1. CRUD Administrador");
            System.out.println("2. CRUD Categoria");
            System.out.println("3. CRUD Proveedor");
            System.out.println("4. CRUD Sede");
            System.out.println("5. CRUD Empleado");
            System.out.println("6. CRUD Cliente");
            System.out.println("7. CRUD Producto");
            System.out.println("8. CRUD Comprobante");
            System.out.println("9. CRUD DetalleComprobante");
            
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    //CRUD ADMINISTRADOR
                    AdministradorImpl ferreteria = new AdministradorImpl();
                    //REGISTRO                   
                    ferreteria.Registrar(new Administrador("7","Juan Lopez Quispe","78564235","juan@gmail.com","986568958"));
                    
                    //ACTUALIZAR      
                   //ferreteria.Actualizar(new Administrador("B101","Juan Angel Quispe","78564235","juan@gmail.com","986568958"));
       
                    //ELIMINAR
                    //ferreteria.Eliminar(new Administrador("B101","Juan Angel Quispe","78564235","juan@gmail.com","986568958"));
                    
                    //LISTAR
                    List<Administrador>ListaAdministrador = ferreteria.Lista();
                    for(Administrador u:ListaAdministrador){
                        System.out.println("Nombre  :"+u.getNombres());
                    }  }
                case 2 -> {
                    //CRUD CATEGORIA
                    CategoriaImpl categoria = new CategoriaImpl();
                    //REGISTRO
                    categoria.Registrar(new Categoria("2","Herramienta"));
                    //ACTUALIZAR      
                    categoria.Actualizar(new Categoria("1","Electronico"));
        
                    //ELIMINAR
                    categoria.Eliminar(new Categoria("1","Electronico"));
        
                    //LISTAR
                     List<Categoria>ListaCategorias = categoria.Lista();
                     for(Categoria u:ListaCategorias){
                     System.out.println("Nombre  :"+u.getNombre());
                    }
                }
                case 3 -> {
                    //CRUD PROVEEDOR
                    ProveedorImpl proveedor = new ProveedorImpl();
                    //REGISTRO
                    proveedor.Registrar(new Proveedor("1", "Juan Manuel", "juan@gmail.com", "Calle Mercedes","985632145"));
                    //ACTUALIZAR      
                    proveedor.Actualizar(new Proveedor("2", "Juan Gabrile", "juan@gmail.com", "Calle Mercedes","985632145"));
        
                    //ELIMINAR
                    proveedor.Eliminar(new Proveedor("2", "Juan Gabrile", "juan@gmail.com", "Calle Mercedes","985632145"));
        
                    //LISTAR
                    List<Proveedor>ListaProveedores = proveedor.Lista();
                      for(Proveedor u:ListaProveedores){
                          System.out.println("Nombre  :"+u.getNombres());        
                      }
                }
                case 4 -> {
                    //CRUD SEDE
                    SedeImpl sede = new SedeImpl();                 
                   
                    //REGISTRO                
                    String idAdministrador = "7"; // Este es el ID del administrador al que quieres asociar la sede

                    sede.Registrar(new Sede("S23", "Sede Principal", "Sede Principal", 123456789, new Administrador(idAdministrador)));
                    //ACTUALIZAR
                    sede.Actualizar(new Sede("S23", "Sede Principal", "Sede Principal", 123456789, new Administrador(idAdministrador)));

                    //ELIMINAR
                    sede.Eliminar(new Sede("S23", "Sede Principal", "Sede Principal", 123456789, new Administrador(idAdministrador)));

                    //LISTAR
                    List<Sede>ListarSedes = sede.Lista();
                    for(Sede u:ListarSedes){
                        System.out.println("Nombre  :" +u.getNombre());
                    }
                }



                case 5 ->{
                    //CRUD EMPLEADO
                    EmpleadoImpl empleado = new EmpleadoImpl();
                    String idSede="1";

                    //REGISTRO
                    empleado.Registrar(new Empleado("1", "", "48563214", "carlos@gmail", "Calle Manuel", new Sede(idSede)));

                    //ACTUALIZAR
                    empleado.Actualizar(new Empleado("2", "Carlos", "48563214", "carlos", "CalleManuel", new Sede(idSede)));

                    //ELIMINAR
                    empleado.Eliminar(new Empleado("2", "Carlos", "48563214", "carlos", "CalleManuel", new Sede(idSede)));

                    //LISTAR
                    List<Empleado>ListarEmpleados = empleado.Lista();
                    for(Empleado u:ListarEmpleados){
                        System.out.println("Nombre  :" +u.getNombres());
                    }
                }
                case 6 ->{
                    //CRUD CLIENTE
                    ClienteImpl cliente = new ClienteImpl();
                    String idEmpleado = "1";

                    //REGISTRO
                    cliente.Registrar(new Cliente("1", "Juna", "", "dni", 98745636, new Empleado(idEmpleado)));

                    //ACTUALIZAR
                    cliente.Actualizar(new Cliente("2", "Juan", "Av 54 Cerro Colorado", "dni", 54623154,new Empleado(idEmpleado)));

                    //ELIMINAR
                    cliente.Eliminar(new Cliente("2", "Juan", "Av 54 Cerro Colorado", "dni", 54623154,new Empleado(idEmpleado)));

                    //LISTAR
                    List<Cliente>ListarClientes = cliente.Lista();
                    for(Cliente u:ListarClientes){
                        System.out.println("Nombre  :" +u.getNombres());
                    }
                }
                case 7 ->{
                    //CRUD PRODUCTO
                    ProductoImpl producto = new ProductoImpl();                               
                    String idCategoria = "1";                 
                    String idProveedor ="1";

                    //REGISTRO
                    producto.Registrar(new Producto("1", "Martillo", new BigDecimal("10"), new BigDecimal("12.25"), 15,new Categoria(idCategoria), new Proveedor(idProveedor)));

                    //ACTUALIZAR
                    producto.Actualizar(new Producto("1", "Martillo", new BigDecimal("10"), new BigDecimal("12.12"), 15,new Categoria(idCategoria), new Proveedor(idProveedor)));

                    //ELIMINAR
                    producto.Eliminar(new Producto("1", "Martillo", new BigDecimal("10"), new BigDecimal("12.5"), 15,new Categoria(idCategoria), new Proveedor(idProveedor)));

                    //LISTAR 
                    List<Producto> ListaProductos = producto.Lista();
                    for(Producto u:ListaProductos){
                        System.out.println("Nombre  :"+u.getNombre());
                    }
                }
                case 8 ->{
                    //CRUD COMPROBANTE
                    ComprobanteImpl comprobante = new ComprobanteImpl();
                    java.util.Date utilDate = new java.util.Date();
                    Date fecha = new Date(utilDate.getTime());
                    String idCliente ="1";
                   
                    //REGISTRAR
                    comprobante.Registrar(new Comprobante("1", "1", fecha, "boleta", new Cliente(idCliente)));
                    
                    //ACTUALIZAR
                    comprobante.Actualizar(new Comprobante("2", "2", fecha, "boleta",new Cliente(idCliente)));

                    //ELIMINAR
                    comprobante.Eliminar(new Comprobante("2", "2", fecha, "boleta",new Cliente(idCliente)));

                    //LISTAR
                    List<Comprobante> ListaComprobantes = comprobante.Lista();
                    for(Comprobante u:ListaComprobantes){
                        System.out.println("Nombre  :" +u.getNumComprobante());
                    }
                }

                case 9 ->{
                    //CRUD DETALLE COMPROBANTE
                    DetalleComprobanteImpl detalleComprobante = new DetalleComprobanteImpl();
                    String idComprobante = "1";
                    String idProducto = "1";

                    //REGISTRAR
                    detalleComprobante.Registrar(new Detallecomprobante("1", 1, new BigDecimal("10"), new BigDecimal("10"), new Comprobante(idComprobante), new Producto(idProducto)));

                    //ACTUALIZAR
                    detalleComprobante.Actualizar(new Detallecomprobante("2", 1, new BigDecimal("10"), new BigDecimal("10"), new Comprobante(idComprobante), new Producto(idProducto)));

                    //ELIMINAR 
                    detalleComprobante.Eliminar(new Detallecomprobante("2", 1, new BigDecimal("10"), new BigDecimal("10"), new Comprobante(idComprobante), new Producto(idProducto)));

                    //LISTAR
                    List<Detallecomprobante> ListaComprobantes = detalleComprobante.Lista();
                    for(Detallecomprobante u:ListaComprobantes){
                        System.out.println("Nombre  : "+u.getIdDetalleComprobante());
                    }
                }
                default -> System.out.println("Opción no válida.");
            }
   
        }
    }
}
