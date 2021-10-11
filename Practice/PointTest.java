class Point{
	private int x;
	private int y; //맞나?

	public int getX(){
		return x; 	
	}//접근해서 멤버에 값을 읽어오는 메소드 설정자
	public void setX(int xCoord){
		x = xCoord;
	}//접근해서 멤버에 값을 변경하는 메소드 접근자 , set타입은 void

	public int getY(){
		return y;
	}
	public void setY(int yCoord){
		y = yCoord;
	}

}


class PointTest
{
	public static void main(String[] args) 
	{
		
		Point p1 = new Point();
		p1.setX(100);
		p1.setY(200);
		p1.getX();
		p1.getY();
		
		System.out.println(p1.getX());
		System.out.println(p1.getY()); //확인

		Point p2 = new Point();
		p2.setX(100);
		p2.setY(300);
		p2.getX();
		p2.getY();

		System.out.println(p2.getX());
		System.out.println(p2.getY()); //확인차


	}
}
