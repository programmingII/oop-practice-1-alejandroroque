// Nombre: Jose Alejandro Roque
// Dia: 28/02/2019
// Hora:2:25 am

import java.util.Scanner;
public class ejercicio66{ //declaracion de una clase nombrada ejercicio66
 public static void main(String[] args){


int sum=0;
int num=2;

while(num<=100){
 for(int i=2; i<=num/2;i++){
 System.out.println("i:" +i +"num" +num + "mod: " + num%i);

if(num%i != 0){
 sum+=num;
}
}
num++;
}
System.out.println("Suma de las primeros 100 numeros primos:"+sum);
 } 
}