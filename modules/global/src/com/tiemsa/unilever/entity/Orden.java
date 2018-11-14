package com.tiemsa.unilever.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Table(name = "UNILEVERPLANTAS_ORDEN")
@Entity(name = "unileverplantas$Orden")
public class Orden extends StandardEntity {
    private static final long serialVersionUID = -7792491519951137533L;

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    @Column(name = "FECHA", nullable = false)
    protected Date fecha;

    @NotNull
    @Column(name = "MONTO", nullable = false)
    protected BigDecimal monto;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CLIENTE_ID")
    protected Clientes cliente;

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Clientes getCliente() {
        return cliente;
    }


    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public BigDecimal getMonto() {
        return monto;
    }


}