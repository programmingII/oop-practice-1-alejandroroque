// Nombre: Jose Alejandro Roque
// Dia: 18/02/2019
// Hora: 1:31pm

import java.util.Scanner; // la parte import java sirve para agregar una libreria a nuestro programa
// y la palabra Sacanner es una sub libreria que a nosotros nos permite introducir datos desde el teclado hacia el programa


public class ejercicio38{
 public static void main(String args[]){

  Scanner in= new Scanner(System.in); // la palabra Scanner se nesesita para el objeto, la palabra in es por el nombre , luego la parte de " = new" es para inicializarlo 
 // por otra parte , lo del parentesis la palabra in es indicar que va a recibir datos

 String LOL = "anita lava la tina, 146889 ,,"; // se declara variable string como String 

int letter = 0;
int space = 0;
int number = 0;
int other = 0;
char temp;

for (int i=0; i < LOL.length(); i++) { // there can be no <= because to test it right it needs to be of lenght -1!!!
temp = LOL.charAt(i);

   if(Character.isLetter(temp)){
   letter ++;
   }
   else if (Character.isDigit(temp)){
  number ++;
   }
  else if (Character.isSpaceChar(temp)){
   space ++;
   }
   else {
other ++;
}
  }
    System.out.println("EL string is : "+ LOL);
   System.out.println("Letras: " + letter);
   System.out.println("Spacios: " + space);
   System.out.println("Numeros: " + number);
   System.out.println("Otros: " + other);
 }
}

 

 