package com.sist.exam13;

class Car implements Movable{

	@Override
	public void speedUp(int amount) {
		amount++;
		System.out.println("���� ���ǵ��" +amount);
	}

	@Override
	public void speedDown(int amount) {
		amount--;
		System.out.println("���ҵ� ���ǵ�� "+amount);
		
	}

	@Override
	public void printSpeed() {
		System.out.println("���� ���ǵ�� "+speed+"�Դϴ�");		
	}
	
	public void TurnLeft() {
		System.out.println("��ȸ�� �մϴ�");
	}
	
	public void TurnRight() {
		System.out.println("��ȸ�� �մϴ�");
	}
	
	
}
