class ForEachTest 
{
	public static void main(String[] args) 
	{
		
		String []name = {"김지현","윤서우","임상진","임하연","정자영","최현호"};
		/*
		//for each반복문을 이용하여 배열의 요소를 모두 출력해봄
		for(String n:name){ //여기의 n은 데이터를 담는 변수를 의미!
			System.out.println(n);
		}
		*/
		for(int i=0;i<name.length;i++){ //여기의 i는 데이타의 인덱스를 의미
			System.out.println(name[i]);
		}
		
	}
}
