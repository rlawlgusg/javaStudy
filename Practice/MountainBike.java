public class Bike{
	protected int gear;
	protected int speed; //상속받게 하려면 protected
	public Bike(){}
	public Bike(int gear,int speed){
		this.gear;
		this.speed;
	}

}
public class MountainBike extends Bike //expand가 아니라 extends
{
	private int seatheight;
	
	public MountainBike(){}//기본생성자

	public MountainBike(int gear, int speed, int seatheight){
		super(gear, speed);//상속
		this.seatheight = seatheight;
	}

	
}
