package day12;
public class IntegerTest {
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("���α׷� �ƱԸ�Ʈ 2���� ���ڷ� �Է��ϼ���");
		} else {
			System.out.println(Integer.parseInt(args[0])
					 +Integer.parseInt(args[1]));
		}
		String s1 = Integer.toBinaryString(12); //�־��� �������� 2���� ���ڿ���
		String s2 = Integer.toBinaryString(88);
	    
		System.out.printf("%s\n", s1);
		System.out.printf("%s\n", s2);
		
		int num1 = Integer.parseInt(s1 ,2); // �ι�° �ƱԸ�Ʈ�� ����Ʈ�� 10������. 2�νἭ 2������ �μ�
		int num2 = Integer.parseInt(s2, 2); // ������ ���ڷ� ��ȯ�ϰٴ�.
		
		System.out.printf("%d\n", num1);
		System.out.printf("%d\n", num2);
	}
}