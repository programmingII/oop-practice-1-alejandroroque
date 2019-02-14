// Nombre: Jose Alejandro Roque 
// Dia: 12/02/2019
// Hora: 1:33pm

import java.util.Scanner; //la parte import java sirve para agregar una libreria a nuestro programa
// y la palabra Sacanner es una sub libreria que a nosotros nos permite introducir datos desde el teclado hacia el programa

public class ejercicio19{
  public static void main(String args[]){
  
  Scanner scan = new Scanner(System.in); // la palabra Scanner se nesesita para el objeto, la palabra in es por el nombre , luego la parte de " = new" es para inicializarlo 
 // por otra parte , lo del parentesis la palabra in es indicar que va a recibir datos
  

  System.out.print("Ingrese el nummero decimal para convertirlo a binario: "); // esta linea imprime un texto preguntando por un numero para hacer la convercion
  String a = scan.nextLine(); // en esta linea lee el dato ingresado como la variable a
  System.out.println("El numero binario es: " + Integer.toBinaryString((Integer.parseInt(a, 10)))); // en esta linea de codigo, lo que genere es que el numero ingresado por el usuario se convertira a numero binario
 
 }
}
