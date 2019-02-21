// Nombre: Jose Alejandro Roque
// Dia: 14/02/2019
// Hora: 1:22pm 


import java.util.Scanner; //la parte import java sirve para agregar una libreria a nuestro programa
// y la palabra Sacanner es una sub libreria que a nosotros nos permite introducir datos desde el teclado hacia el programa

 public class ejercicio33 {
 public static void main(String[] args) {
 int n; // se declara n como entero
 int aux; // se declara aux como entero
 Scanner teclado=new Scanner(System.in); // la palabra Scanner se nesesita para el objeto, la palabra teclado es por el nombre , luego la parte de " = new" es para inicializarlo 
                     // por otra parte , lo del parentesis la palabra in es indicar que va a recibir datos
 System.out.println("Introduce el numero"); // se preguntara al usuario que introduzca un numero para la suma de cifras
 n=teclado.nextInt(); // se leera el numero ingresado por el usuario
 aux=n;  // se igualiza la variable aux con n
 int total=0; // se declara que la variable total es igual a 0
 while(n != 0){ // mientras que while sea diferente de n y 0 se seguira ejecutando la operacion que esta entre parentesis 
 total=total+n%10; // se ejecuta la operacion dando un resultado diferente en la variable total 
 n=n/10; // el resultado de la operacion es vuelve a insertar al mismo valor a n 
 }
  System.out.println("La suma de las cifras de "+aux+" es "+total); // se imprime el total de la suma de cifras en pantalla 
 }
}