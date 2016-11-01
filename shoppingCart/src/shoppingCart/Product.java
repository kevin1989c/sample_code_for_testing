package shoppingCart;

public class Product
{
	//Field
	private int no;
	private String name;
	private double price;

	//Constructor


	public Product(int no,String name,double price){
		this.no = no;
		this.name = name;
		this.price = price;
	}

	//setter and getter
/*	public void setNo(int no){
		this.no = no;
	} */
	public int getNo(){
		return no;
	}
/*	public void setName(String name){
		this.name = name;
	} */
	public String getName(){
		return name;
	}
/*	public void setPrice(double price){
		this.price = price;
	} */
	public double getPrice(){
		return price;
	}

	//toString
	public String toString(){
		return "[No."+no+",Item Name£º"+name+",Price£º"+price+"$/per]";
	} 

}