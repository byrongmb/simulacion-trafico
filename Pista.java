import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Pista extends JPanel {

	  private static final long serialVersionUID = 1L;
	  public void paintComponent(Graphics g){
		  Dimension tamanio = getSize();
		  ImageIcon imagenFondo =  new ImageIcon(Pista.class.getResource("img//pista.png"));
		  g.drawImage(imagenFondo.getImage(),0,0, tamanio.width, tamanio.height,null);
		  setOpaque(false);
		  super.paintComponents(g);
	  }
}