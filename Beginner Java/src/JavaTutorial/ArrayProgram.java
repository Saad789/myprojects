package my.programs;

public class ArrayProgram {

	public static void main(String[] args) {
	int [] arr = {2,4,8,10,12};
	int i;
	int sum = 0;
	
	for(i = 0; i < arr.length;i++){
		sum = sum + arr[i];
		System.out.println("the sum of the array elements is"+ ' ' +sum);
	}

	}

}
