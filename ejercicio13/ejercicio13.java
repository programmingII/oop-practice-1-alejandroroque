// Nombre:Jose Alejandro Roque
// Dia 11/02/2019
// Hora:10:50pm

import java.util.Scanner; //la parte import java sirve para agregar una libreria a nuestro programa
// y la palabra Sacanner es una sub libreria que a nosotros nos permite introducir datos desde el teclado hacia el programa

public class ejercicio13{
 public static void main(String args[]){
 
 Scanner in=new Scanner(System.in);  // la palabra Scanner se nesesita para el objeto, la palabra in es por el nombre , luego la parte de " = new" es para inicializarlo 
 // por otra parte , lo del parentesis la palabra in es indicar que va a recibir datos
 
  double Lado=0;  // se declara la variable Lado 
  double ancho=0; // se declara la variable ancho
  double Resultado1=0; // se declara la variable Resultado1
  double Resultado2=0; // se declara la variable Resultado2
  
  System.out.println("Ingrese el ancho para sacar el area y perimetro del rectangulo:"); // se imprime en pantalla preguntando al usuario el ancho del rectangulo 
  ancho=in.nextDouble(); // se declara el valor ancho con el resultado ingresado por el usuario 

  System.out.println("Ingrese el lado del rectangulo:"); // se imprime en pantalla preguntando al usuario 
  Lado=in.nextDouble();  // se define la variable con el numero ingresado por el usuario

  Resultado1=ancho*Lado;   // se realiza la operacion ancho*Lado
  Resultado2= 2 * (ancho + Lado); // se realiza la operacion  2 * (ancho + Lado)

  System.out.println("El resultado del area es de:" +Resultado1 ); // se imprime el resultado en pantalla del area
  System.out.println("El resultado del perimetro es de:" +Resultado2); // se imprime el resultado en pantalla del perimetro
 }   
}