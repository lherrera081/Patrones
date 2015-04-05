import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
			System.out.flush();
			System.out.println("Type the excercise number: ");
			String exerciseNumber = in.nextLine();
			switch(exerciseNumber){
				case "3":
					Exercise3();
					break;
				case "5":
					Exercise5();
					break;
				case "16":
					Exercise16(in);
					break;
				case "20":
					Excersise20(in);
					break;
				case "34":
					Exercise34(in);
					break;
				case "41":
					Exercise41(in);
					break;
				case "44":
					Exercise44();
					break;
				case "52":
					Excersise52(in);
					break;
				case "57":
					Excersise57(in);
					break;
				case "69":
					Excersise69(in);
					break;
				case "70":
					Excersise70();
					break;
				case "76":
					Excersise76();
					break;
				case "94":
					Excersise94();
					break;
				case "95":
					Excersise95();
					break;
				case "114":
					Excersise114();
					break;
				case "136":
					Exercise136();
					break;
				default:
					System.out.println("Excercise number not found");
			}
			System.out.println("Press Enter key to continue...");
			in.nextLine();
		}

	}

	private static void Exercise3() {
		System.out.println("     *");
		System.out.println("    ***");
		System.out.println("   *****");
		System.out.println("  ********");
		System.out.println(" **********");
		System.out.println("     *");
		System.out.println("Exercise 3: Supruce");
	}
	
	private static void Exercise5() {
		int days=365;
		int hours=24;
		int minutes=60;
		int seconds=60;
		int secondsByYear=days*hours*minutes*seconds;
		System.out.println("One year is "+ secondsByYear +" seconds.");
		System.out.println("Exercise 5: Seconds in a year");
	}

	private static void Exercise16(Scanner in) {
		System.out.println("EVEN, ODD - Type a number: ");
		int number= Integer.parseInt(in.nextLine());
		if((number % 2) == 0)
		{
			System.out.println("Number "+number+" is even.");
		}else
		{
			System.out.println("Number "+number+" is odd");
		}
	}
	
	private static void Excersise20(Scanner in){
		System.out.print("Type your username: ");
		String userName = in.nextLine();
		System.out.print("Type your password: ");
		String password = in.nextLine();
		if((userName.equals("alex") && password.equals("mightyducks"))
			||(userName.equals("emily") && password.equals("cat")	)){
			System.out.print("You are now logged into the system!");
		}else{
			System.out.print("Your username or password was invalid!");
		}
	}
	
	private static void Exercise34(Scanner in) {
		System.out.println("FACTORIAL - Type a number: ");
		int number= Integer.parseInt(in.nextLine());
		long result = 1;
		for(int i=number;i>1;i--){ 
			result=result*i; 
		} 
		System.out.println("Factorial is "+result);
	}
	

	private static void Exercise41(Scanner in) {
		Random random = new Random();
		int correctNumber = random.nextInt(100 + 1);
		int i=0;
		while(true){
			i++;
			System.out.print("Guess a number: ");
			int number= Integer.parseInt(in.nextLine());
			if(correctNumber== number)
				break;
			else if(number<correctNumber)
				System.out.println("The number is greater, guesses made: "+i);
			else
				System.out.println("The number is lesser, guesses made: "+i);
		}
		System.out.println("Congratulations, your guess is correct!");
	}
	
	public static void Exercise44() {
		int answer =  least(2, 7);
	    System.out.println("Least: " + answer);	
	}
	
	public static int least(int number1, int number2) {
		return number1<number2? number1:number2;
	}

	private static void Excersise52(Scanner in){
		System.out.print("Type your name: ");
		String name = in.nextLine();
		System.out.print("In reverse order: ");
		for(int i=name.length(); i>0;i--){
			System.out.print(name.charAt(i-1));	
		}
	}
	
	private static void Excersise57(Scanner in){
		ArrayList<String> words = new ArrayList<String>();
		while(true){
			System.out.print("Type a word: ");
			String word=in.nextLine();
			if(word.isEmpty())
				break;
			words.add(word );
		}
		System.out.println("You typed the following words:");
		for (String word : words) {
			System.out.println( word );
		}
	}
	
	private static void Excersise69(Scanner in){
		 System.out.println("Type a text: ");
		    String text = in.nextLine();
		    if (palindrome(text)) {
		       System.out.println("The text is a palindrome!");
		    } else {
		       System.out.println("The text is not a palindrome!");
		    }
	}

	private static boolean palindrome(String text) {
		text.toCharArray();
		for(int i=0;i<text.length();i++)
		{
			if(text.charAt(i)!=text.charAt(text.length()-1-i))
				return false;
		}
		return true;
	}
	
	private static void Excersise70(){
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
	
		list1.add(4);
		list1.add(3);
	
		list2.add(5);
		list2.add(10);
		list2.add(7);
	
		combine(list1, list2);
	
		System.out.println(list1); // prints [4, 3, 5, 10, 7]
	
		System.out.println(list2); // prints [5, 10, 7]
	}

	private static void combine(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		list1.addAll(list2);
	}
	
	private static void Excersise76(){
		Menu menu = new Menu();
		menu.addMeal("Hamburger");
		menu.addMeal("Fish'n'Chips");
		menu.addMeal("Sauerkraut");
		menu.printMeals();
		menu.clearMeal();
		menu.printMeals();
		System.out.println("View source code to validate the methods, the name class is: Menu");
	}
	
	private static void Excersise94(){
		Phonebook phonebook = new Phonebook();
		phonebook.add("Pekka Mikkola", "040-123123");
		phonebook.add("Edsger Dijkstra", "045-456123");
		phonebook.add("Donald Knuth", "050-222333");
		phonebook.printAll();
		String number = phonebook.searchNumber("Pekka Mikkola");
	    System.out.println( number );
	    number = phonebook.searchNumber("Martti Tienari");
	    System.out.println( number );
	}
	
	private static void Excersise95(){
		Money a = new Money(10,0);
		Money b = new Money(5,0);

		Money c = a.plus(b);

		System.out.println("--------------PLUS----------------");
		System.out.println(a);  // 10.00e
		System.out.println(b);  // 5.00e
		System.out.println(c);  // 15.00e
		System.out.println("a=a+c");
		a = a.plus(c);          // NOTE: new Money-object is created and reference to that
		                        //           is assigned to variable a.
		                        //       The Money object 10.00e that variable a used to hold
		                        //           is not referenced anymore
		System.out.println(a);  // 25.00e
		System.out.println("--------------LESS-----------------");
		System.out.println(a);  // 25.00e
		System.out.println(b);  // 5.00e
		System.out.println(c);  // 15.00e
		System.out.println("a<b?"+a.less(b));  // false
		System.out.println("b<c?"+b.less(c));  // true
		
		System.out.println("--------------MINUS-----------------");
		
		System.out.println(a);  // 10.00e
		System.out.println(b);  // 3.50e
		System.out.println(c);  // 6.50e

		c = c.minus(a);         // NOTE: new Money-object is created and reference to that is assigned to variable c
		                        //       the Money object 6.50e that variable c used to hold, is not referenced anymore
		System.out.println("c=c-a");
		System.out.println(a);  // 10.00e
		System.out.println(b);  // 3.50e
		System.out.println(c);  // 0.00e
	}
	
	
	public static void Excersise114()
	{
		Dictionary dictionary = new Dictionary();
	    dictionary.add("apina", "monkey");
	    dictionary.add("banaani", "banana");
	    System.out.println(dictionary.translate("apina"));
	    System.out.println(dictionary.translate("porkkana"));
	    System.out.println("**********114.2: AMOUNT OF WORDS**********");
	    System.out.println(dictionary.amountOfWords());
	    dictionary.add("cembalo", "harpsichord");
	    System.out.println("cembalo added...");
	    System.out.println(dictionary.amountOfWords());
	    System.out.println("**********114.3: LISTING ALL WORDS**********");	    
	    ArrayList<String> translations = dictionary.translationList();
	    for(String translation: translations) {
	        System.out.println(translation);
	    }
	    
	    System.out.println("**********114.4 - 114.5: THE BEGINNING OF A TEXT USER INTERFACE**********");
	    Scanner reader = new Scanner(System.in);
	    Dictionary dict = new Dictionary();
	    TextUserInterface ui = new TextUserInterface(reader, dict);
	    ui.start();
	    
	    
	    
	}
	public static void Exercise136()
	{
		people.Person pekka = new people.Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
		people.Person esko = new people.Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");
        System.out.println(pekka);
        System.out.println(esko);
        System.out.println("**********EXERCISE 136.2: STUDENT**********");   
        people.Student olli = new people.Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(olli);
        System.out.println("credits " + olli.credits());
        olli.study();
        System.out.println("credits "+ olli.credits());
        System.out.println("**********EXERCISE 136.3: TOSTRING FOR STUDETS**********");   
        olli = new people.Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println( olli );
        olli.study();
        System.out.println( olli );
        System.out.println("**********EXERCISE 136.4: TEACHER**********");
        pekka = new people.Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200);
        esko = new people.Teacher("Esko Ukkonen", "Mannerheimintie 15 Street 00100 Helsinki", 5400);
        System.out.println( pekka );
        System.out.println( esko );

        olli = new people.Student("Olli", "Ida Albergintie 1 Street 00400 Helsinki");
        for ( int i=0; i < 25; i++ ) {
            olli.study();
        }
        System.out.println( olli );
        System.out.println("**********EXERCISE 136.5: EVERYONE IN A LIST**********");
        List<people.Person> people = new ArrayList<people.Person>();
        people.add( new people.Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200) );
        people.add( new people.Student("Olli", "Ida Albergintie Street 1 00400 Helsinki") );

        printDepartment(people);
	}
	
	 public static void printDepartment(List<people.Person> people) {
		 for(people.Person person : people)
		 {
			 System.out.println( person );
		 }
		 
	 }

	
}
