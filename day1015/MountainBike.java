public class Bike{
	protected int gear;
	protected int speed; //상속받게 하려면 protected
	public Bike(){}
	public Bike(int gear,int speed){
		this.gear;
		this.speed;
	}

}
class MountainBike extends Bike 
//expand가 아니라 extends
//한 패키지에 public클래스가 두개 있을 수 없음
{
	private int seatheight;
	
	public MountainBike(){}//기본생성자

	public MountainBike(int g){  //생성자이름 왼쪽에는 void를 쓸 수 없음
		super();
		gear = g; 
		//부모클래스의 private영역애는 접근 불가능
		//부모클래스를 만들때에 gear를 protected로 하거나 setter을 통해서 접근해야함	
	}	
	
}
