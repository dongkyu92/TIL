package day12;
public class StringTest {
	public static void main(String[] args) {
		System.out.println("1".length());    				
		System.out.println("������".length()); 					
		System.out.println("abc".charAt(1)); // �ɸ��� at (�־��� ���ڿ����� n��° ���ڸ� �̾Ƴ��� �Լ�)
		System.out.println("abc".toUpperCase());	 //ABC�� ���ο� ��Ʈ����ü�� �������. �ѹ�������� ��Ʈ����ü�� ������ ����.	
		String str1 = "ABCDEFGHIJ";
		String str2 = "abcdefgfhij";
		
		System.out.println(str1.substring(4));     	//substring(n) ���� ��ġ, substring(n1,n2) n1~n2 ����	        
		System.out.println(str1.substring(0, 3)); 	//��ŸƮ �ε����� ����, ���� �ε����� �������� ���� 
		System.out.println(str2.indexOf("f"));       		  
		System.out.println(str2.lastIndexOf("f"));      
		System.out.println(str2.replace('h', 'H')); 	    //replace�� ���� ���Ÿ� ��Ʈ�� ����
		
		String str3 = "java:html5:css3:javascript";
		String[] ary = str3.split(":");   
		
		for(int i=0; i < ary.length; i++){
			System.out.println(ary[i]);
		}		
		char ch[] = str3.toCharArray();
		System.out.println(str3.length() + " ---- " + ch.length);
		for(int i=0; i < ch.length; i++){
			System.out.print(ch[i] + " ");
		}
	}
}













