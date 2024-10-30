import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class miVentana extends JFrame{
    private JPanel miPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton sumarButton;
    private JButton multiplicarButton;
    private JTextField txtRespuesta;
    private JTextField txtRespuesta2;
    private JButton restarButton;
    private JButton dividirButton;

    public miVentana() {
        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(textField1.getText());
                    double b = Double.parseDouble(textField2.getText());
                    double suma;
                    suma = a +b;
                    txtRespuesta.setText("La suma queda como: ");
                    txtRespuesta2.setText(String.valueOf(suma));
                }catch (Exception NumberFormatException){
                    JOptionPane.showMessageDialog(miPanel,"El programa No acepta letras");
                }
            }
        });
        restarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(textField1.getText());
                    double b = Double.parseDouble(textField2.getText());
                    double resta;
                    resta = a - b;
                    txtRespuesta.setText("La resta queda como: ");
                    txtRespuesta2.setText(String.valueOf(resta));
                }catch (Exception NumberFormatException){
                    JOptionPane.showMessageDialog(miPanel,"El programa No acepta letras");
                }
            }
        });
        multiplicarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(textField1.getText());
                    double b = Double.parseDouble(textField2.getText());
                    double multi;
                    multi = a * b;
                    txtRespuesta.setText("La multiplicación queda como: ");
                    txtRespuesta2.setText(String.valueOf(multi));
                }catch (Exception NumberFormatException){
                    JOptionPane.showMessageDialog(miPanel,"El programa No acepta letras");
                }
            }
        });
        dividirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(textField1.getText());
                    double b = Double.parseDouble(textField2.getText());
                    double div;
                    div = a / b;
                    txtRespuesta.setText("La división queda como: ");
                    txtRespuesta2.setText(String.valueOf(div));
                }catch (Exception NumberFormatException){
                    JOptionPane.showMessageDialog(miPanel,"El programa No acepta letras");
                }
            }
        });
    }

    public static void main(String[] args) {
        miVentana v = new miVentana();
        v.setContentPane(v.miPanel);
        v.setSize(500, 500);
        v.setVisible(true);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
