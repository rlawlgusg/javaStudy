import java.util.Scanner;
class Exam{ 
		boolean flag = true;
		int correct = 0;
		int incorrect = 0;

char []right_answer = {'c','a','a','a','c','d','b','a','c','b'};
char []answer = new char[10];
Scanner sc = new Scanner(System.in);


public static void main(String[] args){
	for(int i = 0; i < answer.length; i++){//for���� Ŭ�����ȿ��� ���Ұ� �� �޼ҵ�� ���ξ��Ѵ�
	System.out.printf("%d�� ������ ��",i+1);
	answer[i] = sc.next.charAt[0];
	}
}

static int correctAnswers(char []rightanswer,char[] answer){
	for(int i=0;i<answer.length;i++){
		if(answer[i] == rightanswer[i]){
					correct ++;}
				return correct;}
	
static int incorrectAnswers(char []rightanswer,char[] answer){incorrect ++;
return incorrect;}


static boolean isPassed(char []rightanswer,char[] answer)
{if(correctAnswers(rightanswer, answer) >= 7) return true;
else return false;	}

}


class ExamResult
{
	


		boolean result = Exam.isPassed();
		int correct = Exam.correctAnswer();
		int incorrect = Exam.incorrectAnswer();

		

		System.out.printf("���� Ƚ�� : %d\n",correct);
		System.out.printf("���� Ƚ�� : %d\n",incorrect);
		System.out.printf(result);

	}
}
