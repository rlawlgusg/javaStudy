import java.util.Scanner;
class Homework07
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c,min;
		
		System.out.println("ù��° ������ �Է��Ͻÿ�");
		a = sc.nextInt();
		System.out.println("�ι�° ������ �Է��Ͻÿ�");
		b = sc.nextInt();
		System.out.println("����° ������ �Է��Ͻÿ�");
		c = sc.nextInt();
		
		
		if(a<b && a<c){
			min = a;
		}else if(b<a && b<c){
			min = b;
		}else{		
			min = c;
		}

		/*
		if (a > b){
			if (b > c){
				min = c;
			}else
				min = b;
		}else{
			if (a > c){
			    min = c;
			}else{
				min = a;
			}
		} */



		/*
		if( a > b){
			if( b > c ){
				min = c;
			}else{
				min = b;
			} 
		}else{ // b > a
			if(a > c){//b>a>c
				min = c;
			}else{//c>a
				min = a;
			}
		}*/
				System.out.println("���� ���� ���� "+min+"�Դϴ�");
	


	}
}