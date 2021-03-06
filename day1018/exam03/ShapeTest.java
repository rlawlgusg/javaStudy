package com.sist.exam03;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//타원, 사각형, 삼각형, 구, 직육면체, 원기둥 
		//3개의 도형 - 타원, 직육면체, 원기둥 
		
		Shape []arr = new Shape[3]; //객체 생성이 아니라 객체를 생성할 수 있는 참조변수 3개만듬
		arr[0] = new Ellipse(10, 10, 20, 50);
		arr[1] = new Cube(10, 100, 100, 100, 100);
		arr[2] = new Cylinder(10, 300, 50, 100);
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		((TwoDimShape)arr[0]).getArea();
		((ThreeDimShape)arr[1]).getVolume();
		((ThreeDimShape)arr[2]).getVolume();
		System.out.println();
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		*/
		
		for(Shape s:arr) {
			if(s instanceof TwoDimShape) {
				((TwoDimShape) s).getArea();
			}else if(s instanceof ThreeDimShape) {
				((ThreeDimShape) s).getVolume();
			}
			System.out.println(s);
		}
		
		
		
		
	}

}
