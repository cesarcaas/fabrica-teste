package application;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class DataDateParaString {

	public static void main(String[] args) {
		//Locale.setDefault(Locale.US);
		Date dataAtual = new Date();
        //DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
        String dataFormatada = dateFormat.format(dataAtual);
        System.out.println("Date em String formatada: " + dataFormatada);

	}

}
