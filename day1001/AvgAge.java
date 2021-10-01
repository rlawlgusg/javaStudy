class AvgAge 
{
	public static void main(String[] args) 
	{
		int[]age = {27,28,26,29,28};
		int tot = 0;
		 for(int i = 0; i<age.length ; i++){ 
			tot += age[i];
			//tot = tot + age[i];
		 }
			double avg = (double)tot / age.length;// 실수값에 정수넣으면 소수점자리가 0만 나옴.. 앞에 double을 붙여준다!
			System.out.println("평균나이" +avg);
	}
}
