import java.util.Scanner;
class Pay
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        String name;
		int a,b;
		System.out.print("상품명이 무엇입니까?");
		name = sc.next();
		System.out.print("단가는 얼마 입니까?");
		a = sc.nextInt();
		System.out.print("구매수량이 몇개 입니까?");
        b = sc.nextInt();
		int c = a * b;
        double d = c*0.1;
		double e = c*0.9;
		
		if(b>=10 || c>=20000){
		System.out.println("할인된 금액은 "+d+"입니다");
		System.out.println("고객님이 지급해야할 총 금액은 "+e+"입니다");}
		else{
		System.out.println("할인대상자가 아닙니다");
		System.out.println("고객님이 지급해야할 금액은 "+c+"입니다");}
		
	}
}
