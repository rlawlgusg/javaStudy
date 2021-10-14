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


class CallByValueAndCallByReferenceTest 
{
	public static void minusOne(int n){//���� ���� ȣ��
		 n = n - 1;
		 System.out.println(n);
	}

	public static void minusOne(int []arr){//������ ���� ȣ��
		for(int i=0;i<arr.length;i++){
			arr[i]=arr[i]-1;
		}
		printArray(arr);
	}

	public static void minusOne(double []arr){
		for(int i=0;i<arr.length;i++){
			arr[i]=arr[i]-1;
		}
		printArray(arr);
	}
	public static void printArray(int []arr){
		for(int i:arr){
			System.out.printf("%10d",i);
		}
		System.out.println();
	}

	public static void printArray(double []arr){
		for(double i:arr){
			System.out.printf("%10.1f",i);
		}
		System.out.println();
	}


	public static void minusOne(Goods g){//������ ���� ȣ��
		 g.setQty(g.getQty()-1);
	}

	public static void main(String[] args) 
	{
		int n =100;
		double []arr ={10.3, 2.7, 9.1};
		Goods g = new Goods("���",10);
		
		minusOne(n);
		minusOne(arr);
		minusOne(g);
		System.out.println(n);
		printArray(arr);
		System.out.println(g);

	}
}
