
public class DriverExample {
	static void drive(Vehicle v) {
		v.run();
	}

	public static void main(String[] args) {
		Taxi taxi = new Taxi();
		drive(taxi);
		drive(new Vehicle());
		drive(new Bus());

	}

}
