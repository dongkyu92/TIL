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
		String path = "C:/iotest"; // 경로를 스트링 변수에 저장
		File isDir = new File(path); // 파일존재여부 화긴
		if (!isDir.exists()) {
			isDir.mkdirs();
		}

		try (FileWriter writer = new FileWriter("c:/iotest/today.txt");) {
			writer.write("오늘은");
			writer.write(Integer.toString(gc.get(GregorianCalendar.YEAR)) + "년 "
					+ Integer.toString(gc.get(GregorianCalendar.MONTH) + 1) + "월 "
					+ Integer.toString(gc.get(GregorianCalendar.DATE)) + "일 입니다.");
			writer.write('\n');
			writer.write("오늘은 ");
			writer.write(getDay(gc));
			writer.write("입니다.");
			writer.write('\n');
			writer.write("xxx 는 ");
			writer.write(Character.toString(getDayofMonth(gcbirth)));
			writer.write("요일에 태어났습니다.");
			
			

			



			System.out.println("저장이 완료되었습니다.");
		} catch (IOException ioe) {
			System.out.println("파일에 저장하는 동안 오류가 발생했습니다.");
		}

	}

	public static String getDay(GregorianCalendar gc) {
		String date = null;
		switch (gc.get(GregorianCalendar.DAY_OF_WEEK)) {
		case 2:
			date = "월요일";
			break;
		case 3:
			date = "화요일";
			break;
		case 4:
			date = "수요일";
			break;
		case 5:
			date = "목요일";
			break;
		case 6:
			date = "금요일";
			break;
		case 7:
			date = "토요일";
			break;
		case 1:
			date = "일요일";
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
			day = '월';
			break;
		case 3:
			day = '화';
			break;
		case 4:
			day = '수';
			break;
		case 5:
			day = '목';
			break;
		case 6:
			day = '금';
			break;
		case 7:
			day = '토';
			break;
		case 1:
			day = '일';
			break;
		default:
			break;
		}
		return day;
	}
}
