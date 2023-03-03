import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Menu  extends JFrame{
    private JPanel panel1;
    private JComboBox opciones;
    private JButton bCalcelar ;
    private JButton bOk;

    private Monedas monedas;

    String opcion;

    private Menu menu;
    private void opcionParaConvertir(String opcion){

    }

    public Menu(){}

    public void cargandoComonentes(Menu menu){
        menu.setSize(500, 120);
        panel1.setSize(400,120);
        panel1.add(opciones);
        cololarBotones();
        panel1.setVisible(true);
        menu.setTitle("Menu");
        menu.add(panel1);
        menu.setVisible(true);
    }
    private void cololarBotones(){
        panel1.add(bCalcelar);
        panel1.add(bOk);

    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JComboBox getOpciones() {
        return opciones;
    }

    public void setOpciones(JComboBox opciones) {
        this.opciones = opciones;
    }

    public JButton getbCalcelar() {
        return bCalcelar;
    }

    public void setbCalcelar(JButton bCalcelar) {
        this.bCalcelar = bCalcelar;
    }

    public JButton getbOk() {
        return bOk;
    }

    public void setbOk(JButton bOk) {
        this.bOk = bOk;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Monedas getMonedas() {
        return monedas;
    }

    public void setMonedas(Monedas monedas) {
        this.monedas = monedas;
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }
}
