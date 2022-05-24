import org.junit.Test;

public class jUnitTest {

	public static void main(String[] args) {
		System.out.println("Hello, World!");
	}

	@Test
	public int multiply(int a, int b) {
		return a * b;
	}
}
