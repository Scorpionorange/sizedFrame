import java.awt.*;
import javax.swing.*;
/**
 * Created by ScorpionOrange on 2016/08/21.
 */
public class SizedFrameTest {
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new SizedFrame();
                frame.setTitle("SizedFrame");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

class SizedFrame extends JFrame{
    public SizedFrame(){
        //get screen dimensions
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        //set frame width, heigth and let platform pick screen location
        setSize(screenWidth / 2, screenHeight / 2);
        setLocationByPlatform(true);

        //set frame icon
        Image img = new ImageIcon("icon.gif").getImage();
        setIconImage(img);
    }
}
