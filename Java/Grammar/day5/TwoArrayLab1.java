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
		System.out.println("1�� 1���� ������ : " + nums[0][0] );
		System.out.println("1�� 1���� ������ : " + nums[2][3] );
		
		System.out.print("���� ���� : ");
		for(int i = 0 ;i<nums.length;i++)
			colSum += 1;
		System.out.println(colSum);
		
		System.out.print("���� ���� : " );
		for(int i = 0 ;i<nums.length;i++)
			rowSum += 1;
		System.out.println(rowSum);
		
		System.out.println("3���� �����͵� : ");
		for(int i= 0; i<nums.length;i++) 
			System.out.print(nums[2][i]+" ");
		System.out.println();
		    	
		System.out.println("2���� �����͵� : ");
		for(int i= 0; i<nums.length;i++) 
			System.out.print(nums[i][1]+" ");
		System.out.println();
		
		System.out.println("���� �밢�� �����͵� : ");
		for(int i= 0; i<nums.length;i++) 
			System.out.print(nums[i][i]+" ");
		System.out.println();
		
		System.out.println("������ �밢�� �����͵� : ");
		for(int i= 0; i<nums.length;i++) 
			System.out.print(nums[i][nums.length-i-1]+" ");
		System.out.println();
	}
}
