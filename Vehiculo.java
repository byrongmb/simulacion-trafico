import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Vehiculo{

    private JLabel car = new JLabel();
    private int posX;
    private int posY;
    private String imagenUrl = "img//car_red.png";

    public Vehiculo(int posX, int posY) {
        ImageIcon imagen = new ImageIcon(imagenUrl);
        car.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH))); 
        car.setBounds(posX, posY, 200, 200);
    }

    public void mover(){

        

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