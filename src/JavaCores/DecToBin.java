package JavaCores;

public class DecToBin {
	public static void main(String[] args) {
		int decimalNumbers = 2;
		int binaryNumbers=0;
		int finalValue=0;
		
		while(decimalNumbers!=0) {
			binaryNumbers = decimalNumbers % 2;
			decimalNumbers /= 2;
			finalValue = finalValue*10+binaryNumbers;
					}
		System.out.println(reverse(finalValue));	
	}
	public static int reverse(int number){
        int reverse=0;
        int lastdigit;
        while(number!=0){
            reverse*=10;
            lastdigit=number%10;
            reverse+=lastdigit;
            number=number/10;
        }
        reverse+=number;
        return reverse;
    }
	

}
