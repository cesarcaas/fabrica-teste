package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataStringToDateTime {

	public static void main(String[] args) {
		//String date_time = "11/27/2020 05:35:00";
		String date_time = "11/12/23";
		//SimpleDateFormat dateParser = new SimpleDateFormat("MM/dd/yy HH:mm:ss");
		SimpleDateFormat dateParser = new SimpleDateFormat("MM/dd/yy");
		{
			try {
				Date date = dateParser.parse(date_time);
				System.out.println(date);

				SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yy");
				System.out.println(dateFormatter.format(date));

			} catch (ParseException e) {
				e.printStackTrace();
			}
		}

	}

}
