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
		return "��ǰ��: "+item +", ����: "+qty;
	}

}


class Exam02_CallByReferenceObject 
{
	//��ǰ�ϳ��� �Ű������� ���޹޾� �� ��ǰ�� ������ 1 �����ϴ� �޼ҵ带 ���� 
	public static void minusQty(Goods g){
		 g.setQty(g.getQty()-1);//���������� �����־����
	}


	public static void main(String[] args) 
	{
		Goods g = new Goods("����",10);
		System.out.println(g);
		minusQty(g);//��������
		System.out.println(g);
	}
}
