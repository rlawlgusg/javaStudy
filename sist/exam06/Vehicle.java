package com.sist.exam06;

public abstract class Vehicle {
	
	protected int speed;
	//�߻�Ŭ������ �߻�޼ҵ��̿ܿ� �ϹݼӼ��� ���� ����! 
	
	public void printSpeed() {
		System.out.println("����ӵ�:"+speed);
	}
	//�߻�Ŭ������ �߻�޼ҵ� ���� body�� ��üȭ�� �Ϲ� �޼ҵ带 ������ �� ����!
	public abstract double getKillosPerLiter();
		
}
