// Nombre: Jose Alejandro Roque
// Dia: 24/02/2019
// Hora:9:25 pm

import java.util.Scanner;


public class ejercicio65{
 public static void main(String[] args){
  
 Scanner in=new Scanner(System.in);
 System.out.print("Ingrese el primer numero:");
 int a=in.nextInt();

 System.out.print("Ingrese el segundo numero:");
 int b=in.nextInt();

 int division=a/b;
 int resultado=a-(division*b);
 System.out.print("El resultado es:"+resultado);
}}