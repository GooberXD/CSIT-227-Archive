package CharacterCounter;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CharacterCounter extends JFrame {
    private JTextArea messageTextArea;
    private JTextField characterTextField;
    private JButton countButton;
    private JLabel countLabel;

    public CharacterCounter() {
        // Frame setup
        setTitle("Character Counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout(10, 10));

        // panel
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(9, 15, 10, 15)); // top, left, bottom, right, acting like html gng
        add(mainPanel, BorderLayout.CENTER);

        // main center box
        messageTextArea = new JTextArea(8, 25);
        messageTextArea.setName("messageTextArea");
        messageTextArea.setLineWrap(true);
        messageTextArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(messageTextArea);
        scrollPane.setPreferredSize(new Dimension(350, 130));
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // bottom section area
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.Y_AXIS));
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0)); // spacing above bottom section, tldr padding like hTMl

        // bottom area rows and stuff
        JPanel inputPanel = new JPanel(new BorderLayout());
        JPanel leftInput = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        leftInput.add(new JLabel("Enter character:"));
        characterTextField = new JTextField(3);
        characterTextField.setName("characterTextField");
        leftInput.add(characterTextField);
        inputPanel.add(leftInput, BorderLayout.WEST);

        // counter button, click to coUnt
        countButton = new JButton("Count");
        countButton.setName("countButton");
        inputPanel.add(countButton, BorderLayout.EAST);
        bottomPanel.add(inputPanel);

        // output res sect
        JPanel resultPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        resultPanel.add(new JLabel("Count:"));
        countLabel = new JLabel("0");
        countLabel.setName("countLabel");
        resultPanel.add(countLabel);
        bottomPanel.add(Box.createVerticalStrut(5));
        bottomPanel.add(resultPanel);

        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        // Button funct
        countButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = messageTextArea.getText();
                String charInput = characterTextField.getText();

                if (charInput.length() != 1) {
                    JOptionPane.showMessageDialog(CharacterCounter.this,
                            "Please enter a single character.",
                            "Invalid Input",
                            JOptionPane.WARNING_MESSAGE);

                    return;
                }

                char targetChar = charInput.charAt(0);
                long count = text.chars().filter(ch -> ch == targetChar).count();
                countLabel.setText(String.valueOf(count));
            }
        });
    }


    //main to ex
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CharacterCounter().setVisible(true)); //lamdafied, thnx intellij
    }
}


//ngl basically just html + javascript fr fr