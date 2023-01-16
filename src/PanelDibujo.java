import java.awt.Graphics;
import javax.swing.JPanel;
public class PanelDibujo extends JPanel{
    //Dibuja una x desde las esquinas del panel
    public void paintComponent(Graphics g){
        //Llama a paintComponent para asegurar que el panel se muestre correctamente
        super.paintComponent(g);
        //Anchura y altura total
        int anchura = getWidth();
        int altura = getHeight();
        //Dibuja una linea desde la esquina superior izquierda a la mitad de la pantalla
        g.drawLine(3,3,anchura/2,3);
        //Dibuja una linea desde la esquina superior izquierda a la mitad de la pantalla
        g.drawLine(anchura/2,3,anchura/2,altura/2);
        //Dibuja una linea desde la esquina superior izquierda a la esquina inferior izquierda
        g.drawLine(3,0,3,altura);
        //Dibuja una linea desde la esquina superior izquierda a la esquina inferior izquierda
        g.drawLine(anchura/2,altura/2,3,altura/2);
    }
}
