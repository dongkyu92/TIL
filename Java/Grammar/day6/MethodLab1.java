package day6;

class MethodLab1 {

	public static void main(String[] args) {
		getStudentCode('@',3);
		getStudentCode('%',4);
		getStudentCode('A',5);
		getStudentCode('°¡',3);
	}
	
	
	
	static void getStudentCode(char ch, int num) {
		
		for(int i =0 ; i<num; i++)
			System.out.print(ch);
		System.out.println();
	}
}
