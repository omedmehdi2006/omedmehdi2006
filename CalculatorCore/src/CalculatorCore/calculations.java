package CalculatorCore;

import java.util.Scanner;

public class calculations {

	
	
	static int firstNumber() {
        Scanner firstNum = new Scanner(System.in);
        System.out.print("");
        int n1 = firstNum.nextInt();
		return n1;
        
    }

    static int secondNumber() {
        Scanner secondNum = new Scanner(System.in);
        System.out.print("Enter input:");
        int n2 = secondNum.nextInt();
		return n2;
        
    }
    

    
    


    public static void main(String[] args) {
    
    
    
        System.out.println("Please Choose one of the following equasions: +, -, * or /");
        mathEquasions();
    
    
        
    }
    
    
    static void mathEquasions() {
        Scanner equasions = new Scanner(System.in);
        System.out.print("Enter input: ");
        String e = equasions.next();
        
        if (e.equals("+")) {
        	
        	
        		
        	
            System.out.println("");
            System.out.println("Please enter the first number that you want to add:");
            
            int n1 = firstNumber();
            
            System.out.println("");
            System.out.println("Now add the second number:");
            
            
            int n2 = secondNumber();
            
            
            var additionAnswer = (n1 + n2);  /*The problem is situated here, i need to call the 
            strings from another class*/
            
           
           
            
            
            System.out.println("");
            System.out.println("");
            
            
            System.out.println("Your answer is...");
            System.out.println(additionAnswer);
            
           
            	
            	
            		
            	
            	
            	
            
            
            	
                 }
            
            
        
               
         
        
        else if (e.equals("-")) {
        	System.out.println("");
            System.out.println("Please enter the first number that you want to subtract:");
            int n1 = firstNumber();
            
            
            
            
            System.out.println("");
            System.out.println("Now add the second number:");
            
            
            int n2 = secondNumber();
            var subtractionAnswer = (n1 - n2); 
            System.out.println("");
            System.out.println("");
            System.out.println("Your answer is...");
            System.out.println(subtractionAnswer);
            	}
        
        else if (e.equals("*")) {
        	System.out.println("");
            System.out.println("Please enter the first number that you want to multiply:");
            int n1 = firstNumber();
            
            
            
            
            System.out.println("");
            System.out.println("Now add the second number:");
            
            
            int n2 = secondNumber();
            var multiplicationAnswer = (n1 * n2);  
            System.out.println("");
            System.out.println("");
            System.out.println("Your answer is...");
            System.out.println(multiplicationAnswer);
            	}
        
        else if (e.equals("/")) {
        	System.out.println("");
            System.out.println("Please enter the first number that you want to divide:");
            int n1 = firstNumber();
            
            
            
            
            System.out.println("");
            System.out.println("Now add the second number:");
            
            
            int n2 = secondNumber();
            var divisionAnswer = (n1 / n2); 
         
            System.out.println("");
            System.out.println("");
            System.out.println("Your answer is...");
            System.out.println(divisionAnswer);
            
            	}
        else {
        	System.out.println("");
        	System.out.println("That is not a valid answer");
        	System.out.println("");
        	System.out.println("Please Choose one of the following equasions: +, -, * or /");
        	mathEquasions();
                }
        
    

	}
    
    	
    }
  
       
    