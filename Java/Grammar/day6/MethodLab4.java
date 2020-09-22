package day6;

public class MethodLab4 {

	public static void main(String[] args) {
		
		int arr1[] = new int[] {10,20,30};
		int arr2[] = new int[] {100,500,300,200,400};
		int arr3[] = new int[] {1,10,3,4,5,8,7,6,9,2};
		
		System.out.println("가장 큰 값은"+ maxNumArray(arr1)+"입니다.");
		System.out.println("가장 큰 값은"+ maxNumArray(arr2)+"입니다.");
		System.out.println("가장 큰 값은"+ maxNumArray(arr3)+"입니다.");
		
		
		
	}

	
	static int maxNumArray(int[] num) {

		int max = 0;
		for(int data: num) {
			if(data>max)
				max = data;
		}
		
		return max;
	}
}
