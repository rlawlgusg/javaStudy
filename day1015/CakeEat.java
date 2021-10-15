//메소드 오버라이딩에 대한 예제 만들기
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
		return brand+"에서 "+price+"에 구입한 "+name+"을"+" 맛있게 먹는다!";
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
		return super.toString()+" 커피랑 함께 먹는다!";
	}
}


class CakeEat
{
	public static void main(String[] args) 
	{
		Cake c = new Cake("아이스박스","투썸",5900);
		System.out.println(c);
		CreamCake cc = new CreamCake("순우유케이크","파리바게트",20000,"동물성");
		System.out.println(cc);
	}
}
