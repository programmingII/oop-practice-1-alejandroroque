// Nombre: Jose Alejandro Roque
// Dia: 24/02/2019
// Hora:7:46 pm

import java.util.Scanner;


public class ejercicio62{
 public static void main(String[] args){
  
 Scanner in=new Scanner(System.in);
 System.out.print("Ingrese el primer numero:");
 int a=in.nextInt();

System.out.print("Ingrese el segundo numero:");
int b=in.nextInt();

System.out.print("Ingrese el tercer numero:");
int c=in.nextInt();
 
 if(((a-b) >= 20 || (b-c) >= 20 || (c-a)>= 20)){
 System.out.println("verdadero");
}
else{
  System.out.println("falso");
 }

}}
 