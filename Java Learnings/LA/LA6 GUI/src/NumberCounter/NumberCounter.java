package NumberCounter;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumberCounter extends JFrame {
    private JLabel countLabel;
    private JButton increaseButton;
    private JButton decreaseButton;
    private int count = 0;

    public NumberCounter() {
        // Frame init window size
        setTitle("Number Counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new BorderLayout());

        // temp to centerize
        countLabel = new JLabel("0", SwingConstants.CENTER);
        countLabel.setName("countLabel");
        countLabel.setFont(new Font("Impact", Font.BOLD, 30)); //funi meme
        add(countLabel, BorderLayout.CENTER);

        // buttons layout te
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));

        //buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 500, 10));
        //buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 500));

        // Decrem
        decreaseButton = new JButton("Decrease");
        decreaseButton.setName("decreaseButton");
        buttonPanel.add(decreaseButton);

        // increm
        increaseButton = new JButton("Increase");
        increaseButton.setName("increaseButton");
        buttonPanel.add(increaseButton);

        add(buttonPanel, BorderLayout.SOUTH);

        // plus
        increaseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count++;
                countLabel.setText(String.valueOf(count));
            }
        });

        // minus
        decreaseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count--;
                countLabel.setText(String.valueOf(count));
            }
        });
    }


    //actual main
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new NumberCounter().setVisible(true));  //lamda test
    }
}
