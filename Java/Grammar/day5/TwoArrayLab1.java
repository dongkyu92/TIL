package day5;

public class TwoArrayLab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[][] = { 
									{ 10, 12, 14, 16 },
									{ 18, 20, 22, 24 },
									{ 26, 28, 30, 32 },
									{ 34, 36, 38, 40 } 
								};
		int colSum = 0;
		int rowSum = 0;
		System.out.println("1행 1열의 데이터 : " + nums[0][0] );
		System.out.println("1행 1열의 데이터 : " + nums[2][3] );
		
		System.out.print("행의 갯수 : ");
		for(int i = 0 ;i<nums.length;i++)
			colSum += 1;
		System.out.println(colSum);
		
		System.out.print("열의 갯수 : " );
		for(int i = 0 ;i<nums.length;i++)
			rowSum += 1;
		System.out.println(rowSum);
		
		System.out.println("3행의 데이터들 : ");
		for(int i= 0; i<nums.length;i++) 
			System.out.print(nums[2][i]+" ");
		System.out.println();
		    	
		System.out.println("2열의 데이터들 : ");
		for(int i= 0; i<nums.length;i++) 
			System.out.print(nums[i][1]+" ");
		System.out.println();
		
		System.out.println("왼쪽 대각선 데이터들 : ");
		for(int i= 0; i<nums.length;i++) 
			System.out.print(nums[i][i]+" ");
		System.out.println();
		
		System.out.println("오른쪽 대각선 데이터들 : ");
		for(int i= 0; i<nums.length;i++) 
			System.out.print(nums[i][nums.length-i-1]+" ");
		System.out.println();
	}
}
