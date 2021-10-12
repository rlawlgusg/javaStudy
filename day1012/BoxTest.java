class Box{
	private int length;
	private int width;
	private int height;
	private boolean empty = true; 
	
	public Box(){ // �ʱⰪ 0
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public Box(int length){	//�ΰ� ����ִ� ���
		this.length = length;
	}

	public Box(int length,int width){ //�ϳ� ����ִ� ���
		this.length = length;
		this.width = width;
	}

	public Box(int length,int width,int height){
		if(length >0 && width>0 && height >0){
		this.length = length;
		this.width = width;
		this.height = height;
		empty = false;
		}else
		empty = true;
	}
	
	public int getWidth(){
		return width;
	}
	public void setWidth(int width){
		this.width = width;
	}

	public int getLength(){
		return length; 
	}
	public void setLength(int length){
		this.length = length; 
	}

	public int getHeight(){
		return height;
	}
	public void setHeight(int height){
		this.height = height;
	}
	
	/*
	public int getVolume(){
		int volume = getWidth()*getLength()*getHeight();
		return volume;
	}
	*/
	
	public String toString(){
		if(empty){
		return "�ڽ��� ����ֽ��ϴ�";
		}else
		return "�ڽ��� ���̴� "+length+" �ʺ�� "+width+" ���̴� "+height; 
	}
	
	
}


class BoxTest 
{
	public static void main(String[] args) 
	{
		
		Box b1 = new Box(); //��� ����ִ� ���
		System.out.println(b1);
		
		Box b2 = new Box(10); //�ΰ� ����ִ� ���
		System.out.println(b2);

		Box b3 = new Box(10,20); //�ϳ� ����ִ� ���
		System.out.println(b3);

		Box b4 = new Box(30,20,10);
		System.out.println(b4);

		Box b5 = new Box(0,20,10);
		System.out.println(b5);
		
		
	}
}
