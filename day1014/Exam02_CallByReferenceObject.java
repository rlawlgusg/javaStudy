class Goods{

	private String item;
	private int qty;
	public Goods(String item, int qty){
		this.item = item;
		this.qty = qty;
	}

	public Goods(){}
	
	public void setItem(String item){
		this.item = item;
	}

	public String getItem(){
		return item;
	}
	public void setQty(int qty){
		this.qty = qty;
	}

	public int getQty(){
		return qty;
	}

	public String toString(){
		return "상품명: "+item +", 수량: "+qty;
	}

}


class Exam02_CallByReferenceObject 
{
	//상품하나를 매개변수로 전달받아 그 상품의 수량을 1 감소하는 메소드를 정의 
	public static void minusQty(Goods g){
		 g.setQty(g.getQty()-1);//참조변수를 꼭써주어야함
	}


	public static void main(String[] args) 
	{
		Goods g = new Goods("우유",10);
		System.out.println(g);
		minusQty(g);//참조변수
		System.out.println(g);
	}
}
