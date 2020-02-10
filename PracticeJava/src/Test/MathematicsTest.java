import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import junit.framework.TestCase;

public class MathematicsTest extends TestCase {

	public void testAdunare() {
		Mathematics mat=new Mathematics();
		int expected=5;
		int result;
		assertThrows(ArithmeticException.class, () ->mat.Adunare(10,0),"Divide by 0 should throw" );
		
	}
	
	

	@Test
	public void testcircleArea() {
		Mathematics math=new Mathematics();
		assertEquals(10,math.circleArea(5));
	}

}
