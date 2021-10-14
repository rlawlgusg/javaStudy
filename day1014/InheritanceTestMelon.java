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
	//������
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
		return "Į�θ�: "+cal+" ����: "+price+" �߷�: "+kg;
	}


}

class Melon extends Foods{
	private String origin;
	//melon�� ����� Ŭ������ ������ protected ������ private
	
	public Melon(){}

	public Melon(double cal,int price, double kg,String origin){
		super(cal,price,kg);
		this.origin = origin;
	} 



	public void printMelon(){
	System.out.printf("Į�θ��� %.1f\n",cal);
	System.out.printf("������ %d\n",price);
	System.out.printf("���Դ� %.1f\n",kg);
	System.out.printf("�������� %s\n",origin);
	System.out.println();
	}

	public void setOrigin(String origin){
		this.origin = origin;
	}
	public String getOrigin(){
		return origin;
	}

//�θ�Ŭ�������� �������� toString�� �������� ��ȯ���� �ʾ� ������ �˸µ��� �ٽ� ����!
//�޼ҵ� �������̵� 
	public String toString(){ 
		//return "Į�θ�: "+cal+" ����: "+price+" �߷�: "+kg+" ������: "+origin;
		return super.toString() +" ������: "+origin;
		//�θ�Ŭ������ ������ �޼ҵ带 ��û�ϱ� ���ؼ��� super.�޼ҵ��()���� ����� 
	}
//�θ�Ŭ�����κ��� �������� ����� ������ ���� �ʾƼ� ������! = �������̵�
//�ڽ��� �켱����! 
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
		return super.toString()+" �귣��:"+brand;
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
		m.setOrigin("�");
		System.out.println(m);
		//Į�θ�: 42.0 ����: 30000 �߷�: 4.0 ��°�� ..�������� ���� �������̵��ؾ���! 
//�θ�Ŭ�������� toString()�޼ҵ尡 �ְ� �ڽ�Ŭ�������� toString()�� �������� �ڽ�Ŭ������ toString()�� ������
		Melon e = new Melon(100,10000,5,"����");
		e.printMelon();
	
		Melon l = new Melon(200,40000,7,"�̱�");
		l.printMelon();

		
		Milk milk = new Milk(200,900,0.95,"�������");
		System.out.println(milk);
	}
}
