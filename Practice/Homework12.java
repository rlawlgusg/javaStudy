class Homework12
{
	public static void main(String[] args) 
	{

		int i,j,cnt;
//반복문안에 반복문 중첩반복문이 필요하다!

		for(i=2;i<=100;i++){
			cnt=0;//약수의 갯수를 구해야한다. 0이라는 초기값을 줌, 바깥에 있으면 안됌!!!! 꼭 for안에 있어야함
			for(k=2;k<i;k++){ //i가 소수인지 판단! 1제외 자기자신 제외 k 나누는수
				if(i%k==0) cnt++; //나누어 떨어지면 소수 ㄴ i의 약수의 개수가 cnt에 담김
				}
		if(cnt==0) System.out.print(i + " ");
		}
	}
}
	
		
		
















/*	for(int i = 2; i<= 100 ; i++){ //i의 범위는 2~100까지 이중에서 소수를 찾자 , 나눠지는수
			for(int k = 2 ; k < i ; k++){ //1 제외 ,자기자신 제외, k 나누는수
				int cnt =0;
				if ( i % k == 0) //나누어떨어지면 소수아님.......
					cnt++; 
			}if (cnt == 0)
				System.out.println(i);
			} */
