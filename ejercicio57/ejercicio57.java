// Nombre: Jose Alejandro Roque 
// Dia: 24/02/2019
// Hora: 6:16pm

import java.util.Scanner;
 public class ejercicio57{
  public static void main(String[] args){
 
Scanner in=new Scanner(System.in);
 System.out.println("agrege su numero:");
 int z=in.nextInt();
 int hecho=0;
 for(int i=1;i<=z;i++){
 if(z%i==0){
 hecho++;
 }
}
System.out.println("EL factor del numero agregado es:"+hecho);
}}