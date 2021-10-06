import java.util.Scanner; //왜 안돼...?
class StudentRandom 
{
	public static void main(String[] args) 
	{
		String []names = {"김수연","김시아","감지현","노유나","박지예","유하림","윤서우","윤태인","이건우","임상진","임하연","전세영","정자영","최현호"};
		for(int i=0;i<100;i++){
		System.out.print(names[i%names.length]);
		
		
		//대기시간을 줌!
		try{
		Thread.sleep(1); 
		}catch(Exception e){}
		
		}

		Random rand = new Random(System.in);
		int n = rand.nextInt();
		n = n >>> 1;
		n = n % 15; //0에서부터 14번째 난수 발생
		System.out.println(" *** 당첨자 *** ");
		System.out.println(names[n]);


	}
}
