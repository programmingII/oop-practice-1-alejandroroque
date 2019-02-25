// Nombre: Jose Alejandro Roque
// Dia: 24/02/2019
// Hora:7:46 pm

import java.util.Scanner;


public class ejercicio63{
 public static void main(String[] args){
  
 Scanner in=new Scanner(System.in);
 System.out.print("Ingrese el primer numero:");
 int a=in.nextInt();

System.out.print("Ingrese el segundo numero:");
int b=in.nextInt();

if(a>b){
 System.out.print(a);
}
 else{
   if(a<b){
    System.out.print(b);
    }
     else{
      if(a==b ){
    System.out.print("0");
     }
       else{
   if(a%6 == b%6){
  System.out.print(a);  
}
 }
}
}}
}