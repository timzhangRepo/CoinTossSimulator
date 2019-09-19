// Name:
// USC NetID:
// CS 455 PA1
// Fall 2019

// we included the import statements for you
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
//Temporary import for testing


/**
 * Bar class
 * A labeled bar that can serve as a single bar in a bar graph.
 * The text for the label is centered under the bar.
 * 
 * NOTE: we have provided the public interface for this class. Do not change
 * the public interface. You can add private instance variables, constants,
 * and private methods to the class. You will also be completing the
 * implementation of the methods given.
 * 
 */
public class Bar {

   private int bottom;
   private int width;
   private int barHeight;
   private double scale;
   private Color color;
   private String label;
   private int left;


   /**
    Creates a labeled bar.  You give the height of the bar in application
    units (e.g., population of a particular state), and then a scale for how
    tall to display it on the screen (parameter scale).

    @param bottom  location of the bottom of the label
    @param left  location of the left side of the bar
    @param width  width of the bar (in pixels)
    @param barHeight  height of the bar in application units
    @param scale  how many pixels per application unit
    @param color  the color of the bar
    @param label  the label at the bottom of the bar
    */
  public Bar(int bottom, int left, int width, int barHeight,
             double scale, Color color, String label) {
     this.left = left;
     this.bottom  = bottom;
     this.width = width;
     this.barHeight = barHeight;
     this.scale = scale;
     this.color = color;
     this.label = label;

   }


   /**
    * Draw the labeled bar.
    *
    * @param g2 the graphics context
    */
   public void draw(Graphics2D g2) {


      /*Rectangle part*/
      int x = left;
      int y = bottom-barHeight; //bottom is from the height of the frame minus vertical buffer, thus if minus height of the bar we get where y should starts
      Rectangle rect = new Rectangle(x,y,width,barHeight);   //creates a rectangle class
      g2.setColor(color);
      g2.draw(rect);
      g2.fill(rect);

      String label = this.label;   // suppose this is the label you want to display

      Font font = g2.getFont();


      /*Rectamngle Labeling part*/
      FontRenderContext context = g2.getFontRenderContext();  //code to get the dimensions of the label you will be displaying
      Rectangle2D labelBounds = font.getStringBounds(label, context);
      int widthOfLabel = (int) labelBounds.getWidth();
      int heightOfLabel = (int) labelBounds.getHeight();
      g2.setColor(color.black);

      int x_font =x+width/2-widthOfLabel/2; //left side of the bar minus half of its length to get the center point, and then  shift half width of the label to the left

      g2.drawString(label,x_font,bottom+20); //display the string to the panel;






   }
}
