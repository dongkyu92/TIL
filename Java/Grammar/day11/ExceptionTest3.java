package day11;

import java.util.Random;

class TestException extends Exception {
	TestException(String message) {
		super(message);
	}
}

public class ExceptionTest3 {
	public static void main(String[] args) {
		System.out.println("main()�������");
		a();
		System.out.println("main()��������");
	}

	static void a() {  // Ʈ���� ��ġ�� �Ҷ� �� throws �� �ʿ����. 
		System.out.println("a()�������");
		try {
			b();
		} catch (TestException e) {
			System.out.println("���� �߻� : " + e.getMessage());
		}
		System.out.println("a()��������");
	}

	static void b() throws TestException { // �ѱ�ٴٴ°ɷ� �˸�.
		System.out.println("b()�������");
		c();
		System.out.println("b()��������");
	}

	static void c() throws TestException {
		System.out.println("c()�������");
		boolean flag = new Random().nextBoolean(); //�ѹ��� ��밡���� ��ü. �Ҹ���Ÿ���� ����
		if (flag) {
			throw new TestException("<<:::::�׽�Ʈ�� ���ܹ߻���Ŵ:::::>>"); // ���� throws TestException �Ⱦ��� ������.
			// jvm�� ������ �߻� ȣ���ϴ� ���� �������� ã��. b-> a(Ʈ���� ĳġ ����) a ���� �ͼ��� ������ �����Ͽ� �����߻� �޼��� ����. 
		} else {
			System.out.println("��������");
		}
		System.out.println("c()��������");
	}
}
