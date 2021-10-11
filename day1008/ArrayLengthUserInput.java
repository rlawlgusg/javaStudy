import java.util.Scanner;
class ArrayLengthUserInput 
{
	static void printArray(double []data){
		for(double i : data){
			System.out.printf("%10.1f",i);//10칸잡아서 소숫점 첫째줄까지 출력해줘
		}
		System.out.println();
	}


	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double []readings;
		int n;
		System.out.println("배열의 크기를 입력하세요: ");
		n = sc.nextInt();
		readings = new double[n];
		for(int i=0; i<n ;i++){
			System.out.printf("%d번째 값을 입력하세요",i+1);
			readings[i] = sc.nextDouble();
		}
		
		printArray(readings);//배열의 이름만 입력해도대


	}
}
