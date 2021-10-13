class MethodArray{
	//정수형 배열 2개를 매개변수로 전달받아 하나의 배열로 만들어 반환하는 메소드... 
	
	public static int[] array(int []arr1, int []arr2){
		int arrr[] = new int[arr1.length + arr2.length];
		for(int i=0;i<arr1.length;i++){
			arrr[i] = arr1[i];
		}
		for(int i=0;i<arr2.length;i++){ //int i=arr1.length를 넣으면 왜 안될까?
			arrr[i+arr1.length] = arr2[i];
		}
		return arrr;
	}
	//실수형 배열 2개를 매개변수로 전달받아 하나의 배열로 만들어 반환하는 메소드를 중복정의
	public static double[] array(double []arr3, double []arr4){
		double arrr[] = new double[arr3.length + arr4.length];
		for(int i=0;i<arr3.length;i++){
			arrr[i] = arr3[i];
		}
		for(int i=0;i<arr4.length;i++){ 
			arrr[i+arr3.length] = arr4[i];
		}
		return arrr;
	}
}
class MethodArrayTest {	
	public static void main(String[] args){

		int []arr1 = new int [] {10,20,30,40};
		int []arr2 = new int [] {50,60,70,80};
		int []arrr = MethodArray.array(arr1,arr2);

		for(int i : arrr){
			System.out.printf(i+" ");
		}
		System.out.println();

		double []arr3 = new double [] {1.1,2.1,3.1,4.1};
		double []arr4 = new double [] {5.1,6.1,7.1,8.1};
		double []arrl = MethodArray.array(arr3,arr4);

		for(double i : arrl){
			System.out.printf(i+" ");
		}

		
	}
}
