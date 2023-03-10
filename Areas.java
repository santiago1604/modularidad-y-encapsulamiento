/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

import javax.swing.JOptionPane;

public class Areas {

    private double base;
    private double altura;
    private double radio;
    private double areaCuadrado;
    private double areaCirculo;
    private final double pi = 3.1416;

    public void leerDatos() {
        base = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite la base"));
        radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el radio"));
        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite la altura"));
    }

    public void calcularAreaCuadrado() {
        areaCuadrado = base * altura;
    }

    public void calcularAreaCirculo() {
        areaCirculo = pi * (radio * radio);
    }

    public void imprimirResultados() {
        JOptionPane.showMessageDialog(null, "El área del cuadrado es: " + areaCuadrado);
        JOptionPane.showMessageDialog(null, "El área de la circunferencia es: " + areaCirculo);
    }
}


