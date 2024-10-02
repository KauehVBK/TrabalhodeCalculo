package grafc;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

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

	//kaueh1
	private JPanel pnl4;
	private JLabel lblValorA4;
	private JLabel lblValorB4;
	private JLabel lblValorResultado4;
	private JTextField txfValorA4;
	private JTextField txfValorB4;
	private JTextField txfResultado4;
	private JButton btnResultado4;

	//kaueh2
	private JPanel pnl5;
	private JLabel lblValorA5;
	private JLabel lblValorB5;
	private JLabel lblValorResultado5;
	private JTextField txfValorA5;
	private JTextField txfValorB5;
	private JTextField txfResultado5;
	private JButton btnResultado5;

	//kaueh3
	private JPanel pnl6;
	private JLabel lblValorA6;
	private JLabel lblValorB6;
	private JLabel lblValorResultado6;
	private JTextField txfValorA6;
	private JTextField txfValorB6;
	private JTextField txfResultado6;
	private JButton btnResultado6;

	//kaueh4
	private JPanel pnl7;
	private JLabel lblValorA7;
	private JLabel lblValorB7;
	private JLabel lblValorResultado7;
	private JTextField txfValorA7;
	private JTextField txfValorB7;
	private JTextField txfResultado7;
	private JButton btnResultado7;

	//kaueh5
	private JPanel pnl8;
	private JLabel lblValorA8;
	private JLabel lblValorB8;
	private JLabel lblValorResultado8;
	private JLabel lblValorR1;
	private JTextField txfValorA8;
	private JTextField txfValorB8;
	private JTextField txfValorR1;
	private JTextField txfResultado8;
	private JButton btnResultado8;

	//kaueh6
	private JPanel pnl9;
	private JLabel lblMaiuscula9;
	private JLabel lblMinuscula9;
	private JLabel lblNumeros9;
	private JLabel lblSimbulos9;
	private JLabel lblTamanho9;
	private JLabel lblGerar9;

	private JCheckBox cbMa;
	private JCheckBox cbMi;
	private JCheckBox cbNu;
	private JCheckBox cbSim;

	private JSpinner spiTamanhi;

	private JTextField txfValorA9;
	private JTextField txfValorB9;

	private JTextField txfResultado9;
	private JButton btnResultado9;




	public AtividadeWindow() {
		setSize(1370,710);
		setTitle("Trabalho I -> Cálculos Matemáticos");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		componentesCriar();
		acrecimoPercent();
		terceiroPedro();
		primeirokaueh();
		segundokaueh();
		terceirokaueh();
		quartokaueh();
		quintokaueh();
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
			txfResultado.setEditable(false);
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
			txfResultadoIncrementar.setEditable(false);
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
		pnl3.setBorder(BorderFactory.createTitledBorder("Amostragem - Quanto X% Representa de Y"));
		
			lblValorA3 = new JLabel("Total(a):");
			lblValorA3.setForeground(Color.red);
		    lblValorA3.setBounds(70, 20, 200, 35);
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
			
			lblValorB3 = new JLabel("Porcentagem %:");
			lblValorB3.setForeground(Color.black);
		    lblValorB3.setBounds(25, 60, 200, 35);
			pnl3.add(lblValorB3);

			txfValorB3 = new JTextField();
			txfValorB3.setBounds(117, 60, 200, 35);
			txfValorB3.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if (e.getKeyCode() == KeyEvent.VK_ENTER) {
						btnResultado3.doClick();
					}
				}
			});
			pnl3.add(txfValorB3);
			
			lblValorResultado3 = new JLabel("Corresponde a:");
			lblValorResultado3.setForeground(Color.black);
			lblValorResultado3.setBounds(30, 100, 200, 35);
			pnl3.add(lblValorResultado3);

			
			txfResultado3 = new JTextField();
			txfResultado3.setBounds(117, 100, 200, 35);
			txfResultado3.setEditable(false);
			pnl3.add(txfResultado3);
			
			btnResultado3 = new JButton(new AbstractAction("CALCULAR") {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					double a = Double.parseDouble(txfValorA3.getText());
					double b = Double.parseDouble(txfValorB3.getText());
					
					double resultado = calculusMatematicus.amostragem(a, b);
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
	private void primeirokaueh() {

		pnl4 = new JPanel();
		pnl4.setLayout(null);
		pnl4.setBounds(1015, 10, 330, 200);
		pnl4.setBorder(BorderFactory.createTitledBorder("Amostragem 2 - Quanto X representa de Y"));

		lblValorA4 = new JLabel("Total[X]:");
		lblValorA4.setForeground(Color.red);
		lblValorA4.setBounds(65, 20, 200, 35);
		pnl4.add(lblValorA4);


		txfValorA4 = new JTextField();
		txfValorA4.setBounds(117, 20, 200, 35);
		txfValorA4.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					txfValorB4.requestFocus();
				}
			}
		});
		pnl4.add(txfValorA4);

		lblValorB4 = new JLabel("Parte[Y]:");
		lblValorB4.setForeground(Color.black);
		lblValorB4.setBounds(65, 60, 200, 35);
		pnl4.add(lblValorB4);

		txfValorB4 = new JTextField();
		txfValorB4.setBounds(117, 60, 200, 35);
		txfValorB4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnResultado4.doClick();
				}
			}
		});
		pnl4.add(txfValorB4);

		lblValorResultado4 = new JLabel("Corresponde a%:");
		lblValorResultado4.setForeground(Color.black);
		lblValorResultado4.setBounds(15, 100, 200, 35);
		pnl4.add(lblValorResultado4);


		txfResultado4 = new JTextField();
		txfResultado4.setBounds(117, 100, 200, 35);
		txfResultado4.setEditable(false);
		pnl4.add(txfResultado4);

		btnResultado4 = new JButton(new AbstractAction("CALCULAR") {

			@Override
			public void actionPerformed(ActionEvent e) {

				double a = Double.parseDouble(txfValorA4.getText());
				double b = Double.parseDouble(txfValorB4.getText());

				double resultado = calculusMatematicus.amostragem2(a, b);
				txfResultado4.setText(""+resultado);

			}
		});

		JLabel lblValorResultado4 = new JLabel("Resultado:");
		lblValorResultado4.setBounds(10, 90, 200, 35);
		getContentPane().add(lblValorResultado4);

		btnResultado4.setBounds(115, 140, 100, 35);
		pnl4.add(btnResultado4);

		getContentPane().add(pnl4);
	}
	
	// seggundo kaueh
	private void segundokaueh() {

		pnl5 = new JPanel();
		pnl5.setLayout(null);
		pnl5.setBounds(10, 210, 330, 200);
		pnl5.setBorder(BorderFactory.createTitledBorder("Era A paguei B, quanto de desconto?"));

		lblValorA5 = new JLabel("valor original[a]:");
		lblValorA5.setForeground(Color.red);
		lblValorA5.setBounds(25, 20, 200, 35);
		pnl5.add(lblValorA5);


		txfValorA5 = new JTextField();
		txfValorA5.setBounds(117, 20, 200, 35);
		txfValorA5.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					txfValorB5.requestFocus();
				}
			}
		});
		pnl5.add(txfValorA5);

		lblValorB5 = new JLabel("Valor c/desconto[Y]:");
		lblValorB5.setForeground(Color.black);
		lblValorB5.setBounds(2, 60, 200, 35);
		pnl5.add(lblValorB5);

		txfValorB5 = new JTextField();
		txfValorB5.setBounds(117, 60, 200, 35);
		txfValorB5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnResultado5.doClick();
				}
			}
		});
		pnl5.add(txfValorB5);

		lblValorResultado5 = new JLabel("% Desconto:");
		lblValorResultado5.setForeground(Color.black);
		lblValorResultado5.setBounds(45, 100, 200, 35);
		pnl5.add(lblValorResultado5);


		txfResultado5 = new JTextField();
		txfResultado5.setBounds(117, 100, 200, 35);
		txfResultado5.setEditable(false);
		pnl5.add(txfResultado5);

		btnResultado5 = new JButton(new AbstractAction("CALCULAR") {

			@Override
			public void actionPerformed(ActionEvent e) {

				double a = Double.parseDouble(txfValorA5.getText());
				double b = Double.parseDouble(txfValorB5.getText());

				double resultado = calculusMatematicus.pagueiavalorb(a, b);
				txfResultado5.setText(""+resultado);

			}
		});

		JLabel lblValorResultado5 = new JLabel("Resultado:");
		lblValorResultado5.setBounds(10, 90, 200, 35);
		getContentPane().add(lblValorResultado5);

		btnResultado5.setBounds(115, 140, 100, 35);
		pnl5.add(btnResultado5);

		getContentPane().add(pnl5);
	}

	//terceirokaueh

	private void terceirokaueh() {

		pnl6 = new JPanel();
		pnl6.setLayout(null);
		pnl6.setBounds(345, 210, 330, 200);
		pnl6.setBorder(BorderFactory.createTitledBorder("Variação Delta[%] - Diferença % entre valores"));

		lblValorA6 = new JLabel("valor inicial[a]:");
		lblValorA6.setForeground(Color.red);
		lblValorA6.setBounds(35, 20, 200, 35);
		pnl6.add(lblValorA6);


		txfValorA6 = new JTextField();
		txfValorA6.setBounds(117, 20, 200, 35);
		txfValorA6.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					txfValorB6.requestFocus();
				}
			}
		});
		pnl6.add(txfValorA6);

		lblValorB6 = new JLabel("Valor final[Y]:");
		lblValorB6.setForeground(Color.black);
		lblValorB6.setBounds(40, 60, 200, 35);
		pnl6.add(lblValorB6);

		txfValorB6 = new JTextField();
		txfValorB6.setBounds(117, 60, 200, 35);
		txfValorB6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnResultado6.doClick();
				}
			}
		});
		pnl6.add(txfValorB6);

		lblValorResultado6 = new JLabel("Diferença %:");
		lblValorResultado6.setForeground(Color.black);
		lblValorResultado6.setBounds(45, 100, 200, 35);
		pnl6.add(lblValorResultado6);


		txfResultado6 = new JTextField();
		txfResultado6.setBounds(117, 100, 200, 35);
		txfResultado6.setEditable(false);
		pnl6.add(txfResultado6);

		btnResultado6 = new JButton(new AbstractAction("CALCULAR") {

			@Override
			public void actionPerformed(ActionEvent e) {

				double a = Double.parseDouble(txfValorA6.getText());
				double b = Double.parseDouble(txfValorB6.getText());

				double resultado = calculusMatematicus.deltadiff(a, b);
				txfResultado6.setText(""+resultado);

			}
		});

		JLabel lblValorResultado6 = new JLabel("Resultado:");
		lblValorResultado6.setBounds(10, 90, 200, 35);
		getContentPane().add(lblValorResultado6);

		btnResultado6.setBounds(115, 140, 100, 35);
		pnl6.add(btnResultado6);

		getContentPane().add(pnl6);
	}

	//quartokaueh

	private void quartokaueh() {

		pnl7 = new JPanel();
		pnl7.setLayout(null);
		pnl7.setBounds(680, 210, 330, 200);
		pnl7.setBorder(BorderFactory.createTitledBorder("Qual era o valor orginal"));

		lblValorA7 = new JLabel("valor final[a]:");
		lblValorA7.setForeground(Color.red);
		lblValorA7.setBounds(40, 20, 200, 35);
		pnl7.add(lblValorA7);


		txfValorA7 = new JTextField();
		txfValorA7.setBounds(117, 20, 200, 35);
		txfValorA7.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					txfValorB7.requestFocus();
				}
			}
		});
		pnl7.add(txfValorA7);

		lblValorB7 = new JLabel("% Desconto[Y]:");
		lblValorB7.setForeground(Color.black);
		lblValorB7.setBounds(30, 60, 200, 35);
		pnl7.add(lblValorB7);

		txfValorB7 = new JTextField();
		txfValorB7.setBounds(117, 60, 200, 35);
		txfValorB7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnResultado7.doClick();
				}
			}
		});
		pnl7.add(txfValorB7);

		lblValorResultado7 = new JLabel("Valor inicial:");
		lblValorResultado7.setForeground(Color.black);
		lblValorResultado7.setBounds(45, 100, 200, 35);
		pnl7.add(lblValorResultado7);


		txfResultado7 = new JTextField();
		txfResultado7.setBounds(117, 100, 200, 35);
		txfResultado7.setEditable(false);
		pnl7.add(txfResultado7);

		btnResultado7 = new JButton(new AbstractAction("CALCULAR") {

			@Override
			public void actionPerformed(ActionEvent e) {

				double a = Double.parseDouble(txfValorA7.getText());
				double b = Double.parseDouble(txfValorB7.getText());

				double resultado = calculusMatematicus.valoorg(a, b);
				txfResultado7.setText(""+resultado);

			}
		});

		JLabel lblValorResultado7 = new JLabel("Resultado:");
		lblValorResultado7.setBounds(10, 90, 200, 35);
		getContentPane().add(lblValorResultado7);

		btnResultado7.setBounds(115, 140, 100, 35);
		pnl7.add(btnResultado7);

		getContentPane().add(pnl7);
	}

	//quintokaueh

	private void quintokaueh() {

		pnl8 = new JPanel();
		pnl8.setLayout(null);
		pnl8.setBounds(1015, 210, 330, 200);
		pnl8.setBorder(BorderFactory.createTitledBorder("Regra de 3"));

		lblValorA8 = new JLabel("A:");
		lblValorA8.setForeground(Color.red);
		lblValorA8.setBounds(5, 20, 200, 35);
		pnl8.add(lblValorA8);


		txfValorA8 = new JTextField();
		txfValorA8.setBounds(20, 20, 135, 35);
		txfValorA8.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					txfValorR1.requestFocus();
				}
			}
		});
		pnl8.add(txfValorA8);

		lblValorB8 = new JLabel("B:");
		lblValorB8.setForeground(Color.black);
		lblValorB8.setBounds(5, 60, 200, 35);
		pnl8.add(lblValorB8);

		txfValorB8 = new JTextField();
		txfValorB8.setBounds(20, 60, 135, 35);
		txfValorB8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnResultado8.doClick();
				}
			}
		});
		pnl8.add(txfValorB8);

		lblValorResultado8 = new JLabel("R2:");
		lblValorResultado8.setForeground(Color.GRAY);
		lblValorResultado8.setBounds(165, 60, 135, 35);
		pnl8.add(lblValorResultado8);

		lblValorR1 = new JLabel("R1:");
		lblValorR1.setForeground(Color.GREEN);
		lblValorR1.setBounds(165, 20, 135, 35);
		pnl8.add(lblValorR1);

		txfValorR1= new JTextField();
		txfValorR1.setBounds(185, 20, 135, 35);
		pnl8.add(txfValorR1);
		txfValorR1.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					txfValorB8.requestFocus();
				}
			}
		});


		txfResultado8 = new JTextField();
		txfResultado8.setBounds(185, 60, 135, 35);
		txfResultado8.setEditable(false);
		pnl8.add(txfResultado8);

		btnResultado8 = new JButton(new AbstractAction("CALCULAR") {

			@Override
			public void actionPerformed(ActionEvent e) {

				double a = Double.parseDouble(txfValorA8.getText());
				double b = Double.parseDouble(txfValorB8.getText());
				double r1 = Double.parseDouble(txfValorR1.getText());
				double resultado = calculusMatematicus.regrade3(a, b, r1);
				txfResultado8.setText(""+resultado);

			}
		});

		JLabel lblValorResultado8 = new JLabel("Resultado:");
		lblValorResultado8.setBounds(10, 90, 200, 35);
		getContentPane().add(lblValorResultado8);

		btnResultado8.setBounds(20, 110, 100, 35);
		pnl8.add(btnResultado8);

		getContentPane().add(pnl8);
	}
	//setimokaueh
/*
	private void setimokaueh() {

		pnl9 = new JPanel();
		pnl9.setLayout(null);
		pnl9.setBounds(1015, 210, 330, 200);
		pnl9.setBorder(BorderFactory.createTitledBorder("Regra de 3"));

		lblValorA9 = new JLabel("A:");
		lblValorA9.setForeground(Color.red);
		lblValorA9.setBounds(5, 20, 200, 35);
		pnl9.add(lblValorA8);


		txfValorA9 = new JTextField();
		txfValorA9.setBounds(20, 20, 135, 35);
		txfValorA9.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					txfValorR1.requestFocus();
				}
			}
		});
		pnl9.add(txfValorA9);

		lblValorB9 = new JLabel("B:");
		lblValorB9.setForeground(Color.black);
		lblValorB9.setBounds(5, 60, 200, 35);
		pnl8.add(lblValorB8);

		txfValorB9 = new JTextField();
		txfValorB9.setBounds(20, 60, 135, 35);
		txfValorB9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnResultado9.doClick();
				}
			}
		});
		pnl9.add(txfValorB9);

		lblValorResultado9 = new JLabel("R2:");
		lblValorResultado9.setForeground(Color.GRAY);
		lblValorResultado9.setBounds(165, 60, 135, 35);
		pnl9.add(lblValorResultado9);

		lblValorR1 = new JLabel("R1:");
		lblValorR1.setForeground(Color.GREEN);
		lblValorR1.setBounds(165, 20, 135, 35);
		pnl9.add(lblValorR1);

		txfValorR1= new JTextField();
		txfValorR1.setBounds(185, 20, 135, 35);
		pnl9.add(txfValorR1);
		txfValorR1.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					txfValorB8.requestFocus();
				}
			}
		});


		txfResultado9 = new JTextField();
		txfResultado9.setBounds(185, 60, 135, 35);
		txfResultado9.setEditable(false);
		pnl9.add(txfResultado9);

		btnResultado9 = new JButton(new AbstractAction("CALCULAR") {

			@Override
			public void actionPerformed(ActionEvent e) {

				double a = Double.parseDouble(txfValorA8.getText());
				double b = Double.parseDouble(txfValorB8.getText());
				double r1 = Double.parseDouble(txfValorR1.getText());
				double resultado = calculusMatematicus.gerarsenha(a, b);
				txfResultado9.setText(""+resultado);

			}
		});

		JLabel lblValorResultado9 = new JLabel("Resultado:");
		lblValorResultado9.setBounds(10, 90, 200, 35);
		getContentPane().add(lblValorResultado9);

		btnResultado9.setBounds(20, 110, 100, 35);
		pnl9.add(btnResultado9);

		getContentPane().add(pnl9);
	}
*/
	public static void main(String[] args) {
		new AtividadeWindow();
	}

}




