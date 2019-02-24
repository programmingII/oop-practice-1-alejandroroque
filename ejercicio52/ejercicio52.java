// Nombre: Jose Alejandro Roque
// Dia: 24/02/2019
// Hora:3:54 pm

import java.util.Scanner;

public class ejercicio52{
 public static void main(String[] args){
  
 Scanner in=new Scanner(System.in);

System.out.print("Ingrese el primer numero:");
double a= in.nextDouble();

System.out.print("Ingres el segundo numero:");
double b=in.nextDouble();

System.out.print("Ingrese el tercer numero:");
double c=in.nextDouble();


if( a+b==c ){
 System.out.println("El resultado es: verdadero");
}

if(a+c==b){
 System.out.println("El resultado es: verdadero");
}

if(b+c==a){
 System.out.println("El resultado es: verdadero");
}



 }
}