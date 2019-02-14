// Nombre: Jose Alejandro Roque 
// Dia: 13/02/2019
// Hora: 7:22pm

import java.util.Scanner; //la parte import java sirve para agregar una libreria a nuestro programa
// y la palabra Sacanner es una sub libreria que a nosotros nos permite introducir datos desde el teclado hacia el programa

public class ejercicio23{
  public static void main(String args[]){
  
  Scanner scan = new Scanner(System.in); // la palabra Scanner se nesesita para el objeto, la palabra in es por el nombre , luego la parte de " = new" es para inicializarlo 
 // por otra parte , lo del parentesis la palabra in es indicar que va a recibir datos
  

  System.out.print("Ingrese el numero Binario para convertirlo a Hexadecimal: "); // se imprime en pantalla un frase indicando que ingrese el numero para convertirlo a Hexadecimal
  String a = scan.nextLine(); // lee el numero ingresado por el usuario a la variable a
  System.out.println(Integer.toHexString(Integer.parseInt(a, 2))); // esta linea lo que hace es que toma el valor ingresado de la variable a para que en si
   // el numero ingresado se transforme a Hexadecimal usando el Integer.pareInt
 }
}
