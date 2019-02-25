// Nombre: Jose Alejandro Roque 
// Dia: 24/02/2019
// Hora: 7:02pm

import java.util.Scanner;
public class ejercicio60{
 public static void main(String[] args){	
     Scanner lol = new Scanner(System.in);
     System.out.print("Ingrese la frase: ");
	 String Linea = lol.nextLine();
	String[] words =Linea.split("[ ]+");
        System.out.println("La penultima palabra es:"+words[words.length-2]);
	 }			
}
