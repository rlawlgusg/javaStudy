class Foods{
	protected double cal;
	protected int price;
	protected double kg;
	
	public Foods(){}

	public Foods(double cal,int price, double kg){
		this.cal = cal;
		this.price = price;
		this.kg = kg;
	}
	//생성자
	public void setCal(double cal){
		this.cal = cal;
	}
	public double getCal(){
		return cal;
	}
	public void setPrice(int price){
		this.price= price;
	}
	public int getPrice(){
		return price;
	}
	public void setKg(double kg){
		this.kg = kg;
	}
	public double getKg(){
		return kg;
	}
	public String toString(){ 
		return "칼로리: "+cal+" 가격: "+price+" 중량: "+kg;
	}


}

class Melon extends Foods{
	private String origin;
	//melon을 상속할 클래스가 있으면 protected 없으면 private
	
	public Melon(){}

	public Melon(double cal,int price, double kg,String origin){
		super(cal,price,kg);
		this.origin = origin;
	} 



	public void printMelon(){
	System.out.printf("칼로리는 %.1f\n",cal);
	System.out.printf("가격은 %d\n",price);
	System.out.printf("무게는 %.1f\n",kg);
	System.out.printf("원산지는 %s\n",origin);
	System.out.println();
	}

	public void setOrigin(String origin){
		this.origin = origin;
	}
	public String getOrigin(){
		return origin;
	}

//부모클래스부터 물려받은 toString은 원산지를 반환하지 않아 나한테 알맞도록 다시 정의!
//메소드 오버라이딩 
	public String toString(){ 
		//return "칼로리: "+cal+" 가격: "+price+" 중량: "+kg+" 원산지: "+origin;
		return super.toString() +" 원산지: "+origin;
		//부모클래스의 동일한 메소드를 요청하기 위해서는 super.메소드명()으로 사용함 
	}
//부모클래스로부터 물려받은 기능을 마음에 들지 않아서 재정의! = 오버라이딩
//자식이 우선순위! 
}

class Milk extends Foods{
	
	private String brand;
	public Milk(){}
	public Milk(double cal,int price,double kg,String brand){
		super(cal,price,kg);
		this.brand = brand;
	}
	public void setBrand(String brand){
		this.brand = brand;
	}
	public String getBrand(){
		return brand;
	}
	public String toString(){
		return super.toString()+" 브랜드:"+brand;
	}
}



class InheritanceTestMelon
{
	public static void main(String[] args) 
	{
		Foods f = new Foods(200,3000,0.6);
		System.out.println(f);


		Melon m = new Melon();
		m.setCal(42);
		m.setPrice(30000);
		m.setKg(4);
		m.setOrigin("곡성");
		System.out.println(m);
		//칼로리: 42.0 가격: 30000 중량: 4.0 출력결과 ..원산지가 빠짐 오버라이딩해야함! 
//부모클래스에서 toString()메소드가 있고 자식클래스에도 toString()이 있을때에 자식클래스의 toString()이 동작함
		Melon e = new Melon(100,10000,5,"서울");
		e.printMelon();
	
		Melon l = new Melon(200,40000,7,"미국");
		l.printMelon();

		
		Milk milk = new Milk(200,900,0.95,"서울우유");
		System.out.println(milk);
	}
}
