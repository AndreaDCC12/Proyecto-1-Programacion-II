package com.mycompany.sistemacalificaciones;

import java.io.Serializable;



public class Alumno implements Serializable {

    private static final long serialVersionUID = 1L;

    // Definición de las longitudes de los campos en bytes
    public static final int LONGITUD_NOMBRE = 30; 
    public static final int LONGITUD_APELLIDO = 30; 
    public static final int LONGITUD_BIMESTRE = 10; 
    public static final int TAMANIO = LONGITUD_NOMBRE * 2 + LONGITUD_APELLIDO * 2 + 4 + LONGITUD_BIMESTRE * 2 + 5 * 8; // Total en bytes

    private String nombre;
    private String apellido;
    private int codigoalumno;
    private String bimestre;
    private double matematicas;
    private double comunicacion;
    private double sociales;
    private double naturales;
    private double computacion;
    private double promedio;

    // Constructor vacío
    public Alumno() {
        this.nombre = "";
        this.apellido = "";
        this.codigoalumno = 0;
        this.bimestre = "";
        this.matematicas = 0.0;
        this.comunicacion = 0.0;
        this.sociales = 0.0;
        this.naturales = 0.0;
        this.computacion = 0.0;

    }

    // Constructor con parámetros
    public Alumno(String nombre, String apellido, int codigoalumno, String bimestre, double matematicas, double comunicacion, double sociales, double naturales, double computacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoalumno = codigoalumno;
        this.bimestre = bimestre;
        this.matematicas = matematicas;
        this.comunicacion = comunicacion;
        this.sociales = sociales;
        this.naturales = naturales;
        this.computacion = computacion;

    }

    // Métodos getter y setter
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

    public int getCodigoalumno() {

        return codigoalumno;
    }

    public void setCodigoalumno(int codigoalumno) {
        this.codigoalumno = codigoalumno;
    }

    public String getBimestre() {
        return bimestre;
    }

    public void setBimestre(String bimestre) {
        this.bimestre = bimestre;
    }

    public double getMatematicas() {
        return matematicas;
    }

    public void setMatematicas(double matematicas) {
        this.matematicas = matematicas;
    }

    public double getComunicacion() {
        return comunicacion;
    }

    public void setComunicacion(double comunicacion) {
        this.comunicacion = comunicacion;
    }

    public double getSociales() {
        return sociales;
    }

    public void setSociales(double sociales) {
        this.sociales = sociales;
    }

    public double getNaturales() {
        return naturales;
    }

    public void setNaturales(double naturales) {
        this.naturales = naturales;
    }

    public double getComputacion() {
        return computacion;
    }

    public void setComputacion(double computacion) {
        this.computacion = computacion;
    }

    // Devuelve el tamaño en bytes de un registro de Alumno
    public static int getTAMANIO() {
        return TAMANIO;
    }
public double getPromedio() {
        return (matematicas + comunicacion + sociales + naturales + computacion) / 5;
    }

    public String getEstadoaprobacion() {
        if (promedio > 59) {
            return "Aprobado";
        } else {
            return "Desaprobado";
        }

    }

    double setPromedio(double readDouble) {
         return (matematicas + comunicacion + sociales + naturales + computacion) / 5;
    }
}