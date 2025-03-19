
package Visual;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MiVentana extends JFrame{
    
    public MiVentana(){
        
        iniciarComponetes();
        
    }
    
    public void iniciarComponetes(){
       setLayout(new FlowLayout());
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Mi primera ventana");
        setLocationRelativeTo(null);

        add(new JButton("Click Aqui! 1"));
        add(new JButton("Click Aqui! 2")); 
    }
    
    
    public static void main(String[] args) {
        
        new MiVentana().setVisible(true);
        
        
    }
    
    
    
    
}
