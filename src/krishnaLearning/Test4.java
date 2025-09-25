package krishnaLearning;

class nokia{
	private int mic;
	private int cam;
	void SetValue() {
		mic=4;
		cam=120;
	}
	void Display() {
		System.out.println(mic);
		System.out.println(cam);
	}
}
public class Test4 {
	public static void main(String args[]) {
		nokia n1=new nokia();
		n1.SetValue();
		n1.Display();
	}

}
