class IncrementDecrement 
{
	public static void main(String[] args) 
	{
		int i = 5;
		int j = 5;
		i++; //i= i+1
		++j; //j= j+1
		System.out.println(i);
		System.out.println(j);

		System.out.println("----------------------");
		//a++와 a+1은 다름 
		//a+1은 그냥 a에 1을 더한것,
		//a++는 a=a+1
		int a = 10;
		int b = 10;
		System.out.println(a+1);
		System.out.println(b++);
		System.out.println("----------------------");
		System.out.println(a);
		System.out.println(b);
		System.out.println("----------------------");

		int n = 5;
		int m = 5;
		n--;
		--m;
		System.out.println(n);
		System.out.println(m);
		System.out.println("----------------------");
		//증감연산자는 앞에 올수도 있고 뒤에 올수도 있다. 단독으로 쓰일 때는 결과가 같다
		//그러나 다른 연산자나 명령문에 사용이 될때에는 의미가 다르다!
		//변수명 앞에 증감연산자가 오면 먼저 변수를 증가하고 다른 연산자나 명령문을 수행한다
		//변수명 뒤에 증감연산자가 오면 다른 연산자나 명령문을 수행하고 나중에 변수를 증감한다
		//==>>오는 순서대로 수행하면 됌

        i = 5;
		j = 5;
		a = ++i;
	    b = j++;
	    System.out.println("i:" + i);//6
	    System.out.println("j:" + i);//6
		System.out.println("a:" + a);//6
	    System.out.println("b:" + b);//5
		System.out.println("----------------------");
		/*a = ++i는 두개의 명령어를 하나로 줄여놓은 표현이다
		  i = i+1 , a = i;
		  즉 i의 값을 먼저 증가시키고 증가된 i를 변수 a에 대입한다
		  b = j++는 두개의 명령어를 하나로 줄여놓은 표현이다
		  b = j; , j = j+1;
		  증가시키기전의 j의 값을 b에 대입하고 나중에 j를 증가시킨다 
         */
		 
		 i = 5;
		 j = 5;
		 int k = 5;
		 System.out.println(++i);//6
		 System.out.println(j++);//5
		 System.out.println(k+1);//6
		 System.out.println(i);//6
		 System.out.println(j);//6
		 System.out.println(k);//5








	}
}
