package canvas;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class CanvasTest {

	@Test
	public void testConstructor() {
		int horizontalDimension = 4;
		int verticalDimension = 4;
		Canvas canvas = new Canvas(horizontalDimension, verticalDimension);
		String horizontalBorder = canvas.getHorizontalBorder();
		String verticalBorder = canvas.getVerticalBorder();
		String expectedHorizontalBorder = "------";
		String expectedVerticalBorder = "|    |";
		assertTrue(expectedHorizontalBorder.equals(horizontalBorder));
		assertTrue(expectedVerticalBorder.equals(verticalBorder));
	} // testConstructor
	
} // class CanvasTest
