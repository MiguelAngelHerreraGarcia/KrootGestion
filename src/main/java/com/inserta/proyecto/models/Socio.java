package com.inserta.proyecto.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "socios")
public class Socio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String dni;
    private String tarjetaSanitaria;
    private String pasaporte;
    private LocalDateTime fechaNacimiento;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String diagnostico;
    private int idGenero;
    private int idEstado;
    private int idTipoSocio;
    private String domicilio;
    private String codigoPostal;
    private int idPoblacion;
    private int idProvincia;
    private int idPais;
    private String emailPrincipal;
    private String emailSecundario;
    private String telefonoFijo;
    private String telefonoMovil;
    private boolean lopd;
    private String urlFoto;
    private int idFormaPago;
    @Column (columnDefinition = "TIMESTAMP")
    private LocalDateTime fechaRegistro;
    private LocalDateTime fechaUltimoAcceso;
}