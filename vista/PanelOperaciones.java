package vista;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;

public class PanelOperaciones extends javax. swing.JPanel{
    // Atrivutos---------------
    public JButton btComenzar;
    private JLabel lbBienvenido;
    private JLabel lbPregunta;
    //----------------------
    //--Metodos-------------
    //-----------------------
    /*
     * 
     */
    public PanelOperaciones() 
    {
        this.setLayout(null);
        this.setBackground(Color.WHITE);
        // Creaciòn y adicion de el boton comenzar
       btComenzar = new JButton("Empezar");
        btComenzar.setActionCommand("Empezar"); 
        btComenzar.setBounds(550,300,105,25);
        add(btComenzar);
         //Creacion de las etiquetas pregunta y bienvenido
         lbBienvenido =new JLabel("Bienvenidos");
         lbBienvenido.setBounds(550, 50, 170, 50);
         add(lbBienvenido);
         
         lbPregunta =new JLabel("¿Quiere saber cual es tu IQ?");
         lbPregunta.setBounds(550,200, 170, 50);
         add(lbPregunta);

       


    }
}    
    
    

