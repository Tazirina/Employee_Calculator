import java.util.Scanner;

public class CalculatorV2 {
	//====All Global Variables
	static String  nameOfEmployee;
	static double  numberOfHourWorked;
	static double  HourlyPayRate;
	static double  grosspay;
	static double  netpay;
	
    //=== Module 1
	public static void wellcome() {
	 System.out.println("******Employee Calculator V1.******");
     System.out.println("Please follow the instruction");
			
		
	}
	//====Module 2
	public static void getinput() {
		
		//Contractor in my Program
				Scanner myscanner= new Scanner(System.in);
				
				System.out.println("Enter Emplyee name:");
				nameOfEmployee=myscanner.nextLine();
				System.out.println("Enter total hour:");
				numberOfHourWorked =myscanner.nextDouble();
				System.out.println("Enter total pay rate:");
				HourlyPayRate = myscanner.nextDouble();	
				
				}
	
	//===Module 3
	 public static void  Calculategrosspay() {
	grosspay=numberOfHourWorked*HourlyPayRate;
	 }
	 public static void Calculatenetpay() {
		 
		 if(grosspay<1500)
		 
		 {
			 netpay=grosspay-10;
		 } 
		 	else if (grosspay>=1500 && grosspay<3000) 
		 {
			
			 netpay=grosspay-20;
		 }
		 
			else if (grosspay>=3000 && grosspay<4000) 
			{
				
				netpay=grosspay-30;
				
			}
		 
		 else if (grosspay>=4500 && grosspay<6000)
         {
			 netpay=grosspay-40;
			 
		 }
		 else if (grosspay>=6000) 
		 {
			 netpay=grosspay-50;
			 
			 
		 }
		 
		 else 
		 {
		System.out.println("humm something went wrong");
		

		 }
			  
			  
		 }
	//===Module 4
	public static void displayoutput() {
		System.out.println();
		System.out.println();
		System.out.println("======Pay Slip========");
		System.out.println("Employee Name is"+nameOfEmployee);		
		
		System.out.println("Employee total is "+numberOfHourWorked);
	
		System.out.println("Employee hourly rate is "+HourlyPayRate);
		System.out.println( "======================================");
		System.out.println( "Employee gross pay is "+ grosspay);	
		
		System.out.println( "Employee net pay is "+ netpay);	
		
	}
	
	
	//Special main Module 
	
	public static  void main(String[] args) {
		
  	//Calling All Other Module 
		wellcome();
		
		int maxEmployee=5;
		for(int i=1; i<=maxEmployee;i++)
		{	
			System.out.println("Calculating salary for employe " +i);
			
		getinput();
		Calculategrosspay();
		Calculatenetpay();
		displayoutput(); 
		System.out.println("============================== ");
		
		
		}
		
		
		
		
		
	
		
		
	
		
		
		
	
	}
	
	
	
	

}
