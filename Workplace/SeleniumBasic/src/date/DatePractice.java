package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE, 0);
		Date d=cal.getTime();
		//System.out.println(d);---> This Date is not in Proper format
		// To get Date in proper Format
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(d));
	

	}

}
