package day6;
/*
 * char 는 케릭터형으로 매개변수 전달.
 */
public class MethodTest3{

	
	
	public static void main(String[] args) {
		System.out.println("main() 수행시작");
		printMyName(1,'#');
		System.out.println("---------------------");
		printMyName(3,'*');
		System.out.println("---------------------");
		printMyName(2,'@');
		System.out.println("---------------------");
		System.out.println("main() 수행종료");
	}
	
	
	
	static void printMyName(int num, char deco) {
		
		for(int i=1; i<=num;i++) {
			System.out.println(deco+"김동규"+deco);
		}
	
	

}
}
