//�޼ҵ� �������̵��� ���� ���� �����
class Cake{
	protected String name;
	protected String brand;
	protected double price;

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setBrand(String brand){
		this.brand = brand;
	}
	public String getBrand(){
		return brand;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public double getPrice(){
		return price;
	}
	public Cake(){}
	public Cake(String name, String brand, double price){
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	public String toString(){
		return brand+"���� "+price+"�� ������ "+name+"��"+" ���ְ� �Դ´�!";
	}
}

class CreamCake extends Cake{
	private String typeofcream;
	
	public void setTypeofcream(String typeofcream){
		this.typeofcream = typeofcream;
	}
	public String getTypeofcream(){
		return typeofcream;
	}

	public CreamCake(){}
	public CreamCake(String name, String brand, double price, String typeofcream){
		super(name,brand,price);
		this.typeofcream = typeofcream;
	}
	public String toString(){
		return super.toString()+" Ŀ�Ƕ� �Բ� �Դ´�!";
	}
}


class CakeEat
{
	public static void main(String[] args) 
	{
		Cake c = new Cake("���̽��ڽ�","����",5900);
		System.out.println(c);
		CreamCake cc = new CreamCake("����������ũ","�ĸ��ٰ�Ʈ",20000,"������");
		System.out.println(cc);
	}
}
