package day8;

class Parent{ // java.lang.Object (�θ� ���� �������� ������ �ڵ����� ���)
	//object Ŭ������ ��������. ������ ���
	
	int x = 1, y = 2;
	
	public String toString() {
		
		return "Parent Ŭ������ ��ü �Դϴ�"; //�޼ҵ� �������̵�.
	}
}
class Child extends Parent{
	int x = 10 ;
	void printInfo() {
		int x = 100;
		System.out.println(x);           //100
		System.out.println(this.x);    // 10 ������ ��������
		System.out.println(super.x); // 1 super�� ����ü�� �����ϴ� ���ͷ�
		System.out.println(y);          // 2 ����
		System.out.println(this.y);    // 2
		System.out.println(super.y); // 2
		//System.out.println(z);
		
	
	}
//��� �ڹ� Ŭ������ Object�� �ְ� ����
	//Child���� ����Ʈ�� ȣ���ϸ� ����� �θ� ȣ��
	
public String toString() {
		
		return "Parent Ŭ������ ��ü �Դϴ�"; //�޼ҵ� �������̵�.
	}
}

public class ParentChildTest {
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.toString());
		System.out.println(p);
		System.out.println("���1" + p); // ���ڿ� ����.
		Card c = new Card(); // ���� ��Ű���� ����Ʈ ���ص� ��.
		System.out.println(c.toString());
		System.out.println("���2" + c);
		java.util.Date d= new java.util.Date();
		System.out.println(d.toString());
		System.out.println("���3" + d);
		
		Child ch = new Child();
		System.out.println("��� 4"+ ch);
		ch.printInfo();
	}


}
