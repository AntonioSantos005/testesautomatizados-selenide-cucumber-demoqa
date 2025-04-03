package calculatorTest;

import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {

// Declare variables and components
TextField num1, num2, result;
Label plus, equal;
Button add;

// Constructor
public Calculator() {
    // Set the layout
    setLayout(new FlowLayout());
    
    // Initialize variables and components
    num1 = new TextField(10);
    plus = new Label("+");
    num2 = new TextField(10);
    equal = new Label("=");
    result = new TextField(10);
    add = new Button("Add");
    
    // Add the components to the frame
    add(num1);
    add(plus);
    add(num2);
    add(equal);
    add(result);
    add(add);
    
    // Add action listener to the button
    add.addActionListener(this);
    
    // Set the size and visibility
    setSize(200, 100);
    setVisible(true);
}

// Method to add two numbers
public void actionPerformed(ActionEvent e) {
    int n1, n2, res;
    n1 = Integer.parseInt(num1.getText());
    n2 = Integer.parseInt(num2.getText());
    res = n1 + n2;
    result.setText(Integer.toString(res));
}

// Main method
public static void main(String[] args) {
    Calculator c = new Calculator();
}
}

