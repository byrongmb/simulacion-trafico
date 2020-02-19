import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Ventana extends JFrame {
    private static final long serialVersionUID = 1L;
    
    private Pista pst = new Pista();
    private JButton btn = new JButton();
    private Vehiculo aut1 = new Vehiculo(100, 200,1,1);

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
        pst.add(aut1.getCar());
        this.getContentPane().add(pst);
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
        pst.add(btn);
    }

    public static void main(String[] args) {
        Ventana vnt = new Ventana();
        vnt.setVisible(true);
    }
}