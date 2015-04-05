import java.util.ArrayList;
import java.util.HashMap;


public class Dictionary {
    private HashMap<String, String> wordPairs ;

    public Dictionary() {
        this.wordPairs  = new HashMap<String, String>();
    }

    public void add(String word, String translate) {
        if(this.wordPairs .containsKey(word))
        	this.wordPairs.replace(word, translate);
    	this.wordPairs .put(word, translate);
    }

    public String translate(String word) {
    	if(this.wordPairs .containsKey(word)== false)
    		return "Word not found";
        return this.wordPairs.get(word);
    }
    public int amountOfWords(){
    	return this.wordPairs.size();
    }
    public ArrayList<String> translationList(){
    	ArrayList<String> list = new ArrayList<String>();
    	 for (String key: this.wordPairs.keySet()) {
             list.add(key+" = "+this.wordPairs.get(key));
         }
    	 return list;
    }
}
