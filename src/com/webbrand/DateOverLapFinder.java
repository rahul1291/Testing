package com.webbrand;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class DateOverLapFinder {

	public static void main(String[] args) {
		
		boolean isOverlap;
		
		//String showTimes[] = {"1/1/2015 20:00-21:30","1/1/2015 21:30-23:00","1/1/2015 23:10-23:30"};
		String showTimes[] ={"1/2/2015 23:00-24:30","1/1/2015 4:00-4:15","1/1/2015 8:00-9:00","1/1/2015 4:30-5:00"};
		isOverlap = CanViewAll(showTimes);
		if(isOverlap==true){
			System.out.println("Movies are Overlapping!!");
		}
		else{
			System.out.println("Movies are Not Overlapping!!");
		}
	
	}
	
	public static boolean CanViewAll(String[] showTimes){
		
        String dateTime[][] = new String[showTimes.length][];
        boolean flag=false;
    	SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
    	
		for(int i=0;i<showTimes.length;i++){
		    dateTime[i] =  showTimes[i].split(" ");
		}
		
		try{
			for(int i=0;i<showTimes.length-1;i++){
		
			Date date1 = formatter.parse(dateTime[i][0]);
			Date date2 = formatter.parse(dateTime[i+1][0]);
			if(date1.compareTo(date2)==0){
				String timings1[] = dateTime[i][1].split("-");
				String timings2[] = dateTime[i+1][1].split("-");
				if((Time.valueOf(timings2[0]+":00").after(Time.valueOf(timings1[0]+":00")) || Time.valueOf(timings2[0]+":00").equals(Time.valueOf(timings1[0]+":00")))
					&& (Time.valueOf(timings2[1]+":00").after(Time.valueOf(timings1[0]+":00")) || Time.valueOf(timings2[1]+":00").equals(Time.valueOf(timings1[0]+":00")))){
					flag= false; 
				}
				else{
					flag=true;
				}
			}
			else{
				continue;
			}
			
		}
		}
		catch(ParseException pe1){
			pe1.addSuppressed(pe1);
		}
		return flag;
	}

}
