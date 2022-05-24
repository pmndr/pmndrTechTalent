import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		Main m = new Main();
		int result = m.goodGuy()
		assertEquals("Unexpected result!", 100, result);
	}

}
