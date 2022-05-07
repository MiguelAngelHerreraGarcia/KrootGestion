package com.inserta.proyecto.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "actividades")
public class Actividad {
    @Id
    @GeneratedValue
    private int id;
    private int idEstado;
    private String nombre;
    @Column(name = "descripcion_corta")
    private String descripcionCorta;
    @Column(name = "descripcion_larga")
    private String descripcionLarga;
    @Column(name = "id_tipo")
    private int idTipo;
    private String lugar;
    @Column(name="fecha_inicio",columnDefinition = "TIMESTAMP")
    private LocalDateTime  fechaInicio;
    @Column(name="fecha_fin",columnDefinition = "TIMESTAMP")
    private LocalDateTime  fechaFin;
    @Column(name="fecha_inscripcion_inicio",columnDefinition = "TIMESTAMP")
    private LocalDateTime  fechaInscripcionInicio;
    @Column(name="fecha_inscripcion_fin",columnDefinition = "TIMESTAMP")
    private LocalDateTime fechaInscripcionFin;
    @Column(name="aforo_minimo")
    private int aforoMinimo;
    @Column(name="aforo_maximo")
    private int aforoMaximo;
    @Column(name="num_participantes")
    private int numParticipantes;
}
