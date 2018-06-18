package bs14.itech.objects;

import bs14.itech.interfaces.Body;

public class Cuboid implements Body {
	private String name;
	private double length;
	private double width;
	private double height;
	
	public Cuboid (String provName, double provLength, double provWidth, double provHeight) {
		name = provName;
		length = provLength;
		width = provWidth;
		height = provHeight;
	}
	
	@Override
	public double berechneVolumen() {
		return length * width * height;
	}
	
	@Override
	public double berechneOberflaeche() {
		double result = (height * width) * 6;
		return result;
	}

	@Override
	public String getName() {
		return name;
	}
}
