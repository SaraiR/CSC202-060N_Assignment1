
public class Dispenser {

	//Instance Variables
	private int quantity;
	private int itemsSold;
	private FoodInfo foodItem;
	
	//Default constructor
	public Dispenser(){
		this.quantity = 20;
		this.itemsSold = 0;
		this.foodItem = new FoodInfo();
	}
	
	//Constructor that takes parameters for a new food item
	public Dispenser(double price, String name, int calories, int sugar){
		this.quantity = 20;
		this.itemsSold = 0;
		this.foodItem = new FoodInfo(price, name, calories, sugar);
	}

	//Mutator method
	public void setFoodItem(FoodInfo newItem){
		this.foodItem = newItem;
	}
	//Accessor Methods
	public int getQuantity(){
		return quantity;
	}
	
	public int getItemsSold(){
		return itemsSold;
	}
	
	public FoodInfo getFoodItem(){
		return foodItem;
	}
	
	//To String method that displays food information and number of items sold
	public String toString(){
		return foodItem.toString() + "\n\nThe number of items sold is \t" + itemsSold;
	}
	
}
