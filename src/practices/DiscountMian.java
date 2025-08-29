package practices;
import java.util.*;

public class DiscountMian {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter price ");
		System.out.println("enter quantity");
		int num =sc.nextInt();
		int num1=sc.nextInt();
		Discount dis = new Discount();
		dis.setPrice(num );
		System.out.println("your price "+dis.getPrice());
		dis.setQuantity(num1);
		
		System.out.println("discount price "+dis.getPrice()+"\nno of quantity "+dis.getQuantity());

	}

}
