//1부터 30까지 거듭제곱+1의 합을 구함..

class Homework6
{
	public static void main(String[] args) 
	{

		int tot = 0;
		for(int i = 1; i<=30 ; i++){
			tot += i*i+1;
		}

		System.out.println(tot);
	}
}
