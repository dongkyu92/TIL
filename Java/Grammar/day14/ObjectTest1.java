package day14;

class Member1 {
	private int id;
	private String name;
	private String password;

	Member1(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}
	//hashCode, equals 오버라이딩 안함.
}

public class ObjectTest1 {
	public static void main(String args[]) {
		Member1 obj1 = new Member1(10, "자바", "duke");
		Member1 obj2 = new Member1(10, "자바", "duke");

		System.out.println(obj1.equals(obj2)); //f
		System.out.println(obj1 == obj2); // f
		//equals와 등가연산의 결과
		//둘다 false
		//참조값이 각각 만들어짐.
		
		Member1 obj3 = obj2;
		System.out.println(obj3.equals(obj2)); //t
		System.out.println(obj3 == obj2); //t
		
		//obj3는 obj2와 똑같은 참조값 동일한 객체를 둘다 참고함.
	}
}
