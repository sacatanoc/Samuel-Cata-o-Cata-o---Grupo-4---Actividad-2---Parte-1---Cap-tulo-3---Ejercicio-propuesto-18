/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parte_1_problema_1;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author Samuel Cataño C
 */
public class Parte_1_Problema_1 {

    public static void main(String[] args) {
        
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Por favor ingrese el código del empleado: ");
        int codigo = lector.nextInt();
        
        System.out.println("Por favor ingrese el nombre del empleado: ");
        String nombre = lector.next();
        
        System.out.println("Por favor ingrese el número de horas que el empleado trabaja al mes: ");
        int horas_mes = lector.nextInt();
        
        System.out.println("Por favor ingrese el valor de la hora de trabajo del empleado: ");
        double valor_hora = lector.nextDouble();
        
        System.out.println("Por favor ingrese el porcentaje de retención en la fuente del empleado: ");
        double pctj_retencion = lector.nextDouble();
        
        Empleado empleado_1 = new Empleado(codigo, nombre, horas_mes, valor_hora, pctj_retencion);
        
        System.out.println("Codigo: "+empleado_1.codigo);
        System.out.println("Nombre: "+empleado_1.nombre);
        System.out.println("Salario bruto: "+empleado_1.salario_bruto());
        System.out.println("Salario neto: "+empleado_1.salario_neto());
        
    }
}
