
public class EncapEx {
	private int a,b;
	public static void main(String[] args) {
		EncapEx ob = new EncapEx();
	ob.setA(3);

	System.out.println (ob.getA());
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}

}
