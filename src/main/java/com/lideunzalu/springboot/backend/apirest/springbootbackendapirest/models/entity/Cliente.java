package com.lideunzalu.springboot.backend.apirest.springbootbackendapirest.models.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Id: Primary Key
 * @GeneratedValue: Cómo se genera esta Primary Key en bbdd.
 * GenerationType.IDENTITY: Para MySQL, SQLServer, h2. Cuando los id se generan de forma incremental
 * GenerationType.SEQUENCE: Para Oracle, Postgress.
 * @Column cuando el nombre del atributo es igual al nombre del campo en la tabla, se puede omitir ésta anotación.
 * @Temporal(TemporalType.DATE): Transforma la fecha de java a Date de MySQL
 */

@Entity
@Table(name="clientes")
public class Cliente implements Serializable {
    private static final long serialVersionUID = -3987156267836219868L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="apellido")
    private String apellido;

    @Column(name="email")
    private String email;

    @Column(name="fecha")
    //transforma la fecha de java al Date de mySQL
    @Temporal(TemporalType.DATE)
    private Date fecha;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
