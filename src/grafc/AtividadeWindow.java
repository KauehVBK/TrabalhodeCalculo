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
	
	
	// DESCONTO
	private JPanel pnl1;
	private JLabel lblValorA;
	private JLabel lblValorB;
	private JLabel lblValorResultado;
	private JTextField txfValorA;
	private JTextField txfValorB;
	private JTextField txfResultado;
	private JButton btnResultado;
	
	//
	
	// INCREMENTAR
	private JPanel pnlincrementar;
	private JLabel lblValorAIncrementar;
	private JLabel lblValorBIncrementar;
	private JLabel lblValorResultadoIncrementar;
	private JTextField txfValorAIncrementar;
	private JTextField txfValorBIncrementar;
	private JTextField txfResultadoIncrementar;
	private JButton btnResultadoIncrementar;
	
	//

	// TERCEIRO PEDRO
	private JPanel pnl3;
	private JLabel lblValorA3;
	private JLabel lblValorB3;
	private JLabel lblValorResultado3;
	private JTextField txfValorA3;
	private JTextField txfValorB3;
	private JTextField txfResultado3;
	private JButton btnResultado3;

	
	
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
		
		pnlincrementar = new JPanel();
		pnlincrementar.setLayout(null);
		pnlincrementar.setBounds(345, 10, 330, 200);
		pnlincrementar.setBorder(BorderFactory.createTitledBorder("Incrementar Percentual"));
		
			lblValorAIncrementar = new JLabel("Valor Inicial R$(a):");
			lblValorAIncrementar.setForeground(Color.red);
		    lblValorAIncrementar.setBounds(10, 20, 200, 35);
			pnlincrementar.add(lblValorAIncrementar);
			
			
			txfValorAIncrementar = new JTextField();
			txfValorAIncrementar.setBounds(117, 20, 200, 35);
			txfValorAIncrementar.addKeyListener(new KeyListener() {
				
				@Override
				public void keyTyped(KeyEvent e) {
					
				}
				
				@Override
				public void keyReleased(KeyEvent e) {
					
				}
				
				@Override
				public void keyPressed(KeyEvent e) {
					if (e.getKeyCode() == KeyEvent.VK_ENTER) {
						txfValorBIncrementar.requestFocus();	
					}				
				}
			});
			pnlincrementar.add(txfValorAIncrementar);
			
			lblValorBIncrementar = new JLabel("Incrementar %:");
			lblValorBIncrementar.setForeground(Color.black);
		    lblValorBIncrementar.setBounds(27, 60, 200, 35);
			pnlincrementar.add(lblValorBIncrementar);

			txfValorBIncrementar = new JTextField();
			txfValorBIncrementar.setBounds(117, 60, 200, 35);
			txfValorBIncrementar.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if (e.getKeyCode() == KeyEvent.VK_ENTER) {
						btnResultadoIncrementar.doClick();
					}
				}
			});
			pnlincrementar.add(txfValorBIncrementar);
			
			lblValorResultadoIncrementar = new JLabel("Resultado:");
			lblValorResultadoIncrementar.setForeground(Color.black);
		    lblValorResultadoIncrementar.setBounds(55, 100, 200, 35);
			pnlincrementar.add(lblValorResultadoIncrementar);

			
			txfResultadoIncrementar = new JTextField();
			txfResultadoIncrementar.setBounds(117, 100, 200, 35);
			pnlincrementar.add(txfResultadoIncrementar);
			
			btnResultadoIncrementar = new JButton(new AbstractAction("CALCULAR") {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					double a = Double.parseDouble(txfValorAIncrementar.getText());
					double b = Double.parseDouble(txfValorBIncrementar.getText());
					
					double resultado = calculusMatematicus.acrementar(a, b);
					txfResultadoIncrementar.setText(""+resultado);
					
				}
			});
			
		    JLabel lblValorResultIncrementar = new JLabel("Resultado:");
		    lblValorResultIncrementar.setBounds(10, 90, 200, 35);
		    getContentPane().add(lblValorResultIncrementar);

			btnResultadoIncrementar.setBounds(115, 140, 100, 35);
			pnlincrementar.add(btnResultadoIncrementar);
		
		getContentPane().add(pnlincrementar);		
	}
	
	//MEU TERCEIRO PEDRO
	
	private void terceiroPedro() {
		
		pnl3 = new JPanel();
		pnl3.setLayout(null);
		pnl3.setBounds(680, 10, 330, 200);
		pnl3.setBorder(BorderFactory.createTitledBorder("TERCEIRO PROGRAMA PEDRO 3"));
		
			lblValorA3 = new JLabel("Valor Inicial R$(a):");
			lblValorA3.setForeground(Color.red);
		    lblValorA3.setBounds(10, 20, 200, 35);
			pnl3.add(lblValorA3);
			
			
			txfValorA3 = new JTextField();
			txfValorA3.setBounds(117, 20, 200, 35);
			txfValorA3.addKeyListener(new KeyListener() {
				
				@Override
				public void keyTyped(KeyEvent e) {
					
				}
				
				@Override
				public void keyReleased(KeyEvent e) {
					
				}
				
				@Override
				public void keyPressed(KeyEvent e) {
					if (e.getKeyCode() == KeyEvent.VK_ENTER) {
						txfValorB3.requestFocus();	
					}				
				}
			});
			pnl3.add(txfValorA3);
			
			lblValorB3 = new JLabel("Incrementar %:");
			lblValorB3.setForeground(Color.black);
		    lblValorB3.setBounds(27, 60, 200, 35);
			pnl3.add(lblValorB3);

			txfValorB3 = new JTextField();
			txfValorB3.setBounds(117, 60, 200, 35);
			txfValorB3.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if (e.getKeyCode() == KeyEvent.VK_ENTER) {
						btnResultado.doClick();
					}
				}
			});
			pnl3.add(txfValorB3);
			
			lblValorResultado3 = new JLabel("Resultado:");
			lblValorResultado3.setForeground(Color.black);
			lblValorResultado3.setBounds(55, 100, 200, 35);
			pnl3.add(lblValorResultado3);

			
			txfResultado3 = new JTextField();
			txfResultado3.setBounds(117, 100, 200, 35);
			pnl3.add(txfResultado3);
			
			btnResultado3 = new JButton(new AbstractAction("CALCULAR") {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					double a = Double.parseDouble(txfValorA3.getText());
					double b = Double.parseDouble(txfValorB3.getText());
					
					double resultado = calculusMatematicus.acrementar(a, b);
					txfResultado3.setText(""+resultado);
					
				}
			});
			
		    JLabel lblValorResultado3 = new JLabel("Resultado:");
		    lblValorResultado3.setBounds(10, 90, 200, 35);
		    getContentPane().add(lblValorResultado3);

		    btnResultado3.setBounds(115, 140, 100, 35);
			pnl3.add(btnResultado3);
		
		getContentPane().add(pnl3);		
	}
	
	//
	
	
	public static void main(String[] args) {
		new AtividadeWindow();
	}

}




