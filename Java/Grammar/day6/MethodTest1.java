package day6;
/*
 * [�޼��带 �����ϴ� ���]
- �޼���� : (1) �ҹ��ڷ� �����ϰ� ���ο� ���� ����� ù ���ڸ� �빮�ڷ�
	   (2) �ĺ���(���) ��Ģ ����
	   (3) ����� ����
- �޼��� ȣ�� �� ���޹��� �������� ������ ����
	�� : �� ��, � Ÿ�� ---------> �Ű� ���� ����
- ȣ��� �Ŀ� ȣ���� ������ ���� �� �������� ���θ� ���� -- ���ϰ�
  return �̶�� ������ ����Ѵ�.


 [������]  �޼����� ���----> ���ϰ���Ÿ�� �޼����([�Ű����� ����]){

�޼����� �ٵ�(��������; ���� ����....)
[return ���ϰ�;]
}


[�޼��带 ����ϴ� ��� - ȣ��]
(1) ���
(2) ���
    - �޼����
    - ȣ��� ������ ������(�ƱԸ�Ʈ)�� ����, (�޴� ������ �Ű�����)
    - ���ϰ��� ������ ���� ���ϰ��� ���

       ���� = ��
       result = system.out.println();
       rand = math.random();
 */
public class MethodTest1 {

	
	
	public static void main(String[] args) {
		System.out.println("main() �������");
		printMyName();
		System.out.println(1);
		printMyName();
		System.out.println(2);
		printMyName();
		System.out.println(3);
		System.out.println("main() ��������");
	}
	
	
	
	
	 static void printMyName() {
	System.out.println("�赿��");
	return;
	}
	
	
	
	

}
