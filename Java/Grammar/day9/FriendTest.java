package day9;

class Person {
	private String name;

	Person(String name) {
		this.name = name;
	}

	public String getInfo() {

		return this.name;
	}
}

class Friend extends Person {
	private String phoneNum;
	private String email;

	Friend(String name, String phoneNum, String email) {
		super(name);
		this.email = email;
		this.phoneNum = phoneNum;
	}

	public String getInfo() { // public ���� �Ұ� ������ ���������ڸ� ��� ��ų �� ����.
		return super.getInfo() + "\t" + this.phoneNum + "\t" + this.email;
	}
}

public class FriendTest {

	public static void main(String[] args) {
		Friend f[] = new Friend[5];
		f[0] = new Friend("��浿", "01011112222", "gildong@naver.com");
		f[1] = new Friend("�Ѹ�", "01022223333", "22@naver.com");
		f[2] = new Friend("��ġ", "01044445555", "ddochi@naver.com");
		f[3] = new Friend("�����", "01066667777", "rednose@naver.com");
		f[4] = new Friend("������", "01088889999", "michael@naver.com");

		System.out.println(f[0].getInfo());
		System.out.println(f[1].getInfo());
		System.out.println(f[2].getInfo());
		System.out.println(f[3].getInfo());
		System.out.println(f[4].getInfo());

	}

}
