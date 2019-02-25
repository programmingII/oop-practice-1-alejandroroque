// Nombre: Jose Alejandro Roque 
// Dia: 24/02/2019
// Hora: 6:22pm

import java.util.Scanner;
 public class ejercicio58{
  public static void main(String[] args){
 
  Scanner in=new Scanner(System.in);
  System.out.print("Ingrese la frase:");
  String isim =in.nextLine();

  String substring="";

  Scanner line = new Scanner(isim);

  while(line.hasNext()){

  String yenikelime =line.next();

  substring+= Character.toUpperCase( yenikelime.charAt(0))+yenikelime.substring(1)+" ";

}
System.out.println(substring.trim());
}}