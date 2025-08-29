package practices;

public class Discount
{
//	creating pprivate class for price nad quantity 
	private int price ,quantity;

//	applying setter and getter
//	setter 
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setQuantity(int quantity) {
		if (quantity > 18) {
			this.price = (int) (this.price*0.8);
		}
		this.quantity=quantity;
	}
	
//	getter 
	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}


	
}
