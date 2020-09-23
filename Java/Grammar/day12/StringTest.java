package day12;
public class StringTest {
	public static void main(String[] args) {
		System.out.println("1".length());    				
		System.out.println("가나다".length()); 					
		System.out.println("abc".charAt(1)); // 케릭터 at (주어진 문자열에서 n번째 문자를 뽑아내는 함수)
		System.out.println("abc".toUpperCase());	 //ABC의 새로운 스트링객체가 만들어짐. 한번만들어진 스트링객체는 변하지 않음.	
		String str1 = "ABCDEFGHIJ";
		String str2 = "abcdefgfhij";
		
		System.out.println(str1.substring(4));     	//substring(n) 시작 위치, substring(n1,n2) n1~n2 범위	        
		System.out.println(str1.substring(0, 3)); 	//스타트 인덱스는 포함, 엔드 인덱스는 포함하지 않음 
		System.out.println(str2.indexOf("f"));       		  
		System.out.println(str2.lastIndexOf("f"));      
		System.out.println(str2.replace('h', 'H')); 	    //replace를 많이 쓸거면 스트링 버퍼
		
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













