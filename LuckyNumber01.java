package my.programs;

public class LuckyNumber01 {

	public static void main(String[] args) {
		String date = "23-Jan-1995";
		System.out.println(getLuckyNumber(date));
	}
	 
	public static int getLuckyNumber(String date){
		String [] dateParts = date.split("-");
		
		int dd = Integer.parseInt(dateParts[0]);
		int mm = convertMMMtoMM(dateParts[1]);
		int year = Integer.parseInt(dateParts[2]);
		
		int sumOfDigits = getSumOfDigits(dd);
		sumOfDigits = sumOfDigits + getSumOfDigits(mm);
		sumOfDigits = sumOfDigits + getSumOfDigits(year);
		
		while(sumOfDigits > 10){
			sumOfDigits = getSumOfDigits(sumOfDigits);
			}
	    return sumOfDigits;
	}
	
	public static int convertMMMtoMM(String mon)
	{
		String dateparts[] = mon.split("-");
		String months = "JANFEBMARAPRMAYJUNJULAUGSEPOCTNOVDEC";
		mon = mon.substring(0,3);
		mon = mon.toUpperCase();
		return((months.indexOf(mon)/3)+1);
	}


	
	public static int getSumOfDigits(int num){
		int sum = 0;
		while(num > 0){
			sum = sum + num % 10;
			num = num / 10;
			}
		return sum;
	}
	
 }


