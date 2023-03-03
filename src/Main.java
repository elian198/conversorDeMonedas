import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;

public class Main extends Frame {
     static  int confirmacion =7;

    public static void main(String[] args) {


        menu();
        int con =  JOptionPane.showConfirmDialog(null, "Desea seguir","confirmacion", JOptionPane.YES_NO_OPTION);
        if(con == JOptionPane.YES_OPTION){
            menu();
        }
        else {
            JOptionPane.showMessageDialog(null,"Programa terminado");
            System.exit(0);
        }
    }

                static void menu(){
                    Menu menu = new Menu();
                    Monedas monedas = new Monedas();

                    menu.cargandoComonentes(menu);

                    menu.getbCalcelar().addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            menu.setVisible(false);
                        }
                    });
                    menu.getbOk().addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String opcion = menu.getOpciones().getSelectedItem().toString();
                            if (opcion == "Conversor de Monedas") {
                                monedas.cargarComponentes(monedas);
                                monedas.setVisible(true);
                                menu.setVisible(false);
                            }

                            monedas.getbCancelar().addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    monedas.setVisible(false);
                                }
                            });
                            monedas.getbOk().addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    monedas.setVisible(false);
                                    String opcion = monedas.getComboMonedas().getSelectedItem().toString();
                                    monedas.convertirValorExtranjero(opcion);
                                    JOptionPane.showMessageDialog(null, monedas.getResultado());

                                }

                            });
                        }
                    });
    }
                }







