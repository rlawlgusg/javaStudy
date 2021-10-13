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
		planes++;//����Ʈ!
	}//�⺻������

	public Plane(String manufacturer,String model,int passenger){
		this.manufacturer=manufacturer;
		this.model=model;
		this.passenger=passenger;
		planes++;//����Ʈ!
	}
	
	public static int getPlanes() {
		return planes;
	}

	public String toString(){
		return "������� ���ۻ�� "+manufacturer+" ������� ���� "+model+" ������� �ִ� �°����� "+passenger+"���ݱ��� ������� ������� ��"+planes;
	}

}

class PlaneTest 
{
	

	public static void main(String[] args) {
	
		Plane p1 = new Plane("�������","A380",500);
		System.out.println(p1);
		Plane p2 = new Plane("������̸�","A500",300);
		System.out.println(p2);
		Plane p3 = new Plane("�����","A200",200);
		System.out.println(p3); 
		//��ü �ϳ� ������ ����Ʈ �ϳ� ������...
		
	}
}