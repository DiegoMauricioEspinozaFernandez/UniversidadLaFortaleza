/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Planta extends Profesor {
    
    private double salarioBasico;
    private double numPuntoSalarial;
    private double valorPunto;
    private String categoria;
    private int numResolucion;
    private Date fechaNombramiento;

    public Planta() {
    }

    public Planta(double salarioBasico, double numPuntoSalarial, double valorPunto, String categoria, int numResolucion, Date fechaNombramiento) {
        this.salarioBasico = salarioBasico;
        this.numPuntoSalarial = numPuntoSalarial;
        this.valorPunto = valorPunto;
        this.categoria = categoria;
        this.numResolucion = numResolucion;
        this.fechaNombramiento = fechaNombramiento;
    }

    public Planta(double salarioBasico, double numPuntoSalarial, double valorPunto, String categoria, int numResolucion, Date fechaNombramiento, String codigo, String nombre, String titulo, Departamento departamento) {
        super(codigo, nombre, titulo, departamento);
        this.salarioBasico = salarioBasico;
        this.numPuntoSalarial = numPuntoSalarial;
        this.valorPunto = valorPunto;
        this.categoria = categoria;
        this.numResolucion = numResolucion;
        this.fechaNombramiento = fechaNombramiento;
    }

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public double getNumPuntoSalarial() {
        return numPuntoSalarial;
    }

    public void setNumPuntoSalarial(double numPuntoSalarial) {
        this.numPuntoSalarial = numPuntoSalarial;
    }

    public double getValorPunto() {
        return valorPunto;
    }

    public void setValorPunto(double valorPunto) {
        this.valorPunto = valorPunto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNumResolucion() {
        return numResolucion;
    }

    public void setNumResolucion(int numResolucion) {
        this.numResolucion = numResolucion;
    }

    public Date getFechaNombramiento() {
        return fechaNombramiento;
    }

    public void setFechaNombramiento(Date fechaNombramiento) {
        this.fechaNombramiento = fechaNombramiento;
    }
    

    public void calcularSalario(){
    
    double salario;
    
    salario=salarioBasico+(numPuntoSalarial*valorPunto);
    System.out.println("El salario es de:"+salario);
    
    }
    
    
    
}
