import java.util.Scanner;

public class CalculatorV1 {

	public static void main(String[] args) {
	
	// 1.Start
	// Declaring all Variable with appropriate Data type
	// 2.Declare Staring nameOfemployee
	// 3.Declare double numberOfHourWorked
	// 4.Declare double HourlyPayRate
	// 5.Declare double GrossPay
		
		// Create a variable 
		
	String  nameOfEmployee;
	double  numberOfHourWorked;
	double  HourlyPayRate;
	double  grosspay;
		
		
		System.out.println("******Employee Calculator V1.******");
		
		System.out.println("Please follow the instruction");
		
		
		nameOfEmployee="Mr X";
		numberOfHourWorked = 40;
		HourlyPayRate = 10;
		grosspay=numberOfHourWorked*HourlyPayRate;
		
		
		
		// Contractor in my Program
		Scanner Myscanner= new Scanner(System.in);
		
		System.out.println("Enter Employee Name:");
		
		nameOfEmployee=Myscanner.nextLine();
		System.out.println("Enter total houre:");
		
		numberOfHourWorked=Myscanner.nextDouble();
		
		System.out.println("Enter Rate:");
		
		HourlyPayRate=Myscanner.nextDouble();
		
		System.out.println();
		System.out.println();
		System.out.println("======Pay Slip========");
		System.out.println("Employee Name is"+nameOfEmployee);		
		
		System.out.println("Employee total is "+numberOfHourWorked);
	
		System.out.println("Employee hourly rate is "+HourlyPayRate);
		System.out.println( "======================================");
		System.out.println( "Employee gross pay is "+ grosspay);
		
		
		
	
	}
	
	
	
	

}
