class RangeByte 
{
	public static void main(String[] args) 
	{
		// 1byte은 8bit로 구성된다.
		// 1bit로 표현할 수 있는 수의 범위는 0,1 두가지 
		// 2bit가 있다면
		//  00   0
		//  01   1
		//  10   2
		//  11   3

		//1byte(8개의 bit)중에 맨 왼쪽에 있는 bit는 부호를 음수인지 양수인지 
		//판별하는 부호비트로 사용하고
		//나머지 7개의 비트로 숫자를 표현한다
		//따라서 표현할 수 있는 수의 범위가 다음과 같다
		//음수 2의 7승 부터 양수 2의 7승 -1
		//-128 ~ 127

		byte data;
		data = -128;
		System.out.println(data);
		data = (byte)(data - 1);//underFlow
        System.out.println(data);

		/*data = 127;
		System.out.println(data);
		data = (byte)(data+1);//overFlow
		System.out.println(data);*/

	}
}
/*
C:\javaStudy\day0928>java RangeByte
127
-128
*/