package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
JFrame frame;
JPanel panel;
JLabel lNumber1, lNumber2, lResult;
JTextField tNumber1, tNumber2, tResult;
JButton bAdd, bSubtract, bMultiply, bDivide, bClear, bCancel;

public Calculator() {
frame = new JFrame();
panel = new JPanel();

lNumber1 = new JLabel("Number[1]: ");
lNumber2 = new JLabel("Number[2]: ");
lResult = new JLabel("Result : ");

tNumber1 = new JTextField(15);
tNumber2 = new JTextField(15);
tResult = new JTextField(15);
tResult.setEditable(false);

bAdd = new JButton("Add");
bSubtract = new JButton("Subtract");
bMultiply = new JButton("Multiply");
bDivide = new JButton("Divide");
bClear = new JButton("Clear");
bCancel = new JButton("Cancel");

panel.add(lNumber1);
panel.add(tNumber1);
panel.add(lNumber2);
panel.add(tNumber2);
panel.add(lResult);
panel.add(tResult);
panel.add(bAdd);
panel.add(bSubtract);
panel.add(bMultiply);
panel.add(bDivide);
panel.add(bClear);
panel.add(bCancel);

frame.add(panel);
frame.setVisible(true);
frame.setTitle("Calculator");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLocation(300, 300);
frame.setSize(270, 250);
frame.setResizable(false);

bAdd.addActionListener(this);
bSubtract.addActionListener(this);
bMultiply.addActionListener(this);
bDivide.addActionListener(this);
bClear.addActionListener(this);
bCancel.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {

if(e.getSource() == bAdd) {
int n1 = Integer.parseInt(tNumber1.getText());
int n2 = Integer.parseInt(tNumber2.getText());
int res = n1 + n2;
tResult.setText(String.valueOf(res));
}

if(e.getSource() == bSubtract) {
int n1 = Integer.parseInt(tNumber1.getText());
int n2 = Integer.parseInt(tNumber2.getText());
int res = n1 - n2;
tResult.setText(String.valueOf(res));
}

if(e.getSource() == bMultiply) {
int n1 = Integer.parseInt(tNumber1.getText());
int n2 = Integer.parseInt(tNumber2.getText());
int res = n1 * n2;
tResult.setText(String.valueOf(res));
}

if(e.getSource() == bDivide) {
int n1 = Integer.parseInt(tNumber1.getText());
int n2 = Integer.parseInt(tNumber2.getText());
int res = n1 / n2;
tResult.setText(String.valueOf(res));
}

if(e.getSource() == bClear) {
tNumber1.setText("");
tNumber2.setText("");
tResult.setText("");
}

if(e.getSource() == bCancel) {
frame.dispose();
}
}

public static void main(String[] args) {
new Calculator();
}
}