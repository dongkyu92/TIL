package day13;
import java.util.*;
public class SetExample1 {
    public static void main(String args[]) {
        HashSet<String> set = new HashSet<String>();
        System.out.println(set.add("자바")); // true
        System.out.println(set.add("카푸치노")); // true
        System.out.println(set.add("에스프레소")); // true
        System.out.println(set.add("자바")); //이미 들어가있는 애가 새로운 애랑 똑같으면 false
        System.out.println("저장된 데이터의 수 = " + set.size());
        
        Iterator<String> iterator = set.iterator(); //나오는 순서가 상관없음.
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }
        System.out.println(set);
    }
}
