// Nombre: Jose Alejandro Roque 
// Dia: 07/02/2019
// Hora: 1:27

import java.util.Scanner;  //  la parte import java sirve para agregar una libreria a nuestro programa, y la palabra scanner es una sub libreria que a nosotros nos permite introducir 
// desde el teclado hacia el proggrama

public class ejercicio5{
 public static void main(String args[]){
     
  Scanner in=new Scanner(System.in); // la palabra Scanner se nesesita para el objeto, la palabra in es por el nombre , luego la parte de " = new" es para inicializarlo 
  // por otra parte , lo del parentesis la palabra in es indicar que va a recibir datos
  int Numero1=0;  // se declara la variable "numero1" con valor 0
  int Numero2=0;   // se declara la variable "numero2" con valor 0
  int Resultado=0;   // se declara la variable "Resultado" con valor 0
 
  System.out.println("Ingrese el primer numero de la multiplicacion:"); // se imprime el texto en donde se preguntara al usuario que ingrese un numero para la multiplicacion
  Numero1=in.nextInt();   //aqui el entero declarado "Numero1" tendra el valor que el usuario ingrese 

  System.out.println("ingrese el segundo numero:");  // se imprime el texto en donde se preguntara al usuario que ingrese el siguiente numero para la multiplicacion
   Numero2=in.nextInt();  //aqui el entero declarado "Numero2" tendra el valor que el usuario ingrese 
  
  Resultado= Numero1 * Numero2; // se ejecuta la operacion de los enteros declarados "Numero1" y "Numero2"

  System.out.println("El resultado es:" + Resultado);  //en esta linea se imprimira en pantalla un texto con la variable "Resultado" dando el resultado de la operacion ejecutada
 }
}