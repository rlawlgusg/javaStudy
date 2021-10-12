class Movie{
	private String name;
	private String director;
	private String manufacturer;
	
	public String toString(){
		return "��ȭ�� ������ " +name+" ��ȭ�� ������ "+director+" ���ۻ�� "+manufacturer;
	}

	public Movie(){
		this.name = "�ظ�����";
		this.director = "ũ���� �ݷ�����";
		this.manufacturer = "���Ϲ��Ƚ������";
	}

	public Movie(String name, String director , String manufacturer){
		this.name = name;
		this.director = director;
		this.manufacturer = manufacturer;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}

	public void setDirector(String director){
		this.director = director;
	}
	public String getDirector(){
		return director;
	}
	
	public void setManufacturer(String manufacturer){
		this.manufacturer = manufacturer;
	}
	public String getManufacturer(){
		return manufacturer;
	}

}

class MovieTest 
{
	public static void main(String[] args) 
	{	
		Movie m1 = new Movie();
		System.out.println(m1);
		
		Movie m2 = new Movie("����","����ȣ","û���");
		System.out.println(m2);
	}
}
