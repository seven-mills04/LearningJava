package krishnaLearning;

 class Area{
	static void fun1(){
		System.out.println("E");
	}
	static void fun2() {
		System.out.println("G");
	}
}
	 class Test2 {
		static void fun1() {
			System.out.println("A");
		}
		static void fun2() {
			System.out.println("B");
		}
	
	public static void main (String args[]) {
		System.out.println("C");
		Area.fun1();
		Test2.fun1();
	}
	}


