package krishnaLearning;

class Krishna{
	int x;
	int y;
	void fun1() {
		System.out.println("Non-static");
	}
	void fun2() {
		System.out.println("Non-static bnn gya ");
	}
}
public class Nonstatic {

	public static void main(String[] args) {
		Krishna k1=new Krishna();
				k1.x=25;
				k1.y=56;
				System.out.println(k1.x);
				System.out.println(k1.y);
	}

}
