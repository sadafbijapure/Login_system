
package databse;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ct1 extends javax.swing.JFrame implements CaretListener
{
 JTextField jt;
 JPanel jp;
 
 public ct1()
 {
     jt=new JTextField(10);
     jp=new JPanel();
     
     setLayout(null);
     jt.setBounds(50, 20, 50,30);
     jt.addCaretListener(this);
     
     jp.setBounds(50, 80, 200, 200);
     jp.setOpaque(true);
     jp.setBackground(Color.yellow);
     
 add(jt);
 add(jp);
 }
  int num;
  int n;
   JTextField jl[ ];
 public void caretUpdate(CaretEvent ce)
 {
    // System.out.println("CaretUpdate is called...");
     String str =jt.getText();
     
        jp.removeAll();
        if(!str.equals(" ")){
              num=Integer.parseInt(str);
            
           JTextField jl[ ]= new JTextField[num];
           int n= jl.length;
              for(int i=0;i<jl.length;i++)
              {
                  jl[i]=new JTextField(" hello ");
                  jp.add(jl[i]);
              }
              for(int i=0;i<n;i++)
              {
               System.out.println(jl[i].getText());   
              }
        }
        
        jp.validate();
        jp.repaint();
        
        }
 public static void main(String args[])
 {
     ct1 c=new ct1();
     c.setTitle("my frame ");
     c.setSize(300, 350);
     c.setVisible(true);
 }
}  







