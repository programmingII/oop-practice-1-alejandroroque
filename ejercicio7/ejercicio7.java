// Nombre: Jose Alejandro Roque 
// Dia: 10/02/2019
// Hora: 8:14


import java.util.Scanner; // la parte import java sirve para agregar una libreria a nuestro programa
// y la palabra Sacanner es una sub libreria que a nosotros nos permite introducir desde el teclado hacia el programa

public class ejercicio7{
 public static void main(String args[]){

 Scanner in =new Scanner(System.in); // la palabra Scanner se nesesita para el objeto, la palabra in es por el nombre , luego la parte de " = new" es para inicializarlo 
 // por otra parte , lo del parentesis la palabra in es indicar que va a recibir datos
  
  int Numero1; // se declara la variable 
  int R ;      // se declara la variable

 System.out.print("ingrese un numero para la tabla de multiplicacion:"); // se imprime en pantalla una pregunta para el usuario
 Numero1=in.nextInt();  // se iguala el valor que ingrese el usuario a la variable Numero1
 
  for(int i=1; i<11; i++){  // se cusa un ciclo for del 1 al 11 para repetir el proceso 10 veces
    R=Numero1*i;   // se hace una multiplicacion 
    System.out.println(Numero1 + "X" + i + "=" + R ); // se imprime en pantalla el resultado
  }
 }
}