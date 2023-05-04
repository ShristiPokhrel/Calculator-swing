import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonListener implements ActionListener  {
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
        Label textField = new Label();
        if (command.equals("=")) {
            String expression = textField.getText();
            double result = evaluateExpression(expression);
            textField.setText(Double.toString(result));
        } else {
            textField.setText(textField.getText() + command);
        }
    }

    public double evaluateExpression(String expression) {
        // You can implement your own expression evaluation logic here
        // This is just a simple example
        String[] tokens = expression.split(" ");
        double operand1 = Double.parseDouble(tokens[0]);
        double operand2 = Double.parseDouble(tokens[2]);
        String operator = tokens[1];

        double result = 0.0;

        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                result = operand1 / operand2;
                break;
        }

        return result;
    }
}


