package day11;

import java.util.Random;

interface Drawable {
	void draw();
}

// �������̽��� ���ǵǴ� �޼���� �ڵ����� �ۺ���.
// ���� �۽�Ʈ��Ʈ
class Rect implements Drawable {
	public void draw() {
		System.out.println("�簢���� �׸��ϴ�.");
	}
	// draw�Լ��� �������� ������ abstract Ŭ������ �����ؾߵ�.
}

class Circle implements Drawable {
	public void draw() {
		System.out.println("���� �׸��ϴ�.");
	}
	// draw�Լ��� �������� ������ abstract Ŭ������ �����ؾߵ�.
}

class Diamond implements Drawable {
	public void draw() {
		System.out.println("������ �׸��ϴ�.");
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
		System.out.println("���޵� ��ü�� Ŭ������ : " + d.getClass().getName());
		d.draw();
	}
}
