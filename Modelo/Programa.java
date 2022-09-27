/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Programa {
    private String codigo;
    private String nombre;
    private Profesor Director;
    
    List <Asignatura>asignatura=null;
    public Programa() {
        asignatura=new ArrayList<Asignatura>();
        
    }

    public Programa(String codigo, String nombre, Profesor Director) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.Director = Director;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getDirector() {
        return Director;
    }

    public void setDirector(Profesor Director) {
        this.Director = Director;
    }

    public List<Asignatura> getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(List<Asignatura> asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return "Programa{" + "codigo=" + codigo + ", nombre=" + nombre + ", Director=" + Director + ", asignatura=" + asignatura + '}';
    }
    

}