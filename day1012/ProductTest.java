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
		return "��ǰ���� "+name+ " ������ "+amount+" �ܰ��� "+unit+ " �� ������ "+getPrice(); 
		
		//String result = "";
		//result += "��ǰ��"+name+"\n";
		//result += "����"+amount+"\n";
		//result += "�ܰ�"+unit+"\n"; //+=
		//return result;

	}

}



class ProductTest{
	public static void main(String[] args) 
	{
	
		Product p1 = new Product();
		p1.setName("Ŀ��");
		p1.setAmount(3);
		p1.setUnit(5000);


		System.out.println(p1.getName());
		System.out.println(p1.getAmount());
		System.out.println(p1.getUnit());
		System.out.println(p1.getPrice());
		//int total = p1.getAmount()*p1.getUnit(); �̷��Ե� ǥ������
		System.out.println(p1.toString());

	}
}
