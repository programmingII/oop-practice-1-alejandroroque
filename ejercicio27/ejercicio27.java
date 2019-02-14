// Nombre: Jose Alejandro Roque
// Dia: 13/02/2019
// Hora: 10:52pm

import java.util.Scanner;  //la parte import java sirve para agregar una libreria a nuestro programa
// y la palabra Sacanner es una sub libreria que a nosotros nos permite introducir datos desde el teclado hacia el programa

public class ejercicio27{
 public static void main(String args[]){

 Scanner scan = new Scanner(System.in); // la palabra Scanner se nesesita para el objeto, la palabra in es por el nombre , luego la parte de " = new" es para inicializarlo 
 // por otra parte , lo del parentesis la palabra in es indicar que va a recibir datos

 System.out.println("Ingrese el numero Octal para convertirlo a Hexadecimal:"); // se imprime el mensaje preguntando que ingrese un numero para la conversion
 String a= scan.nextLine(); // se leera la variable a con el dato ingresado por el usuario
 System.out.println("El numero Hexadecimal es: " + Integer.toHexString((Integer.parseInt(a, 8)))); // aqui se imprime el resultado de la conversion dando un mensaje y con el codigo
 // integer.toHex se usa para ejecutar la conversion


 }
}