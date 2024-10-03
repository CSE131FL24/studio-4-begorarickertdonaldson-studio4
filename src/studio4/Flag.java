package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledCircle(.5,.5,.2);
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(.43,.55,.05);
		StdDraw.filledCircle(.57,.55,.05);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.rectangle(.5, .5, .49, .49);
		StdDraw.filledCircle(.43,.55,.01);
		StdDraw.filledCircle(.57,.55,.01);
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledRectangle(.5, .4, .1, .01);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.text(.5, .75, "I will");
		StdDraw.text(.5, .25, "find you");

	}
}