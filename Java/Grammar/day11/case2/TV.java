package day11.case2;

public interface TV {
	public void powerOn();
	public void powerOff();
	public void volumnUp();
	public void volumnDown();
}
// 인터페이스에는 abstract 메서드만 쓸 수 있는데 왜 없나?
// default로 abstract가 붙음.