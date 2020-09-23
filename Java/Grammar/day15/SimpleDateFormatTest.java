package day15;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

	public static String timeToStrDate(long time) {
		DateFormat formatter = 
				new SimpleDateFormat("yyyy-MM-dd");
		// DataFormat이 부모임.
		return formatter.format(time);
	}

	public static Date parseStrDate(String strDate) throws ParseException {
		DateFormat formatter = 
				new SimpleDateFormat("yyyy년 MM월 dd일");
		return formatter.parse(strDate);
		//파싱이란 데이터를 읽어가면서 포맷하는것.
	}
	

	public static void main(String[] args) throws ParseException {
		System.out.println(timeToStrDate(new Date().getTime()));
		System.out.println(parseStrDate("2019년 12월 25일")); 		
	}
}



// 심플 데이터 포맷은 프로젝트할 때 필요함.