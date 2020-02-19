import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Ventana extends JFrame {
    private static final long serialVersionUID = 1L;
    private JButton btn = new JButton();
    //Pista
    private Pista pst = new Pista();
    //Autos
    private Vehiculo aut1 = new Vehiculo(0, 300,1,1);
    private Vehiculo aut2 = new Vehiculo(400, 0,4,2);
    //Semaforos
    private Semaforo smf1 = new Semaforo(280,400,3);
    private Semaforo smf2 = new Semaforo(550,85,1);

    public Ventana(){
        inicializarVentana();
        componentes();
    }

    private void inicializarVentana(){
        this.setSize(900, 700);
        this.setTitle("Proyecto Programacion - Segundo Parcial");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
    }

    private void componentes(){
        pst.setLayout(null);
        this.getContentPane().add(pst);
        compAutos();
        compSemaforos();
        compBoton();
    }

    private void compAutos()
    {
        pst.add(aut1.getCar());
        pst.add(aut2.getCar());
    }
    private void compSemaforos()
    {
        pst.add(smf1.getSmf());
        pst.add(smf2.getSmf());
    }

    private void compBoton()
    {
        btn.setText("Iniciar");
        btn.setBounds(400, 600, 100, 50);
        ActionListener press = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                aut1.avanzar();
                aut2.avanzar();               
            }
        };
        btn.addActionListener(press);
        pst.add(btn);
    }

    public static void main(String[] args) {
        Ventana vnt = new Ventana();
        vnt.setVisible(true);
    }
}