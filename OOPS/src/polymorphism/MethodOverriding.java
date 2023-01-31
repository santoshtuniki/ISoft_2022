package polymorphism;

class Vehicle {
	public void modeOfTransportation() {
		System.out.println("Different Vehicles are used for transportation on air, land and water");
	}
}

class Bike extends Vehicle{
	public void modeOfTransportation() {
		System.out.println("Bike is used for transportation on land");
	}
}

class Hero extends Bike {
	public void modeOfTransportation() {
		System.out.println("Hero is a model of Bike");
		System.out.println("It is a mode of land transportation");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();
		vehicle.modeOfTransportation();
		System.out.println();

		Vehicle bike = new Bike();
		bike.modeOfTransportation();
		System.out.println();
		
		Vehicle hero = new Hero();
		hero.modeOfTransportation();
	}

}
