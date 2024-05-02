import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame {

    // Declare text field and buttons
    private JTextField display = new JTextField();
    private JButton[] buttons = new JButton[16];

    // Declare variables for calculations
    private double firstNumber = 0;
    private double secondNumber = 0;
    private double result = 0;
    private String operator = "";

    public Calculator() {
        // Set the layout of the calculator
        setLayout(new BorderLayout());
        setSize(250, 250);
        setTitle("Calculator");

        // Add the display to the calculator
        add(display, BorderLayout.NORTH);

        // Create the button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        // Add the buttons to the panel
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("" + i);
            buttonPanel.add(buttons[i]);
        }

        // Add the operator buttons
        buttons[10].setText("+");
        buttons[11].setText("-");
        buttons[12].setText("*");
        buttons[13].setText("/");
        buttons[14].setText(".");
        buttons[15].setText("=");

        // Add the button panel to the calculator
        add(buttonPanel, BorderLayout.CENTER);

        // Add action listeners to the buttons
        for (int i = 0; i < 10; i++) {
            buttons[i].addActionListener(new NumberListener());
        }
        for (int i = 10; i < 15; i++) {
            buttons[i].addActionListener(new OperatorListener());
        }
        buttons[15].addActionListener(new EqualListener());

        // Set the calculator to visible
        setVisible(true);
    }

    private class NumberListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            display.setText(display.getText() + button.getText());
        }
    }

    private class OperatorListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            operator = button.getText();
            firstNumber = Double.parseDouble(display.getText());
            display.setText("");
        }
    }

    private class EqualListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            secondNumber = Double.parseDouble(display.getText());

            switch (operator) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    break;
                case "/":
                    result = firstNumber / secondNumber;
                    break;
            }
        }
    }
}
