import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Monedas extends  JFrame{

    private final double DOLLARS = 220, EUROS = 270, LIBRAS = 190, YEN_JAPONES = 120, WON_SUL_COREANO = 100;
    private Double valor;
    private double tipoMoneda;
    private  int cantidad;
    private JPanel jPanel;
    private JComboBox comboMonedas;
    private JButton bOk;
    private JButton bCancelar;

    private Monedas monedas;

    private String resultado;

    public Monedas() {

    }

    public void cargarComponentes(Monedas monedas){
        monedas.setSize(400,140);
        jPanel.add(comboMonedas);
        cololarBotones();
        monedas.add(jPanel);
    }
    private void cololarBotones(){
        jPanel.add(bCancelar);
        jPanel.add(bOk);

    }

    public double convertirValorPesos(String tipoMoneda) {
        switch (tipoMoneda){
            case "dollar" :
                valor = cantidad * getDOLLARS();
                break;
            case "euros" :
                valor = cantidad * getEUROS();
                break;
            case "libras" :
                valor = cantidad * getLIBRAS();
                break;
            case "yen_japones" :
                valor = cantidad * getYEN_JAPONES();
                break;
            case "won_sul_coreano" :
                valor = cantidad * getWON_SUL_COREANO();
                break;
        } return valor;
    }

    public double convertirValorExtranjero(String tipoMoneda){
        String cant = JOptionPane.showInputDialog("Ingrese el dinero: ");
            switch (tipoMoneda) {
                case "De pesos a dollar":
                    cantidad = Integer.parseInt(cant);
                    valor = cantidad / getDOLLARS();
                    resultado = "Udted tiene $" + getValor() + " " + tipoMoneda;

                    break;
                case "De pesos a euros":
                    valor = cantidad / getEUROS();
                    resultado = "Udted tiene $" + getValor() + " " + tipoMoneda;

                    break;
                case "De pesos a libras":
                    valor = cantidad / getLIBRAS();
                    resultado = "Udted tiene $" + getValor() + " " + tipoMoneda;
                    break;
                case "De pesos a yen_japones":
                    valor = cantidad / getYEN_JAPONES();
                    resultado = "Udted tiene $" + getValor() + " " + tipoMoneda;
                    break;
                case "De pesos a won_sul_coreano":
                    valor = cantidad / getWON_SUL_COREANO();
                    resultado = "Udted tiene $" + getValor() + " " + tipoMoneda;
                   break;
            }
            return valor;

    }

    public double getDOLLARS() {
        return DOLLARS;
    }

    public double getEUROS() {
        return EUROS;
    }

    public double getLIBRAS() {
        return LIBRAS;
    }

    public double getYEN_JAPONES() {
        return YEN_JAPONES;
    }

    public double getWON_SUL_COREANO() {
        return WON_SUL_COREANO;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public double getTipoMoneda() {
        return tipoMoneda;
    }

    public void setTipoMoneda(double tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getValor() {
        return  valor;
    }

    public JPanel getjPanel() {
        return jPanel;
    }

    public void setjPanel(JPanel jPanel) {
        this.jPanel = jPanel;
    }

    public JComboBox getComboMonedas() {
        return comboMonedas;
    }

    public void setComboMonedas(JComboBox comboMonedas) {
        this.comboMonedas = comboMonedas;
    }

    public JButton getbOk() {
        return bOk;
    }

    public void setbOk(JButton bOk) {
        this.bOk = bOk;
    }

    public JButton getbCancelar() {
        return bCancelar;
    }

    public void setbCancelar(JButton bCancelar) {
        this.bCancelar = bCancelar;
    }

    public Monedas getMonedas() {
        return monedas;
    }

    public void setMonedas(Monedas monedas) {
        this.monedas = monedas;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Monedas{" +
                "tipoMoneda='" + tipoMoneda + '\'' +
                ", valor=" + valor +
                '}';
    }
}
