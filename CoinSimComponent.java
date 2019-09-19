import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.Color;
import java.util.Scanner;
import java.util.ArrayList;
/*

CoinSimComponent. Extends JComponent. Constructor initializes any necessary data and runs the simulation.
 Overrides paintComponent to draw the bar graph, using Bar objects for each bar in the graph.
 This class uses the CoinTossSimulator and Bar class.

 */

public class CoinSimComponent extends JComponent
{

    private final int bw = 60; //bar width constant
    private final int vb = 50; //vertical buffer constant
    private int num_Trails = ask_numtrail();
    private CoinTossSimulator sim = runTrail();

    /**
     * Ask the user for number of trails it wish to perform,
     * also checks the boundary of the entry before the program passes to the simulator.
     */
    public int ask_numtrail()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of trials: ");
        int num_Trails = scan.nextInt();

        if(num_Trails>=1)
        {
            return num_Trails;
        }
        else{
            System.out.println("ERROR: Number entered must be greater than 0.");
            while(num_Trails<=0)
            {
                System.out.println("Re_Enter number of trials:");
                num_Trails = scan.nextInt();
            }

        }
        return num_Trails;



    }
    /**
     * Creates and return an instance of the CoinTossSimulator class.
     */
    public CoinTossSimulator runTrail()
    {
        CoinTossSimulator sim = new CoinTossSimulator();
        sim.run(num_Trails);
        return sim;
    }

    /*
        first calculates the left value for all bars..
        calcualte the scale value
        calculate the height_of the bar value
        calculate the bottom value
        create three labels for three bars
        create three instances of the bar class.
        draw the bars..
        DETAIL DESCRIPTION ARE SHOWED AS COMMENT BELOW!
     */

    public void paintComponent(Graphics g)
    {


        int split_even = getWidth()/4;  //Simply width divide by 4, 1st step to get first x on the graph
        int left_bar1 = (int)split_even-bw/2; //use the first split minus half of the bar width to get where x should be plot in the rectangle
        int left_bar2 = (int)split_even*2-bw/2;//use the second split minus half of the bar width to get where x should be plot in the rectangle
        int left_bar3 = (int)split_even*3-bw/2;//use the third split minus half of the bar width to get where x should be plot in the rectangle

        int barHeight =  num_Trails;  //1st step calculate the ratio
        double scale = (getHeight()-2*vb)/(double)barHeight; //The scale depends on the window size which is height minus two vertical buffer.


        int height_bar1 = (int)(sim.getTwoHeads()*scale);  //amount received from the trail times the relative scale which is the unit
        int height_bar2 = (int)(sim.getHeadTails()*scale); //amount received from the trail times the relative scale which is the unit
        int height_bar3 = (int)(sim.getTwoTails()*scale);   //amount received from the trail times the relative scale which is the unit


        int bottom = getHeight()-vb; //The height of the frame minus the top vertical buffer

        String label1 = "Two Heads: "+sim.getTwoHeads()+" "+"("+sim.getTwoHeads()*100/num_Trails+")%";
        String label2 = "A Head and a Tail: "+sim.getHeadTails()+" "+"("+sim.getHeadTails()*100/num_Trails+")%";
        String label3 = "Two Tails: "+sim.getTwoTails()+" "+"("+sim.getTwoTails()*100/num_Trails+")%";

        Color color;
        Graphics2D g2 = (Graphics2D) g;
        Bar bar1 = new Bar(bottom,left_bar1,bw,height_bar1,scale,Color.red,label1);
        Bar bar2 = new Bar(bottom,left_bar2,bw,height_bar2,scale,Color.green,label2);
        Bar bar3 = new Bar(bottom,left_bar3,bw,height_bar3,scale,Color.blue,label3);


        bar1.draw(g2);
        bar2.draw(g2);
        bar3.draw(g2);

    }


}
