
public class OddPalindromes01 {
	

	public static void main(String[] args) {
		int start = 1000;
		int limit = 2000;
		System.out.println(generateOddPalindrome(start,limit));
		}
	
	public static String generateOddPalindrome(int start, int limit){
		String result = "";
		for(int num = start;num <= limit; num++){
			if(isAllDigitsOdd(num)){
			   if(isPalindrome(num))
			   result += num + ",";
			}
		}
		if (result.length() == 0){
			return "-3";
		}
		else
		
			return result.substring(0,result.length()-1);
		}
	
	public static boolean isPalindrome(int num){
		
		if(num == reverse(num))
		  return true;
		else
		  return false;
		
		}
		
	public static int reverse(int num){
		int digit;
		int reverse = 0;
		
		while(num > 0){
		
		digit = num % 10;
	    num  = num / 10;
	    reverse = reverse * 10 + digit;
		}
		return reverse;
	}
	
	public static boolean isAllDigitsOdd(int num){
	   int  digit;
	   
	   while(num > 0){
		   digit = num % 10;
		   if(digit % 2 == 0 && digit != 0)
		     return false;
	       num = num / 10;
	       }
	   return true;
		   
	}
	
}
