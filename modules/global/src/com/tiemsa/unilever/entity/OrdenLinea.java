package com.tiemsa.unilever.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "UNILEVERPLANTAS_ORDEN_LINEA")
@Entity(name = "unileverplantas$OrdenLinea")
public class OrdenLinea extends StandardEntity {
    private static final long serialVersionUID = 2833974068603530722L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDEN_ID")
    protected Orden orden;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCTO_ID")
    protected Producto producto;

    @NotNull
    @Column(name = "CANTIDAD", nullable = false, precision = 19, scale = 3)
    protected BigDecimal cantidad;

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }


}