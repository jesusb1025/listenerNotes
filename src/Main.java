import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setSize(500, 500 );

    JPanel panel = new JPanel();

    //create componenets
        JLabel output = new JLabel("");
    JButton button = new JButton("push");
    button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("hi");
            panel.setBackground(Color.PINK);

        }
    });
    JTextField textField = new JTextField(10);
    textField.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String blah = textField.getText();
            output.setText(blah);
        }
    });




//add components to the panel
    panel.add(button);
    panel.add(textField);
    panel.add(output);
    frame.add(panel);
    frame.setVisible(true);




        }
    }