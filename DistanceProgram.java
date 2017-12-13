package JavaTutorial;

public class DistanceProgram {

	public static void main(String[] args) {
		int distanceInMeters = 20000;
		double km = distanceInMeters/1000.0;
		double mile = distanceInMeters/1609.0;
		
		int timeInHours = 2;
		int timeInMinutes = 30;
		int timeInSeconds = 20;
		
		double totalTimeInHours = timeInHours + (timeInMinutes/60.0) + (timeInSeconds/3600.0);
		double totalTimeInSec = (2*3600) + (30*60) + 20;
		double speedInMts = distanceInMeters/totalTimeInSec;
		double speedInKms = km/timeInHours;
		double speedInMiles = mile/totalTimeInHours;
		
		System.out.println("speedInMts= "+speedInMts);
		System.out.println("speedInKms= "+speedInKms);
		System.out.println("speedInMiles= "+speedInMiles);	
				
		

	}

}
