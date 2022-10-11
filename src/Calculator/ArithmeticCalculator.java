package Calculator;
import java.util.*;
/*
 * As a developer, write a Java code to create a calculator 
 * to perform the four basic arithmetic operations (addition, subtraction, multiplication, and division).
*/
public class ArithmeticCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Arithmetic Calculator: \nEnter first number a: ");
		float a = sc.nextFloat();
		
		System.out.print("Enter Second Number: ");
		float b = sc.nextFloat();
		
		System.out.print("Enter Operator ");
		char Operator = sc.next().trim().charAt(0);
		
		
		switch(Operator) {
		
		case '+' -> System.out.println("a + b = "+(a+b));
		case '-' -> System.out.println("a - b = "+(a-b));
		case '*' -> System.out.println("a * b = "+(a*b));
		case '/' -> System.out.println("a / b = "+(a/b));
		case '%' -> System.out.println("a % b = "+(int)(a%b));
		default -> System.out.println("Enter Valid Operator!!");
		}
			

	}

}
