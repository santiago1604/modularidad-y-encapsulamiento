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







Objetivo Laboratorio: Llevar a la práctica los conceptos de encapsulamiento, haciendo uso de modularidad.
Preparación y creación del proyecto:
1. Cree un nuevo proyecto con las siguientes 2 Clases:
public class ObjetoCalculadora
{
//???
public int numero1;
public int numero2;
public int resultado;
//???
public ObjetoCalculadora() {
super();
}

//???
public int calcularSuma ()
{
resultado = 0;
resultado = numero1 + numero2;
return (resultado);
}
public int calcularResta ()
{
resultado = 0;
resultado = numero1 - numero2;
return (resultado);
}
public int calcularMultiplicacion ()
{
resultado = 0;
resultado = numero1 * numero2;
return (resultado);
}
public int calcularDivision ()
{
resultado = 0;
if (numero2 != 0)
{
resultado = numero1 / numero2;
}
return (resultado);
}
}
import javax.swing.JOptionPane;
public class Calculadora {
public static void main(String[] args)
{
//???
ObjetoCalculadora calculadora = new ObjetoCalculadora();
//Se asignan valores a los atributos de la clase
calculadora.numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el Numero 1"));
calculadora.numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el Numero 2"));
//Se ejecutan las operaciones
//Suma
calculadora.resultado =calculadora.calcularSuma();
JOptionPane.showMessageDialog(null,"Suma: " + calculadora.resultado);
//Resta
calculadora.resultado =calculadora.calcularResta();
JOptionPane.showMessageDialog(null,"Resta: "+ calculadora.resultado);
//Multiplicacion
calculadora.resultado =calculadora.calcularMultiplicacion();
JOptionPane.showMessageDialog(null,"Multiplicación: " + calculadora.resultado);
//División
calculadora.resultado =calculadora.calcularDivision();
JOptionPane.showMessageDialog(null,"División: " + calculadora.resultado);
}
}
2. Analice el programa y complete los comentarios que describen cada parte. (//???)
3. Cambie los métodos de la clase ObjetoCalculadora, optimizar eliminando la variable resultado, donde sea
posible.
4. Desde la clase calculadora remplace la impresión de los resultados por una misma implementación y
varios llamados (modularidad).
5. Cambie la visibilidad a los atributos de este programa, cree los métodos de encapsulamiento y controle
que los valores de número 1 y 2 sean mayores que 0 dentro de los métodos set. (Encapsulamiento)
