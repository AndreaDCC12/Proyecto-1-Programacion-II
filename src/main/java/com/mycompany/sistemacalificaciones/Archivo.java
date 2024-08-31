/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacalificaciones;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class Archivo {

    private RandomAccessFile file;

    // Abre el archivo en modo lectura y escritura
    public void abrirArchivo(String nombreArchivo) throws IOException {
        file = new RandomAccessFile(nombreArchivo, "rw");
    }

    // Cierra el archivo
    public void cerrarArchivo() throws IOException {
        if (file != null) {
            file.close();
        }
    }

    // Lee un registro para llenar un objeto Alumno a partir de una posición dada
    public Alumno obtenerRegistro(int posicion) throws IllegalArgumentException, IOException {
        if (posicion < 0) {
            throw new IllegalArgumentException("Posición fuera de rango");
        }

        Alumno alumno = new Alumno();
        file.seek(posicion * Alumno.getTAMANIO());

        alumno.setNombre(leerCadena(Alumno.LONGITUD_NOMBRE));
        alumno.setApellido(leerCadena(Alumno.LONGITUD_APELLIDO));
        alumno.setCodigoalumno(file.readInt());
        alumno.setBimestre(leerCadena(Alumno.LONGITUD_BIMESTRE));
        alumno.setMatematicas(file.readDouble());
        alumno.setComunicacion(file.readDouble());
        alumno.setSociales(file.readDouble());
        alumno.setNaturales(file.readDouble());
        alumno.setComputacion(file.readDouble());
        alumno.setPromedio(file.readDouble());
        return alumno;
    }

    // Almacena un alumno en la posición dada
    public void nuevoRegistro(int posicion, Alumno alumno) throws IOException {
        file.seek(posicion * Alumno.getTAMANIO()); // Mueve el puntero a la posición dada
        escribirCadena(alumno.getNombre(), Alumno.LONGITUD_NOMBRE);
        escribirCadena(alumno.getApellido(), Alumno.LONGITUD_APELLIDO);
        file.writeInt(alumno.getCodigoalumno());
        escribirCadena(alumno.getBimestre(), Alumno.LONGITUD_BIMESTRE);
        file.writeDouble(alumno.getMatematicas());
        file.writeDouble(alumno.getComunicacion());
        file.writeDouble(alumno.getSociales());
        file.writeDouble(alumno.getNaturales());
        file.writeDouble(alumno.getComputacion());
        file.writeDouble(alumno.getPromedio());
    }

    // Elimina un registro del archivo al escribir un registro en blanco
    public void eliminarRegistro(int posicion) throws IllegalArgumentException, IOException {
        if (posicion < 0) {
            throw new IllegalArgumentException("Posición fuera de rango");
        }

        file.seek(posicion * Alumno.getTAMANIO());

        // Crear un objeto Alumno con valores predeterminados
        Alumno alumno = new Alumno();
        escribirCadena(alumno.getNombre(), Alumno.LONGITUD_NOMBRE);
        escribirCadena(alumno.getApellido(), Alumno.LONGITUD_APELLIDO);
        file.writeInt(alumno.getCodigoalumno());
        escribirCadena(alumno.getBimestre(), Alumno.LONGITUD_BIMESTRE);
        file.writeDouble(alumno.getMatematicas());
        file.writeDouble(alumno.getComunicacion());
        file.writeDouble(alumno.getSociales());
        file.writeDouble(alumno.getNaturales());
        file.writeDouble(alumno.getComputacion());
        file.writeDouble(alumno.getPromedio());
    }
    // Escribir la cadena en el archivo
    private void escribirCadena(String cadena, int longitud) throws IOException {
        StringBuffer buffer = new StringBuffer(cadena);
        if (cadena.length() < longitud) {
            buffer.setLength(longitud);
        } else {
            buffer.setLength(longitud);
        }
        file.writeChars(buffer.toString()); 
    }

    private String leerCadena(int longitud) throws IOException {
        char[] cadena = new char[longitud];
        for (int i = 0; i < longitud; i++) {
            cadena[i] = file.readChar(); // Leer carácter por carácter
        }
        // Convertir a cadena
        return new String(cadena).trim(); 
    }

    // Método para buscar la posición por código
    public int buscarPosicionPorCodigo(int codigo) throws IOException {
        List<Alumno> alumnos = obtenerTodosLosRegistros();
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getCodigoalumno() == codigo) {
                return i; 
            }
        }
        return -1;
    }

    public List<Alumno> obtenerTodosLosRegistros() throws IOException {
        List<Alumno> alumnos = new ArrayList<>();
        file.seek(0); // Asegúrate de empezar desde el inicio del archivo
        while (file.getFilePointer() < file.length()) {
            Alumno alumno = obtenerRegistro((int) (file.getFilePointer() / Alumno.getTAMANIO()));
            alumnos.add(alumno);
        }
        return alumnos;
    }

}
