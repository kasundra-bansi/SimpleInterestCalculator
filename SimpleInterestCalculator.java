import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleInterestCalculator extends JFrame implements ActionListener {

    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4;
    JButton b1,b2;

    public SimpleInterestCalculator(){
        setTitle("Simple Interest Modified Calculator");

        getContentPane().setBackground(Color.CYAN);
        
        l1=new JLabel("Principal");
        l2=new JLabel("Rate");
        l3=new JLabel("Time (Years)");
        l4=new JLabel("Simple Interest");

        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        t4=new JTextField();

        b1=new JButton("Calculate");
        b2=new JButton("Clear");

        setLayout(null);

        l1.setBounds(50,40,120,30);
        t1.setBounds(180,40,150,30);

        l2.setBounds(50,90,120,30);
        t2.setBounds(180,90,150,30);

        l3.setBounds(50,140,120,30);
        t3.setBounds(180,140,150,30);

        l4.setBounds(50,190,120,30);
        t4.setBounds(180,190,150,30);

        b1.setBounds(60,250,120,40);
        b2.setBounds(210,250,120,40);

        add(l1);
        add(l2);
        add(l3);
        add(l4);

        add(t1);
        add(t2);
        add(t3);
        add(t4);

        add(b1);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        b1.setBackground(Color.GREEN);
        b2.setBackground(Color.RED);

        setSize(420,380);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==b1){

            double p=Double.parseDouble(t1.getText());
            double r=Double.parseDouble(t2.getText());
            double n=Double.parseDouble(t3.getText());

            double si=(p*r*n)/100;

            t4.setText(String.valueOf(si));
        }

        if(e.getSource()==b2){

            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");

        }

    }

    public static void main(String args[]){

        new SimpleInterestCalculator();

    }

}



setTitle("Simple Interest Calculator v2");

getContentPane().setBackground(Color.CYAN);