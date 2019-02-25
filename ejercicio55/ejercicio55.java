 // Nombre: Jose Alejandro Roque
// Dia: 24/02/2019
// Hora:4:59 pm

import java.util.Scanner;
import java.io.*;

public class ejercicio55{
 public static void main(String[] args){
  
 Scanner in=new Scanner(System.in);
 InputStreamReader isr= new InputStreamReader(System.in);
 BufferedReader br=new BufferedReader(isr);
 try{
 int  iSeg,iMin,iHr;
 System.out.print("Ingrese los segundos:");
 iSeg=Integer.parseInt(br.readLine());

 iHr=iSeg/3600;
 iMin=iSeg/60 - iHr*60;
 iSeg=iSeg-iMin*60-iHr*3600;

 System.out.print(iHr+"Hora(s),"+iMin+"Minuto(s)" +iSeg +"Segundos");

}
catch(Exception e)
{
  e.printStackTrace();
}
}}


