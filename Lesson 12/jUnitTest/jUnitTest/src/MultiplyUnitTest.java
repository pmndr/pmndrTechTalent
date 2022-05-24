import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplyUnitTest {

	@Test
	public void test() {
		jUnitTest m = new jUnitTest();
		int result = m.multiply(10, 10);
		assertEquals("Unexpected result!", 100, result);
	}

}
