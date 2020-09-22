package day6;

public class MethodLab3 {

	public static void main(String[] args) {

		int num1=getRandom(10);
		int num2=getRandom(10);
		int num3=getRandom(10);
		int num4=getRandom(10);
		int num5=getRandom(10);
		System.out.print(num1+", "+num2+", "+num3+", "+num4+", "+num5);
		System.out.println();
		//»ïÇ×¿¬»êÀÚ  (i<4? ", " :"");

		int num6=getRandom(10,20);
		int num7=getRandom(10,20);
		int num8=getRandom(10,20);
		int num9=getRandom(10,20);
		int num10=getRandom(10,20);
		System.out.print(num6+", "+num7+", "+num8+", "+num9+", "+num10);
	}
	
	
	public static int getRandom(int n) {
		int result = (int)(Math.random()*n)+1;
		
		return result;
	}
public static int getRandom(int n1,int n2) {
	int result = (int)(Math.random()*n2)+n1;
	
	return result;
	}
}
