public class Bike{
	protected int gear;
	protected int speed; //��ӹް� �Ϸ��� protected
	public Bike(){}
	public Bike(int gear,int speed){
		this.gear;
		this.speed;
	}

}
public class MountainBike extends Bike //expand�� �ƴ϶� extends
{
	private int seatheight;
	
	public MountainBike(){}//�⺻������

	public MountainBike(int gear, int speed, int seatheight){
		super(gear, speed);//���
		this.seatheight = seatheight;
	}

	
}
