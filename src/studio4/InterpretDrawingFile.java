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
		String shape = in.next();
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();
		boolean filled = in.nextBoolean();
		double x1 = in.nextDouble();
		double  x2 = in.nextDouble();
		double y1 = in.nextDouble();
		double y2 = in.nextDouble();
		
		StdDraw.setPenColor(r,g,b);
		StdDraw.rectangle(x1, x2, y1, y2);
		
			
		
		

	}
}
