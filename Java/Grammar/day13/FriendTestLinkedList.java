package day13;

import java.util.Iterator;
import java.util.LinkedList;
//control+shift+o ��ɾ�� �ʿ��� Ŭ���� �ڵ����� ����Ʈ����.
//import java.util.*;
//��Ű������ ����ؼ� *��ȣ�� �Ұ�.
// Ŭ������ �������̽��� ����ؼ��� �� �� ����.


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

	public String getInfo() { // public ���� �Ұ� ������ ���������ڸ� ��� ��ų �� ����.
		return super.getInfo() + "\t" + this.phoneNum + "\t" + this.email;
	}
}

public class FriendTestLinkedList {

	public static void main(String[] args) {
		LinkedList<Friend> flist = new LinkedList<Friend>();
		//LinkedList<Friend> f[] = new LinkedList<Friend>(); []�ϸ鿡����
		//ArrayList�� ��������
		Friend f1[] = new Friend[5];
		f1[0] = new Friend("��浿", "01011112222", "gildong@naver.com");
		f1[1] = new Friend("�Ѹ�", "01022223333", "22@naver.com");
		f1[2] = new Friend("��ġ", "01044445555", "ddochi@naver.com");
		f1[3] = new Friend("�����", "01066667777", "rednose@naver.com");
		f1[4] = new Friend("������", "01088889999", "michael@naver.com");
		/*
		 *  
		 *  flist.add(new Friend("��浿", "01011112222", "gildong@naver.com"));
		 flist.add(new Friend("�Ѹ�", "01022223333", "22@naver.com");
		 flist.add(new Friend("��ġ", "01044445555", "ddochi@naver.com");
		 flist.add(new Friend("�����", "01066667777", "rednose@naver.com");
		 flist.add(new Friend("������", "01088889999", "michael@naver.com");
		 */
		
		for(int i = 0; i<f1.length;i++)
			flist.add(f1[i]);
		
		for(int i = 0; i<f1.length;i++)
			System.out.println(flist.get(i).getInfo());
		System.out.println();
		
		for(Friend value : flist) { // list ��ü�� ���� �� ���ʸ��� ���� �����༭ �ڵ������� ������Ʈ Ÿ������ �����
			// ���� Object -> LinkedList�� String value�� �ϸ� ������.
			//Integer �� String���� ����ȯ �ȵǱ� ������ ���ܳ�.
			System.out.println(value.getInfo());
		}
		// �ڷḦ ������ �ι�° ���
		// �ӵ��� �������.
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

