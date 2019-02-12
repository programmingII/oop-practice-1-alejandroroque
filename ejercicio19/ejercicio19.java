// Nombre: Jose Alejandro Roque 
// Dia: 12/02/2019
// Hora: 1:33pm

import java.util.Scanner; // 

public class ejercicio19{
  public static void main(String args[]){
  
  Scanner scan = new Scanner(System.in);
  

  System.out.print("Ingrese el nummero decimal para convertirlo a binario: "); 
  String a = scan.nextLine(); 
  System.out.println("El numero binario es: " + Integer.toBinaryString((Integer.parseInt(a, 10)))); 
 
 }
}
