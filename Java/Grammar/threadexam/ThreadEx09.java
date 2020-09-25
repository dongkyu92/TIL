package threadexam;
 class ThreadEx09 implements Runnable  {
	static boolean autoSave = false;

	public static void main(String[] args) {
		Thread t = new Thread(new ThreadEx09());
		t.setDaemon(true);		// 이 부분이 없으면 종료되지 않는다.
		// 데몬스레드가 아니라 일반스레가되면 메인스레드는무조건 기다리기때문에 안끝난다.
		// 20이되면 메인스레드는 수행할거없음
		// 데몬스레드는 무한루프여도 프로세스상에 기동되는 스레드가 없어도 자동으로 죽는다.
		// 내부적으로 다른 스레드를 서포트할 때set Daemon (true)로 처리한다.
		// 기동하기 전이다.
		t.start();

		for(int i=1; i <= 20; i++) {			
			try{
				Thread.sleep(1500);
			} catch(InterruptedException e) {}
			System.out.println(i);
			
			if(i==5)
				autoSave = true;
		}// 1.5초에 한 번 출력함.

		System.out.println("프로그램을 종료합니다.");
	}

	public void run() {
		while(true) {
			try { 
				Thread.sleep(3 * 1000);	// 3초마다
			} catch(InterruptedException e) {}	

			// autoSave의 값이 true이면 autoSave()를 호출한다.
			if(autoSave) {
				autoSave();
			}
		}
	}

	public void autoSave() {
		System.out.println("작업파일이 자동저장되었습니다.");
	}
}
