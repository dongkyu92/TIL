package day9;

class A{
	A(){
		System.out.println("A Ŭ������ ��ü �����մϴ�.");
	}
}
class B extends A{
	B(int num){ 
		//C���� super �Ⱦ��� ������.
		System.out.println("B Ŭ������ ��ü �����մϴ�.");
	}
}
class C extends B{
	C(){
		super(100); // �ݵ�� ù�ٿ� ��ߵ�. �ؿ� ���� ������. ������� ȣ���ؾߵǴµ� ����� ���� �ֱ� ����.
		System.out.println("C Ŭ������ ��ü �����մϴ�.");
	}
}


public class ABCTest {

	public static void main(String[] args) {
		new C(); // ��ü ����, � Ŭ������ ��ü�����ϸ� ����鵵 ��ü ������. �翬�� ���� ������ �ڵ� ȣ��.
		// ������ ���� ������
	}

}
