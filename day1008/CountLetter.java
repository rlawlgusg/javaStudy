import java.util.Scanner;
class CountLetter
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int []count =new int[26];

		System.out.println("���ڿ��� �Է��Ͻÿ�: "); //next ��ĭ, ���� ���ڸ� ������..
		//String buffer =sc.next();
		String buffer = sc.nextLine(); //nextLine= ���鹮�ڵ� �Է¹��� �� ����
		System.out.println(buffer);
		//�� ���ڰ� �����ϴ� Ƚ���� ����Ѵ� (��, ��ĭ�� ����)
		for(int i=0;i<buffer.length();i++){
			char ch = buffer.charAt(i);
			if(ch != ' '){
				if(ch >= 'A' && ch<='Z'){
					//ch = ch + 32; 
					//incompatible types: possible lossy conversion from int to char
					//ch�� �����̱⶧���� char�� ����ȯ �������
					ch = (char)(ch +32);
				}
				count[ch-'a']++;
			}
		}
		//�迭�� ����� Ƚ���� ����ϴ� �ݺ���
		for(int i=0;i<count.length;i++){
			System.out.printf("%10c %5d\n",(char)('a'+i),count[i]); //%c�� �������
		}
		//'a' :97
		//'A' : 65
		//'a'-'A' :32
		//�빮�ڸ� �ҹ��ڷ� �ٲٷ��� (char)(ch+32)
		

	}
}
