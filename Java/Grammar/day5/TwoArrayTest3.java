package day5;
/* Open API�� Ȱ���� ������ ��ó��, �ð�ȭ
 * �赿��
 * 12.09 2���� �迭 �ǽ�2
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
			
			System.out.println("��ü �������� �� : " + sum);
			
			int sumRow=0, sumCol=0;
			
			for(int i = 0 ; i<nums.length;i++)
				sumRow+=nums[2][i];
			for(int j = 0; j<nums.length;j++)
				sumCol += nums[j][1];
			
			System.out.println("������ �� �������� �� : " + sumRow);
			System.out.println("�ι��� �� �������� �� : " + sumCol);

			
			
		}

	}


