package week1.day2;

public class Twowheeler {

	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisNumber=123456789;
	boolean isPunctured=false;
	String bikeName="Activa 4G";
	double runningKM=4321;


	public static void main(String[] args) {
		Twowheeler mybike = new Twowheeler();
		System.out.println("No of wheels " + mybike.noOfWheels);
		System.out.println("No of Mirrors " + mybike.noOfMirrors);
		System.out.println("Chassis Number " + mybike.chassisNumber);
		System.out.println("Is punctured? " + mybike.isPunctured);
		System.out.println("Bike Name " + mybike.bikeName);
		System.out.println("Running KM " + mybike.runningKM);

	}
}