package day13;

import java.util.Iterator;
import java.util.LinkedList;
//control+shift+o 명령어쓰면 필요한 클래스 자동으로 임포트해줌.
//import java.util.*;
//패키지명을 대신해서 *기호는 불가.
// 클래스나 인터페이스를 대신해서는 쓸 수 있음.


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

public class FriendTestLinkedList {

	public static void main(String[] args) {
		LinkedList<Friend> flist = new LinkedList<Friend>();
		//LinkedList<Friend> f[] = new LinkedList<Friend>(); []하면에러남
		//ArrayList도 마찬가지
		Friend f1[] = new Friend[5];
		f1[0] = new Friend("고길동", "01011112222", "gildong@naver.com");
		f1[1] = new Friend("둘리", "01022223333", "22@naver.com");
		f1[2] = new Friend("또치", "01044445555", "ddochi@naver.com");
		f1[3] = new Friend("도우너", "01066667777", "rednose@naver.com");
		f1[4] = new Friend("마이콜", "01088889999", "michael@naver.com");
		/*
		 *  
		 *  flist.add(new Friend("고길동", "01011112222", "gildong@naver.com"));
		 flist.add(new Friend("둘리", "01022223333", "22@naver.com");
		 flist.add(new Friend("또치", "01044445555", "ddochi@naver.com");
		 flist.add(new Friend("도우너", "01066667777", "rednose@naver.com");
		 flist.add(new Friend("마이콜", "01088889999", "michael@naver.com");
		 */
		
		for(int i = 0; i<f1.length;i++)
			flist.add(f1[i]);
		
		for(int i = 0; i<f1.length;i++)
			System.out.println(flist.get(i).getInfo());
		System.out.println();
		
		for(Friend value : flist) { // list 객체를 만들 때 제너릭을 선언 안해줘서 자동적으로 오브젝트 타입으로 선언됨
			// 따라서 Object -> LinkedList나 String value로 하면 에러남.
			//Integer 는 String으로 형변환 안되기 때문에 예외남.
			System.out.println(value.getInfo());
		}
		// 자료를 꺼내는 두번째 방법
		// 속도가 가장빠름.
		System.out.println();		
		
		
		/*
		 * Iterator<Friend> iter = flist.iterator();
		 * 	while(iter.hasNext()){
			Friend value =  iter.next();		
			System.out.println(value.getInfo());
		 */
		Iterator iter = flist.iterator();
		while(iter.hasNext()){
			Friend value = (Friend) iter.next();		
			System.out.println(value.getInfo());

	}
	}
}

