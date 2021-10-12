class Product{
	
	private String name;
	private int amount;
	private int unit;
	
	public void setName(String name){
		this.name = name;
	}
	public void setAmount(int amount){
		this.amount = amount;
	}
	public void setUnit(int unit){
		this.unit = unit;
	}

	public String getName(){
		return this.name;
	}
	
	public int getAmount(){
		return this.amount;
	}

	public int getUnit(){
		return this.unit;
	}

	public int getPrice(){
		int price = amount*unit;
			return price;
	}
	public String toString(){
		return "상품명은 "+name+ " 수량은 "+amount+" 단가는 "+unit+ " 총 가격은 "+getPrice(); 
		
		//String result = "";
		//result += "상품명"+name+"\n";
		//result += "수량"+amount+"\n";
		//result += "단가"+unit+"\n"; //+=
		//return result;

	}

}



class ProductTest{
	public static void main(String[] args) 
	{
	
		Product p1 = new Product();
		p1.setName("커피");
		p1.setAmount(3);
		p1.setUnit(5000);


		System.out.println(p1.getName());
		System.out.println(p1.getAmount());
		System.out.println(p1.getUnit());
		System.out.println(p1.getPrice());
		//int total = p1.getAmount()*p1.getUnit(); 이렇게도 표현가능
		System.out.println(p1.toString());

	}
}
