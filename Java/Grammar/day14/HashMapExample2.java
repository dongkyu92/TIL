package day14;
import java.util.*;
class HashMapExample2 {
    @SuppressWarnings("deprecation")
	public static void main(String args[]) {
        HashMap<Name, Integer> hm = 
                                new HashMap<Name, Integer>();
        hm.put(new Name("해리", "포터"), new Integer(95));
        hm.put(new Name("헤르미온느", "그레인져"),new Integer(100));
        hm.put(new Name("론", "위즐리"), new Integer(85));
        hm.put(new Name("드레이코", "말포이"), new Integer(93));
        hm.put(new Name("네빌", "롱버텀"), new Integer(70));
        hm.put(new Name("헤르미온느", "그레인져"), new Integer(55));
        //헤르미온느가 두개인 이유, 2째와 마지막 객체는 동일하다고 판단안함.
        //오브젝에 있는 해쉬코드(참조값비교)를 호출하기 때문에..
        //다른 객체로 인식.
        System.out.println(hm);
    }
}
