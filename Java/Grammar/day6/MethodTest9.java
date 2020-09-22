package day6;

public class MethodTest9 {
	public static void main(String[] args) {
		int size = MethodLab3.getRandom(3, 8);  // 3~8 사이의 랜덤 변수생성
		int p[] = new int[size]; // 생성된 랜덤 변수 만큼의 크기의 p 배열 생성
		for (int i = 0; i < p.length; i++)
			p[i] = MethodLab3.getRandom(20); // p배열 크기만큼 포문 돌려서 배열에 1~20 범위의 랜덤 변수 할당
		for (int data : p)
			System.out.print(data + " "); // p배열 꺼내서 출력
		System.out.println();
		boolean flag[] = isEven(p); // p가 짝수인지 확인 flag에는 0, 1 여부 저장
		for (boolean data : flag)
			System.out.print(data ? "짝수":"홀수" + " "); // data == true ? 도 되지만 boolean 형은 data만 써도 됨.
		System.out.println();
	}

	// 전달된 배열의 요소값들을 각각 체크하여
	// 짝수면 true 홀수면 false를 저장하는 boolean 타입 배열을 리턴한다.
	// 이때 전달된 배열의 크기와 동일한 크기의 boolean 타입의 배열을 생성해서 리턴
	static boolean[] isEven(int[] p) {
		boolean[] result = new boolean[p.length];
		// for(int data : p)// p 를 하나하나 꺼내서 data에 담음 -> 일반 for문으로 하는게 나음 data에서 또 다시
		// 저장해야기 때문
		for (int i = 0; i < p.length; i++)
			result[i] = p[i] % 2 == 0 ? true : false;
		return result;

	}
}
