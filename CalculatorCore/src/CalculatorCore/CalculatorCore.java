package CalculatorCore;
import java.util.Calendar;
import java.util.Scanner; 
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import CalculatorCore.calculations;  
public class CalculatorCore {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		
		//-------------------------------------------------------------------------------------------------------------------------------------//
		System.out.println("Hello");
		System.out.println("Welcome To ComputerCalculator!          v.pre1");
		System.out.println("Designed By Omed Dariab");
		System.out.println("Made in 20/7/2021");
		System.out.print("Today is ");
		System.out.println(dateFormat.format(cal.getTime()));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		TimeUnit.SECONDS.sleep(2);
		
		System.out.println("Hello");
		System.out.println("Type one of the following statements: start, stop or help");
		startupQuestion();
	}
		static void startupQuestion() throws InterruptedException {	
		Scanner startup = new Scanner(System.in);
		System.out.print("Enter input: ");
		String s = startup.next();
		
		
		
		if(s.equals("start")){
			System.out.println("");
			System.out.println("");

			calculations.main(null); 

			//java
			
			}
		else if(s.equals("stop")){
			System.out.println("Terminating Calculator...");
			TimeUnit.SECONDS.sleep(3);
			System.exit(1);
				
			}
		else if(s.equals("help")){
			System.out.println("");
			System.out.println("List and details of each command:");
			System.out.println("start - To begin the program");
			System.out.println("stop - To stop any additional actions in the program");
			System.out.println("help - To request a Line of commands and details about them");
			TimeUnit.SECONDS.sleep(6);
			System.out.println("");
			System.out.println("");
			System.out.println("Type one of the following statements: start, stop or help");
			startupQuestion();
			
		}
		else{
				System.out.println("");
				System.out.println("");
			    TimeUnit.SECONDS.sleep(2);
				System.out.println("Sorry, that is not an valid answer, try again.");
				System.out.println("");
				System.out.println("Type one of the following statements: start, stop");
				startupQuestion();
				System.out.print("Enter input: ");

			}
    		
    		}
		
		
		  
          
          
          
        	  
        	  
			
		
				
				
}



