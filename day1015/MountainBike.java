public class Bike{
	protected int gear;
	protected int speed; //��ӹް� �Ϸ��� protected
	public Bike(){}
	public Bike(int gear,int speed){
		this.gear;
		this.speed;
	}

}
class MountainBike extends Bike 
//expand�� �ƴ϶� extends
//�� ��Ű���� publicŬ������ �ΰ� ���� �� ����
{
	private int seatheight;
	
	public MountainBike(){}//�⺻������

	public MountainBike(int g){  //�������̸� ���ʿ��� void�� �� �� ����
		super();
		gear = g; 
		//�θ�Ŭ������ private�����ִ� ���� �Ұ���
		//�θ�Ŭ������ ���鶧�� gear�� protected�� �ϰų� setter�� ���ؼ� �����ؾ���	
	}	
	
}
