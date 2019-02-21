// Nombre: Jose Alejandro Roque 
// Dia: 21/02/2019
// Hora: 1:17PM

import java.nio.charset.Charset; // Defines charsets, decoders, and encoders, for translating between bytes and Unicode characters.
public class ejercicio40{
 public static void main(String[] args){
 System.out.println("list of avaible character sets: "); // se llama a imprimir en pantalla lo que esta entre parentesis y comillas
 for (String str : Charset.availableCharsets().keySet()){
  System.out.println(str);
}
}  
 }