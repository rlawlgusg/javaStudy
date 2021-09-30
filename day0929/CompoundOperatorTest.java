/*
복합 치환 연산자
변수에 연산을 수행하여 그 결과를 다시 변수에 대입하는 연산자들입니다
+= -= *= /+ %= >>= <<=
예시1)
int a = 5;
a* = 2; 이것은 a = a*2를 의미합니다
System.out.println(a); = 10
예시2)
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
