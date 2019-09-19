import javax.swing.JFrame;

public class CoinSimViewer {
    public CoinSimViewer() {
    }
/*
This is a coin simulator program which simulates two coins toss at the same time.
The user determines number of of toss they need to perform. And the program outputs statistics for
the outcomes.
The program contains four running components and a program tester. It also uses the Java Swing method
for graphic implmentations.
It creates a 800 by 500 frame and calls the CoinSimComponent method, which draws the bar by using bar.java and runs the
simulation by calling the simulator. The window is resizeble which means everything will be displayed in ratio.



 */
    public static void main(String[] var0) {
        JFrame frame = new JFrame();
        frame.setSize(800,500);
        frame.setTitle("CoinSim");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CoinSimComponent component = new CoinSimComponent();
        frame.add(component);
        frame.setVisible(true);

    }
}
