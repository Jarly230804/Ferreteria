package org.jpa.bean;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "comprobante", catalog = "ferreteria", schema = "")
@NamedQueries({
    @NamedQuery(name = "Comprobante.findAll", query = "SELECT c FROM Comprobante c"),
    @NamedQuery(name = "Comprobante.findByIdComprobante", query = "SELECT c FROM Comprobante c WHERE c.idComprobante = :idComprobante"),
    @NamedQuery(name = "Comprobante.findByNumComprobante", query = "SELECT c FROM Comprobante c WHERE c.numComprobante = :numComprobante"),
    @NamedQuery(name = "Comprobante.findByFecha", query = "SELECT c FROM Comprobante c WHERE c.fecha = :fecha"),
    @NamedQuery(name = "Comprobante.findByTipoComprobante", query = "SELECT c FROM Comprobante c WHERE c.tipoComprobante = :tipoComprobante")})
public class Comprobante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idComprobante", nullable = false, length = 6)
    private String idComprobante;
    @Basic(optional = false)
    @Column(name = "numComprobante", nullable = false, length = 6)
    private String numComprobante;
    @Basic(optional = false)
    @Column(name = "fecha", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "tipoComprobante", nullable = false, length = 7)
    private String tipoComprobante;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idComprobante")
    private List<Detallecomprobante> detallecomprobanteList;
    @JoinColumn(name = "idCliente", referencedColumnName = "idCliente", nullable = false)
    @ManyToOne(optional = false)
    private Cliente idCliente;

    public Comprobante() {
    }

    public Comprobante(String idComprobante) {
        this.idComprobante = idComprobante;
    }

    public Comprobante(String idComprobante, String numComprobante, Date fecha, String tipoComprobante, Cliente idCliente) {
        this.idComprobante = idComprobante;
        this.numComprobante = numComprobante;
        this.fecha = fecha;
        this.tipoComprobante = tipoComprobante;
        this.idCliente = idCliente;
    }



    public String getIdComprobante() {
        return idComprobante;
    }

    public void setIdComprobante(String idComprobante) {
        this.idComprobante = idComprobante;
    }

    public String getNumComprobante() {
        return numComprobante;
    }

    public void setNumComprobante(String numComprobante) {
        this.numComprobante = numComprobante;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public List<Detallecomprobante> getDetallecomprobanteList() {
        return detallecomprobanteList;
    }

    public void setDetallecomprobanteList(List<Detallecomprobante> detallecomprobanteList) {
        this.detallecomprobanteList = detallecomprobanteList;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idComprobante != null ? idComprobante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comprobante)) {
            return false;
        }
        Comprobante other = (Comprobante) object;
        if ((this.idComprobante == null && other.idComprobante != null) || (this.idComprobante != null && !this.idComprobante.equals(other.idComprobante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.jpa.bean.Comprobante[ idComprobante=" + idComprobante + " ]";
    }
    
}
