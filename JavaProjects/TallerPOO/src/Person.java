
public class Person {
	private String name;
	private String number;
	public Person(String name,String number){
		this.setName(name);
		this.setNumber(number);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String toString()
	{
		return "Name: "+name+"Number: "+number;
	}
	
	
}
