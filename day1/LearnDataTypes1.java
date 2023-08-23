package week1.day1;

    public class LearnDataTypes1 {
	int noOfWheels=4;    //Global Variable 
	Boolean isPuncture=true;
	long regNumber = 12304555l;
	
	public int add (int a, int b) {
		int result=a+b;
		System.out.println(result);
		return result;
	}
	private void soundHorn() { 
		System.out.println("Sound");
	}
	
	void colourCar() {
		System.out.println("black");
	}
	public static void main(String[] args) {
		// dataType variable name = value;
		
		String colour = " white";
		int noOfWheels=4;    //Global Variable 
		Boolean isPuncture=true;
		long regNumber = 12304555l;
		char logo='K';
		float mileage =23.3451f;
		double capacity =234.345d;
		
		System.out.println("colour of the car:"+colour);
		System.out.println(capacity);
		System.out.println(logo);
	    System.out.println(regNumber);
	    
		//create object to call members of the class(variable and method)
		LearnDataTypes1 data=new LearnDataTypes1();
		 data.soundHorn();
		 data.add(20, 20);
		 data.colourCar();
		 System.out.println(data.isPuncture);
		 System.out.println(data.noOfWheels);
		 System.out.println(data.regNumber);
		 
	}

}
