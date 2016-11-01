package com.raj.java8.date.time;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeTest {
   public static void main(String args[]){
      ZonedDateTimeTest java8tester = new ZonedDateTimeTest();
      java8tester.testZonedDateTime();
   }
	
   public void testZonedDateTime(){
	
      // Get the current date and time
      ZonedDateTime date1 = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Kolkata]");
      System.out.println("date1: " + date1);
		
      ZoneId id = ZoneId.of("Europe/Paris");
      System.out.println("ZoneId: " + id);
		
      ZoneId currentZone = ZoneId.systemDefault();
      System.out.println("CurrentZone: " + currentZone);
   }
}