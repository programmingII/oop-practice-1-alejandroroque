// Nombre: Jose Alejandro Roque 
// Dia: 11/02/2019
// Hora: 10:13pm

import java.util.Scanner; // la parte import java sirve para agregar una libreria a nuestro programa
// y la palabra Sacanner es una sub libreria que a nosotros nos permite introducir desde el teclado hacia el programa

public class ejercicio11{
 public static void main(String args[]){

 Scanner in=new Scanner(System.in); // la palabra Scanner se nesesita para el objeto, la palabra in es por el nombre , luego la parte de " = new" es para inicializarlo 
 // por otra parte , lo del parentesis la palabra in es indicar que va a recibir datos
  
  double Radio=0;
  double A=0;
  double P=0;
  double pi=3.1416;
  double N2=2;

 System.out.println("ingrese la radio del circulo para sacar el area y perimetro:");
 Radio=in.nextDouble();
  
  A= pi * Radio * Radio;
  P= N2 * pi * Radio;

  System.out.println("El resultado del area es de:" +A);
  System.out.println("El resultado del perimetro es de:" +P);
  }
}