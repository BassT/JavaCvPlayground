/**
 * 
 */
package playground;

import com.googlecode.javacv.CanvasFrame;
import com.googlecode.javacv.cpp.opencv_core.IplImage;
import com.googlecode.javacv.cpp.opencv_highgui;

import javax.swing.JFrame;

/**
 * @author Sebastian Richter
 *
 */
public class test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IplImage img = opencv_highgui.cvLoadImage("D:/git/JavaCvPlayground/src/res/test1.jpg", opencv_highgui.CV_LOAD_IMAGE_GRAYSCALE);
		
		CanvasFrame canvas = new CanvasFrame("Test1",1);
		
		canvas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		canvas.showImage(img);

	}

}
