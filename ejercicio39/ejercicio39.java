// Nombre: Jose Alejandro Roque 
// Dia: 21/02/2019
// Hora: 12:53PM

import java.util.Scanner;

public class ejercicio39{
 public static void main(String[] args){

  int sounc=0;
  for(int i=1;i<=4; i++){
  for(int j=1;j<=4; j++){
  for(int k=1;k<=4; k++){
   
  if(k !=i && k !=j && i !=j){
    sounc++ ;;
  System.out.println(""+i+j+k+""); 
 }
  }
   System.out.println("");
  }
 }
 System.out.println("El numero total de los 3 digitos es de:"+sounc);
}
}