package JavaCores;

import java.util.Scanner;

public class RecursionFibo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the lenght of number: ");
		int number=scan.nextInt();
		System.out.print(fibo(number));
		
	}
	public static int fibo(int num) {
		if(num == 1 || num == 2) {
			return num -1;
		}else {
			return fibo(num-1)+fibo(num-2);
		}
	}

}
