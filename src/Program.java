import java.awt.BorderLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//DRIVER CLASSS ++++++++++++++++++++++++++++++
public class Program {

    public static void main(String[] args) {
       
       // ExampleFrame  myFrame  = new  ExampleFrame();
       // myFrame.setVisible(true);
    	MyDialog myDialog = new MyDialog();
        
    	myDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    	myDialog.setVisible(true);
    }

}
