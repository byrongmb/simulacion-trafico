import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Vehiculo{
    private final int velocidad = 5; 

    private int horientacion;
    private int color;

    private final JLabel car = new JLabel();
    private int posX;
    private int posY;
    private int posXIni;
    private int posYIni;

    public Vehiculo(final int posX, final int posY) {
        this.posXIni = posX;
        this.posYIni = posY;
        this.posX = posX;
        this.posY = posY;
        this.horientacion = 1;
        this.color = 1;
        crearAuto(horientacion, color);
        crearAuto(1, 1);
    }

    public Vehiculo(final int posX, final int posY, final int horientacion, final int color) {
        this.posXIni = posX;
        this.posYIni = posY;
        this.posX = posX;
        this.posY = posY;
        this.horientacion = horientacion;
        this.color = color;
        crearAuto(horientacion, color);
    }

    public void avanzar() {
        switch (horientacion) {
            case 1:
                posX += velocidad;                
                break;
            case 2:
                posX -= velocidad;
                break;
            case 3:
                posY -= velocidad;
                break;
            default:
                posY += velocidad;
                break;
        }
        car.setLocation(posX, posY);
    }
    public void reiniciar() {
        switch (horientacion) {
            case 1:
                posX = posXIni;                
                break;
            case 2:
                posX = posXIni;
                break;
            case 3:
                posY = posYIni;
                break;
            default:
                posY = posYIni;
                break;
        }
        car.setLocation(posX, posY);
    }

    public void crearAuto(final int horientacion, final int color) {
        String imagenUrl;
        if (color == 1) {
            switch (horientacion) {
                case 1:
                    imagenUrl = "img//car1Right.png";
                    break;
                case 2:
                    imagenUrl = "img//car1Left.png";
                    break;
                case 3:
                    imagenUrl = "img//car1Up.png";
                    break;
                case 4:
                    imagenUrl = "img//car1Down.png";
                    break;
                default:
                    imagenUrl = "img//car1Left.png";
                    this.horientacion = 1;
                    break;
            }
        } else {
            switch (horientacion) {
                case 1:
                    imagenUrl = "img//car2Right.png";
                    break;
                case 2:
                    imagenUrl = "img//car2Left.png";
                    break;
                case 3:
                    imagenUrl = "img//car2Up.png";
                    break;
                case 4:
                    imagenUrl = "img//car2Down.png";
                    break;
                default:
                    imagenUrl = "img//car2Right.png";
                    this.horientacion = 1;
                    break;
            }
            this.color = 2;
        }
        final ImageIcon imagen = new ImageIcon(imagenUrl);
        car.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(200, 100, Image.SCALE_SMOOTH)));
        car.setBounds(posX, posY, 160, 160);
    }

    // Getters and Setters
    public JLabel getCar() {
        return this.car;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(final int posY) {
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(final int posX) {
        this.posX = posX;
    }
}