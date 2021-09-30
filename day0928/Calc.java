import java.util.Scanner;
class Calc
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a;
	    int b;
		System.out.print("첫번째 수를 입력하시오->");
		a = sc.nextInt();
		System.out.print("두번째 수를 입력하시오->");
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
