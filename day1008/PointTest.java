class Point{
	private int x;
	private int y; //�³�?

	public int getX(){
		return x; 	
	}//�����ؼ� ����� ���� �о���� �޼ҵ� ������
	public void setX(int xCoord){
		x = xCoord;
	}//�����ؼ� ����� ���� �����ϴ� �޼ҵ� ������ , setŸ���� void

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
		System.out.println(p1.getY()); //Ȯ��

		Point p2 = new Point();
		p2.setX(100);
		p2.setY(300);
		p2.getX();
		p2.getY();

		System.out.println(p2.getX());
		System.out.println(p2.getY()); //Ȯ����


	}
}
