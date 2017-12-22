package my.programs;

public class StringDemo {

	public static void main(String[] args) {
		String name = "Amar Akbar Anthony TOmmy";
		String[] nameParts = name.split(" ");
		for(int i = 0; i< nameParts.length; i++)
			System.out.println(nameParts[i]);
		
	}
}


	/*
	 	int indexOfFirstSpace = name.indexOf(" ");
        int indexOfSecondSpace = name.lastIndexOf(" ");
		
		String firstName = name.substring(0, indexOfFirstSpace);
		System.out.println(firstName);
		
		String middleName = name.substring(indexOfFirstSpace + 1, indexOfSecondSpace);
		System.out.println(middleName);
		
		String lastName = name.substring(indexOfSecondSpace + 1);
		System.out.println(lastName);
	}
		


}*/

