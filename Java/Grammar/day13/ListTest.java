package day13;

import java.util.ArrayList;

class CreateList{
	public ArrayList<Integer> convertList(int array[]){
		

	
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = array.length-1; i>=0 ;i--)
			al.add(array[i]);
		
		return al;
		
	}
}
public class ListTest {

	public static void main(String[] args) {
		int array[] = {3, 4, 2, 5, 2, 3, 6, 7, 5, 7, 9};
		CreateList cl = new CreateList();
		cl.convertList(array);
		for(int i= 0 ;i<cl.convertList(array).size();i++)
			System.out.println(cl.convertList(array).get(i));
		//cl.convertList(array) �޾Ƽ� �ѹ��� ȣ���ϴ°� ����
		//���� ��������
/*
 ArrayList<Integer> alist = new CreateList().convertList(array);
 //�ѹ��� ȣ���� �� �̷������� ¥�� ��.
 �� �ڵ�� 2���̻� ȣ���ҋ�
 Iterator<Integer> it = alist.iterator();
 while(it.hasNext()){
 	System.out.println(it.next());
 }
 
 
 
 */
	}

}
