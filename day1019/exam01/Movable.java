package com.sist.exam01;

public interface Movable {
	int speed = 100; 
	//�⺻�� final�ε� �ʱ�ȭ���� ������ ����
	//�ݵ�� �ʱⰪ�� �־���Ѵ�!
	public abstract void speedUp(int amount);
	public abstract void speedDown(int amount);
	
	public void printspeed() {
		System.out.println("����ӵ�"+speed);
	}
	//�������̽��� �ٵ� ��üȭ�� �޼ҵ带 ���� �� ����
}
