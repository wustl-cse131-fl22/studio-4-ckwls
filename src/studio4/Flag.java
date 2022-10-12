package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(0,0,0);
		StdDraw.rectangle(0.5, 0.5, 0.25, 0.15);
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(.5, .6, .25, .05);
		
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(.5, .4, .25, .05);
		
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledRectangle(.625, .5, .125, .05);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledCircle(.375, .5, .02);
	}
}