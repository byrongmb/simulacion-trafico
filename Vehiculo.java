import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Vehiculo {

    private JLabel car;
    private int posX;
    private int posY;
    private String imagenUrl = "/img/car_red.png";

    public Vehiculo(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        car = new JLabel(new ImageIcon(imagenUrl));
    }

    public void moverX(){
        posX += 5;
    }
    public void moverY()
    {
        posY += 5;
    }

    //Getters and Setters
    public JLabel getCar(){
        return this.car;
    }

    public int getPosY() {
        return posY;
    }
    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }
    public void setPosX(int posX) {
        this.posX = posX;
    }

}