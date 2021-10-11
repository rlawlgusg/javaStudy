class Box{

	private int width;
	private int length;
	private int height;
	private int volume;
	
	public int getWidth(){
		return width;
	}
	public void setWidth(int w){
		width = w;
	}

	public int getLength(){
		return length; //��ȯ�ؼ� ������
	}
	public void setLength(int l){
		length = l; //��ȯ�� �ƴ϶� ����..
	}

	
	public int getHeight(){
		return height;
	}
	public void setHeight(int h){
		height = h;
	}

	public int getVolume(){ //�Է�x..
		return width*length*height;
		
	}
	
	public String toString(){
		return "���δ� "+width+ " ���δ� "+length+" ���̴� "+height+ " ���Ǵ� "+getVolume(); 
	}//toString ??????
	

}




class BoxTest 
{
	public static void main(String[] args) 
	{
		
		Box box1 = new Box();
		box1.setWidth(100);
		box1.setLength(100);
		box1.setHeight(100);
		box1.getVolume();
		System.out.println(box1);
		System.out.println(box1.toString());//������ ������

		Box box2 = new Box();
		box2.setWidth(200);
		box2.setLength(200);
		box2.setHeight(200);

		box2 = box1;
		
		System.out.printf("box1�� ���δ� %d\t ���δ� %d\t ���̴� %d\n",box1.getWidth(),box1.getLength(),box1.getHeight());
		System.out.println(box2.toString());
		
		//box2�� box1�� ���������� �ּҰ��� �����ϸ� box2�� �����ڴ� �������� �ǰ�, box2�� box1�� �����ڸ� �����ϰ� �ȴ�
		//�׷��� box2�� box1�� ���� ���� �ȴ�??
	}
}
