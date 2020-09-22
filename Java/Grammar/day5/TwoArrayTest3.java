package day5;
/* Open API를 활용한 빅데이터 전처리, 시각화
 * 김동규
 * 12.09 2차원 배열 실습2
 */
public class TwoArrayTest3 {

	public static void main(String[] args) {
			int nums[][] = {
					
										{10,20,30,40},
										{11,21,31,41},
										{12,22,32,42}
									
								};
		
			int sum = 0;
			
			for(int i=0; i < nums.length; i++)
				for(int j=0; j< nums.length;j++)
					sum += nums[i][j];
			
			System.out.println("전체 데이터의 합 : " + sum);
			
			int sumRow=0, sumCol=0;
			
			for(int i = 0 ; i<nums.length;i++)
				sumRow+=nums[2][i];
			for(int j = 0; j<nums.length;j++)
				sumCol += nums[j][1];
			
			System.out.println("마지막 행 데이터의 합 : " + sumRow);
			System.out.println("두번쨰 열 데이터의 합 : " + sumCol);

			
			
		}

	}


