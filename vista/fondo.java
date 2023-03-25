package vista;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;

public class fondo extends JPanel 
 {
    //------------------------
    //Atributos
    //-------------------------
    private JLabel lbImagen;
    private ImageIcon iImagen;
    public JButton  btComenzar;
   
    //------------------------
    //Metodos
    //-------------------------

    //-------------------------
    //constructor
    //-------------------------
    public fondo(){
        //Creacion y adicion de la imagen al panel
        iImagen= new ImageIcon((getClass().getResource("/Vista/Train.png")));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(0,0,400,120);
        this.add(lbImagen);
       
        //Creacion del borde la Ventana 
        TitledBorder borde = BorderFactory.createTitledBorder("Inicio de la aplicación");
        borde.setTitleColor(Color.black);
        setBorder(borde);
        
    }
}
