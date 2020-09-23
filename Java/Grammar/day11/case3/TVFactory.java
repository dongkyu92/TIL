package day11.case3;

public class TVFactory { // Factory이름이 붙으면 보통 객체를 만들어주는 함수라는 뜻.
	public static TV getTV(String beanName){
		TV obj = null;
		if(beanName.equals("samsung")){
			obj = new SamsungTV();
		} else if(beanName.equals("lg")){
			obj = new LgTV();
		}
		return obj;
	}

}
