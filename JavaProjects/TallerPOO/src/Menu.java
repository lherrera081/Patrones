import java.util.ArrayList;


public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    public void addMeal(String meal)
    {
    	this.meals.add(meal);
    }
    
    public void printMeals()
    {
    	System.out.println("Menu:");
    	for(String meal : this.meals){
    		System.out.println("- "+meal);
    	}
    }
    
    public void clearMeal()
    {
    	this.meals.clear();
    }
}
    
