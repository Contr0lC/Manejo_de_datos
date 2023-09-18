
package Control;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class calcular {


private  LocalDate dia = LocalDate.now();
String Hora,minuto,segundo,ampn;



  public void calculartime() {
Calendar calendario = new GregorianCalendar();
Date fechaHoraActual= new Date();
String tiempo= "";
calendario.setTime(fechaHoraActual);
ampn= calendario.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";
if(ampn.equals("PM")){
    int h=calendario.get(Calendar.HOUR_OF_DAY);
    Hora=h>9?""+h:"0"+h;
}else{
    Hora=calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
} 
minuto=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
segundo=calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);


}
}
