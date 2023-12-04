package polymorphism;
//overl loading example
class shopping_cart {
	void display(String item_name) {
		System.out.println("Item Name: Pencil  ");
	}
	void display(String item_name,double quanitity) {
		System.out.println("Item Name: Pencil  Quantity: 4  ");
	}
	void display(String item_name,double quantity,String Size) {
		System.out.println("Item Name: Pencil  Quantity: 4  Size:40grams ");
		}
	void display(String item_name,double quanitiy,String size,String colour) {
		System.out.println("Item Name: Pencil  Quantity: 4  Size:40grams  Colour: Red");
	}
}

public class method_overloading_ex2 {

	public static void main(String[] args) {
		shopping_cart ob=new shopping_cart();
		ob.display("chodolate");
		ob.display("chocolate", 4);
		ob.display("chocolate", 4, "40grams");
		ob.display("chocolate", 4, "40grams", "red");
	
	}

}
