// Nombre: Jose Alejandro Roque 
// Dia: 12/02/2019
// Hora: 12:15pm

import java.util.Scanner; // 

public class ejercicio17{
  public static void main(String args[]){
  
  Scanner scan = new Scanner(System.in);
  

  System.out.print("Ingrese el primer numero binario: "); // se pregunta al usuario que ingrese un numero binario
  String a = scan.nextLine(); // se declara la variable String a con el numero que ingrese el usuario
  System.out.print("Ingrese el segundo numero binario: "); // se pregunta al usuario que ingrese un numero binario 
  String b = scan.nextLine(); // se declara la variable String b con el numero que ingrese el usuario

System.out.println("La suma de los numeros binarios es de: "
+ Integer.toBinaryString((Integer.parseInt(a, 2) + (Integer.parseInt(b, 2))))); // en esta linea se imprime el resultado de la suma de binarios y se ejeruta mediante la parte Integer.toBinaryString 
 
 }
}
