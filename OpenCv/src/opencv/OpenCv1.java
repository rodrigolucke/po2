/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencv;
   
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
/**
 *
 * @author m80027
 */
public class OpenCv1 {



  public OpenCv1() throws IOException{
    //Mat image = Imgcodecs.imread("Frame1.png");
    //Mat res = new Mat();
    //Imgproc.blur(image, res, new Size(15,15));
    
    BufferedImage img1 = ImageIO.read(new File("Frame1.png"));   
    BufferedImage img2 = ImageIO.read(new File("Frame2.png"));   
    BufferedImage img3 = ImageIO.read(new File("Frame3.png"));   
   // BufferedImage image = ImageIO.read(img);
    // Geramos uma versão em escala de cinza
    BufferedImage gray1 = toGrayscale(img1);
    BufferedImage gray2 = toGrayscale(img2);
    BufferedImage gray3 = toGrayscale(img3);
    
 //   ImageIO.write(gray, "png", newFile(img, "gray"));
    // Geramos uma versão binária a partir da versão em escala de cinza.
    BufferedImage binary1 = toBinary(gray1, 128);
    BufferedImage binary2 = toBinary(gray2, 128);
    BufferedImage binary3 = toBinary(gray3, 128);
  //  ImageIO.write(binary, "png", newFile(img, "binary"));
  
  ImageIO.write(binary1, "png", new File("img1bin.png"));
  ImageIO.write(binary2, "png", new File("img2bin.png"));
  ImageIO.write(binary3, "png", new File("img3bin.png"));
  //ImageIO.write(gray, "png", new File("imagempb.png"));
    
    
  }
  
  public static void main(String[] args) throws IOException {
    System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    new OpenCv1();
    
    
  }
  
  private static BufferedImage toGrayscale(BufferedImage image)
			throws IOException {
		BufferedImage output = new BufferedImage(image.getWidth(),
				image.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
		Graphics2D g2d = output.createGraphics();
		g2d.drawImage(image, 0, 0, null);
		g2d.dispose();
		return output;
	}
  
  
  private static BufferedImage toBinary(BufferedImage image, int t) {
		int BLACK = Color.BLACK.getRGB();
		int WHITE = Color.WHITE.getRGB();
		BufferedImage output = new BufferedImage(image.getWidth(),
				image.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
		// Percorre a imagem definindo na saída o pixel como branco se o valor
		// na entrada for menor que o threshold, ou como preto se for maior.
		for (int y = 0; y < image.getHeight(); y++)
			for (int x = 0; x < image.getWidth(); x++) {
				Color pixel = new Color(image.getRGB(x, y));
				output.setRGB(x, y, pixel.getRed() < t ? BLACK : WHITE);
			}
		return output;
	}
}

   
 
 
  



