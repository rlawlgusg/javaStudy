//정수형 배열을 매개변수로 전달받아 총합을 구하여 반환하는 메소드와
//실수형 배열을 매개변수로 전달받아 총합을 구하여 반환하는 메소드를
//중복하여 정의하고 호출
class MethodOverloading{
	
	/*
	public static int total(int []a){
		int sum = 0;
		for(int i=0;i<a.length;i++){
			sum += a[i];
		}
		return sum;
	}
	*/

	public static int total(int []a){
		int sum = 0;
		for(int i:a){
			sum +=i;
		}
		return sum;
	}

	public static double total(double []a){
		double sum = 0;
		for(double i:a){
			sum +=i;
		}
		return sum;
	}



}

class MethodOverloadingTest06
  
{
	public static void main(String[] args) 
	{
		int []arr1 = {10,20,30,40};
		double []arr2 = {10.5,20.7,35.6,62.8,80.5,93.7};//배열은 여기다가!

		System.out.printf("정수형 배열의 총합: %d\n",MethodOverloading.total(arr1));
		System.out.printf("실수형 배열의 총합: %.1f\n",MethodOverloading.total(arr2));
	}
}
