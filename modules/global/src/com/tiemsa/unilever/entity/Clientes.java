package com.tiemsa.unilever.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|nombre")
@Table(name = "UNILEVERPLANTAS_CLIENTES")
@Entity(name = "unileverplantas$Clientes")
public class Clientes extends StandardEntity {
    private static final long serialVersionUID = -3608391563239771346L;

    @NotNull(message = "{msg://validacion_name}")
    @Column(name = "NOMBRE", nullable = false)
    protected String nombre;

    @Email(message = "{msg://correo_msg}")
    @NotNull(message = "{msg://requiere_corero}")
    @Column(name = "EMAIL", nullable = false)
    protected String email;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }


}