# modularidad-y-encapsulamiento
ejercicios hechos por medio de modularidad y encapsulamiento en java







Objetivo Laboratorio:
Reconocer las diferencias básicas entre programación estructurada y programación orientada a objetos:
Preparación y creación del proyecto:
1. Cree un nuevo proyecto y copie el código adjunto llamado Areas.

import javax.swing.JOptionPane;

public class Areas {

public static void main(String[] args)

{

double base = 0.0; 

double altura = 0.0;

double radio = 0.0;

double areaCuadrado = 0.0;

double areaCirculo = 0.0;

double pi = 3.1416;

base = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite la base"));

radio = Double.parseDouble (JOptionPane.showInputDialog(null, "Digite el radio"));

altura = Double.parseDouble (JOptionPane.showInputDialog(null, "Digite la altura "));

areaCuadrado = base * altura;

areaCirculo = pi * (radio * radio);

JOptionPane.showMessageDialog(null, "El área del cuadrado es: "+ areaCuadrado)

JOptionPane.showMessageDialog(null, "El área de la circunferencia es: "+ areaCirculo)

}
}



2. Realizar la reescritura del programa aplicando conceptos modularidad y diseño del paradigma orientado a
objetos:
a. Trasladar los datos como atributos de la clase.
b. Crear los métodos que aíslen la lógica del problema.
c. Para la lectura de datos, crear un método de tal manera que se realice una sola implementación.
d. Cree un método para la impresión de los resultados.
e. Modifique el método main para que haga el llamado a los métodos correspondientes.








