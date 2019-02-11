// Nombre: Jose Alejandro Roque 
// Dia: 07/02/2019
// Hora: 8:00


import java.util.Scanner; // la parte import java sirve para agregar una libreria a nuestro programa
// y la palabra Sacanner es una sub libreria que a nosotros nos permite introducir desde el teclado hacia el programa

public class ejercicio6{
 public static void main(String args[]){

 Scanner in=new Scanner(System.in); // la palabra Scanner se nesesita para el objeto, la palabra in es por el nombre , luego la parte de " = new" es para inicializarlo 
 // por otra parte , lo del parentesis la palabra in es indicar que va a recibir datos
  

  int Numero1=0;  // se declara la variable "numero1" con valor 0
  int Numero2=0;   // se declara la variable "numero2" con valor 0
  int Resultado1=0;   // se declara la variable "Resultado1" con valor 0
  int Resultado2=0;   // se declara la variable "Resultado2" con valor 0
  int Resultado3=0;   // se declara la variable "Resultado3" con valor 0
  int Resultado4=0;   // se declara la variable "Resultado4" con valor 0 
  int Resultado5=0;  // se declara la variable "Resultado5" con valor 0
 
  System.out.println("Ingrese el primer numero para las operaciones:"); // se imprime el texto en donde se preguntara al usuario que ingrese un numero para las operaciones
  Numero1=in.nextInt();  //aqui el entero declarado "Numero1" tendra el valor que el usuario ingrese 

  System.out.println("Ingrese el segundo numero para las operaciones:");// se imprime el texto en donde se preguntara al usuario que ingrese un numero para la operaciones
  Numero2=in.nextInt();   //aqui el entero declarado "Numero2" tendra el valor que el usuario ingrese 

  Resultado1= Numero1 + Numero2; // se ejecuta la operacion de los enteros declarados "Numero1" y "Numero2" 
  Resultado2= Numero1 - Numero2;
  Resultado3= Numero1 * Numero2;
  Resultado4= Numero1 / Numero2;
  Resultado5= Numero1 % Numero2;
  

  System.out.println("El resultado de la suma es:" + Resultado1);  //en esta linea se imprimira en pantalla un texto con la variable "Resultado1" dando el resultado de la operacion ejecutada
  System.out.println("El resultado de la resta es:" +Resultado2);  //en esta linea se imprimira en pantalla un texto con la variable "Resultado2" dando el resultado de la operacion ejecutada
  System.out.println("El resultado de la multiplicacion es:" +Resultado3);  //en esta linea se imprimira en pantalla un texto con la variable "Resultado3" dando el resultado de la operacion ejecutada
  System.out.println("El resultado de la division es:"+Resultado4);  //en esta linea se imprimira en pantalla un texto con la variable "Resultado4" dando el resultado de la operacion ejecutada
  System.out.println("El resultado del mod es:"+Resultado5);  //en esta linea se imprimira en pantalla un texto con la variable "Resultado5" dando el resultado de la operacion ejecutada
 } 
}