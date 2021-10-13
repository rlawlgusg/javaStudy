class Plane{
	private String manufacturer;
	private String model;
	private int passenger;
	static int planes = 0;

	
	public void setManufacturer(String manufacturer){
		this.manufacturer = manufacturer;
	}
	public String getManufacturer(){
		return manufacturer;
	}
	public void setModel(String model){
		this.model = model;
	}
	public String getModel(){
		return model;
	}
	public void setPassenger(int passenger){
		this.passenger = passenger;
	}
	public int getPassenger(){
		return passenger;
	}

	public Plane(){
		planes++;//포인트!
	}//기본생성자

	public Plane(String manufacturer,String model,int passenger){
		this.manufacturer=manufacturer;
		this.model=model;
		this.passenger=passenger;
		planes++;//포인트!
	}
	
	public static int getPlanes() {
		return planes;
	}

	public String toString(){
		return "비향기의 제작사는 "+manufacturer+" 비행기의 모델은 "+model+" 비행기의 최대 승객수는 "+passenger+"지금까지 만들어진 비행기의 수"+planes;
	}

}

class PlaneTest 
{
	

	public static void main(String[] args) {
	
		Plane p1 = new Plane("에어버스","A380",500);
		System.out.println(p1);
		Plane p2 = new Plane("비행기이름","A500",300);
		System.out.println(p2);
		Plane p3 = new Plane("비행기","A200",200);
		System.out.println(p3); 
		//객체 하나 나오고 프린트 하나 나오고...
		
	}
}