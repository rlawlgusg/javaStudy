import java.util.Scanner; //�� �ȵ�...?
class StudentRandom 
{
	public static void main(String[] args) 
	{
		String []names = {"�����","��þ�","������","������","������","���ϸ�","������","������","�̰ǿ�","�ӻ���","���Ͽ�","������","���ڿ�","����ȣ"};
		for(int i=0;i<100;i++){
		System.out.print(names[i%names.length]);
		
		
		//���ð��� ��!
		try{
		Thread.sleep(1); 
		}catch(Exception e){}
		
		}

		Random rand = new Random(System.in);
		int n = rand.nextInt();
		n = n >>> 1;
		n = n % 15; //0�������� 14��° ���� �߻�
		System.out.println(" *** ��÷�� *** ");
		System.out.println(names[n]);


	}
}
