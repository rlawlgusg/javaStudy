package com.sist.exam03;

public class Shpere extends ThreeDimShape {
	private double radius;
	
	public Shpere(double radius) {
		super();
		this.radius = radius;
	}

	public Shpere() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Shpere [radius=" + radius + ", volume=" + volume + ", x=" + x + ", y=" + y + "]";
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		volume = 4.0/3*Math.PI*Math.pow(radius, 3);
		return volume;
	}

}
