package Singleton;

import java.util.Date;

public class Singleton {
	private static Singleton instance = null;
	private Date createdDate;
	   private Singleton() {
		   createdDate = new Date();
	   }
	   public static Singleton getInstance() {
	      if(instance == null) {
	         instance = new Singleton();
	      }
	      return instance;
	   }
	   
	   public void printCreatedDate()
	   {
		   System.out.println(createdDate);
	   }
}
