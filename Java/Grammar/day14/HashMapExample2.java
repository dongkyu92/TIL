package day14;
import java.util.*;
class HashMapExample2 {
    @SuppressWarnings("deprecation")
	public static void main(String args[]) {
        HashMap<Name, Integer> hm = 
                                new HashMap<Name, Integer>();
        hm.put(new Name("�ظ�", "����"), new Integer(95));
        hm.put(new Name("�츣�̿´�", "�׷�����"),new Integer(100));
        hm.put(new Name("��", "����"), new Integer(85));
        hm.put(new Name("�巹����", "������"), new Integer(93));
        hm.put(new Name("�׺�", "�չ���"), new Integer(70));
        hm.put(new Name("�츣�̿´�", "�׷�����"), new Integer(55));
        //�츣�̿´��� �ΰ��� ����, 2°�� ������ ��ü�� �����ϴٰ� �Ǵܾ���.
        //�������� �ִ� �ؽ��ڵ�(��������)�� ȣ���ϱ� ������..
        //�ٸ� ��ü�� �ν�.
        System.out.println(hm);
    }
}
