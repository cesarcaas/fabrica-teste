package application;

import java.text.DateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		//SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		// Exemplo Date
		Date dat = new Date();
		System.out.println(dat);
		// Exemplo Calendar
		Calendar c = new GregorianCalendar();
		System.out.println("Data/Hora atual: " + c.getTime());
		System.out.println("Ano: " + c.get(Calendar.YEAR));
		System.out.println("Mês: " + c.get(Calendar.MONTH));
		System.out.println("Dia do Mês: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("-------------------------");
		// Outro exemplo
		Calendar c1 = Calendar.getInstance();
		c1.set(Calendar.YEAR, 1995);
		c1.set(Calendar.MONTH, Calendar.MARCH);
		c1.set(Calendar.DAY_OF_MONTH, 20);

		System.out.println("Data/Hora atual: " + c1.getTime());
		System.out.println("Ano: " + c1.get(Calendar.YEAR));
		System.out.println("Mês: " + c1.get(Calendar.MONTH + 1));
		System.out.println("Dia do Mês: " + c1.get(Calendar.DAY_OF_MONTH));
		System.out.println("-------------------------");

		Calendar c2 = Calendar.getInstance();
		Date data = c2.getTime();

		Locale brasil = new Locale("pt", "BR"); // Retorna do país e a língua
		Locale eua = Locale.US;
		Locale italia = Locale.ITALIAN;

		DateFormat f2 = DateFormat.getDateInstance(DateFormat.DATE_FIELD, brasil);
		System.out.println("Data e hora brasileira: " + f2.format(data));

		DateFormat f3 = DateFormat.getDateInstance(DateFormat.FULL, eua);
		System.out.println("Data e hora americana: " + f3.format(data));

		DateFormat f4 = DateFormat.getDateInstance(DateFormat.DATE_FIELD, italia);
		System.out.println("Data e hora italiana: " + f4.format(data));

		//String nomeData = "70/12/2040";
		String nomeData = "01/12/2040";
		try {
			Date d5 = new Date();
			LocalDate d4 = LocalDate.parse(nomeData, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			System.out.println(d4);
		} catch (DateTimeException ex) {
			System.out.println("Formato inválido.");
		}
		System.out.println("xxxxxxxxxxxxxx");
		LocalDate date = LocalDate.parse("2020-01-08");
		System.out.println(date);
		System.out.println("**************");
		LocalDate today = LocalDate.now();
		//Today's date in GMT
		LocalDate todayInGMT = LocalDate.now(ZoneId.of("GMT"));
		System.out.println(today);
		System.out.println(todayInGMT);
		
		System.out.println("##########################");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate todai = LocalDate.now();
		String dateString = todai.format(formatter);	//23-Feb-2022}
		System.out.println(dateString);
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
		LocalDate d = LocalDate.now();
		LocalDate d20 = d.plusYears(5);
		System.out.println("plusYears " + d20);
		LocalDate d21 = d.plusWeeks(3);
		System.out.println("plusWeek " + d21);
		LocalDate d22 = d.plusDays(1);
		System.out.println("plusDays " + d22);

	}
}
