package threadexam;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//Rserve의 역할
//알콜로
//제이알클라이언트.
public class ThreadLab1 {

	public static void main(String[] args) throws Exception {

		Thread_01 th1 = new Thread_01();
		Thread_02 th2 = new Thread_02();
		th1.start();
		th2.start();

	
		for(int i = 0 ; i<10;i++) {
		try{
			System.out.println("number of miliseconds since January 1, 1970, 00:00:00 GMT");
			Thread.sleep(3000);
		} catch(InterruptedException e) {}
	}
	
}
}

class Thread_01 extends Thread{
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
		return formatter.format(time);
	}
}

class Thread_02 extends Thread{
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