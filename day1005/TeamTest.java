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
			System.out.printf("%d��° �л��� �̸��� �Է��ϼ���\n",i+1);
			System.out.printf("%d��° �л��� ���� ������ �Է��ϼ���\n",i+1);
			System.out.printf("%d��° �л��� ���� ������ �Է��ϼ���\n",i+1);
			System.out.printf("%d��° �л��� ���� ������ �Է��ϼ���\n",i+1);
			names[i] = sc.next();
			kor[i] = sc.nextInt(); 
			eng[i] = sc.nextInt();
			math[i] = sc.nextInt();
			tot[i] = kor[i]+eng[i]+math[i];
			avg[i] += (kor[i]+eng[i]+math[i])/3.0;//�Ǽ����� ���Ѵٸ� 3.0

		}

		
		for(int i = 0 ; i<avg.length ; i++){
			for(int j = i+1 ; j<avg.length ; j++){
				if(avg[i] < avg[j]){//��������! 
						
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

			System.out.println("** ���� ó�� ��� **");
			System.out.println("�̸�\t����\t����\t����\t����\t���");
		for(int i=0;i<avg.length;i++){
			//System.out.println(names[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+math[i]+"\t"+tot[i]+"\t"+avg[i]);
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\n",names[i],kor[i],eng[i],math[i],tot[i],avg[i]);
			//.1f�� �Ҽ� ù°�ڸ� ���� �����شٴ� ��,�ٹٲ��� \n
		}




		//��������
		/*for(int i = 0 ; i<scores.length ; i++){
			for(int j = i+1 ; j<scores.length ; j++){
				
				 if(scores[i] < scores[j]){ 
					
					int temp1 = scores[i]; //����Ÿ�� �ٲٴ� ����
					scores[i] = scores[j];
					scores[j] = temp1;

					String temp2 = names[i]; //�̸��� �ٲܶ� 
					names[i] = names[j];
					names[j] = temp2;
				 }
			}
		}
		System.out.println("** ������ ���� **");
		
		for(int i=0;i<names.length;i++){
			System.out.println(names[i]+" "+scores[i]);
		}
		*/


	}
}
