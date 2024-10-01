package grafc;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AtividadeWindow extends JFrame {
	
	private JTextField txfValorA;
	private JTextField txfValorA2;
	private JTextField txfValorB;
	private JTextField txfResultado;
	private JTextField txfResultado2;
	private JButton btnResultado;
	
	private JLabel lblValorA;
	private JLabel lblValorB;
	private JLabel lblValorResultado;
	private JLabel lblValorResultado2;


	
	private JLabel lblValorB2;
	private JLabel lblValorA2;
	
	private JPanel pnl1;
	private JPanel pnl2;
	
	public AtividadeWindow() {
		setSize(1850,700);
		setTitle("Trabalho I -> Cálculos Matemáticos");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		componentesCriar();
		acrecimoPercent();
		terceiroPedro();
		setVisible(true);
	}
	
	private void componentesCriar() {
		
		pnl1 = new JPanel();
		pnl1.setLayout(null);
		pnl1.setBounds(10, 10, 330, 200);
		pnl1.setBorder(BorderFactory.createTitledBorder("Aplicar Desconto"));
		
			lblValorA = new JLabel("Valor Inicial R$(a):");
			lblValorA.setForeground(Color.red);
		    lblValorA.setBounds(10, 20, 200, 35);
			pnl1.add(lblValorA);
			
			
			txfValorA = new JTextField();
			txfValorA.setBounds(117, 20, 200, 35);
			txfValorA.addKeyListener(new KeyListener() {
				
				@Override
				public void keyTyped(KeyEvent e) {
					
				}
				
				@Override
				public void keyReleased(KeyEvent e) {
					
				}
				
				@Override
				public void keyPressed(KeyEvent e) {
					if (e.getKeyCode() == KeyEvent.VK_ENTER) {
						txfValorB.requestFocus();	
					}				
				}
			});
			pnl1.add(txfValorA);
			
			lblValorB = new JLabel("Desconto:");
			lblValorB.setForeground(Color.black);
		    lblValorB.setBounds(55, 60, 200, 35);
			pnl1.add(lblValorB);

			
			txfValorB = new JTextField();
			txfValorB.setBounds(117, 60, 200, 35);
			txfValorB.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if (e.getKeyCode() == KeyEvent.VK_ENTER) {
						btnResultado.doClick();
					}
				}
			});
			pnl1.add(txfValorB);
			
			lblValorResultado = new JLabel("Resultado:");
			lblValorResultado.setForeground(Color.black);
		    lblValorResultado.setBounds(55, 100, 200, 35);
			pnl1.add(lblValorResultado);
			
			txfResultado = new JTextField();
			txfResultado.setBounds(117, 100, 200, 35);
			pnl1.add(txfResultado);
			
			btnResultado = new JButton(new AbstractAction("CALCULAR") {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					double a = Double.parseDouble(txfValorA.getText());
					double b = Double.parseDouble(txfValorB.getText());
					
					double resultado = calculusMatematicus.soma(a, b);
					txfResultado.setText(""+resultado);
					
				}
			});

			btnResultado.setBounds(115, 140, 100, 35);
			pnl1.add(btnResultado);
		
		getContentPane().add(pnl1);		
	}
	
	private void acrecimoPercent() {
		
		pnl2 = new JPanel();
		pnl2.setLayout(null);
		pnl2.setBounds(345, 10, 330, 200);
		pnl2.setBorder(BorderFactory.createTitledBorder("Incrementar Percentual"));
		
			lblValorA2 = new JLabel("Valor Inicial R$(a):");
			lblValorA2.setForeground(Color.red);
		    lblValorA2.setBounds(10, 20, 200, 35);
			pnl2.add(lblValorA2);
			
			
			txfValorA2 = new JTextField();
			txfValorA2.setBounds(117, 20, 200, 35);
			txfValorA2.addKeyListener(new KeyListener() {
				
				@Override
				public void keyTyped(KeyEvent e) {
					
				}
				
				@Override
				public void keyReleased(KeyEvent e) {
					
				}
				
				@Override
				public void keyPressed(KeyEvent e) {
					if (e.getKeyCode() == KeyEvent.VK_ENTER) {
						txfValorB.requestFocus();	
					}				
				}
			});
			pnl2.add(txfValorA2);
			
			lblValorB2 = new JLabel("Incrementar %:");
			lblValorB2.setForeground(Color.black);
		    lblValorB2.setBounds(27, 60, 200, 35);
			pnl2.add(lblValorB2);

			txfValorB = new JTextField();
			txfValorB.setBounds(117, 60, 200, 35);
			txfValorB.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if (e.getKeyCode() == KeyEvent.VK_ENTER) {
						btnResultado.doClick();
					}
				}
			});
			pnl2.add(txfValorB);
			
			lblValorResultado2 = new JLabel("Resultado:");
			lblValorResultado2.setForeground(Color.black);
		    lblValorResultado2.setBounds(55, 100, 200, 35);
			pnl2.add(lblValorResultado2);

			
			txfResultado2 = new JTextField();
			txfResultado2.setBounds(117, 100, 200, 35);
			pnl2.add(txfResultado2);
			
			btnResultado = new JButton(new AbstractAction("CALCULAR") {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					double a = Double.parseDouble(txfValorA2.getText());
					double b = Double.parseDouble(txfValorB.getText());
					
					double resultado = calculusMatematicus.acrementar(a, b);
					txfResultado2.setText(""+resultado);
					
				}
			});
			
		    JLabel lblValorResult2 = new JLabel("Resultado:");
		    lblValorResult2.setBounds(10, 90, 200, 35);
		    getContentPane().add(lblValorResult2);

			btnResultado.setBounds(115, 140, 100, 35);
			pnl2.add(btnResultado);
		
		getContentPane().add(pnl2);		
	}
	
	//MEU TERCEIRO PEDRO
	
	private void terceiroPedro() {
		
		pnl2 = new JPanel();
		pnl2.setLayout(null);
		pnl2.setBounds(680, 10, 330, 200);
		pnl2.setBorder(BorderFactory.createTitledBorder("TERCEIRO PROGRAMA PEDRO 3"));
		
			lblValorA2 = new JLabel("Valor Inicial R$(a):");
			lblValorA2.setForeground(Color.red);
		    lblValorA2.setBounds(10, 20, 200, 35);
			pnl2.add(lblValorA2);
			
			
			txfValorA2 = new JTextField();
			txfValorA2.setBounds(117, 20, 200, 35);
			txfValorA2.addKeyListener(new KeyListener() {
				
				@Override
				public void keyTyped(KeyEvent e) {
					
				}
				
				@Override
				public void keyReleased(KeyEvent e) {
					
				}
				
				@Override
				public void keyPressed(KeyEvent e) {
					if (e.getKeyCode() == KeyEvent.VK_ENTER) {
						txfValorB.requestFocus();	
					}				
				}
			});
			pnl2.add(txfValorA2);
			
			lblValorB2 = new JLabel("Incrementar %:");
			lblValorB2.setForeground(Color.black);
		    lblValorB2.setBounds(27, 60, 200, 35);
			pnl2.add(lblValorB2);

			txfValorB = new JTextField();
			txfValorB.setBounds(117, 60, 200, 35);
			txfValorB.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if (e.getKeyCode() == KeyEvent.VK_ENTER) {
						btnResultado.doClick();
					}
				}
			});
			pnl2.add(txfValorB);
			
			lblValorResultado2 = new JLabel("Resultado:");
			lblValorResultado2.setForeground(Color.black);
		    lblValorResultado2.setBounds(55, 100, 200, 35);
			pnl2.add(lblValorResultado2);

			
			txfResultado2 = new JTextField();
			txfResultado2.setBounds(117, 100, 200, 35);
			pnl2.add(txfResultado2);
			
			btnResultado = new JButton(new AbstractAction("CALCULAR") {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					double a = Double.parseDouble(txfValorA2.getText());
					double b = Double.parseDouble(txfValorB.getText());
					
					double resultado = calculusMatematicus.acrementar(a, b);
					txfResultado2.setText(""+resultado);
					
				}
			});
			
		    JLabel lblValorResult2 = new JLabel("Resultado:");
		    lblValorResult2.setBounds(10, 90, 200, 35);
		    getContentPane().add(lblValorResult2);

			btnResultado.setBounds(115, 140, 100, 35);
			pnl2.add(btnResultado);
		
		getContentPane().add(pnl2);		
	}
	
	//
	
	
	public static void main(String[] args) {
		new AtividadeWindow();
	}

}




