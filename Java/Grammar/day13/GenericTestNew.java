package day13;
import java.util.*;
public class GenericTestNew {
	public static void main(String[] args) {
		// ���׸��� ��� ������ ����Ǿ� ������� Ŭ������ ��ü ������
		// Ÿ�� �Ķ���Ͷ�� ���� ����Ѵ�. 
		LinkedList<String> list = new LinkedList<String>();  // Ÿ���Ķ����
		//���ڿ� ó���� �����ϴ� ��ũ�� ����Ʈ�� ����Ŷ�� ��.
		list.add("java");
		list.add("100");
		//list.add(100); ��Ʈ�� ��ü�� ���̳��̶� �ڼվ��� ���� ��Ʈ���� ��밡����. �����Ͻ� üũ�ؼ� �˷��ֱ⶧���� �߰��� ���α׷��� ��.
		// add�� get���� �����Ҷ��� ��Ʈ������ �˻���.
		list.add("servlet");
		list.add("jdbc");
		
		for(int i=0; i < list.size(); i++)
			System.out.println(list.get(i));
		System.out.println();		
		
		for(String value : list) {			
			System.out.println(value);
		}
		System.out.println();
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()){
			String s = iter.next();
			//String s = (String)value;	������ ����ȯ�� �ʿ����.		
			System.out.println(s);
		}
	}
}

