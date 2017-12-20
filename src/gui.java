import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui extends JFrame{
    
    // Declare all variable
    private JPanel panel;
    private JLabel labelNum1, labelNum2, labelResult;
    private JTextField fieldNum1, fieldNum2, fieldResult;
    private JButton buttonAdd, buttonSubtract, buttonMultiply, buttonDivide, buttonExit;
    
    public gui(){
        // Create frame
        super("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550,200);
        // Create panel
        panel = new JPanel();
        setContentPane(panel);
        panel.setLayout(null);
        
        // Add variable into panel
        labelNum1 = new JLabel("Number 1");
        labelNum1.setBounds(75,50,70,15);
        panel.add(labelNum1);
        
        fieldNum1 = new JTextField();
        fieldNum1.setBounds(135,45,40,25);
        panel.add(fieldNum1);
        
        labelNum2 = new JLabel("Number 2");
        labelNum2.setBounds(180,50,70,15);
        panel.add(labelNum2);
        
        fieldNum2 = new JTextField();
        fieldNum2.setBounds(240,45,40,25);
        panel.add(fieldNum2);
        
        labelResult = new JLabel("Result");
        labelResult.setBounds(285, 50, 70,15);
        panel.add(labelResult);
        
        fieldResult = new JTextField();
        fieldResult.setBounds(327,45,100,25);
        fieldResult.setEditable(false);
        panel.add(fieldResult);
        
        // Add button
        buttonAdd = new JButton("Add");
        // Add action listener
        buttonAdd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    double num1 = Double.parseDouble(fieldNum1.getText());
                    double num2 = Double.parseDouble(fieldNum2.getText());
                    double result = num1 + num2;
                    fieldResult.setText(Double.toString(result));
                }catch(NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "Wrong input. Please enter number only");
                }
            }
        });
        buttonAdd.setBounds(50,100,60,25);
        panel.add(buttonAdd);
        
        buttonSubtract = new JButton("Subtract");
        // Add action listener
        buttonSubtract.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    double num1 = Double.parseDouble(fieldNum1.getText());
                    double num2 = Double.parseDouble(fieldNum2.getText());
                    double result = num1 - num2;
                    fieldResult.setText(Double.toString(result));
                }catch(NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "Wrong input. Please enter number only");
                }
            }
        });
        buttonSubtract.setBounds(115,100,90,25);
        panel.add(buttonSubtract);
        
        buttonMultiply = new JButton("Multiply");
        // Add action listehers
        buttonMultiply.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    double num1 = Double.parseDouble(fieldNum1.getText());
                    double num2 = Double.parseDouble(fieldNum2.getText());
                    double result = num1 * num2;
                    fieldResult.setText(Double.toString(result));
                }catch(NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "Wrong input. Please enter number only");
                }
            }
        });
        buttonMultiply.setBounds(210,100,90,25);
        panel.add(buttonMultiply);
        
        buttonDivide = new JButton("Divide");
        // Add action listener
        buttonDivide.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    double num1 = Double.parseDouble(fieldNum1.getText());
                    double num2 = Double.parseDouble(fieldNum2.getText());
                    double result = num1 / num2;
                    fieldResult.setText(Double.toString(result));
                }catch(NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "Wrong input. Please enter number only");
                }catch(ArithmeticException error){
                    JOptionPane.showMessageDialog(null, "Arithmetic error");
                }
            }
        });
        buttonDivide.setBounds(305,100,90,25);
        panel.add(buttonDivide);
        
        buttonExit = new JButton("Exit");
        buttonExit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
            }
        });
        buttonExit.setBounds(400,100,60,25);
        panel.add(buttonExit);
    }
   
}
