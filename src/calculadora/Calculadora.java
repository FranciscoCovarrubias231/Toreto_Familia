package calculadora;
import javax.swing.*;

public class Calculadora extends JFrame
{
    JLabel lbl1, lbl2,lbl3;
    JTextField txt1,txt2,txt3;
    JButton suma;
    
  public Calculadora()
  {
    setLayout(null);
    lbl1 = new JLabel();
    lbl2 = new JLabel();
    lbl3 = new JLabel();
    txt1 = new JTextField();
    txt2 = new JTextField();
    txt3 = new JTextField();
    suma = new JButton();
    lbl1.setBounds(10, 30, 100, 30); lbl1.setText("Numero Uno");
    lbl2.setBounds(10, 80, 100, 30); lbl2.setText("Numero Dos");
    lbl3.setBounds(10, 140, 100, 30); lbl3.setText("Resultado");
    txt1.setBounds(120, 160, 150, 30);
    txt2.setBounds(120, 80, 150, 30);
    txt3.setBounds(120, 160, 150, 30);
    suma.setBounds(80, 150, 150, 30); suma.setText("SUMAR");
    add(lbl1); add(lbl2); add(txt1); add(txt2); add(txt3);add(suma);
  }
    public static void main(String[] args)
    {
       Calculadora ventana = new Calculadora();
       ventana.setSize(320,240);
       ventana.setTitle("Calculadora JAVA");
       ventana.setLocationRelativeTo(null);
       ventana.setVisible(true);
       ventana.setResizable(false);
       ventana.setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }  
}