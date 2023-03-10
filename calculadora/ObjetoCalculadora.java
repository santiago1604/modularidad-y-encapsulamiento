package a.calculadora;

import javax.swing.JOptionPane;

public class ObjetoCalculadora {
//???Estos son los atributos de la clase que necesitamos. Los encapsulamos.
    ///// 5 punto.
        private int numero1;
        private int numero2;
        
//??? Este es el constrtuctor de la clase, es un constructor que esta por defectoqu
public ObjetoCalculadora() {
    super(); 
}
///////////////////////////////////////// agregamos los sets y gets
///// 5 punto.
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        if (numero1 > 0) {
            this.numero1 = numero1;
        } 
        else {
            this.numero1 = 0;
        }
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        if (numero2 > 0) {
            this.numero2 = numero2;
        } 
        else {
            this.numero1 = 0;
        }
    }
 
//??? Todos estos son los metodos de la clase, nos serviran para hacer las operaciones
//////  3 punto. Quitamos la variable resultado y optimisamos el codigo
public int calcularSuma (){
        
    return numero1+numero2;
}
public int calcularResta (){
        return numero1-numero2;
}
public int calcularMultiplicacion (){
       return numero1*numero2;
}
public int calcularDivision (){  
            if (numero2 != 0){
                return numero1 / numero2;
            }
            return 0;
    }

//// 4 punto.
//// creo un metodo nueov que me va imprimir remplazando todos esos JOptionPane
public void imprimir(String operacion, int resultado){
            JOptionPane.showMessageDialog(null,operacion+ ":" + resultado);

}



}
