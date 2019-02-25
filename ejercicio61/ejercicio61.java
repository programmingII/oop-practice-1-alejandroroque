// Nombre: Jose Alejandro Roque 
// Dia: 24/02/2019
// Hora: 7:02pm

import java.util.Scanner;
public class ejercicio61{
 public static void main(String[] args){	
     Scanner lector=new Scanner(System.in);
     String Cadenainvertida="";

     System.out.print("Ingrese la palabra para invertirla:");
     String Cadena=lector.nextLine();
    
    for(int i= Cadena.length()-1;i>=0;i--){
  Cadenainvertida += Cadena.charAt(i);
 }
System.out.println(Cadenainvertida);
}}