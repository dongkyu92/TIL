package day6;
/*
 * �迭 Ÿ���� �Ű������� �����Ͽ� �޼��� ȣ��� �迭�� �ƱԸ�Ʈ�� ���޹����� ���޹޴� �������� ������ �������� �ʰ� �ȴ�.
 * 
 * Java
 */
public class MethodTest6 {

	public static void main(String[] args) {
		System.out.println("main() �������");
		System.out.println(add(10,100));
		System.out.println(add(10,20,30));
		System.out.println(add(new int[] {1,2,3,4,5,6,7,8,9,10}));
		System.out.println(add());
		System.out.println(add(11,22,33,44,55,66,77,88,99));
		System.out.println("main() ��������");
	}

	static int add(int p1, int p2) {
		return p1 + p2;
	}
	
	static int add(int p1, int p2, int p3) {
		return p1 + p2+ p3;
	}
	/*
	static int add(int[] p) {
		int sum = 0;
		for(int i=0; i<p.length;i++)
			sum +=p[i];
		return sum;
	}
	*/
	static int add(int... p) { // ����
		int sum = 0;
		for(int i=0; i<p.length;i++)
			sum +=p[i];
		return sum;
	}

}