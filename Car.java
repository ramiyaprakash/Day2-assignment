package week1.day2;


public class Car {
	public void	applyBreak()
	{
		System.out.println("Break is applied");	
	}

	public void applyGear()
	{
		System.out.println("Gear Change applied");
	}
	public void switchOnAc()
	{
		System.out.println("AC is turned ON");
	}
	public void applyAcclerate()
	{
		System.out.println("Acclerater applied");
	}
	public static void main(String[] args) {
		Car mycar = new Car();
		mycar.applyBreak();
		mycar.applyGear();
		mycar.applyAcclerate();
		mycar.switchOnAc();
	}


}
