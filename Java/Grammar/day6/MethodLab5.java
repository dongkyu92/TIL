package day6;

public class MethodLab5 {

	public static void main(String[] args) {
		
		int r1[] = powerArray(2);
		for(int i = 0 ; i<r1.length;i++) 
			System.out.printf("%d%s", r1[i], i<r1.length-1 ? ", ": " ");
		System.out.println();
		
		
		int r2[] = powerArray(3);
		for(int i = 0 ; i<r2.length;i++) 
			System.out.printf("%d%s", r2[i], i<r2.length-1 ? ", ": " ");
		System.out.println();
		
		int r3[] = powerArray(4);
		for(int i = 0 ; i<r3.length;i++) 
			System.out.printf("%d%s", r3[i], i<r3.length-1 ? ", ": " ");
		System.out.println();
	}

	
	static int[] powerArray(int num) {
		
		int arr[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		for(int i = 0 ; i<arr.length;i++)
			arr[i]*=num;
		
		return arr;
	}
}
