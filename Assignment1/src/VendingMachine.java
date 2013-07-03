import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;
import java.io.*;
public class VendingMachine {

		private String machineID;
		private double totalSales;
		private boolean status = true;
		private	Dispenser[] products;
		
		     		
		public VendingMachine(){
			this.machineID = "No name";
			this.totalSales = 0.00;
			this.products = new Dispenser[10];
		}
		
		public VendingMachine(String name){
			this.machineID = name;
			this.totalSales = 0.00;
			this.products = new Dispenser [10];
		}
		
		public double getTotalSales(){
			return totalSales;
		}
		
		public void stockDispenser(){
			int i;
			for(i = 0; i < 2; i++)
				products[i] = new Dispenser(1.00, "Apple", 25, 8);
			for(i = 2; i < 4; i++)
				products[i] = new Dispenser(0.50, "Banana", 50, 15);
			for(i = 4; i < 6; i++)
				products[i] = new Dispenser(1.50, "Kiwi", 15, 4);
			for(i = 6; i < 8; i++)
				products[i] = new Dispenser(1.50, "Water", 0, 0);
			for(i = 8; i <=9 ; i++)
				products[i] = new Dispenser(2.50, "Naked", 120, 35);
		}
		
		public String getMenu(){
			String menu = "";
			int i;
			for(i = 0; i < products.length; i++){
			 menu +=  products[i].getFoodItem().getItemName() 
					 + " $" +products[i].getFoodItem().getPrice() + "\n";
			}
			return menu;
		}
		public void readInventory(){
			
			Date d = new Date();
       			String fileName = d.toString().replace(':', '_');
			Scanner inFP = null;
			try{
			     inFP= new Scanner (new File (fileName));
			}
			catch(FileNotFoundException e){
				System.out.println("Error openin the file" + fileName);
				System.exit (0);
			}
		}
		
		public void writeInventory(){
			
			Date d = new Date();
       			String fileName = d.toString().replace(':', '_');
       			
       			PrintWriter outFP = null;
       			try{
       				outFP=
       			}
		}
		
}
