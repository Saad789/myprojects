package my.programs;

public class OddPalindrome {

	public static void main(String[] args) {
		int num = 3553;
		int reverse;
		
		
		if(checkAllDigitsOdd(num))
		{
		  reverse = reverse(num);
		
		  if(checkPalindrome(num,reverse))
		  
		  System.out.println("Number is odd plindrome" );
		  
		else
		
		  System.out.println("Number is not odd palindrome");
		
		}
		  else
		  
			  System.out.println("Number is not odd palindrome");
	}
    
	public static boolean checkAllDigitsOdd(int num){
		int digit;
		int count = 0;
		while(num> 0){
			digit  = num % 10;
			num = num / 10;
			if(digit % 2 == 0)
			count++;
		}
		 
		 if(count == 0)
			 return true;
		 else
			 return false;
		}

    public static int reverse(int num){
		int digit;
		int reverse = 0;
		while(num > 0){
			digit = num % 10;
			num = num / 10;
		}
		
		return reverse;
		
		}

	public static boolean checkPalindrome(int num, int reverse){
		
      if (num == reverse)
      return true;
      else
	  return false; 
   } 
}