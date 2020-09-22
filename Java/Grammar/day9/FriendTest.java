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

	public String getInfo() { // public 제거 불가 조상의 접근제어자를 축소 시킬 수 없다.
		return super.getInfo() + "\t" + this.phoneNum + "\t" + this.email;
	}
}

public class FriendTest {

	public static void main(String[] args) {
		Friend f[] = new Friend[5];
		f[0] = new Friend("고길동", "01011112222", "gildong@naver.com");
		f[1] = new Friend("둘리", "01022223333", "22@naver.com");
		f[2] = new Friend("또치", "01044445555", "ddochi@naver.com");
		f[3] = new Friend("도우너", "01066667777", "rednose@naver.com");
		f[4] = new Friend("마이콜", "01088889999", "michael@naver.com");

		System.out.println(f[0].getInfo());
		System.out.println(f[1].getInfo());
		System.out.println(f[2].getInfo());
		System.out.println(f[3].getInfo());
		System.out.println(f[4].getInfo());

	}

}
