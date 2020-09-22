package day7;

class StudentNew {
	String name;
	int age;
	String subject;
	
	StudentNew(String p1, int p2, String p3){ // void 나 int 등 리턴값 넣으면 일반 메서드 됨.
		name = p1;
		age = p2;
		subject = p3;
	}
	StudentNew(){}

	void printStudentInfo() {
		System.out.println(name + "학생은 나이가 " + age + "입니다.");
	}

	void study() {
		System.out.println(name + "학생은 " + subject + "과목을 학습합니다.");
	}

	void study(int hour) {
		System.out.println(name + "학생은 " + subject + "과목을" + hour + "시간 동안 학습합니다.");
	}
}

public class StudentTest2 {

	public static void main(String[] args) {
		StudentNew st1 = new StudentNew();
		System.out.println(st1);
		st1.study(2);

	}

}
