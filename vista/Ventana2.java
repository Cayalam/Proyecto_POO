package vista;

import java.awt.Button;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Ventana2 extends JFrame {
    private Button btAceptar;
    public void initialize(){
    this.setTitle("Niveles de el juego");
    this.setSize(500,500); 
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setVisible(true); 

    
    


    }
    public void agregarOyentesBotones(ActionListener pAL)
    {
        btAceptar.addActionListener(pAL);
    }
}
