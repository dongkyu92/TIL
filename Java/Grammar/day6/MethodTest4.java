package day6;

public class MethodTest4 {

	public static void main(String[] args) {
		System.out.println("main() �������");
		printName("�赿��", '$');
		printMyName(3,'*');
		System.out.println("main() ��������");
	}

	static void printName(String name, char deco) {
		System.out.println(deco + name + deco);
		return;
	}

	static void printMyName(int num, char deco) {
			
			for(int i=1; i<=num;i++) {
				System.out.println(deco+"�赿��"+deco);
			}
}
}
