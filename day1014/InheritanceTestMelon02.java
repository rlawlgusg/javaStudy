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
	//melon을 상속할 클래스가 있으면 protected 없으면 private
	
	public void printMelon(){
	System.out.printf("칼로리는 %.1f\n",cal);
	System.out.printf("가격은 %d\n",price);
	System.out.printf("무게는 %.1f\n",kg);
	System.out.printf("원산지는 %s\n",origin);
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
		m.setOrigin("곡성");
		m.printMelon();

	
	}
}
