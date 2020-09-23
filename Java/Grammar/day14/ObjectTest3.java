package day14;

import java.util.HashSet;

class Member3 {
	private int id;
	private String name;
	private String password;
	Member3(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}
	public boolean equals(Object o) {
		if (o != null && o instanceof Member3) {
			Member3 m = (Member3) o;			
			if (id ==  m.id && 
					name.equals(m.name) && 
							password.equals(m.password))
				return true;
			// 원래 오브젝트 클래스에 있는 이퀄스는 등가비교인데 오버라이딩하여 멤버변수를 하나씩 비교하여 동일한지 판단.
		}
		return false;
	}	
	public int hashCode() {
		return id+name.hashCode()+password.hashCode();
	}
	
	
	public String toString() {
		return "("+id+":"+name+":"+password+")";
	}//이퀄스보다 ToString 오버라이딩하는게 필수.
	// 객체의 정보를 하나의 스트링으로 출력해주는 함수.
}
public class ObjectTest3 {
	public static void main(String args[]) {
		Member3 obj1 = new Member3(10, "자바", "duke");
		Member3 obj2 = new Member3(10, "자바", "duke");
		Member3 obj3 = new Member3(20, "자바", "duke");
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());		
		System.out.println(obj3.hashCode());	
		HashSet<Member3> set = new HashSet<>();
		set.add(obj1);
		set.add(obj2);
		set.add(obj3);
		//obj1과 obj2는 동일한 해쉬값을 가지고있어서 해쉬셋에는 중복되는 obj2가 들어가지 않음.
		System.out.println("저장된 데이터의 갯수 : " + set.size());
		System.out.println(set);
	}
}




