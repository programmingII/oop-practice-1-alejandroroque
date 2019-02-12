// Nombre: Jose Alejandro Roque 
// Dia: 11/02/2019
// Hora: 10:13pm

import java.util.Scanner; // la parte import java sirve para agregar una libreria a nuestro programa
// y la palabra Sacanner es una sub libreria que a nosotros nos permite introducir desde el teclado hacia el programa

public class ejercicio11{
 public static void main(String args[]){

 Scanner in=new Scanner(System.in); // la palabra Scanner se nesesita para el objeto, la palabra in es por el nombre , luego la parte de " = new" es para inicializarlo 
 // por otra parte , lo del parentesis la palabra in es indicar que va a recibir datos
  
  double Radio=0; // se declara la variable Radio
  double A=0;  // se declara la variable A
  double P=0;  // se declara la variable p
  double pi=3.1416;  // se declara la variable pi
  double N2=2;  // se declara la variable N2

 System.out.println("ingrese la radio del circulo para sacar el area y perimetro:"); // se imprime en pantalla pidiendo al usuario la radio del circulo
 Radio=in.nextDouble(); // se declara la variable radio con el numero ingresado por el usuario
  
  A= pi * Radio * Radio; // se ejejuta la operacion ingresada
  P= N2 * pi * Radio; // se genera la operacion ingresada

  System.out.println("El resultado del area es de:" +A); // si imprime en pantalla el resultado del area
  System.out.println("El resultado del perimetro es de:" +P); // se imprime en pantalla el resultado del perimetro
  }
}
