// Nombre: Jose Alejandro Roque
// Dia:24/02/2019
// Hora: 12:07pm

import java.util.Scanner;
public class ejercicio41{
 public static void main(String[] args){

 Scanner scan = new Scanner(System.in);
   
 System.out.println("Ingrese el valor para convertirlo a numero ascii:"); 
 String data=scan.nextLine(); 
  
 for(int i=0; i <data.length(); i++){
    int as=data.charAt(i);
    System.out.println("El valor ascii ingresado es:"+as);    
      } 
   }
 }