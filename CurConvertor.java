import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

public class CurConvertor{
  
   
    public static void converter()
    {
         
        JFrame f = new JFrame("Currency Convertor");
         
        JLabel l1, l2 , l3 , l4;

        JTextField t1, t2, t3, t4;
          
        JButton b1, b2, b3, b4, b5;
  
        l1 = new JLabel("Rupees:");
        l1.setBounds(10, 40, 60, 15);
        l2 = new JLabel("Dollars:");
        l2.setBounds(170, 40, 60, 15);
        l3 = new JLabel("Pound:");
        l3.setBounds(10,120,60,15);
        l4 = new JLabel("Euro:");
        l4.setBounds(170,120,60,15);

        t1 = new JTextField("0");
        t1.setBounds(60, 40, 80, 20);
        t2 = new JTextField("0");
        t2.setBounds(240, 40, 80,20);
        t3 = new JTextField("0");
        t3.setBounds(60,120,80,20);
        t4 = new JTextField("0");
        t4.setBounds(240,120,80,20);
  
        b1 = new JButton("INR");
        b1.setBounds(45, 70, 80, 15);
        b2 = new JButton("Dollar");
        b2.setBounds(190, 70, 80, 15);
        b3 = new JButton("Pound");
        b3.setBounds(50,150,80,15);
        b4 = new JButton("Euro");
        b4.setBounds(190,150,80,15);
        b5 = new JButton("close");
        b5.setBounds(130, 190, 80, 30);
        
  
     
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                double d = Double.parseDouble(t1.getText());
  
                double d1 = Math.round((float)(d / 83.15));
                
            
                double d2 = Math.round((float)(d / 106));
                
                double d3 = Math.round((float)(d / 90));
                String str1 = String.valueOf(d1);
                String str2 = String.valueOf(d2);
                String str3 = String.valueOf(d3);
            
                t2.setText(str1);
                t3.setText(str2);
                t4.setText(str3);
            }
        });
  
        
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                double d2  = Double.parseDouble(t2.getText());
  
                double d3 = Math.round((float)(d2 * 83.15));
                
                
                double d4 = Math.round((float)(d2 * 0.78));

                double d5 = Math.round((float)(d2 * 0.92));
                
                String str2 = String.valueOf(d3);
                String str3 = String.valueOf(d4);
                String str4 = String.valueOf(d5);
  
                t1.setText(str2);
                t3.setText(str3);   
                t4.setText(str4);
            }
        });
        
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                double s = Double.parseDouble(t3.getText());
            
                double s1 =  Math.round((float)(s * 106));

                double s2 =  Math.round((float)(s * 1.28));

                double s3 =  Math.round((float)(s * 1.17));

                String str = String.valueOf(s1);
                String str2 = String.valueOf(s2);
                String str3 = String.valueOf(s3);

                t1.setText(str);
                t2.setText(str2);
                t4.setText(str3);   
            }        
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                double eu = Double.parseDouble(t3.getText());
        
                double eu1 =  Math.round((float)(eu * 90.68));
            
                double eu2 =  Math.round((float)(eu * 1.1));

                double eu3 =  Math.round((float)(eu * 0.86));   

                String str1 = String.valueOf(eu1);
                String str2 = String.valueOf(eu2);
                String str3 = String.valueOf(eu3);

                t1.setText(str1);
                t2.setText(str2);
                t3.setText(str3);
            }
        });
   
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                f.dispose();
            }
        });
  
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
  
        
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(l4);
        f.add(t4);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
  
        f.setLayout(null);
        f.setSize(400, 300);
        f.setVisible(true);
    }

    public static void main(String args[]){
        converter();
    }
}