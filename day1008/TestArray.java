import java.util.Scanner;
class TestArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//10개의 정수를 저장할 수 있는 배열을 선언하고 생성하라
		int []arr = new int[10];
		//사용자로 부터 정수를 받아 배열에 저장하는 반복 루프
		for(int i=0;i<arr.length;i++){
		System.out.printf("%d번째 배열의 원소를 입력하세요\n",i+1);
		arr[i] = sc.nextInt();
		}
		//배열에 저장된 정수를 출력하는 반복 루프
		for(int i =0;i<arr.length;i++){
			System.out.printf("%5d",arr[i]);
		}
		System.out.println();

		for(int i :arr){
			System.out.printf("%5d",i);
		}
		System.out.println();
		//배열에 저장된 정수를 역순으로 출력하여 보라
		for(int i=arr.length-1; i >=0 ; i--){
			System.out.printf("%5d",arr[i]);
		}
		System.out.println();


	}
}
