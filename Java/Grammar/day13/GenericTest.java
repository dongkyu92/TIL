package day13;
import java.util.*;
public class GenericTest {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("java");
		list.add("100");
		//list.add(100); ������ ���� �ȳ�. ���ʸ� ������ �����߱� ������ �ڵ����� ������.
		//��ũ�帮��Ʈ �������� ���ʸ� �����ϰԲ� ����Ǿ�����.
		//���󿡼� �ڼ����� ���� ����ȯ�� �� �ִµ� Integer�� String�� ���� �ڼ� ���谡 �ƴϱ⶧���� ����� ���ܹ߻�.
		list.add("servlet");
		list.add("jdbc");
		// �ݷ��� ����Ʈ���� ����Ǵ� ������ ������ ������ ����.
		// �� �� ��ũ�� ����Ʈ�� String, int ���� �����ϰڴ�. <String>...
		// <> ��� ���߱� ������ Object�� �ڵ� �ν�.
		
		for(int i=0; i < list.size(); i++)
			System.out.println(list.get(i));
		System.out.println();		
		// �ڷḦ ������ ù��° ���
		// �ӵ� ������� ������ ���� �� ��� ����
		
		
		for(Object value : list) { // list ��ü�� ���� �� ���ʸ��� ���� �����༭ �ڵ������� ������Ʈ Ÿ������ �����
			// ���� Object -> LinkedList�� String value�� �ϸ� ������.
			String s = (String)value;	
			//Integer �� String���� ����ȯ �ȵǱ� ������ ���ܳ�.
			System.out.println(s);
		}
		// �ڷḦ ������ �ι�° ���
		// �ӵ��� �������.
		System.out.println();		
		
		
		Iterator iter = list.iterator();
		while(iter.hasNext()){
			Object value = iter.next();
			String s = (String)value;		
			System.out.println(s);
		}
		// �ڷḦ ������ ����° ���
		// �԰�ȭ�� �����
		// Iterator�� �������̽���.
		// Iterator�� �ݷ��� ��ü�� ������ �Ƶ�, �� �ȿ� �ִ� �����͸� �ϳ��� ������ ���� �Ծ��� �������̽���.
		// �����°� next(), üũ�ϴ°Ŵ� hasNext(boolean��)
		
		
	}
}
