package java_20200520;

public class ShapeDemo {
	// 추상 클래스의 다형성 (Shape의 하위클래스만 가능)
	public static void run(Shape s) {
		s.draw();
	}
	
	public static void main(String[] args) {
		// 추상 클래스는 객체를 생성할 수 없다.
		// Shape s1 = new Shape(); => 불가능
		
		Rectangle r1 = new Rectangle();
		run(r1);
		
		Circle c1 = new Circle();
		run(c1);
		
		Triangle t1 = new Triangle();
		run(t1);
	}
}
