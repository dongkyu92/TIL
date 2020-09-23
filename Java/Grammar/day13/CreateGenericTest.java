package day13;
import java.util.Date;
public class CreateGenericTest {
	public static void main(String[] args) {
		Value1 o1 = new Value1();
		o1.put("abc");
		String s1 = o1.get(); 
		//get(0...) ���°���� ������ ���� �� ����.
		System.out.println(s1);		
		
		Value2 o2 = new Value2();
		o2.put("abc");
		String s2 = (String)o2.get(); 
		System.out.println(s2);
		
		Value3<String> o3 = new Value3<>();		//������ �ڿ� �� �����? java8 ���ʹ� ���ȣ�� �൵ �ǵ��Ϻ���.
		//�������� ���� �� �� �ֱ⶧���� �ٲ�...
		o3.put("abc");
		String s3 = o3.get();
		//String s3 = (String)o3.get();  ���ϰ��� ������ String�̶� �����ص� �ǰ� �ᵵ �����ȳ�.
		System.out.println(s3);	
		
		Value3<Date> o4 = new Value3<Date>();		
		o4.put(new Date());
		//o4.put("abc"); //������ �ֳĸ� Date���� �ִ°� �ƴϱ⶧����.
		Date s4 = o4.get(); 
		System.out.println(s4);	
		// �Ű�����, ���ϰ� �� Date����.
	}
}


class Value1 {
	String obj;
	void put(String obj){
		this.obj = obj;
	}
	String get() {
		return obj;
	}
}
// ��Ʈ������ ���̳��̶� Value1 ��ü ������
// ������ ��Ʈ���� ���� �� ����.

class Value2 {
	Object obj;
	void put(Object obj){
		this.obj = obj;
	}
	Object get() {
		return obj;
	}
}
// 1�� ���ؼ� Ÿ�Ը� �޶���.
// ��Ʈ�����ۿ� ���� ����. ��Ʈ���� ����, �ϵ� ����� ����. �⺻���� ����(rapper�� �ڵ� ��ȯ)
// �������� ������µ� ������ ����ȯ�ؾߵ�.
// ������ ����Ʈ �� ������ �����ž� �ϸ� ����ȯ�ؾߵ�.


// Value3<Card> v = new Value3<Card>();
// ��ü ������ <Card>���ϸ� TT�� Card�� �ٲ�!!!!!!!!!!!!!!
// String���� �� �� TT�� String���� �ٲ�.!!!!!!

// Value3<String> v = new Value3<String>();

class Value3<TT> {
	// class Value3<TT, SS,ZZ > ���� 
	TT obj;
	void put(TT obj){
		this.obj = obj;
	}
	TT get() {
		return obj;
	}
}
// ���� �ѱ��ڷ� <K,V>, (key,value) T �� �ѱ��ڷ� ��.

// ���� ��ȸ�� �ִ°��� �ǹ̾��ٴ� ��.
// Ŭ���� �ڿ� ������ ��ü������ Ÿ���Ķ���͸� �ϳ� �����ž߶�� ��.
// Ÿ���Ķ���͸� ���ٰ� ������ ������ ������.
//Value3<Card> v = new Value3<Card>();
//��ü ������ <Card>���ϸ� TT�� Card�� �ٲ�!!!!!!!!!!!!!!
//String���� �� �� TT�� String���� �ٲ�.!!!!!!

//Ŭ���� Ÿ���� Ŭ������ ����½����� �ƴ϶� ��ü�� ���� ������ ���ϰڴٴ� ��ޱ���.
// ��ü Ÿ���� �Ϲ�ȭ ��Ű�ڴ�. �Ϲ�ȭ generic
// ������ LinkedList<E> �� �Ǿ��ֱ� ������ ��ü ������ Ÿ���� ���� �� �ִ°���.









