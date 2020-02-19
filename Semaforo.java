import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Semaforo {
    private int estado;
    private JLabel smf = new JLabel();

    private int posX;
    private int posY;
    
    public Semaforo(int posX, int posY){
        this.estado = 0;
        this.posX = posX;
        this.posY = posY;
        estadoOff();
    }

    public Semaforo(int posX, int posY, int estado){
        this.estado = 0;
        this.posX = posX;
        this.posY = posY;
        switch (estado) {
            case 0:
                estadoOff();
                break;
            case 1:
                estado1();
                break;
            case 2:
                estado2();
                break;
            default:
                estado3();
                this.estado = 3;
                break;
        }
    }

    public void cambiarEstado(){
        switch (estado) {
            case 0:
            estado1();
            this.estado = 1;
                break;
            case 1:
                estado3();
                this.estado = 3;
                break;
            case 2:
                estado1();
                this.estado = 1;
                break;
            default:
                estado2();
                this.estado = 2;
                break;
        }

    }

    private void estadoOff(){
        String imagenUrl = "img//estadoOff.png";
        ImageIcon imagen = new ImageIcon(imagenUrl);
        smf.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(50, 75, Image.SCALE_SMOOTH))); 
        smf.setBounds(posX, posY, 200, 200);
    }
    private void estado1(){
        String imagenUrl = "img//estado1.png";
        ImageIcon imagen = new ImageIcon(imagenUrl);
        smf.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(50, 75, Image.SCALE_SMOOTH))); 
        smf.setBounds(posX, posY, 200, 200);
    }
    private void estado2(){
        String imagenUrl = "img//estado2.png";
        ImageIcon imagen = new ImageIcon(imagenUrl);
        smf.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(50, 75, Image.SCALE_SMOOTH))); 
        smf.setBounds(posX, posY, 200, 200);
    }
    private void estado3(){
        String imagenUrl = "img//estado3.png";
        ImageIcon imagen = new ImageIcon(imagenUrl);
        smf.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(50, 75, Image.SCALE_SMOOTH))); 
        smf.setBounds(posX, posY, 200, 200);
    }

    public JLabel getSmf(){
        return this.smf;
    }
    public int getEstado(){
        return this.estado;
    }
}