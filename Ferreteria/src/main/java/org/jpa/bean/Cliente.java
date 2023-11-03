/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jpa.bean;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "cliente", catalog = "ferreteria", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByIdCliente", query = "SELECT c FROM Cliente c WHERE c.idCliente = :idCliente"),
    @NamedQuery(name = "Cliente.findByNombres", query = "SELECT c FROM Cliente c WHERE c.nombres = :nombres"),
    @NamedQuery(name = "Cliente.findByDireccion", query = "SELECT c FROM Cliente c WHERE c.direccion = :direccion"),
    @NamedQuery(name = "Cliente.findByTipoIdentificcion", query = "SELECT c FROM Cliente c WHERE c.tipoIdentificcion = :tipoIdentificcion"),
    @NamedQuery(name = "Cliente.findByIdentificacion", query = "SELECT c FROM Cliente c WHERE c.identificacion = :identificacion")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idCliente", nullable = false, length = 6)
    private String idCliente;
    @Basic(optional = false)
    @Column(name = "nombres", nullable = false, length = 100)
    private String nombres;
    @Basic(optional = false)
    @Column(name = "direccion", nullable = false, length = 100)
    private String direccion;
    @Basic(optional = false)
    @Column(name = "tipoIdentificcion", nullable = false, length = 3)
    private String tipoIdentificcion;
    @Basic(optional = false)
    @Column(name = "identificacion", nullable = false)
    private int identificacion;
    @JoinColumns({
        @JoinColumn(name = "idEmpleado", referencedColumnName = "idEmpleado", nullable = false),
        @JoinColumn(name = "idEmpleado", referencedColumnName = "idEmpleado", nullable = false)})
    @ManyToOne(optional = false)
    private Empleado empleado;

    public Cliente() {
    }

    public Cliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente(String idCliente, String nombres, String direccion, String tipoIdentificcion, int identificacion, Empleado empleado) {
        this.idCliente = idCliente;
        this.nombres = nombres;
        this.direccion = direccion;
        this.tipoIdentificcion = tipoIdentificcion;
        this.identificacion = identificacion;
        this.empleado = empleado;
    }



    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoIdentificcion() {
        return tipoIdentificcion;
    }

    public void setTipoIdentificcion(String tipoIdentificcion) {
        this.tipoIdentificcion = tipoIdentificcion;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.jpa.bean.Cliente[ idCliente=" + idCliente + " ]";
    }
    
}
