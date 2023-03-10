package a.calculadora;

import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {
    //??? Aca creamos un objeto de la clase ObjetoCalculadora, instanciamos.
        ObjetoCalculadora calculadora = new ObjetoCalculadora();
//Se asignan valores a los atributos de la clase
//// Aca hay parte del 5 punto.
        calculadora.setNumero1(Integer.parseInt(JOptionPane.showInputDialog("Digite el Numero 1")));
        calculadora.setNumero2(Integer.parseInt(JOptionPane.showInputDialog("Digite el Numero 2")));
//Se ejecutan las operaciones

// 4 punto.
//Suma
        int resultado = calculadora.calcularSuma();
        calculadora.imprimir("La Suma de los dos numeros es ",resultado);
//Resta
     
        resultado = calculadora.calcularResta();
        calculadora.imprimir("La Resta de los dos numeros es ",resultado);
//Multiplicacion
        
        resultado = calculadora.calcularMultiplicacion();
        calculadora.imprimir("La Multiplicacion de los dos numeros es ",resultado);
//División
       
        resultado = calculadora.calcularDivision();
        calculadora.imprimir("La Divicion de los dos numeros es ",resultado);        
    }
}
