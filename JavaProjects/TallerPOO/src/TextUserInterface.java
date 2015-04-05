import java.util.Scanner;


public class TextUserInterface {
	private Scanner reader;
	private Dictionary dictionary;
	public TextUserInterface(Scanner reader, Dictionary dictionary)
	{
		this.reader=reader;
		this.dictionary=dictionary;
	}
	
	public void start(){
		System.out.println("Statement:");
		System.out.println("quit - quit the text user interface");
		String word;
		do{
			System.out.print("Statement: ");
			word = reader.nextLine();
			switch(word){
				case "translate":
					translateWord();
					break;
				case "add":
					addWord();
					break;
				case "quit":
					break;
				default:
					System.out.println("Unknown statement");
					break;
			}
		}
		while(word.equals("quit")==false);
	}

	private void addWord() {
		System.out.print("In Finnish: ");
		String word = reader.nextLine();
		System.out.print("Translation: ");
		String translate = reader.nextLine();
		this.dictionary.add(word, translate);
	}
	
	private void translateWord() {
		System.out.print("In Finnish: ");
		String word = reader.nextLine();
		System.out.print("Translation: ");
		System.out.println(this.dictionary.translate(word));
	}
	
}
