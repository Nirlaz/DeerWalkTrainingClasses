package OopConcept;
// Inheritance -> interface and class
public class Inheritance extends Student {
	private String teacherName;
	private int teacherId;
	
	public Inheritance(String teacherName,int teacherId) {
		this.teacherName=teacherName;
		this.teacherId=teacherId;
	}
	public static void main(String[] args) {
		Inheritance in = new Inheritance("Subansu",101);
		in.setNameString("Nirlaz");
		in.details();//methode overriding
		in.details("Nirlaz",57,"Kathmandu");
	}
	public void details() { //details method was overriding 
		int x=2;
		int y=3;
		int sum = x+y;
		System.out.println(sum);
	}
}
