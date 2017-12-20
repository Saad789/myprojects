
public class Max3Num01 {

	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 20;
	    int num3 = 10;
	    System.out.println(getMaxNumber(num1,num2,num3));
        }
	
	public static int getMaxNumber(int num1,int num2,int num3){
		
		    if(num1>0 && num2>0 && num3>0){
		     if (num1>num2 && num1>num3)
		    {
			
				return num1;
			}
			else if(num2>num3){
				return num2;
			}
		    else{
				return num3;
			}
	    }
	        else{ 
		        return -1;
	        }
          }
}



