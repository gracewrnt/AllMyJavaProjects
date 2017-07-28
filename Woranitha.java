public class Woranitha {
public static void main(String[] args) {
		Child c = new Child();
		Object o = c;
		Test t = c;
		Parent p = c;
		System.out.println("************** Child ************");
		System.out.println(c);
		System.out.println(c.x + " : " + c.y + " : ");
		System.out.println("Get x : " + c.getx());
		System.out.println("Get y : " + c.gety());
		System.out.println("static Get y : " + c.getyy());
		c.prn();
		System.out.println("************** Parent ************");
		System.out.println(p);
		System.out.println(p.x + " : " + p.y + " : ");
		System.out.println("Get x : " + p.getx());
		System.out.println("Get y : " + p.gety());
		System.out.println("static Get y : " + p.getyy());
		p.prn();
		System.out.println("************** Object ************");
		System.out.println(o);
		t.test();
	}
}

class Parent {
	static int y = 3;
	int x = 8;

	void prn() {
		System.out.println("Parent");
	}

	int getx() {
		return x;
	}

	int gety() {
		return y;
	}

	static int getyy() {
		return y;
	}
}

class Child extends Parent implements Test {
	static int y = 999;
	int x = 777;

	void prn() {
		System.out.println("Child");
	}

	public void test() {
		System.out.println("Testing");
	}

	int getx() {
		return x;
	}

	int gety() {
		return y;

	}

	static int getyy() {
		return y;
	}
}

interface Test {
	void test();
}
