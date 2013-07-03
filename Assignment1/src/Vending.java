
public class Vending {

	public static void main(String[] args) {

		// Test FoodInfo Class
		/*FoodInfo product = new FoodInfo(2.00,"Coke", 8, 4);
		product.toString();
		System.out.println(product);
		
		System.out.println(product.getItemName());
		System.out.println(product.getPrice());
		System.out.println(product.getNutriFacts());
		*/
		//---------------------------------------------------
		
		// Test Dispenser Class
		/*Dispenser item = new Dispenser(3.50, "apple", 25,6);
		item.toString();
		System.out.println(item);
		System.out.println(item.getQuantity());
		System.out.println(item.getItemsSold());
		 */
		//---------------------------------------------------------
		//Test Vending Machine class
		
		VendingMachine machineOne = new VendingMachine("Healthy Vending Machine");
		machineOne.stockDispenser();
		System.out.println(machineOne.getMenu());
	}

}
