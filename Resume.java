import javax.swing.*;
import java.awt.*;
import java.lang.*;
import java.util.*;

class Resume extends JFrame{
    Resume(){
        setLayout(new BorderLayout());
        JLabel l1=new JLabel("Resume Builder");
        JPanel jp1=new JPanel();
        JPanel jp2=new JPanel();
        JPanel jp3=new JPanel();

        jp2.setLayout( new GridBagLayout());
        GridBagConstraints gbs=new GridBagConstraints();
        JLabel l2=new JLabel("Name :");
        gbs.gridx=0;
        gbs.gridy=0;
        jp2.add(l2,gbs);

        JTextField t2=new JTextField(15);
        gbs.gridx=1;
        gbs.gridy=0;
        gbs.gridwidth=2;
        jp2.add(t2,gbs);

        JLabel l3=new JLabel("DOB :");
        gbs.gridx=0;
        gbs.gridy=1;
        gbs.gridwidth=1;
        jp2.add(l3,gbs);

        JTextField t3=new JTextField(15);
        gbs.gridx=1;
        gbs.gridy=1;
        gbs.gridwidth=2;
        jp2.add(t3,gbs);

        JLabel l7=new JLabel("10% :");
        gbs.gridx=0;
        gbs.gridy=2;
        gbs.gridwidth=1;
        jp2.add(l7,gbs);

        JTextField t7=new JTextField(15);
        gbs.gridx=1;
        gbs.gridy=2;
        gbs.gridwidth=2;
        jp2.add(t7,gbs);

        JLabel l8=new JLabel("12% :");
        gbs.gridx=0;
        gbs.gridy=3;
        gbs.gridwidth=1;
        jp2.add(l8,gbs);

        JTextField t8=new JTextField(15);
        gbs.gridx=1;
        gbs.gridy=3;
        gbs.gridwidth=2;
        jp2.add(t8,gbs);

        JLabel l9=new JLabel("Highest Degree:");
        gbs.gridx=0;
        gbs.gridy=4;
        gbs.gridwidth=1;
        jp2.add(l9,gbs);

        JTextField t9=new JTextField(15);
        gbs.gridx=1;
        gbs.gridy=4;
        gbs.gridwidth=2;
        jp2.add(t9,gbs);

        JLabel l10=new JLabel("Highest Degree %:");
        gbs.gridx=0;
        gbs.gridy=5;
        gbs.gridwidth=1;
        jp2.add(l10,gbs);

        JTextField t10=new JTextField(15);
        gbs.gridx=1;
        gbs.gridy=5;
        gbs.gridwidth=2;
        jp2.add(t10,gbs);

        JLabel l11=new JLabel("Skills:");
        gbs.gridx=0;
        gbs.gridy=6;
        gbs.gridwidth=1;
        jp2.add(l11,gbs);

        JTextArea t11=new JTextArea(3,15);
        gbs.gridx=1;
        gbs.gridy=6;
        gbs.gridwidth=2;
        jp2.add(t11,gbs);


        JLabel l4=new JLabel("Gender :");
        gbs.gridx=0;
        gbs.gridy=7;
        gbs.gridwidth=1;
        jp2.add(l4,gbs);

        JRadioButton r1=new JRadioButton("Male");
        gbs.gridx=1;
        gbs.gridy=7;
        gbs.gridwidth=1;
        jp2.add(r1,gbs);

        JRadioButton r2=new JRadioButton("Female");
        gbs.gridx=2;
        gbs.gridy=7;
        gbs.gridwidth=1;
        jp2.add(r2,gbs);

        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        JLabel l5=new JLabel("Address :");
        gbs.gridx=0;
        gbs.gridy=8;
        gbs.gridwidth=1;
        jp2.add(l5,gbs);

        JTextArea ta1=new JTextArea(5,20);
        gbs.gridx=1;
        gbs.gridy=8;
        gbs.gridwidth=2;
        jp2.add(ta1,gbs);

       JLabel l6=new JLabel("Email :");
        gbs.gridx=0;
        gbs.gridy=9;
        gbs.gridwidth=1;
        jp2.add(l6,gbs);

        JTextField t4=new JTextField(15);
        gbs.gridx=1;
        gbs.gridy=9;
        gbs.gridwidth=2;
        jp2.add(t4,gbs);

        JLabel l12=new JLabel("Work Experience:");
        gbs.gridx=0;
        gbs.gridy=10;
        gbs.gridwidth=1;
        jp2.add(l12,gbs);

        JTextField t12=new JTextField(15);
        gbs.gridx=1;
        gbs.gridy=10;
        gbs.gridwidth=2;
        jp2.add(t12,gbs);

        JLabel l13=new JLabel("Phone no.:");
        gbs.gridx=0;
        gbs.gridy=11;
        gbs.gridwidth=1;
        jp2.add(l13,gbs);

        JTextField t13=new JTextField(15);
        gbs.gridx=1;
        gbs.gridy=11;
        gbs.gridwidth=2;
        jp2.add(t13,gbs);



        JButton b1=new JButton("Ok");
        JButton b2=new JButton("Save");
        JButton b3=new JButton("Cancel");
        JButton b4=new JButton("Reset");

        jp1.setLayout(new FlowLayout());
        jp3.setLayout(new FlowLayout());

        jp1.add(l1);

        jp3.add(b1);
        jp3.add(b2);
        jp3.add(b3);
        jp3.add(b4);

        add(jp1,BorderLayout.NORTH);
        add(jp2,BorderLayout.CENTER);
        add(jp3,BorderLayout.SOUTH);

        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Resume();
    }
}