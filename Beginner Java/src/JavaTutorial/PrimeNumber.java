package my.programs;

public class PrimeNumber {

	public static void main(String[] args) {
		int number = 13;
		int count = 0;
		
		for(int i=1; i<=number; i++){
		
		if(number % i == 0){
		count++;
		}
		}
		
	    if(count == 2){
		System.out.println("the number is prime");
	      }
		
	     else{
		 System.out.println("the number is not prime");
		}
	  }
	}
