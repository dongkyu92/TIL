package day7;
/*
 * ������ �޼��� ���� ���
 * (1) �޼������ Ŭ������� �����ؾ� �Ѵ�.
 * (2) �Ű������� �������̴�. ���� ������ �޼���� �����ε� ����
 * (3) ���ϰ��� Ÿ���� �����Ѵ�.
 * (4) ������ �޼���� �ַ� ��ü ������ �����ؾ� �ϴ� ��� �Ǵ� ��ü ������ �����͸� ���޹޾Ƽ� ����������� ���� �ʱ�ȭ �ϴ� ���.
 * �ٸ� ��Ű���� �����Ϸ��� import �ؾ� ��.
 * java.util ��Ű���� �����ϰڴ�. Java������Ʈ- util ��Ű�� -Date Ŭ����
 */
import java.util.Date;
import java.util.GregorianCalendar;// date���� ����� ����.
// import�� ��Ű�� �Ʒ� Ŭ���� ���� ��
// import ���� ��Ű��.�Լ� ��밡��
public class DateTest {

	public static void main(String[] args) {
		Date d = new Date(); // �׷����� �������� �� �Ⱦ�.
		//d.  API ���� ¦��� -  ���̻� ���� ���ƶ�. ������ ���� ���ø����̼�
		System.out.println(d.toString());
		
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.get(GregorianCalendar.DAY_OF_WEEK));
		
		gc = new GregorianCalendar(1992, 8, 9);
		System.out.println(gc.get(GregorianCalendar.DAY_OF_WEEK));
		
		

	}

}
