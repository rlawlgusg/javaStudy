import java.util.Scanner;
class Calc
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a;
	    int b;
		System.out.print("ù��° ���� �Է��Ͻÿ�->");
		a = sc.nextInt();
		System.out.print("�ι�° ���� �Է��Ͻÿ�->");
		b = sc.nextInt();
		int add = a+b;
		int sub = a-b;
		int multi = a*b;
		int div = a/b;
		int mod = a%b;
		System.out.println(a+"+"+b+"="+add);
		System.out.println(a+"-"+b+"="+sub);
        System.out.println(a+"*"+b+"="+multi);
		System.out.println(a+"/"+b+"="+div);
		System.out.println(a+"%"+b+"="+mod);





	}
}
