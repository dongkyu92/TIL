package threadexam;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//Rserve의 역할
//알콜로
//제이알클라이언트.
public class ThreadLab2 {

	public static void main(String[] args) throws Exception {
		
		Runnable t3 = new Thread_03(); // 쓰레드의 기능을 제공하는 객체라
		Thread th3 = new Thread(t3); //아규먼트로 런어블객체를 주는 이유.
		Runnable t4 = new Thread_04();
		Thread th4 = new Thread(t4);
		th3.start();
		th4.start();

		for(int i = 0 ; i<10;i++) {
		try{
			System.out.println("number of miliseconds since January 1, 1970, 00:00:00 GMT");
			Thread.sleep(3000);
		} catch(InterruptedException e) {}
	}
	
}
}

class Thread_03 implements Runnable{
	public void run() {
		for(int i=0; i<3;i++) {
		try{
			System.out.println(timeToStrDate(new Date().getTime()));
			Thread.sleep(10000);
		} catch(InterruptedException e) {}
	}
	}
	public static String timeToStrDate(long time) {
		DateFormat formatter = 
				new SimpleDateFormat("오늘은 MM월 dd일 입니다.");
		// DataFormat이 부모임.
		// LocalTime.now().getHour()로 해도 됨.
		return formatter.format(time);
	}
}

class Thread_04  implements Runnable{
	public void run() {
		for(int i=0; i<5;i++) {
		try{
			System.out.println(timeToStrDate(new Date().getTime()));
			Thread.sleep(5000);
		} catch(InterruptedException e) {}
		
	}
	}
	public static String timeToStrDate(long time) {
		DateFormat formatter = 
				new SimpleDateFormat("hh시 m분 s초");
		// DataFormat이 부모임.
		return formatter.format(time);
	}
}
