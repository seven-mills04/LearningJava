package krishnaLearning;
class amy{
	 int x;
	 private static int y;
	void fun1() {
		y=78;
	}
	void fun2() {
		System.out.println(y);
	}
	void fun3() {
		y=786;
	}
}
public class Test3 {
	public static void main(String args[]) {
	amy a1=new amy();
	amy a2=new amy();
	a1.fun1();
	a2.fun3();
	a1.fun2();
	}
}
