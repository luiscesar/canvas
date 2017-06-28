package canvas;

import java.util.Arrays;

public class Canvas {

	private char[][] canvas;
	private char blank = ' ';
	private char hMark = '-';
	private char vMark = '|';
	private int horizontalDimension;
	private int verticalDimension;
	private String horizontalBorder;
	private String verticalBorder;

	public Canvas(int horizontalDimension, int verticalDimension) {
		canvas = new char[verticalDimension][horizontalDimension];
		this.horizontalDimension = horizontalDimension;
		this.verticalDimension = verticalDimension;
		initCanvas();
	}
	
	private void initCanvas() {
		for (int i = 0; i < this.verticalDimension; i++) {
			for (int j = 0; j < this.horizontalDimension; j++) {
				canvas[i][j] = blank;
			}
		} // for
		createBorder();
	} // initCanvas

	private void createBorder() {
		final char[] hArray = new char[horizontalDimension + 2];
		Arrays.fill(hArray, hMark);
	    horizontalBorder = new String(hArray);
		final char[] vArray = new char[horizontalDimension];
		Arrays.fill(vArray, blank);
	    verticalBorder = vMark + new String(vArray) + vMark;		
	}

	public char getBlank() {
		return blank;
	}

	public void setBlank(char blank) {
		this.blank = blank;
	}

	public String getHorizontalBorder() {
		return horizontalBorder;
	}

	public void setHorizontalBorder(String horizontalBorder) {
		this.horizontalBorder = horizontalBorder;
	}

	public String getVerticalBorder() {
		return verticalBorder;
	}

	public void setVerticalBorder(String verticalBorder) {
		this.verticalBorder = verticalBorder;
	}

} // class Canvas
