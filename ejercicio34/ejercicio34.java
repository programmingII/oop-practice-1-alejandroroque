// Nombre: Jose Alejandro Roque
// Dia: 18/02/2019
// Hora: 12:10pm

import java.util.Scanner; // la parte import java sirve para agregar una libreria a nuestro programa
// y la palabra Sacanner es una sub libreria que a nosotros nos permite introducir datos desde el teclado hacia el programa


public class ejercicio34{
 public static void main(String args[]){
 
 Scanner in= new Scanner(System.in); // la palabra Scanner se nesesita para el objeto, la palabra in es por el nombre , luego la parte de " = new" es para inicializarlo 
 // por otra parte , lo del parentesis la palabra in es indicar que va a recibir datos

 double Resultado=0; // se declara la variabl de longitud a 0 con declaracion de double
 double Longitud=0; // se declara la variable de Longitud a 0 con declaracion de double
 
 System.out.println("ingrese la longitud de un lado del hexagono: "); // se imprime en pantanlla preguntando al usuario que ingrese el dato para el area del Hexagono
 Longitud=in.nextDouble(); // se declara el valor LON con el numero ingresado por el usuario // se lee el numero ingresado por el usuaio con la variable Longitud
   
 Resultado = (6*(Longitud*Longitud))/(4*Math.tan(Math.PI/6)); // se ejecuta la operacion entre parentesis ,la palabra math.PI representa la relacion entre la longitud de la circunferencia de un circulo y su diametro, la cual es aproximadamente 3.14159.
                                                              // la palabra Math.tan representa la relacion  

System.out.println("El area del Hexagono es:" +Resultado ); // se imprime en pantalla el resultado de la operacion , se imprime el area del Hexagono 
 
 }
}