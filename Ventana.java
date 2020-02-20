import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;


public class Ventana extends JFrame {
    private static final long serialVersionUID = 1L;
    private JButton btn = new JButton();
    int i = 0;

    private Timer semaforos = new Timer();
    private Timer autos = new Timer();

    //Pista
    private Pista pst = new Pista();
    //Autos
    private Vehiculo aut1;
    private Vehiculo aut2;
    //Semaforos
    private Semaforo smf1 = new Semaforo(280,400,3);
    private Semaforo smf2 = new Semaforo(550,85,1);

    public Ventana(){
        inicializarVentana();
        componentes();
    }

    private void reiniciar() {
        i = 0;
        aut1.reiniciar();
        aut2.reiniciar();
        if(smf1.getEstado() == smf2.getEstado())
        {
            smf1.cambiarEstado();
            smf1.cambiarEstado();                     
        }
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
        aut1 = new Vehiculo(0, 300,1,1);
        aut2 = new Vehiculo(400, 0,4,2);
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
                cambiarColor();
                moverAutos();
                btn.setEnabled(false);
                pst.repaint();             
            }
        };
        btn.addActionListener(press);
        pst.add(btn);
    }
    private void cambiarColor(){
        TimerTask tarea = new TimerTask(){        
            @Override
            public void run() {
                
                smf1.cambiarEstado();
                smf2.cambiarEstado();
            }
        };
        semaforos.schedule(tarea, 8200, 6250);
    }
    private void moverAutos(){
        TimerTask verificar = new TimerTask(){
            @Override
            public void run() {
                System.out.println("X:" + aut1.getPosX());
                System.out.println("I:" + i);
                if(aut1.getPosX() <= 810){
                    if(smf1.getEstado() == 3){
                        aut1.avanzar();
                    }
                    else{
                        if(i < 15){
                            aut1.avanzar();
                            i++;
                        }
                    }
                    if(smf2.getEstado() == 3){
                        aut2.avanzar();
                    }
                    else{
                        if(i < 15){
                            aut2.avanzar();
                            i++;
                        }
                    }     
                }
                else
                    reiniciar();                              
            }
        };
        autos.schedule(verificar, 200,50);
    }
    public static void main(String[] args) {
        Ventana vnt = new Ventana();
        vnt.setVisible(true);
    }
}