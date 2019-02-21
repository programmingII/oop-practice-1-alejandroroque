// Nombre: Jose Alejandro Roque
// Dia: 18/02/2019
// Hora: 12:25pm

import java.util.Scanner; // la parte import java sirve para agregar una libreria a nuestro programa
// y la palabra Sacanner es una sub libreria que a nosotros nos permite introducir datos desde el teclado hacia el programa


public class ejercicio35{
 public static void main(String args[]){
 
 Scanner in= new Scanner(System.in); // la palabra Scanner se nesesita para el objeto, la palabra in es por el nombre , luego la parte de " = new" es para inicializarlo 
 // por otra parte , lo del parentesis la palabra in es indicar que va a recibir datos

 double Resultado=0;
 double Longitud=0;
 double Ndelados=0;
 
 System.out.println("ingrese la longitud de uno de sus lados: ");
 Longitud=in.nextDouble(); // se declara el valor LON con el numero ingresado por el usuario

 System.out.println("Ingrese el numero de lados en el poligono:");
 Ndelados=in.nextDouble(); // se declara el valor de Ndelados con el numero ingresado por el usuario


   
 Resultado = (Ndelados * (Longitud * Longitud) / (4 *Math.tan (Math.PI / Ndelados)));

 System.out.println("El area del poligono es: " +Resultado );
 
 }
}