import java.util.Scanner;
class StudentAnswer
{
	public static void main(String[] args) 
	{
		int []rightanswer = {2,3,4,6,7,8,3,2,1,9};
		int []answer = new int[10];
		int cnt1 = 0 ,cnt2 = 0;
		Scanner sc = new Scanner(System.in);
		 
		 for(int i = 0 ; i <answer.length ; i++){
			System.out.print((i+1)+"번째 답을 입력하세요===>");
			answer[i] = sc.nextInt();   
			if(answer[i] == rightanswer[i]){
			    cnt1 ++;
			System.out.print("맞은 개수는 "+cnt1+"입니다");
			}else{
				cnt2 ++;
			System.out.print("틀린 개수는 "+cnt2+"입니다");
			}
	}
	}
}
