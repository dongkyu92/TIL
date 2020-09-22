package day7;

public class MethodTest10 {
	public static void main(String[] args) {
		int p1[] = {20, 10, 14, 30};
		System.out.println("p1 변수의 값: "+p1);
		printArray(p1);
		int[] result = updateArray1(p1);
		printArray(result);
		printArray(p1); // 자주사용되는 코드를 함수화 시켜서 필요할 때마다 호출.
		System.out.println("-----------------");
		updateArray2(p1);
		printArray(p1);
	}
	
	static void printArray(int[] p2) {
		
		for(int data: p2) 
			System.out.printf("%d ", data); // 포맷문자
		System.out.printf("\n");
		
	}
	static int[] updateArray1(int[] p2){
		System.out.println("p2 변수의 값: "+p2);
		int result[] = new int[p2.length]; // 크기가 제로인 배열은 안만듬 (자바에서
														// 자바스크립트에서는 배열 크기 늘리고 줄일 수 있음.
		for(int i=0; i < result.length;i++)
			result[i] = p2[i] * 2;
		return result;
		// 리턴값이 있던 없던
		//매개변수 여부로 함수 중복여부 결정.
	}
	
	
	static void updateArray2(int[] p3){ 
		System.out.println("p3 변수의 값: "+p3);
		for(int i =0; i< p3.length;i++)
			p3[i] = p3[i]*2;
		
	}
}
