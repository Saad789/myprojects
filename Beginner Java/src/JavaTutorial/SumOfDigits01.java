
public class SumOfDigits01 {

	public static void main(String[] args) {
		int num = 84;
		int sum = getSumOfDigits(num);
	    System.out.print(sum);
	    }
	    
	public static int getSumOfDigits(int num){
		int digit1, digit2, sum;
		if(num>=10 && num < 100){
			
			digit1 = num % 10;
			digit2 = num / 10;
			sum = digit1 + digit2;
			return sum;
			}
		   
		 else{
			return 0;
		    }
		}
	}
