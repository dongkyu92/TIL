package day13;
import java.util.*;
public class SetExample1 {
    public static void main(String args[]) {
        HashSet<String> set = new HashSet<String>();
        System.out.println(set.add("�ڹ�")); // true
        System.out.println(set.add("īǪġ��")); // true
        System.out.println(set.add("����������")); // true
        System.out.println(set.add("�ڹ�")); //�̹� ���ִ� �ְ� ���ο� �ֶ� �Ȱ����� false
        System.out.println("����� �������� �� = " + set.size());
        
        Iterator<String> iterator = set.iterator(); //������ ������ �������.
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }
        System.out.println(set);
    }
}
