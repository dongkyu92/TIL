package day7;

class StudentNew2{
	String name;
	int age;
	String subject;
	StudentNew2(String p1, int p2){
		name = p1;
		age =p2;
		subject = "�ڹ�";
	}
	
	StudentNew2(String p1, int p2, String p3){ // void �� int �� ���ϰ� ������ �Ϲ� �޼��� ��.
		name = p1;
		age = p2;
		subject = p3;
	}
	StudentNew2(){}

	void printStudentInfo() {
		System.out.println(name + "�л��� ���̰� " + age + "�Դϴ�.");
	}

	void study() {
		System.out.println(name + "�л��� " + subject + "������ �н��մϴ�.");
	}

	void study(int hour) {
		System.out.println(name + "�л��� " + subject + "������" + hour + "�ð� ���� �н��մϴ�.");
	}
}

public class StudentTest3 {

	public static void main(String[] args) {
		StudentNew st1 = new StudentNew();
		System.out.println(st1);
		st1.study(2);

	}

}
