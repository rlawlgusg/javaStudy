import java.util.Scanner;
class Homework01
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String a; //char op; char�� ����!
		double b , c;
	    double plus,min,multi,divid;

		System.out.println("�ϳ��� �����ڸ� �Է��Ͻÿ�");
		a = sc.next(); // op = sc.next().charAt(0) <<char�� ù��° ������ �־��
		System.out.println("ù��° ���ڸ� �Է��Ͻÿ�");
		b = sc.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��Ͻÿ�");
		c = sc.nextInt();
	
	//���ڿ� �񱳴� (���ڿ�����).equals(���Ϸ��� ���ڿ�), char�� ����� ��� op == '+'
		if(a.equals("+")){ 
			plus = b+c;
			System.out.println(b+" + "+c+" = "+plus);
		}else if (a.equals("-")){
			min = b-c;
			System.out.println(b+" - "+c+" = "+min);
		}else if(a.equals("*")){
			multi = b*c;
			System.out.println(b+" * "+c+" = "+multi);
		}else if (a.equals("/")){
			if(c == 0){
				System.out.println("�и� 0�̱� ������ ����� �� �����ϴ�");
			}else{
				divid = b/c;
				System.out.println(b+" / "+c+" = "+divid);
			}			
		}else{
			System.out.println("�߸��� ������ �Դϴ�");
		}

	}
}
