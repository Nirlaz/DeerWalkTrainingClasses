package OopConcept;
//Methode overloading always in compile time 

public class Student {
	private String nameString;
	private int id;
	private String addressString;
	public Student() {
		
	}
	
	public Student(String name,int id,String address) {
		this.nameString=name;
		this.addressString=address;
		this.id = id;
	}
	
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddressString() {
		return addressString;
	}
	public void setAddressString(String addressString) {
		this.addressString = addressString;
	}
	public static void main(String[] args) {
		Student st = new Student("Niyam",13,"Gulmi");
		st.details();
		st.details("Nirlaz",22,"Baletaksar-4,Gulmi");
		System.out.println("Name of the Student: "+st.details("Nirmal"));
		st.details(22);
	}
	//no arg and no return value
	public void details() {
		System.out.println("Name of the Student: "+this.nameString);
		System.out.println("Id of the Student: "+this.id);
		System.out.println("Address of the Student: "+this.addressString);
	
	}
	//arg and no return value
	public void details(String name,int id,String address) {
		System.out.println("Name of the Student: "+name);
		System.out.println("Id of the Student: "+id);
		System.out.println("Address of the Student: "+address);
	
	}
	//arg and return value
	public String details(String name) {
	return name;}
	
	//arg and  no return value
	public void details(int id) {
		System.out.println("Id of the Student: "+id);
	}
	
}
