package JavaTutorial;

public class DiscountProgram {

	public static void main(String[] args) {
		double price = 1500;
		double discount;
		
		if(price<1000){
			System.out.println("Price of the item is="+price);
		
		}
		
		else if((price>=1000)&&(price<=10000)){
			discount = (price/100)*10;
			price = price-discount;
			System.out.println("price after 10% discount is="+price);
		}	
		
		else if((price>=10000)&&(price<=20000)){
		    discount = (price/100)*20;
		    price = price - discount;
		    System.out.println("price after 10% discount is="+price);
			
		}
			
	}

}
