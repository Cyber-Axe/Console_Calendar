package ���ӻ�����;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Calendar0 {
	
	public static void main(String[] args) throws IOException, ParseException {
		System.out.println("���������ڣ����磺2015-11-15");
		//����
	    Scanner scanner = new Scanner(System.in); 
	    String tempString = scanner.nextLine();
	    
	    DateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
	    Date date = dFormat.parse(tempString); 
	    Calendar calendar = new GregorianCalendar();
	    calendar.setTime(date);
	    
	    //calendar.add(calendar.DATE, 1);
	    //System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
	    int max = calendar.getActualMaximum(Calendar.DATE);
	    //System.out.println(max);
 	    int day = calendar.get(Calendar.DATE);
 	    //System.out.println(day);
 	    
 	    calendar.set(Calendar.DATE,1); 
 	    System.out.println("��\tһ\t��\t��\t��\t��\t��");
 	   // System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
 	    for (int i = 0; i < calendar.get(Calendar.DAY_OF_WEEK)-1; i++) {
 	    	System.out.print("\t");	
		}
 	    
 	    for (int i = 1; i <= max ; i++) {
 	    	calendar.setTime(date);
 	    	if(i == calendar.get(Calendar.DAY_OF_MONTH))
			    System.out.print(i + "*");
 	    	else 
			    System.out.print(i);
			System.out.print("\t");
			calendar.set(Calendar.DATE,i);
			if(calendar.get(Calendar.DAY_OF_WEEK) == 7) {
				System.out.print("\n");
			}
		}
	}

}
