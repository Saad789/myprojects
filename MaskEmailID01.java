package my.programs;

public class MaskEmailID01 {

	public static void main(String[] args) {
           String email = "johndoe@gmail.com";
           String maskEmail = "";
           
	       for(int i = 0; i < email.length(); i++){
              if(i >= 2 && i < email.indexOf("@"))
            	  maskEmail = maskEmail + "X";
            	else
            	  maskEmail = maskEmail + email.charAt(i);
	       }
	       System.out.println(maskEmail);
	}
}

	
			
		
			
		
           

	


