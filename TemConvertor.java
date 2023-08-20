import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

public class TemConvertor{
    
    public static void converter(){
  
        JFrame f = new JFrame("Temperature Convertor");

        JLabel l1, l2 , l3 ;
  
        JTextField t1, t2, t3;

        JButton b1, b2, b3,  b4;
  
        l1 = new JLabel("clecius:");
        l1.setBounds(10, 40, 60, 15);
        l2 = new JLabel("Fahrenheit:");
        l2.setBounds(160, 40, 60, 15);
        l3 = new JLabel("Kelvin:");
        l3.setBounds(110,120,60,15);
        
        t1 = new JTextField("0");
        t1.setBounds(60, 40, 80, 20);
        t2 = new JTextField("0");
        t2.setBounds(240, 40, 80,20);
        t3 = new JTextField("0");
        t3.setBounds(155,120,80,20);
        
        b1 = new JButton("CEL");
        b1.setBounds(45, 70, 80, 15);
        b2 = new JButton("FHR");
        b2.setBounds(190, 70, 80, 15);
        b3 = new JButton("KEL");
        b3.setBounds(130,150,80,15);
   
        b4 = new JButton("close");
        b4.setBounds(130, 190, 80, 20);
        
  
       
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
              
                double d = Double.parseDouble(t1.getText());
                
               
                double F = Math.round((d * 9/5) + 32);
                double K = Math.round(d + 273.15);

                
                
                String str1 = String.valueOf(F);
                String str2 = String.valueOf(K);
                
               
                t2.setText(str1);
                t3.setText(str2);
               
                
            }
        });
  
        
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                
                double d = Double.parseDouble(t2.getText());
              
                double C = Math.round((d - 32) * 5/9);

                double K = Math.round((d - 32) * 5/9 + 273.15);
                    
                String str2 = String.valueOf(C);
                String str3 = String.valueOf(K);

                t1.setText(str2);
                t3.setText(str3);
                
            }
        });
        
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                double s = Double.parseDouble(t3.getText());
           
                double C = Math.round(s - 273.15);

                double F = Math.round((s - 273.15) * 9/5 + 32);

                String str = String.valueOf(C);
                String str2 = String.valueOf(F);
            
                t1.setText(str);
                t2.setText(str2);
           
            }        
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
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
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
  
        f.setLayout(null);
        f.setSize(400, 300);
        f.setVisible(true);
    }
  
    
    public static void main(String args[]){
        converter();
    }
}