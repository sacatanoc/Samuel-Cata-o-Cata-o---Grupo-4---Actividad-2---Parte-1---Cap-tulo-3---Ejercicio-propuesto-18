/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parte_1_problema_1;

/**
 *
 * @author Samuel Cataño C
 */
public class Empleado {
    
    int codigo;
    String nombre;
    int horas_mes;
    double valor_hora;
    double pctj_retencion;
    
    public Empleado(int codigo, String nombre, int horas_mes, double valor_hora, double pctj_retencion){
        
        this.codigo = codigo;
        this.nombre = nombre;
        this.horas_mes = horas_mes;
        this.valor_hora = valor_hora;
        this.pctj_retencion = pctj_retencion;
    }
    
    public double salario_bruto(){
        
        return Math.floor(100*this.horas_mes*this.valor_hora+0.5)/100;
        
    }
    
    public double salario_neto(){
        
        return Math.floor(100*this.horas_mes*this.valor_hora*(1-this.pctj_retencion/100)+0.5)/100;
        
    }
    
}
