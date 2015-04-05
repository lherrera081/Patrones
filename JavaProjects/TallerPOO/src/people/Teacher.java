package people;

public class Teacher extends people.Person{

	private int salary;
	public Teacher(String name, String number, int salary) {
		super(name, number);
		this.salary=salary;
	}
	
	public String toString(){
		return super.toString() + "\n\tsalary: "+salary;
	}
}
