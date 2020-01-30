/**
 * Created by SamTDawg on 1/28/2020.
 *
 * Frame for Java Visualisation Application.
 *
 */

import javax.swing.*;
import java.awt.*;

public class GraphicsFrame extends JFrame{

    public static void main(String args[]){
        createGUI();
    }

    // Sets the initial Frame for the application
    public static void createGUI(){
        GraphicsFrame frame = new GraphicsFrame();
        frame.setSize(700,700);
        frame.setTitle("Visualisation");
        frame.setVisible(true);
    }

    public GraphicsFrame(){
        super();

        MainPanel mainP = new MainPanel();

        this.add(mainP, BorderLayout.CENTER);


    }

}
