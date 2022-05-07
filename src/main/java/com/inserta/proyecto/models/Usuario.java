package com.inserta.proyecto.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String pass;
    private String descripcion;
    private int idSocio;
    private int idRolUsuario;
    private int estado;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime fechaRegistro;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime ultimoAcceso;































}
