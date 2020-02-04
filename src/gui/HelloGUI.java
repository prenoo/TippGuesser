package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloGUI extends JFrame {
    private JPanel frame;
    private JLabel label1;
    private JTextField textInput;
    private JButton resetButton;
    private JButton tippButton;
    private JTextField infoTextField;
    private JLabel infoLabel;

    private TipperController tc = new TipperController();

    public HelloGUI() {
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tc.reset(textInput, infoTextField);
            }
        });
        tippButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tc.tipp(textInput, infoTextField);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloGUI");
        frame.setContentPane(new HelloGUI().frame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
