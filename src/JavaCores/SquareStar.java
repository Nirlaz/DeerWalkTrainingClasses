package JavaCores;

import java.util.Scanner;

// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 


public class SquareStar {
	public static void main(String[] args) {
	//pattern();	
	//pattern1();
		pattern2();
	}
	public static void pattern() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the pattern width: ");
		int patternWidth = scan.nextInt();
		System.out.println("Enter the pattern length: ");
		int patternLength = scan.nextInt();
		for(int i=0;i<patternWidth;i++) {
			for(int j=0;j<patternLength;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void pattern1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the pattern width: ");
		int patternWidth = scan.nextInt();
		System.out.println("Enter the pattern length: ");
		int patternLength = scan.nextInt();
		for(int i= patternWidth;i>=0;i--) {
			System.out.println();
			for(int j=patternLength;j>=0;j--) {
				System.out.print("* ");
				
			}
			patternLength--;
			
		}
		
	}
	public static void pattern2() {
		int pW=5;
		int pL=5;
		int space=4;
		for(int i=0;i<5;i++) {
				for(int k=0;k<=i;k++) {
					System.out.print("*");
				}
				System.out.println();
			
					
		}
	}
	
		
		
	
}
