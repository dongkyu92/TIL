package day11;

import java.util.Random;

interface Drawable {
	void draw();
}

// 인터페이스에 정의되는 메서드는 자동으로 퍼블릭임.
// 또한 앱스트랙트
class Rect implements Drawable {
	public void draw() {
		System.out.println("사각형을 그립니다.");
	}
	// draw함수를 구현하지 않으면 abstract 클래스로 구현해야됨.
}

class Circle implements Drawable {
	public void draw() {
		System.out.println("원을 그립니다.");
	}
	// draw함수를 구현하지 않으면 abstract 클래스로 구현해야됨.
}

class Diamond implements Drawable {
	public void draw() {
		System.out.println("마름모를 그립니다.");
	}
}

public class DrawableTest {
	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(3);
		Drawable d = null;
		if (num == 0)
			d = new Rect();
		else if (num == 1)
			d = new Circle();
		else if (num == 2)
			d = new Diamond();
		output(d);
	}

	public static void output(Drawable d) {
		System.out.println("전달된 객체의 클래스명 : " + d.getClass().getName());
		d.draw();
	}
}
