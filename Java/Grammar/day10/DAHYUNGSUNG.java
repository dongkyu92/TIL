package day10;
/*
 * 다형성, 추상(abstract), 인터페이스, 예외처리
 * 
 * [다형성]
 * 참조형 변수(클래스 타입)는 타입에 지정된 클래스 객체뿐만 아니라 타입에 지정된 클래스의 자손의 객체도 참조할 수 있다.
 * 
 * A obj;
 * obj = new A();
 * obj = new B();
 * obj = new C();
 * 
 * 
 * 1. 다형성 구문이 없다면?
 * void 메서드(A obj){
 * }
 *  void 메서드(B obj){
 * }
 *  void 메서드(C obj){
 * }
 * 
 * 2. 다형성을 적용한다면
 * void 메서드(A obj, B obj, C obj){
 * }
 * 
 * Object o = new Date();
 * Date d = new Date ();     가능하다는 소리.
 * 
 * Member m = new Date(); 불가능. 
 * 
 */
public class DAHYUNGSUNG {

}
