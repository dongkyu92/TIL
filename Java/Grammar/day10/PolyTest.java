package day10;
// java.lang �� �ڵ� import.

public class PolyTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		// printObjectInfo(new Object());
		// day10.PolyTest.printObjectInfo(new Object()); ���� ȣ���
		printObjectInfo(new Object()); // Object�� Object ��ü�� �ڼո� �ü��ִٴ� ��.
		printObjectInfo(new String("������"));
		printObjectInfo("ABC");
		printObjectInfo(new java.util.Date());
		printObjectInfo(new java.io.File("C:\\Temp")); // \���丮 ������ 2���� ���� : �ϳ��� ���� \T�� Ư�����ڷ� ���������.
														// / �� �Ẹ�� C:/Temp ---> JVM�� ���߿� �˾Ƽ� \�� �ٲ���.
		printObjectInfo(new int[10]); // [I 1���� �迭�̴ϱ� [, 2���� �迭�� [[
		printObjectInfo(new double[5]); // [D
		printObjectInfo(new day7.Member());
		printObjectInfo(new Integer(100)); // int type�� rapperŬ����.
		printObjectInfo(100); //��Ƽ�� ������ ���޵�.// �ڹ� 5 ����AutoBoxing ����
	}

	static void printObjectInfo(Object o) { // String �϶��� 2,3������ �����ϰ� �� ������
		if (o instanceof String) { // o��� �ν��Ͻ��� ��Ƽ�� Ÿ���� �ν��Ͻ���?
			System.out.println("���޵� ��ü�� Ŭ������ :  " + o.getClass().getName() + " - " + ((String) o).length());
		} // ((String)o).length ���� ����ȯ.
		else {
			System.out.println("���޵� ��ü�� Ŭ������ :  " + o.getClass().getName());
		}

		// � ������Ʈ�� ���޵ƴ��� Ȯ���ϰ� ���� �� Ȯ���ϰ� ���� ��, instanceof

		// object�� java.lang�� �ִ� ������Ʈ��.
		// static�� �� ���� ���θż��尡 ����ƽ�ε� ���� Ŭ�������� ���� ����� �����ҋ�
		// print objectinfo �� ���ϰ� ȣ���ϱ� ������.
		// ����ƽ �Ⱥپ������� ��ü �����ؾ� �޸� �Ҵ� �Ǳ⶧����
		// ����ƽ�� �ٿ��ߵ�.

	}

}
