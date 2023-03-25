package vista;
import javax.swing.JFrame;
public class VentanaPrincipal extends JFrame {
    //------------------------
    //Atributos
    //-------------------------
   public fondo miFondo;
   public PanelOperaciones miPanelOperaciones;
   public trasfodo miTrasfodo;

    //------------------------
    //Metodos
    //-------------------------

    //-------------------------
    //constructor
    //-------------------------
    public VentanaPrincipal(){
     //creacion de  la ventana
     // Creacion y adiccion del fondo de el programa
     miFondo = new fondo(); 
    miFondo.setBounds(10, 10, 450, 350);
    add(miFondo);
    miPanelOperaciones = new PanelOperaciones();
    miPanelOperaciones.setBounds(470,10, 330, 350);
    add(miPanelOperaciones);
    
    this.setTitle("TRAINER BRAIN");
    this.setSize(800,400); 
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setVisible(true); 
    
    }
    
}
