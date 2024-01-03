package application;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class HoraStringToTime {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		DateFormat formato = new SimpleDateFormat("HH:mm:ss");
		Date horaAtual = new Date();
		String horaFormatada = formato.format(horaAtual);
		System.out.println("Hora atual formatada: " + horaFormatada);
		
		Date date = new Date(System.currentTimeMillis()); 
		System.out.println("Data = " + date);
	}

}
