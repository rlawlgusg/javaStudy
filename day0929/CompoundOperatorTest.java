/*
���� ġȯ ������
������ ������ �����Ͽ� �� ����� �ٽ� ������ �����ϴ� �����ڵ��Դϴ�
+= -= *= /+ %= >>= <<=
����1)
int a = 5;
a* = 2; �̰��� a = a*2�� �ǹ��մϴ�
System.out.println(a); = 10
����2)
int b = 5;
b- = 3;
System.out.println(b); = 2
*/
class CompoundOperatorTest
{
	public static void main(String[] args) 
	{
		int i = 1;
		int sum = 0;


		for( i=1 ; i<100 ; i++){
			sum += i;
		//for( i=1 ; i<3 ; i++){
			sum += i;
		}

        /*
		sum += i;
		
		i++;
		sum += i;
		
		i++
		sum += i;
		*/

		System.out.println("i :"+i);//3
		System.out.println("sum :"+sum);//6

	}
}
