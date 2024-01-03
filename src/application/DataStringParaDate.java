package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataStringParaDate {

	public static void main(String[] args) {
		//Date date = new Date();
		//System.out.println(date);
		
		long ms = System.currentTimeMillis();
		Date date = new Date(ms);
		System.out.println(date);
		
		Boolean est = date.after(new Date());
		System.out.println(est);
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        date = null;
        try {
            date = formatter.parse("24/07/2020");
            System.out.println(formatter.parse("24/07/2020"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        //*****************************************
        
        formatter = new SimpleDateFormat("MM/yyyy");
        String monthAndYear = formatter.format(new Date());
        System.out.println(monthAndYear);
        
        //*****************************************
        
        formatter = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        System.out.println(formatter.format(calendar.getTime()));
	}

}
