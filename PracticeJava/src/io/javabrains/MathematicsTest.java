package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathematicsTest {

	@Test
	public void testOperation() {
		Mathematics math=new Mathematics();
		assertEquals(5,math.Operation(10, 2));
		assertTrue(5==math.Operation(10, 2));
		assertThrows(ArithmeticException.class, ()->math.Operation(50, 0));
	}

}
