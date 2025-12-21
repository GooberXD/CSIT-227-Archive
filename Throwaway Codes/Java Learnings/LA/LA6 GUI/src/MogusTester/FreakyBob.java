package MogusTester;

import javax.swing.*;

public class FreakyBob {
    private JTextField textField1;
    private JButton submitButton;
    private JPanel pnl1;   // THIS is your root panel

    public FreakyBob() {
        submitButton.addActionListener(e -> {
            String message = textField1.getText();
            JOptionPane.showMessageDialog(pnl1, message);
        });
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("FreakyBob");
        FreakyBob fb = new FreakyBob();

        frame.setContentPane(fb.pnl1);  // <-- FIXED
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}

