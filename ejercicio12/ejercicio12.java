// Nombre:Jose Alejandro Roque
// Dia:11/02/2019
// Hora:10:33pm

import java.util.Scanner; //la parte import java sirve para agregar una libreria a nuestro programa
// y la palabra Sacanner es una sub libreria que a nosotros nos permite introducir datos desde el teclado hacia el programa

public class ejercicio12{
 public static void main(String args[]){
  
  Scanner in=new Scanner(System.in);  // la palabra Scanner se nesesita para el objeto, la palabra in es por el nombre , luego la parte de " = new" es para inicializarlo 
 // por otra parte , lo del parentesis la palabra in es indicar que va a recibir datos
  
   double N1=0; // se declara la variable N1
   double N2=0; // se declara la variable N2
   double N3=0; // se declara la variable N3
   double Resultado=0; // se declara la variable Resultado

  System.out.println("Ingrese el primer numero para sacar el promedio:"); // se imprime en pantalla una frase preguntando al usuario por el primer numero
  N1=in.nextDouble(); // se lee la variable N1 como el dato ingresado por el usuario

  System.out.println("Ingrese el segundo numero para el promedio:"); // se imprime en pantalla una frase preguntando al usuario por el segundo numero
  N2=in.nextDouble(); // se lee la variable N2 como el dato ingresado por el usuario

  System.out.println("Ingrese el tercer numero:"); // se imprime en pantalla una frase preguntando al usuario por el tercer numero
  N3=in.nextDouble(); // se lee la variable N3 como el dato ingresado por el usuario

  Resultado=(N1+N2+N3)/3; // se genera la operacioon para que la variable Resultado tenga un valor final

  System.out.println("El resultado del promedio es de:" +Resultado); // se imprime el resultado dando en si el promedio deseado
   
 }
}
