class Foods{
	protected double cal;
	protected int price;
	protected double kg;

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



}

class Melon extends Foods{
	private String origin;
	//melon�� ����� Ŭ������ ������ protected ������ private
	
	public void printMelon(){
	System.out.printf("Į�θ��� %.1f\n",cal);
	System.out.printf("������ %d\n",price);
	System.out.printf("���Դ� %.1f\n",kg);
	System.out.printf("�������� %s\n",origin);
	}

	public void setOrigin(String origin){
		this.origin = origin;
	}
	public String getOrigin(){
		return origin;
	}
}





class InheritanceTestMelon02
{
	public static void main(String[] args) 
	{
		Melon m = new Melon();
		m.setCal(42);
		m.setPrice(30000);
		m.setKg(4);
		m.setOrigin("�");
		m.printMelon();

	
	}
}
