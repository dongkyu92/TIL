package day14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.GregorianCalendar;

public class FileOutExam {

	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar(2019, 11, 20);
		GregorianCalendar gcbirth = new GregorianCalendar(1992, 8, 9);
		/*
		 System.out.printf("%tY\n",gc);
		 System.out.printf("%ty\n",gc);
		 System.out.printf("%tm\n",gc);
		 System.out.printf("%tb\n",gc);
		 System.out.printf("%tH\n",gc);
		 System.out.printf("%tM\n",gc);
		 System.out.printf("%tS\n",gc);
		 System.out.printf("%tA\n",gc);
		 System.out.printf("%ta\n",gc);
		 */
		String path = "C:/iotest"; // ��θ� ��Ʈ�� ������ ����
		File isDir = new File(path); // �������翩�� ȭ��
		if (!isDir.exists()) {
			isDir.mkdirs();
		}

		try (FileWriter writer = new FileWriter("c:/iotest/today.txt");) {
			writer.write("������");
			writer.write(Integer.toString(gc.get(GregorianCalendar.YEAR)) + "�� "
					+ Integer.toString(gc.get(GregorianCalendar.MONTH) + 1) + "�� "
					+ Integer.toString(gc.get(GregorianCalendar.DATE)) + "�� �Դϴ�.");
			writer.write('\n');
			writer.write("������ ");
			writer.write(getDay(gc));
			writer.write("�Դϴ�.");
			writer.write('\n');
			writer.write("xxx �� ");
			writer.write(Character.toString(getDayofMonth(gcbirth)));
			writer.write("���Ͽ� �¾���ϴ�.");
			
			

			



			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		} catch (IOException ioe) {
			System.out.println("���Ͽ� �����ϴ� ���� ������ �߻��߽��ϴ�.");
		}

	}

	public static String getDay(GregorianCalendar gc) {
		String date = null;
		switch (gc.get(GregorianCalendar.DAY_OF_WEEK)) {
		case 2:
			date = "������";
			break;
		case 3:
			date = "ȭ����";
			break;
		case 4:
			date = "������";
			break;
		case 5:
			date = "�����";
			break;
		case 6:
			date = "�ݿ���";
			break;
		case 7:
			date = "�����";
			break;
		case 1:
			date = "�Ͽ���";
			break;
		default:
			break;
		}
		return date;
	}

	public static char getDayofMonth(GregorianCalendar gcbirth) {
		char day = ' ';
		switch (gcbirth.get(GregorianCalendar.DAY_OF_WEEK)) {
		case 2:
			day = '��';
			break;
		case 3:
			day = 'ȭ';
			break;
		case 4:
			day = '��';
			break;
		case 5:
			day = '��';
			break;
		case 6:
			day = '��';
			break;
		case 7:
			day = '��';
			break;
		case 1:
			day = '��';
			break;
		default:
			break;
		}
		return day;
	}
}
