/*
 * Created by JFormDesigner on Mon Feb 28 10:36:13 EST 2022
 */

package HangmanGUI;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

/**
 * @author unknown
 */
public class HangManGUI extends JFrame {
    public HangManGUI() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Stephen Osei-Owusu
        label1 = new JLabel();
        nametextfield = new JTextField();
        currentwordTextField = new JTextField();
        label2 = new JLabel();
        GuessTextBox = new JTextField();
        label3 = new JLabel();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Name");
        contentPane.add(label1);
        label1.setBounds(20, 25, 120, 35);
        contentPane.add(nametextfield);
        nametextfield.setBounds(165, 25, 205, 30);

        //---- currentwordTextField ----
        currentwordTextField.setEditable(false);
        contentPane.add(currentwordTextField);
        currentwordTextField.setBounds(175, 250, 205, currentwordTextField.getPreferredSize().height);

        //---- label2 ----
        label2.setText("Current Word");
        contentPane.add(label2);
        label2.setBounds(30, 255, 105, label2.getPreferredSize().height);

        //---- GuessTextBox ----
        GuessTextBox.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        contentPane.add(GuessTextBox);
        GuessTextBox.setBounds(175, 295, 205, GuessTextBox.getPreferredSize().height);

        //---- label3 ----
        label3.setText("Enter Guess");
        contentPane.add(label3);
        label3.setBounds(30, 305, 90, label3.getPreferredSize().height);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    public static void main(String []args){
        HangManGUI hangManGUI = new HangManGUI();
        hangManGUI.initComponents();
        hangManGUI.setVisible(true);
        System.out.println("Testing");
        hangManGUI.GuessTextBox.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("have received");
                if (hangManGUI.GuessTextBox.getText().length() >= 3 ) // limit textfield to 3 characters
                    e.consume();
            }
        });

    }
    public void startGame(){

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Stephen Osei-Owusu
    private JLabel label1;
    private JTextField nametextfield;
    private JTextField currentwordTextField;
    private JLabel label2;
    private JTextField GuessTextBox;
    private JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
