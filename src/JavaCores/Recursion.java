package JavaCores;

import java.util.Scanner;

public class Recursion {
	//Function that call itself
	//factorial -> 5!=>5 * 4 * 3 * 2 * 1
	//general con ->n! = n*(n-1)!
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the factorial number: ");
		int number = scan.nextInt();
		int result=factorial(number);
		System.out.print("factorial of "+number + " is: "+result);
	}
	public static int factorial(int number){
		if(number == 0 || number ==1) {
			return 1;
		}else {
		return number* factorial(number-1);
		}
		
	}

}
