package com.erp.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
/*import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
*/import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Date;

public class Custom {

	//private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
   // private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	
	

	public static String getCurrentInvoiceDate() {
		//SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		System.out.println(formatter.format(date));
		System.out.println("Invoice Date -->"+date);
		return formatter.format(date);
	}

	
	
	
	
	
    private static final DateFormat sdff = new SimpleDateFormat("HH:mm:ss");
   
    public static String getCurrentDateandTime() {
    	
    	Date today = new Date();
    	String currentTime = sdff.format(today);
    	System.out.println("Current time ---------->"+currentTime);
        return currentTime;
    }
    
	private static final DateFormat formateDate = new SimpleDateFormat("dd/MM/yyyy");
 
 public static String getFormatedDate(Date inputDate) {

    	//Date today = new Date();
    	String formate = formateDate.format(inputDate);
    	System.out.println("Formated Date ---------->"+formate);
        return formate;
    }
 
    
    
    public static java.sql.Date getCurrentDate() {
        java.util.Date today = new java.util.Date();
        return new java.sql.Date(today.getTime());
    }
    
/*    mapadult.put("adult0", 0);
	mapadult.put("adult1", 1);
	mapadult.put("adult2", 2);
	mapadult.put("adult3", 3);
	mapadult.put("adult4", 4);
	mapadult.put("adult5", 5); */  	
    static Map<String,Integer> mapadult = null;//new HashMap<String,Integer>();
    static Map<String,Integer> mapchild = null;//new HashMap<String,Integer>();
    static Map<String,Integer> maprooms = null;//new HashMap<String,Integer>();
    static Map<String,Integer> mappax = null;
    
 public static int getAudult(String key){
	 mapadult = new HashMap<String,Integer>();
		mapadult.put("adult0", 0);
    	mapadult.put("adult1", 1);
    	mapadult.put("adult2", 2);
    	mapadult.put("adult3", 3);
    	mapadult.put("adult4", 4);
    	mapadult.put("adult5", 5); 
    	mapadult.put("", 6);  
    	mapadult.put(null, 7);  


     int val=mapadult.get(key);
     return val;

   }
   
public static int getRooms(String key){
	maprooms = new HashMap<String,Integer>();
	maprooms.put("room0", 0);
	maprooms.put("room1", 1);
	maprooms.put("room2", 2);
	maprooms.put("room3", 3);
	maprooms.put("room4", 4);
	maprooms.put("room5", 5);
	maprooms.put("", 6);  
	maprooms.put(null, 7);  

	 int val=maprooms.get(key);
     return val; 
   }

	public static int getChild(String key){
		mapchild = new HashMap<String,Integer>();
		mapchild.put("child0", 0);
		mapchild.put("child1", 1);
		mapchild.put("child2", 2);
		mapchild.put("child3", 3);
		mapchild.put("child4", 4);
		mapchild.put("child5", 5);
		mapchild.put("", 6);  
		mapchild.put(null, 7);  

		 int val=mapchild.get(key);
	     return val;  
	}

	public static int getPax(String key){
		mappax = new HashMap<String,Integer>();
		mappax.put("pax0", 0);
		mappax.put("pax1", 1);
		mappax.put("pax2", 2);
		mappax.put("pax3", 3);
	   	mappax.put("pax4", 4);
	   	mappax.put("pax5", 5); 
	   	mappax.put("", 6);  
	   	mappax.put(null, 7);  

	    int val=mappax.get(key);
	    return val;
	}
  
}
