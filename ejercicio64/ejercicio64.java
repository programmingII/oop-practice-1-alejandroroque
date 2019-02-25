// Nombre: Jose Alejandro Roque
// Dia: 24/02/2019
// Hora:9:10 pm

import java.util.Scanner;


public class ejercicio64{
 public static void main(String[] args){
  
 Scanner in=new Scanner(System.in);
 System.out.print("Ingrese el primer numero:");
 int a= in.nextInt();

 System.out.print("Ingrese el segundo numero:");
 int b=in.nextInt();

 if( a>25 && a<75 || b>25 && b<75){
  System.out.print("Verdadero");
 }
else{
 System.out.print("Numero fuera de rango");
}}}