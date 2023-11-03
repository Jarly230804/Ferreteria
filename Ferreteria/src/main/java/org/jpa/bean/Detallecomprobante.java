package org.jpa.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "detallecomprobante", catalog = "ferreteria", schema = "")
@NamedQueries({
    @NamedQuery(name = "Detallecomprobante.findAll", query = "SELECT d FROM Detallecomprobante d"),
    @NamedQuery(name = "Detallecomprobante.findByIdDetalleComprobante", query = "SELECT d FROM Detallecomprobante d WHERE d.idDetalleComprobante = :idDetalleComprobante"),
    @NamedQuery(name = "Detallecomprobante.findByCantidad", query = "SELECT d FROM Detallecomprobante d WHERE d.cantidad = :cantidad"),
    @NamedQuery(name = "Detallecomprobante.findByPrecioUnitario", query = "SELECT d FROM Detallecomprobante d WHERE d.precioUnitario = :precioUnitario"),
    @NamedQuery(name = "Detallecomprobante.findByImporte", query = "SELECT d FROM Detallecomprobante d WHERE d.importe = :importe")})
public class Detallecomprobante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idDetalleComprobante", nullable = false, length = 6)
    private String idDetalleComprobante;
    @Basic(optional = false)
    @Column(name = "cantidad", nullable = false)
    private int cantidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "precioUnitario", nullable = false, precision = 10, scale = 2)
    private BigDecimal precioUnitario;
    @Basic(optional = false)
    @Column(name = "importe", nullable = false, precision = 10, scale = 2)
    private BigDecimal importe;
    @JoinColumn(name = "idComprobante", referencedColumnName = "idComprobante", nullable = false)
    @ManyToOne(optional = false)
    private Comprobante idComprobante;
    @JoinColumn(name = "idProducto", referencedColumnName = "idProducto", nullable = false)
    @ManyToOne(optional = false)
    private Producto idProducto;

    public Detallecomprobante() {
    }

    public Detallecomprobante(String idDetalleComprobante) {
        this.idDetalleComprobante = idDetalleComprobante;
    }

    public Detallecomprobante(String idDetalleComprobante, int cantidad, BigDecimal precioUnitario, BigDecimal importe, Comprobante idComprobante, Producto idProducto) {
        this.idDetalleComprobante = idDetalleComprobante;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.importe = importe;
        this.idComprobante = idComprobante;
        this.idProducto = idProducto;
    }

  

    public String getIdDetalleComprobante() {
        return idDetalleComprobante;
    }

    public void setIdDetalleComprobante(String idDetalleComprobante) {
        this.idDetalleComprobante = idDetalleComprobante;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    public Comprobante getIdComprobante() {
        return idComprobante;
    }

    public void setIdComprobante(Comprobante idComprobante) {
        this.idComprobante = idComprobante;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleComprobante != null ? idDetalleComprobante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallecomprobante)) {
            return false;
        }
        Detallecomprobante other = (Detallecomprobante) object;
        if ((this.idDetalleComprobante == null && other.idDetalleComprobante != null) || (this.idDetalleComprobante != null && !this.idDetalleComprobante.equals(other.idDetalleComprobante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.jpa.bean.Detallecomprobante[ idDetalleComprobante=" + idDetalleComprobante + " ]";
    }
    
}
