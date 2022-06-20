import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formCadastro extends JDialog{
    private JLabel iconLogin;
    private JLabel titCadastro;
    private JTextField nomeTextField;
    private JTextField RGtextField;
    private JTextField DtNascimentotextField;
    private JTextField TelefonetextField;
    private JTextField CEPtextField;
    private JTextField EmailtextField;
    private JTextField RuatextField;
    private JTextField BairrotextField;
    private JTextField CidadetextField;
    private JTextField EstadotextField;
    private JButton cadastrarButton;
    private JTextField NumerotextField;
    private JTextField ComplementotextField;
    private JRadioButton HomemradioButton;
    private JRadioButton MulherradioButton;
    private JPanel cadastroPanel;

    public formCadastro(JFrame parent){
        super(parent);
        setTitle("Cadastro");
        setContentPane(cadastroPanel);
        setMinimumSize(new Dimension(450, 480));
        setModal(true);
        setLocationRelativeTo(parent);
        setVisible(true);
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarUsuario();
            }
        });
    }

    private void registrarUsuario() {

    }


    public static void main(String[] args) {
        formCadastro myForm = new formCadastro(parent null);
    }

}
