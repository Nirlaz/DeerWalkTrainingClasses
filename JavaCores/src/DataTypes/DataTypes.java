package DataTypes;

public class DataTypes {
	public static void main(String[] args) {	
	boolean isSwitchOn = true;
	int firstNumber = 100;
	char firstCharacter = 'a';
	String firstWord = "Nirlaz";
	float firstFloatValue= 1.1f;
	double firstDoubleValue = 12d;
	System.out.println(isSwitchOn);
	System.out.println(firstNumber);
	System.out.println(firstCharacter);
	System.out.println(firstWord);
	System.out.println(firstFloatValue);
	System.out.println(firstDoubleValue);
	//type Casting -> widening and narrowing
	int secondNumber = (int)firstDoubleValue;
	System.out.println(secondNumber);
	
	}
}
