import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by SamTDawg on 1/28/2020.
 */
public class MainPanel extends JPanel implements ActionListener{

    JToolBar toolBar = new JToolBar(); // menu bar

    JButton bfile; // file button on menu bar

    public MainPanel(){

        this.setLayout(new BorderLayout());
        this.setBackground(Color.BLUE);

        bfile = new JButton("File");
        toolBar.add(bfile);
        bfile.addActionListener(this);

        add(toolBar,BorderLayout.NORTH);
    }

    public void actionPerformed(ActionEvent e){

        //When file button on menu bar is clicked
        if(e.getSource() == bfile){

        }

    }

}
