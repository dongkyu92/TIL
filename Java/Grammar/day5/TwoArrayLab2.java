package day5;

public class TwoArrayLab2 {

	public static void main(String[] args) {

		char ch[][] = {
								{'B','C','A','A'},
								{'C','C','B','B'},
								{'D','A','A','D'}
							};
		int asum=0;
		int bsum=0;
		int csum=0;
		int dsum=0;
		
		for(int i = 0; i<ch.length;i++)
			for(int j=0;j<ch[i].length;j++)
				switch(ch[i][j]) {
				case 'A':
					asum+=1;
					break;
				case 'B':
					bsum+=1;
					break;
				case 'C':
					csum+=1;
					break;
				case 'D':
					dsum+=1;
					break;
				}
			
		System.out.println("A��"+asum+"�� �Դϴ�.");
		System.out.println("B��"+bsum+"�� �Դϴ�.");
		System.out.println("C��"+csum+"�� �Դϴ�.");
		System.out.println("D��"+dsum+"�� �Դϴ�.");
		
		
		
		}

	
	
	}


