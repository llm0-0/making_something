public class Item{
	private String name;

	private double indprice, totprice;
	private int quantity;

	public Item(String name, double indprice, int quantity){
this.name=name;
this.indprice=indprice;
this.quantity=quantity;
totprice = indprice*quantity;
	}
	public String getName(){
		return name;
	}
	public double getIndPrice(){
		return indprice;
	}
	public int getQuantity(){
		return quantity;
	}
public double getTotalPrice(){
		return totprice;
	}
}
