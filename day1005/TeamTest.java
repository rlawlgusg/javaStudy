import java.util.Scanner;
class TeamTest
{
	public static void main(String[] args) 
	{
		String []names = new String[5];
		int []kor = new int[5];
		int []eng = new int[5];
		int []math = new int[5];
		int []tot = new int[5];
		double []avg = new double[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i<names.length; i++){
			System.out.printf("%d번째 학생의 이름을 입력하세요\n",i+1);
			System.out.printf("%d번째 학생의 국어 점수를 입력하세요\n",i+1);
			System.out.printf("%d번째 학생의 영어 점수를 입력하세요\n",i+1);
			System.out.printf("%d번째 학생의 수학 점수를 입력하세요\n",i+1);
			names[i] = sc.next();
			kor[i] = sc.nextInt(); 
			eng[i] = sc.nextInt();
			math[i] = sc.nextInt();
			tot[i] = kor[i]+eng[i]+math[i];
			avg[i] += (kor[i]+eng[i]+math[i])/3.0;//실수값을 원한다면 3.0

		}

		
		for(int i = 0 ; i<avg.length ; i++){
			for(int j = i+1 ; j<avg.length ; j++){
				if(avg[i] < avg[j]){//내림차순! 
						
					String temp1 = names[i];
						names[i] = names[j];
						names[j] = temp1;
					
					int temp2 = kor[i];
						kor[i] = kor[j];
						kor[j] = temp2;

						temp2 = eng[i];
						eng[i] = eng[j];
						eng[j] = temp2;

						temp2 = math[i];
						math[i] = math[j];
						math[j] = temp2;

						temp2 = tot[i];
						tot[i] = tot[j];
						tot[j] = temp2;

					double temp3 = avg[i];
						avg[i] = avg[j];
						avg[j] = temp3;

				}//end if
			}//end for j
		}//end for i

			System.out.println("** 성적 처리 결과 **");
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for(int i=0;i<avg.length;i++){
			//System.out.println(names[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+math[i]+"\t"+tot[i]+"\t"+avg[i]);
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\n",names[i],kor[i],eng[i],math[i],tot[i],avg[i]);
			//.1f는 소수 첫째자리 까지 보여준다는 뜻,줄바꿈은 \n
		}




		//내림차순
		/*for(int i = 0 ; i<scores.length ; i++){
			for(int j = i+1 ; j<scores.length ; j++){
				
				 if(scores[i] < scores[j]){ 
					
					int temp1 = scores[i]; //데이타를 바꾸는 변수
					scores[i] = scores[j];
					scores[j] = temp1;

					String temp2 = names[i]; //이름을 바꿀때 
					names[i] = names[j];
					names[j] = temp2;
				 }
			}
		}
		System.out.println("** 성적순 정렬 **");
		
		for(int i=0;i<names.length;i++){
			System.out.println(names[i]+" "+scores[i]);
		}
		*/


	}
}
