package bs14.itech;

import java.util.ArrayList;

import bs14.itech.interfaces.Body;
import bs14.itech.objects.Cuboid;
import bs14.itech.objects.Square;

public class Main {
	
	private static ArrayList<Body> bodys;
	
	public static void main(String[] args) {
		bodys = new ArrayList<Body>();
	
		bodys.add(new Cuboid("Cuboid1", 2.0, 1.6, 2.4));
		bodys.add(new Square("Square1", 2.2));
		bodys.add(new Square("Square2", 1.6));
		
		for (Body object: bodys) {
			printMeasurements(object);	
		}
		
	}

	public static void printMeasurements(Body shape) {
		System.out.println("Name: " + shape.getName());
		if (shape instanceof Square) {
			System.out.println("Type: Square");
		} else if (shape instanceof Cuboid) {
			System.out.println("Type: Cuboid");
		}
		System.out.println("Volumen: " + shape.berechneVolumen());
		System.out.println("Oberfläche: " + shape.berechneOberflaeche());
		System.out.println("");
	}
	
}
