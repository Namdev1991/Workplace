package mavenfirst;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE,5);
		SimpleDateFormat sdf=new SimpleDateFormat("dd MMMM yyyy");
		String date=sdf.format(new Date(cal.getTimeInMillis()));
		System.out.println(date);
		SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf1.format(new Date(cal.getTimeInMillis())));

	}

}
