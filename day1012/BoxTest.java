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
		return length; //반환해서 보여줌
	}
	public void setLength(int l){
		length = l; //반환이 아니라 저장..
	}

	
	public int getHeight(){
		return height;
	}
	public void setHeight(int h){
		height = h;
	}

	public int getVolume(){ //입력x..
		int volume = width*length*height;
		return volume;
	}
	
	public String toString(){
		return "가로는 "+width+ " 세로는 "+length+" 높이는 "+height+ " 부피는 "+getVolume(); 
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
		System.out.println(box1.toString());//위에랑 같은말
		//객체 참조변수를 출력문에 써주면 toString메소드가 자동으로 동작함
		//만약 toString 메소드가 없으면 그 객체의 클래스 이름과 어디에 있는지 정보를 갖고있는 주소값이 출력됌 = 해시코드
		//따라서 만약, 그 클래스의 속성값을 문자열로 출력할 일이 있다면 String을 반환하는 toString을 만들어줌

		Box box2 = new Box();
		box2.setWidth(200);
		box2.setLength(200);
		box2.setHeight(200);

		box1 = box2;
		
		System.out.printf("box1의 가로는 %d\t 세로는 %d\t 높이는 %d\n",box1.getWidth(),box1.getLength(),box1.getHeight());
		System.out.println(box2.toString());
		
		//box2랑 box1의 참조변수의 주소값을 같게하면 box1의 생성자는 가비지가 되고, box1는 box2의 생성자를 참조하게 된다
		//그래서 box2과 box1의 값은 같게 된다??
		//box1과 box2는 동일한 객체를 참조하고 있음!
	}
}
