
//A class that set price, name and nutritional facts 
// of a particular item
public class FoodInfo {

	//Instance Variables
	private double price;
	private String itemName;
	private String nutriFacts;
//	private char itemType;
	
	//Default Constructor
	public FoodInfo(){
		this.price = 0.00;
		this.itemName = "No Name";
		this.nutriFacts = "Calories 0 "
						+" Sugar 0";
	}
	
	// Constructor that sets the price, name and nutritional facts of an item
	public FoodInfo( double price, String name, int calories, int sugar){
		this.price = price;
		this.itemName = name;
		this.nutriFacts ="\tCalories: " + Integer.toString(calories)
						+ "\n\t\t\tSugar: "+ Integer.toString(sugar);
	}
	
	//Accessor Methods 
	public double getPrice(){
		return price;
	}
	
	public String getItemName(){
		return itemName;
	}
	
	public String getNutriFacts(){
		return nutriFacts;
	}
	
	// To String method that will display food information
	public String toString(){
		return "Item Name\t\t" + itemName +
				"\nPrice\t\t\t$" + String.format("%.2f", price) +
				"\nNutritional Facts" + nutriFacts; 
	}
}
