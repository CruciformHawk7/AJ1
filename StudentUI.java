import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//Create a Swing program for Student Registration containing all the fields Name, 
//Age, Contact, Father’s Name, Annual Income and a submit button. Perform field validations.
class Student {
    double annualIncome;
    int age;
    String name, fathersName, contactNumber;
}

class StudentUI{
    public static void main(String[] args) {
        Student student = new Student();
        JFrame contents = new JFrame("Student Registration");
        contents.setLayout(new GridLayout(0, 2, 5, 5));
        JTextField txtName = new JTextField(), 
            txtFathersName = new JTextField(),
            txtPhone = new JTextField(),
            txtAge = new JTextField(), 
            txtAnnualIncome = new JTextField();

        JLabel lblRegistration = new JLabel("Register");
        JTextArea lblError = new JTextArea();
        lblError.setLineWrap(true);
        lblError.setWrapStyleWord(true);
        lblError.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblError.setEditable(true);
        lblError.setBackground(lblRegistration.getBackground());
        lblError.setFocusable(false);
        lblRegistration.setFont(new Font("Verdana", Font.PLAIN, 18));
        JButton btnSubmit = new JButton("Submit");
        lblError.setForeground(Color.RED);

        contents.add(lblRegistration);
        contents.add(new JLabel());
        contents.add(lblError);
        contents.add(new JLabel());
        contents.add(new JLabel("Name: "));
        contents.add(txtName);
        contents.add(new JLabel("Age: "));
        contents.add(txtAge);
        contents.add(new JLabel("Phone: (+91)"));
        contents.add(txtPhone);
        contents.add(new JLabel("Father's Name: "));
        contents.add(txtFathersName);
        contents.add(new JLabel("Annual Income: "));
        contents.add(txtAnnualIncome);
        contents.add(btnSubmit);

        btnSubmit.addActionListener(e -> {
            lblError.setText("");
            if (txtName.getText().length() < 3) lblError.setText("Invalid Name");
            else student.name = txtName.getText();

            if (txtFathersName.getText().length() == 0) lblError.setText(lblError.getText() + " Invalid Father's Name");
            else student.fathersName = txtFathersName.getText();
            
            if (txtAge.getText().length() == 0 || !isNumber(txtAge.getText()) || Integer.parseInt(txtAge.getText()) < 18) 
                lblError.setText(lblError.getText() + " Invalid Age");
            else student.age = Integer.parseInt(txtAge.getText());

            if (txtPhone.getText().length() < 10 || !isNumber(txtAge.getText())) 
                    lblError.setText(lblError.getText() + " Invalid Phone");
            else student.contactNumber = txtPhone.getText();

            if (txtAnnualIncome.getText().length() == 0 || !isNumber(txtAnnualIncome.getText()) || Integer.parseInt(txtAnnualIncome.getText()) <=0) 
                lblError.setText(lblError.getText() + " Invalid Income");
            else student.annualIncome = Integer.parseInt(txtAnnualIncome.getText());

            if (lblError.getText().equals("")) {
                lblError.setText("Registration Successful!");
                lblError.setForeground(new Color(0, 200, 0));
            }
            else {
                lblError.setForeground(Color.RED);
            }
        });

        contents.setVisible(true);
        contents.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        contents.setBounds(200, 200, 400, 400);
    }

    static boolean isNumber(String num) {
        try {
            Double.parseDouble(num);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}