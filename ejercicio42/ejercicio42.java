// Nombre: Jose Alejandro Roque
// Dia:24/02/2019
// Hora:12:47pm

import java.io.Console;

public class ejercicio42{
 public static void main(String[] args){
 Console con=System.console();

 System.out.print("Ingrese su contrasena:");
 char[] password=con.readPassword();

 System.out.println("Su contraseña fue:");
 for(char c: password){
 System.out.print(c);
 }
 
 }
}