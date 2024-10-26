package com.itsqmet.prueba.modelo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmpleado;
    private String nombre;
    private String apellido;
    private double salario;
}
