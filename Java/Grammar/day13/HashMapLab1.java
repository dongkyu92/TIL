package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class HashMapLab1 {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>(5);
		Scanner sc = new Scanner(System.in);

		while (hm.size() != 5) {

			System.out.println("나라이름을 입력하세요 : ");
			String st = sc.next();

			System.out.println("인구 수를 입력하세요 : ");
			int popul = sc.nextInt();

			if (hm.containsKey(st)) {
				System.out.println("나라명" + st + "는 이미 저장되었습니다.");
			} else {
				hm.put(st, popul);
				System.out.println("저장되었습니다.");
			}
			
			//sc.nextLine(); 위에 넥스트라인했을 때.

		}
		System.out.println("5개가 모두 입력되었습니다.");
		
		System.out.print("입력된 데이터 : " );
		Iterator<String> iterator = hm.keySet().iterator(); // key만 뽑아내는 메서드
		//지금 사용할 키의 타입
		
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.print(iterator.hasNext()?str+"("+hm.get(str)+")"+", " : str+"("+hm.get(str)+")");
		}
		/*
		 while(true)
		 key=it.next();
		 value = hmap.get(key);
		 System.out.printf("%s(%d)",key,value);
		 if(it.hasNext)) System.out.print(", ");
		 else break;	
		 }
		 sc.close;
		 */

	}
}
