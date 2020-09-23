package day11;

// throw 예외 강제발생
// throws 예외전가
// try~catch~finally 예외처리
// Object를 제외하고자바의 예외관련 최상위 클래스는 Throwable 클래스이고,
// Throwable 클래스를 상속받는 두 계열의 클래스로 Error 클래스와 Exception 클래스가 있음.
import java.util.Random;

class DuplicateException extends Exception {
	DuplicateException() {
		super("중복된 로또 번호가 발생했습니다.");//예외메세지
	}
}

class LottoMachine {
	private int nums[];

	LottoMachine() {
		nums = new int[6];
	}

	public void createLottoNums() {
		Random ran = new Random();
		for (int i = 0; i < 6; i++)
			nums[i] = ran.nextInt(20) + 1;
	}

	
	// Exception e = new Exception("고의");
	// throw e; //예외를 발생시킴
	// 1~2줄 줄여서 throw new exception("고의");
	
	
	public void checkLottoNums() throws DuplicateException //throws절은 알린다라는 뜻(~~에러가 발생할수도있다)
	{
		for(int i=0; i<5; i++)
		{
			for(int j=i+1; j<5; j++) 
			{
				if (nums[i] == nums[j]) 
				{
					throw new DuplicateException(); // throw가 던지면 우선 jvm 이 확인한다음 catch 블럭을 확인함.
					//
					// DuplicateException e = new DuplicateException("생성자가 매개변수로 받는 공간이 있으면 쓰고 없으면 생략")
					// throw e;
					// 합쳐서 throw new DuplicateException();
				} 
			}
		}
		for (int k = 0; k < nums.length; k++)
		{
			System.out.print(k == nums.length-1 ? nums[k] : nums[k] + ", ");
		}
	}

	public int[] getNums() {
		return nums;
	}
}
public class LottoGame {
	public static void main(String[] args) {
		LottoMachine lm = new LottoMachine();

		lm.createLottoNums();
		try {
			lm.checkLottoNums();
			// 트라이구문은 오류를 발생할 구문을 포함하여 일반구문을 다 넣어도 상관없음.
			// 하지만 Im.checkLottoNums(); 에서 오류가 발생한다면
			// 그 다음 코드는 수행되지 않고 catch에서 예외처리.
			
		} catch (DuplicateException e) {
			System.out.println("오류 발생 : " + e.getMessage());
			//e.printStackTrace(); 반드시 기억
			//e.getMessag();
			// return; 밑에 있다면 return;
		}
	}
  
}
