package com.tiemsa.unilever.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|nombre")
@Table(name = "UNILEVERPLANTAS_PRODUCTO")
@Entity(name = "unileverplantas$Producto")
public class Producto extends StandardEntity {
    private static final long serialVersionUID = 5286902011018145403L;

    @NotNull
    @Column(name = "NOMBRE", nullable = false)
    protected String nombre;

    @Column(name = "PRECIO", precision = 19, scale = 3)
    protected BigDecimal precio;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public BigDecimal getPrecio() {
        return precio;
    }


}