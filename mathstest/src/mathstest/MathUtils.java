package mathstest;

public class MathUtils {

	  
	   public static int add(int a, int b) {
	       return a + b;//Addition
	   }

	   
	   public static int subtract(int a, int b) {
	       return a - b;//Subtraction
	   }

	 
	   public static int multiply(int a, int b) {
	       return a * b;//Multiplication
	   }

	   public static double divide(int a, int b) {
	       if (b == 0) {
	           return -1.0; // Handle division by zero
	       } else {
	           return (double) a / b;//Division
	       }
	   }
	}