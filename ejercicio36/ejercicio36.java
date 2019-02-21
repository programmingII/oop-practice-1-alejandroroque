// Nombre: Jose Alejandro Roque
// Dia: 18/02/2019
// Hora: 12:55pm

import java.util.Scanner; // la parte import java sirve para agregar una libreria a nuestro programa
// y la palabra Sacanner es una sub libreria que a nosotros nos permite introducir datos desde el teclado hacia el programa


public class ejercicio36{
 public static void main(String args[]){
 
 Scanner in= new Scanner(System.in); // la palabra Scanner se nesesita para el objeto, la palabra in es por el nombre , luego la parte de " = new" es para inicializarlo 
 // por otra parte , lo del parentesis la palabra in es indicar que va a recibir datos

 double Resultado=0;
 double Lat1=0;
 double Lon1=0;
 double Lat2=0;
 double Lon2=0;
 
 System.out.println("ingrese la latitud de la cordenada 1: ");
 Lat1=in.nextDouble(); // se declara el valor Lat1 con el numero ingresado por el usuario

 System.out.println("Ingrese la longitud de la cordenada 1:");
 Lon1=in.nextDouble(); // se declara el valor de Lon1 con el numero ingresado por el usuario

 System.out.println("ingrese la latitud de la cordenada 2: ");
 Lat2=in.nextDouble(); // se declara el valor Lat2 con el numero ingresado por el usuario

 System.out.println("Ingrese la longitud de la cordenada 2:");
 Lon2=in.nextDouble(); // se declara el valor de Lon2 con el numero ingresado por el usuario

 double radiotierra=6371.01; // Kilometros
   
        Lat1 = Math.toRadians(Lat1);
        Lon1 = Math.toRadians(Lon1);
        Lat2 = Math.toRadians(Lat2);
        Lon2 = Math.toRadians(Lon2); 
 Resultado = radiotierra * Math.acos(Math.sin(Lat1)*Math.sin(Lat2) + Math.cos(Lat1)*Math.cos(Lat2)*Math.cos(Lon1 - Lon2));

 System.out.println("La distancia entre los 2 puntos es de: " +Resultado + "Km");
 
 }
}