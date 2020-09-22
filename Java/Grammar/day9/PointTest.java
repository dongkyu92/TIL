package day9;
public class PointTest {
	public static void main(String args[]) {
		Point3D p3 = new Point3D(1,2,3);	
		System.out.println(p3.getLocation());
	}
}

class Point {
	int x;	
	int y;
	Point(int x, int y) {		
		this.x = x;
		this.y = y;
	}
	String getLocation() {
		return "x :" + x + ", y :"+ y;
	}
}

class Point3D extends Point {
	int z;
	Point3D(int x, int y, int z) {
		super(x,y); //x,y 는 조상의 멤버변수에 대입하는데, 생성자를 통해 대입해야 됨.
		//this.x = x;
		//this.y = y;
		this.z = z;
	}
	String getLocation() {	// 오버라이딩
		return super.getLocation() + ", z :" + z;
	}	
}













