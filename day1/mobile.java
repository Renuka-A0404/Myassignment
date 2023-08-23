package week1.day1;
	
public class mobile {
      public void sendsms()
      { 
    	     System.out.println("From Oppo");
      }
      public long makeCall(long phno)
      {
    	  return phno;
      }
      public static void main(String[] args)  {
    	  
    	 mobile obj=new mobile();
    	 obj.sendsms();
    	 System.out.println(obj.makeCall(7402062067l));
    	 
      }
}

