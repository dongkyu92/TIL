package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class HashMapLab1 {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>(5);
		Scanner sc = new Scanner(System.in);

		while (hm.size() != 5) {

			System.out.println("�����̸��� �Է��ϼ��� : ");
			String st = sc.next();

			System.out.println("�α� ���� �Է��ϼ��� : ");
			int popul = sc.nextInt();

			if (hm.containsKey(st)) {
				System.out.println("�����" + st + "�� �̹� ����Ǿ����ϴ�.");
			} else {
				hm.put(st, popul);
				System.out.println("����Ǿ����ϴ�.");
			}
			
			//sc.nextLine(); ���� �ؽ�Ʈ�������� ��.

		}
		System.out.println("5���� ��� �ԷµǾ����ϴ�.");
		
		System.out.print("�Էµ� ������ : " );
		Iterator<String> iterator = hm.keySet().iterator(); // key�� �̾Ƴ��� �޼���
		//���� ����� Ű�� Ÿ��
		
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
