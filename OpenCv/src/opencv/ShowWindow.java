/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencv;




import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.util.LinkedList;
import java.util.List;
import javax.swing.*;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.MatOfFloat;
import org.opencv.core.MatOfInt;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;

/**
 *
 * @author Danilo
 */
public class ShowWindow extends JFrame{
    public static JFrame frame;
    public static Mat picture;  
    public static BufferedImage image;
    public static int larg;
    public static int alt;
    public static int modo;
    
    public static void mostra(String nomeJanela, Mat picture){
        frame = new JFrame(nomeJanela);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(picture.cols(),picture.rows());//largura e altura
        image = matToBufferedImage(picture);
        JLabel photo = new JLabel();
        photo.setIcon(new ImageIcon(image));
        frame.setContentPane(photo);
        frame.setVisible(true);
    }
    
    public static Mat histograma(Mat m){
        List<Mat> matList = new LinkedList<Mat>();
        matList.add(m);
        Mat histogram = new Mat();
        MatOfFloat ranges=new MatOfFloat(0,256);
        MatOfInt histSize = new MatOfInt(255);
        Imgproc.calcHist(matList, new MatOfInt(0), new Mat(), histogram, histSize, ranges);
        Mat histImage = Mat.zeros( 200, (int)histSize.get(0, 0)[0], CvType.CV_8UC3);                   
        Core.normalize(histogram, histogram, 1, histImage.rows() , Core.NORM_MINMAX, -1, new Mat() );       
        for( int i = 0; i < (int)histSize.get(0, 0)[0]; i++ )
        {                   
                Imgproc.line(
                        histImage,
                        new org.opencv.core.Point( i, histImage.rows() ), // eixo Y é de cima para baixo
                        new org.opencv.core.Point( i, histImage.rows()-Math.round( histogram.get(i,0)[0] )) ,
                        new Scalar( 255, 255, 0),
                        1, Imgproc.LINE_AA, 0 );
                System.out.println("Nivel de Cinza= "+i+" Quantidade= "+Math.round( histogram.get(i,0)[0] ));
        }
        return (histImage);
    }
    
    public static void showWindow(String nomeJanela, Mat picture){
        frame = new JFrame(nomeJanela);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);//largura e altura
        image = matToBufferedImage(picture);
        JPanel panel = new JPanel(){
        @Override
        public void paintComponent(Graphics g) {
            //BufferedImage image = null; // get your buffered image.
            //Graphics2D graphics2d = (Graphics2D) g;
            //graphics2d.drawImage(image, 0, 0, null);
            g.drawImage(image,0,0,frame.getWidth(),frame.getHeight(), this);
            super.paintComponents(g);
            
        }
    };
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
    
    
    public static void showWindow(String nomeJanela, Mat picture, int l, int a){
        frame = new JFrame(nomeJanela);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);//largura e altura
        image = matToBufferedImage(picture);
        if(l == 0){alt = image.getHeight(); larg = image.getWidth();}
        larg = l;
        alt = a;
        JPanel panel = new JPanel(){
        @Override
        public void paintComponent(Graphics g) {
             g.drawImage(image,0,0,larg,alt, this);
             super.paintComponents(g);    
        }
    };
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
    
    
    /**  
    * Converts/writes a Mat into a BufferedImage.  
    *  
    * @param matrix Mat of type CV_8UC3 or CV_8UC1  
    * @return BufferedImage of type TYPE_3BYTE_BGR or TYPE_BYTE_GRAY  
    */  
   public static BufferedImage matToBufferedImage(Mat matrix) {  
     int cols = matrix.cols();  
     int rows = matrix.rows();  
     int elemSize = (int)matrix.elemSize();  
     byte[] data = new byte[cols * rows * elemSize];  
     int type;  
     matrix.get(0, 0, data);  
     switch (matrix.channels()) {  
       case 1:  
         type = BufferedImage.TYPE_BYTE_GRAY;  
         break;  
       case 3:  
         type = BufferedImage.TYPE_3BYTE_BGR;  
         // bgr to rgb  
         byte b;  
         for(int i=0; i<data.length; i=i+3) {  
           b = data[i];  
           data[i] = data[i+2];  
           data[i+2] = b;  
         }  
         break;  
       default:  
         return null;  
     }  
     BufferedImage image = new BufferedImage(cols, rows, type);  
     image.getRaster().setDataElements(0, 0, cols, rows, data);  
     return image;  
   }  

    
}

