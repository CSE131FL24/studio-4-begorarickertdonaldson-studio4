package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		StdDraw.clear();
		String shape = in.next();
		System.out.print(shape);
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean filled = in.nextBoolean();
		
		if("rectangle".equals(shape))
		{
			double xOne = in.nextDouble();
			double yOne = in.nextDouble();
			double width = xOne/2.0;
			double height = yOne/2.0;
			StdDraw.setPenColor(red,green,blue);
			if(filled)
			{
				StdDraw.filledRectangle(xOne,yOne,width,height);
			}
			else
			{
				StdDraw.rectangle(xOne,yOne,width,height);
			}
			
		}
		if("ellipse".equals(shape))
		{
			double xOne = in.nextDouble();
			double yOne = in.nextDouble();
			double width = xOne/2.0;
			double height = yOne/2.0;
			StdDraw.setPenColor(red,green,blue);
			if(filled)
			{
				StdDraw.filledRectangle(xOne,yOne,width,height);
			}
			else
			{
				StdDraw.rectangle(xOne,yOne,width,height);
			}
			
		}
		if("rectangle".equals(shape))
		{
			double xOne = in.nextDouble();
			double yOne = in.nextDouble();
			double width = xOne/2.0;
			double height = yOne/2.0;
			StdDraw.setPenColor(red,green,blue);
			if(filled)
			{
				StdDraw.filledRectangle(xOne,yOne,width,height);
			}
			else
			{
				StdDraw.rectangle(xOne,yOne,width,height);
			}
			
		}
		
	}
}
