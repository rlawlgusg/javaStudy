import java.util.Scanner;
class ThreeNumber
{
	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է��ϼ���: ");
		a = sc.nextInt();
		System.out.print("�ι�° ���� �Է��ϼ���: ");
		b = sc.nextInt();
		System.out.print("����° ���� �Է��ϼ���: ");
		c = sc.nextInt();
		if(a>b && a>c)
			{
        System.out.print("���� ū���� "+a+"�Դϴ�");
		}else if (b>a && b>c)
		{
		System.out.print("���� ū���� "+b+"�Դϴ�");
		}else
			{
		System.out.print("���� ū���� "+c+"�Դϴ�");
		}
	}
}

/* ��ø ���ù� - ��ø���ù����� else�� ���� ���� ���� ����� if�� �����ȴ�!
if(a>b){
 if(a>c){
  max = a;
 }else{
  max = c;
}
}else{
 if(b>c){
  max = b;
 }else{
  max = c;
 }
}
*/