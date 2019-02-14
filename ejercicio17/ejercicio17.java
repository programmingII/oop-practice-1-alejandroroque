// Nombre: Jose Alejandro Roque 
// Dia: 12/02/2019
// Hora: 12:15pm

import java.util.Scanner; //la parte import java sirve para agregar una libreria a nuestro programa
// y la palabra Sacanner es una sub libreria que a nosotros nos permite introducir datos desde el teclado hacia el programa

public class ejercicio17{
  public static void main(String args[]){
  
  Scanner scan = new Scanner(System.in); // la palabra Scanner se nesesita para el objeto, la palabra in es por el nombre , luego la parte de " = new" es para inicializarlo 
 // por otra parte , lo del parentesis la palabra in es indicar que va a recibir datos
  

  System.out.print("Ingrese el primer numero binario: "); // se pregunta al usuario que ingrese un numero binario
  String a = scan.nextLine(); // se declara la variable String a con el numero que ingrese el usuario
  System.out.print("Ingrese el segundo numero binario: "); // se pregunta al usuario que ingrese un numero binario 
  String b = scan.nextLine(); // se declara la variable String b con el numero que ingrese el usuario

System.out.println("La suma de los numeros binarios es de: "
+ Integer.toBinaryString((Integer.parseInt(a, 2) + (Integer.parseInt(b, 2))))); // en esta linea se imprime el resultado de la suma de binarios y se ejeruta mediante la parte Integer.toBinaryString 
 
 }
}
