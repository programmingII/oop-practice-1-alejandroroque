// Nombre: Jose Alejandro Roque
// Dia: 24/02/2019
// Hora:2:25pm


import java.text.SimpleDateFormat;
import java.util.Date;

public class ejercicio47 {
  public static void main(String[] args){
         String pattern = "yyyy/MM/dd HH:m:s.S";
SimpleDateFormat alex = new SimpleDateFormat(pattern);

String date = alex.format(new Date());
System.out.println("Ahora mismo es: " + date);


    }
}