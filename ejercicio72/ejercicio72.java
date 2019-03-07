// Nombre: Jose Alejandro Roque Leyva
// Fecha: 6/03/2019
// Hora: 1:28pm

public class ejercicio72{ 
 public static void main(String []args){
 String palabra="";   // declaracion de la vaiable palabra como string 
 int len =palabra.length();   // la palabra length devuelve el nnumero de caracteres del String
 if(len >= 3)   // condicional de que si la palabra len es igual o mayor que 3
  System.out.println(palabra.substring(0,3));  // se imprime en pantalla la variable palabra con el uso del subtring
else if(len==1) // condicional de "sino si"
 System.out.println( (palabra.charAt(0)+"##"));   // se imprime en pantalla la variable de una letra con 2 #
    // si es que se cumple con la condicional
    // charAt(indice) es un funcion de String que devuelve el caracter ubicado en la posicion
    // indice de la cadena 
else // condicionl de sino

 System.out.println("###"); //se imprime en pantalla la cadena ###
 }
}