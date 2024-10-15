//Kaueh Vitali, Pedro Lima e Gabriel Cardoso
package grafc;

import javax.swing.*;

public class JanelaBase extends JFrame {

    public JanelaBase() {
        setTitle("Trabalho I -> Cálculos Matemáticos");
        setSize(1370,710);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
    }

    protected JPanel criarPainel(String titulo, int x, int y, int largura, int altura) {
        JPanel painel = new JPanel();
        painel.setLayout(null);
        painel.setBounds(x, y, largura, altura);
        painel.setBorder(BorderFactory.createTitledBorder(titulo));
        return painel;
    }
    //limite de characters


    // DESCONTO
    protected JPanel pnl1;
    protected JLabel lblValorA;
    protected JLabel lblValorB;
    protected JLabel lblValorResultado;
    protected JTextField txfValorA;
    protected JTextField txfValorB;
    protected JTextField txfResultado;
    protected JButton btnResultado;

    //

    // INCREMENTAR
    protected JPanel pnlincrementar;
    protected JLabel lblValorAIncrementar;
    protected JLabel lblValorBIncrementar;
    protected JLabel lblValorResultadoIncrementar;
    protected JTextField txfValorAIncrementar;
    protected JTextField txfValorBIncrementar;
    protected JTextField txfResultadoIncrementar;
    protected JButton btnResultadoIncrementar;

    //

    // TERCEIRO PEDRO
    protected JPanel pnl3;
    protected JLabel lblValorA3;
    protected JLabel lblValorB3;
    protected JLabel lblValorResultado3;
    protected JTextField txfValorA3;
    protected JTextField txfValorB3;
    protected JTextField txfResultado3;
    protected JButton btnResultado3;

    //kaueh1
    protected JPanel pnl4;
    protected JLabel lblValorA4;
    protected JLabel lblValorB4;
    protected JLabel lblValorResultado4;
    protected JTextField txfValorA4;
    protected JTextField txfValorB4;
    protected JTextField txfResultado4;
    protected JButton btnResultado4;

    //kaueh2
    protected JPanel pnl5;
    protected JLabel lblValorA5;
    protected JLabel lblValorB5;
    protected JLabel lblValorResultado5;
    protected JTextField txfValorA5;
    protected JTextField txfValorB5;
    protected JTextField txfResultado5;
    protected JButton btnResultado5;

    //kaueh3
    protected JPanel pnl6;
    protected JLabel lblValorA6;
    protected JLabel lblValorB6;
    protected JLabel lblValorResultado6;
    protected JTextField txfValorA6;
    protected JTextField txfValorB6;
    protected JTextField txfResultado6;
    protected JButton btnResultado6;

    //kaueh4
    protected JPanel pnl7;
    protected JLabel lblValorA7;
    protected JLabel lblValorB7;
    protected JLabel lblValorResultado7;
    protected JTextField txfValorA7;
    protected JTextField txfValorB7;
    protected JTextField txfResultado7;
    protected JButton btnResultado7;

    //kaueh5
    protected JPanel pnl8;
    protected JLabel lblValorA8;
    protected JLabel lblValorB8;
    protected JLabel lblValorResultado8;
    protected JLabel lblValorR1;
    protected JTextField txfValorA8;
    protected JTextField txfValorB8;
    protected JTextField txfValorR1;
    protected JTextField txfResultado8;
    protected JButton btnResultado8;

    //kaueh6
    protected JPanel pnl9;
    protected JLabel lblMaiuscula9;
    protected JLabel lblMinuscula9;
    protected JLabel lblNumeros9;
    protected JLabel lblSimbulos9;
    protected JLabel lblTamanho9;
    protected JLabel lblGerar9;

    protected JCheckBox cbMa;
    protected JCheckBox cbMi;
    protected JCheckBox cbNu;
    protected JCheckBox cbSim;

    protected JSpinner spiTamanhi;

    protected JTextField txfValorA9;
    protected JTextField txfValorB9;

    protected JTextField txfResultado9;
    protected JButton btnResultado9;
}