/*비트연산자: 비트의 상태(2진수의 상태)에서 수행하는 연산자 입니다
&:비트곱 두개의 비트가 모두 1이면 1 그렇지 않으면 0 
|:비트합 두개의 비트 중에 하나라도 1이면 1 그렇지 않으면 0
^:(자석생각,,,, )비트차 두개의 비트가 서로 다르면 1 같으면 0

x   y   x*y   x|y    x^y
--------------------------
0   0    0     0      0
0   1    0     1      1
1   0    0     1      1
1   1    1     1      0

*/


class BitTest
{
	public static void main(String[] args) 
	{
		int a = 10; //10을 2로 나눈 나머지(0이 될때까지 나누고 왼쪽에서부터) 1010
		int b = 20; //20을 2로 나눈 나머지 10100
		int i = a & b;
		int j = a | b;
		int k = a ^ b;
		System.out.println("i: "+i);
		System.out.println("j: "+j);
		System.out.println("k: "+k);
	}
}
