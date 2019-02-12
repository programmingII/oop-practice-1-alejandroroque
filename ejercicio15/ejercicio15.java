// Nombre:Jose Alejandro Roque
// Dia 11/02/2019
// Hora:11:23pm

import java.util.Scanner; //la parte import java sirve para agregar una libreria a nuestro programa
// y la palabra Sacanner es una sub libreria que a nosotros nos permite introducir datos desde el teclado hacia el programa

public class ejercicio15{
 public static void main(String args[]){
 
 Scanner in=new Scanner(System.in);  // la palabra Scanner se nesesita para el objeto, la palabra in es por el nombre , luego la parte de " = new" es para inicializarlo 
 // por otra parte , lo del parentesis la palabra in es indicar que va a recibir datos

 double A=0;  // declaracion de una variable
 double B=0;  // declaracion de una variable
 double C=0;  // declaracion de una variable

 System.out.println("Ingrese el primer numero:"); // se imprime en pantalla preguntado al usuario que ingrese un numero
 A=in.nextDouble();  // que guarda el numero ingresado por el usuario dando valor a la variable A
 
 System.out.println("Ingrese el segundo numero:"); // se imprime en pantalla preguntado al usuario que ingrese un numero
 B=in.nextDouble();  // que guarda el numero ingresado por el usuario dando valor a la variable B

 C=A;  // se iguala el valor a otra variable
 A=B;  // se iguala el valor a otra variable
 B=C;  // se iguala el valor a otra variable

 System.out.println("Los valores que fueron cambiados son 3:" + A + "   Y  " + B);  // se imprime en pantalla los resultados finales

 }
}
 
 