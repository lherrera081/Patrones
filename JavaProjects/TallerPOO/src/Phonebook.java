import java.util.ArrayList;


public class Phonebook {
	private ArrayList<Person> persons;
	
	public Phonebook(){
		this.persons = new ArrayList<Person>();
	}
	
	public void add(String name, String number){
		this.persons.add(new Person(name,number));
	}
	
	public void printAll(){
		for(Person person : persons){
			System.out.println(person.toString());
		}
	}
	
	public String searchNumber(String name){
		for(Person person : this.persons){
			if(person.getName().equals(name)){
				return person.getNumber();
			}
		}
		return "Number not known";
	}
}
