package bs14.itech.objects;

import bs14.itech.interfaces.Body;

public class Square implements Body {
	
	private String name;
	private double radius;
	
	public Square (String provName, double provRadius) {
		name = provName;
		radius = provRadius;
	}

	@Override
	public double berechneVolumen() {
		return ((Math.PI * Math.pow(radius, 3)) / 100) * (100 + (100 / 3));
	}

	@Override
	public double berechneOberflaeche() {
		return 4 * Math.PI * (radius * radius);
	}

	@Override
	public String getName() {
		return name;
	}
}
