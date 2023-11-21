
public class MyObject implements Comparable<MyObject> {
	private int number;

	public MyObject(int number) {
		this.number = number;
	}

	@Override
	public int compareTo(MyObject o) {
		return Integer.compare(this.number, o.number);
	}

	@Override
	public String toString() {
		return "MyObject{" + "number=" + number + '}';
	}
}