package com.sist.exam03;

public abstract class TwoDimShape extends Shape {
	protected double area;
		
	public TwoDimShape(int x, int y) {
		super(x, y);
	}

	public TwoDimShape() {
		super();
		// TODO Auto-generated constructor stub
	}

	public abstract double getArea();
}
