import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args)  {
        try {
            //Crea un panel que contenga el dibujo
            PanelDibujo panel= new PanelDibujo();

            //Crea un nuevo marco para contener el panel
            JFrame aplicacion=new JFrame();

            //establece el marco para salir cuando se cierra
            aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            aplicacion.add(panel);
            aplicacion.setSize(350,350);
            aplicacion.setVisible(true);
        }catch(Exception Ex){System.out.println("Datos incorrectos");}
    }
}