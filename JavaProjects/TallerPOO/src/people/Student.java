package people;

public class Student extends people.Person{
	private int credits;
	public Student(String name, String number) {
		super(name, number);
		credits=0;
	}
	
	public void study(){
		credits++;
	}
	
	public int credits(){
		return this.credits;
	}
	
	public String toString(){
		return super.toString() + "\n\tcredits: "+credits;
	}
}
