package day11;

// throw ���� �����߻�
// throws ��������
// try~catch~finally ����ó��
// Object�� �����ϰ��ڹ��� ���ܰ��� �ֻ��� Ŭ������ Throwable Ŭ�����̰�,
// Throwable Ŭ������ ��ӹ޴� �� �迭�� Ŭ������ Error Ŭ������ Exception Ŭ������ ����.
import java.util.Random;

class DuplicateException extends Exception {
	DuplicateException() {
		super("�ߺ��� �ζ� ��ȣ�� �߻��߽��ϴ�.");//���ܸ޼���
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

	
	// Exception e = new Exception("����");
	// throw e; //���ܸ� �߻���Ŵ
	// 1~2�� �ٿ��� throw new exception("����");
	
	
	public void checkLottoNums() throws DuplicateException //throws���� �˸��ٶ�� ��(~~������ �߻��Ҽ����ִ�)
	{
		for(int i=0; i<5; i++)
		{
			for(int j=i+1; j<5; j++) 
			{
				if (nums[i] == nums[j]) 
				{
					throw new DuplicateException(); // throw�� ������ �켱 jvm �� Ȯ���Ѵ��� catch ���� Ȯ����.
					//
					// DuplicateException e = new DuplicateException("�����ڰ� �Ű������� �޴� ������ ������ ���� ������ ����")
					// throw e;
					// ���ļ� throw new DuplicateException();
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
			// Ʈ���̱����� ������ �߻��� ������ �����Ͽ� �Ϲݱ����� �� �־ �������.
			// ������ Im.checkLottoNums(); ���� ������ �߻��Ѵٸ�
			// �� ���� �ڵ�� ������� �ʰ� catch���� ����ó��.
			
		} catch (DuplicateException e) {
			System.out.println("���� �߻� : " + e.getMessage());
			//e.printStackTrace(); �ݵ�� ���
			//e.getMessag();
			// return; �ؿ� �ִٸ� return;
		}
	}
  
}
