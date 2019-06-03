package presentation_examples;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datetime_example {

	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat();
		String date = dateFormat.format(new Date());
		System.out.println(date);
	}

}
