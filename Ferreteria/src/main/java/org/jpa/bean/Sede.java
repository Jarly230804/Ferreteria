/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jpa.bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "sede", catalog = "ferreteria", schema = "")
@NamedQueries({
    @NamedQuery(name = "Sede.findAll", query = "SELECT s FROM Sede s"),
    @NamedQuery(name = "Sede.findByIdSede", query = "SELECT s FROM Sede s WHERE s.idSede = :idSede"),
    @NamedQuery(name = "Sede.findByNombre", query = "SELECT s FROM Sede s WHERE s.nombre = :nombre"),
    @NamedQuery(name = "Sede.findByDirecci\u00f3n", query = "SELECT s FROM Sede s WHERE s.direcci\u00f3n = :direcci\u00f3n"),
    @NamedQuery(name = "Sede.findByTel\u00e9fono", query = "SELECT s FROM Sede s WHERE s.tel\u00e9fono = :tel\u00e9fono")})
public class Sede implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSede")
    private List<Empleado> empleadoList;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idSede", nullable = false, length = 6)
    private String idSede;
    @Basic(optional = false)
    @Column(name = "nombre", nullable = false, length = 45)
    private String nombre;
    @Basic(optional = false)
    @Column(name = "direcci\u00f3n", nullable = false, length = 100)
    private String dirección;
    @Basic(optional = false)
    @Column(name = "tel\u00e9fono", nullable = false)
    private int teléfono;
    @JoinColumn(name = "idAdministrador", referencedColumnName = "idAdministrador", nullable = false)
    @ManyToOne(optional = false)
    private Administrador idAdministrador;

    public Sede() {
    }

    public Sede(String idSede) {
        this.idSede = idSede;
    }

    public Sede(String idSede, String nombre, String dirección, int teléfono, Administrador idAdministrador) {
        this.idSede = idSede;
        this.nombre = nombre;
        this.dirección = dirección;
        this.teléfono = teléfono;
        this.idAdministrador = idAdministrador;
    }

   

    public String getIdSede() {
        return idSede;
    }

    public void setIdSede(String idSede) {
        this.idSede = idSede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public int getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(int teléfono) {
        this.teléfono = teléfono;
    }

    public Administrador getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(Administrador idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSede != null ? idSede.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sede)) {
            return false;
        }
        Sede other = (Sede) object;
        if ((this.idSede == null && other.idSede != null) || (this.idSede != null && !this.idSede.equals(other.idSede))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.jpa.bean.Sede[ idSede=" + idSede + " ]";
    }

    public List<Empleado> getEmpleadoList() {
        return empleadoList;
    }

    public void setEmpleadoList(List<Empleado> empleadoList) {
        this.empleadoList = empleadoList;
    }
    
}
