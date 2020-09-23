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
		//cl.convertList(array) 받아서 한번에 호출하는게 좋음
		//포문 쓰지말고
/*
 ArrayList<Integer> alist = new CreateList().convertList(array);
 //한번만 호출할 때 이런식으로 짜도 됨.
 내 코드는 2번이상 호출할떄
 Iterator<Integer> it = alist.iterator();
 while(it.hasNext()){
 	System.out.println(it.next());
 }
 
 
 
 */
	}

}
