 // Nombre: Jose Alejandro Roque
// Dia: 24/02/2019
// Hora:4:35 pm

import java.util.Scanner;

public class ejercicio54{
 public static void main(String[] args){
  
 Scanner in=new Scanner(System.in);

System.out.print("Ingrese el primer numero:");
double a= in.nextDouble();

System.out.print("Ingres el segundo numero:");
double b=in.nextDouble();

System.out.print("Ingrese el tercer numero:");
double c=in.nextDouble();
// alt 179

if(a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10){
 System.out.print("El resultado es: verdadero");
}
}}