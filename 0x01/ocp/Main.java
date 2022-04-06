package ocp;

public class Main {

    private static TypeVehicle typeVehicle;

    public static void main(String[] args) {

	typeVehicle = TypeVehicle.CAR;

	if (typeVehicle == TypeVehicle.CAR) {
	    Car vehicle = new Car("Azul", "2022", 2.6, 4);
	    vehicle.startVehicle();
	} else if (typeVehicle == TypeVehicle.MOTORCYCLE) {
	    Motorcycle vehicle = new Motorcycle("red", "2010", 250);
	    vehicle.startVehicle();
	}
    }
}
