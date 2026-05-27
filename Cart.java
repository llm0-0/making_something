import java.util.ArrayList;
import java.util.Scanner;
public class Cart{
	public ArrayList<Item> shopping = new ArrayList<>();

	public Cart(){

	}

	public void shop(){
		boolean shopping = true;
		Scanner in = new Scanner(System.in);
		System.out.println("What would you like to do?");
		while(shopping){
			System.out.println("1. Add item to cart");
			System.out.println("2. Remove item from cart");
			System.out.println("3. View my current cart");
			System.out.println("4. I'm done shopping for now");
			int choice = in.nextInt();


			if(choice==1){
				System.out.println("What is the name of you item?");
				String name = in.next();
				System.out.println("How much does ONE cost?");
				double cost = in.nextDouble();
				System.out.println("How many do you want(whole number)?");
				int num = in.nextInt();
				this.addItem(name, cost, num);
				System.out.println("Added!");
				System.out.println("What else do you want to do?");
			} else




			if(choice==2){
				System.out.println("What item do you want to remove(name of item)?");
				String ri = in.next();
				this.removeItem(ri);
				System.out.println("Removed!");
				System.out.println("What else do you want to do?");
			} else



			if(choice==3){
				System.out.println("Alright, here's your current cart:");
				this.viewCart();
				System.out.println();
				System.out.println("What else do you want to do?");
			} else




			if(choice==4){
				System.out.println("I hope you found what you wanted!");
				shopping=false;
			}
		}


	}

	public void addItem(String newItem, double cost, int amount){
		Item i = new Item(newItem, cost, amount);
		shopping.add(i);
	}

	public void removeItem(String cartItem){
		for (int i = 0; i < shopping.size(); i++){
			if (shopping.get(i).getName().equals(cartItem)){
				shopping.remove(i);
				i--;
			}
		}
	}
	
	public void viewCart(){
		int totalItems = 0;
		double totalPrice = 0.0;
		System.out.println("Cart: ");
		for (int i = 0; i < shopping.size(); i++){
			System.out.println(shopping.get(i).getName() + " | " + shopping.get(i).getQuantity());
			totalItems += shopping.get(i).getQuantity();
			totalPrice += shopping.get(i).getTotalPrice();
		}
		System.out.println("----");
		System.out.println("Number of Items: " + totalItems);
		System.out.println("Total Price: " + totalPrice);
	}
	public double checkout(){
		viewCart();
		double totalPrice = 0.0;
		for (int i = 0; i < shopping.size(); i++){
			totalPrice += shopping.get(i).getTotalPrice();
		}
		double wtax = totalPrice*1.1;
		System.out.println("Your total is $" +wtax+" with tax");
		return wtax;
	}

}
