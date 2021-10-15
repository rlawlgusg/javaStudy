//참조에 의한 호출
class Cbrt
{
	public static void Sum(int []arr){
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			sum += arr[i];
		}
		System.out.println(sum);
	}




	public static void main(String[] args) 
	{
		int []arr1 = {1,2,3,4,5};//15
		Sum(arr1);
		int []arr2 = {6,7,8,9,10};//40
		Sum(arr2);
		int []arr3 = {3,5,2};//10
		Sum(arr3);
	}
}
