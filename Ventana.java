import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Ventana extends JFrame {

    private JPanel panel = new JPanel();
    private JButton btn = new JButton();
    private Vehiculo aut1 = new Vehiculo(100, 200,4,2);

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
        panel.setLayout(null);
        panel.add(aut1.getCar());
        this.getContentPane().add(panel);
        bontoComp();
    }

    private void bontoComp()
    {
        btn.setText("Iniciar");
        btn.setBounds(400, 600, 100, 50);
        ActionListener press = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                aut1.avanzar();

            }
        };
        btn.addActionListener(press);
        panel.add(btn);
    }

    public static void main(String[] args) {
        Ventana vnt = new Ventana();
        vnt.setVisible(true);
    }
}