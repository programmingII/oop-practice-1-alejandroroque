// Nombre: Jose Alejandro Roque
// Dia: 18/02/2019
// Hora: 1:16pm

import java.util.Scanner; // la parte import java sirve para agregar una libreria a nuestro programa
// y la palabra Sacanner es una sub libreria que a nosotros nos permite introducir datos desde el teclado hacia el programa


public class ejercicio37{
 public static void main(String args[]){
 
 Scanner in= new Scanner(System.in); // la palabra Scanner se nesesita para el objeto, la palabra in es por el nombre , luego la parte de " = new" es para inicializarlo 
 // por otra parte , lo del parentesis la palabra in es indicar que va a recibir datos

System.out.println("Please enter a string to reverse: ");
String string = in.nextLine();

StringBuffer buffer = new StringBuffer(string);
StringBuffer reversed = buffer.reverse();
System.out.println(reversed);
 
    
 }
}