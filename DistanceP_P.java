package Assessment;

public class DistanceP_P {
	
	public static void main(String[] args) {
		Point p1 = new Point(2, 3);
		Point p2 = new Point(5, 6);

		double distance = p1.getDistance(p2);

		System.out.println("The Distance from p1 to p2 is : "+distance);
	}

}
