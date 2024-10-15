//Kaueh Vitali, Pedro Lima e Gabriel Cardoso
package grafc;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

import static java.lang.reflect.Array.getLength;

public class AtividadeWindow extends JanelaBase {

		public AtividadeWindow() {
			super();

			componentesCriar();
			acrecimoPercent();
			terceiroPedro();
			primeirokaueh();
			segundokaueh();
			terceirokaueh();
			quartokaueh();
			quintokaueh();
			setimokaueh();

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
			addNumericFilter(txfValorA,6);
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
			lblValorB.setForeground(Color.blue);
		    lblValorB.setBounds(55, 60, 200, 35);
			pnl1.add(lblValorB);


			txfValorB = new JTextField();
			txfValorB.setBounds(117, 60, 200, 35);
			addNumericFilter(txfValorB,6);
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

					if (txfValorA.getText().isEmpty() || txfValorB.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
						return;
					}

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
			addNumericFilter(txfValorAIncrementar,6);
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
			lblValorBIncrementar.setForeground(Color.blue);
		    lblValorBIncrementar.setBounds(27, 60, 200, 35);
			pnlincrementar.add(lblValorBIncrementar);

			txfValorBIncrementar = new JTextField();
			txfValorBIncrementar.setBounds(117, 60, 200, 35);
			addNumericFilter(txfValorBIncrementar,6);
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

					if (txfValorAIncrementar.getText().isEmpty() || txfValorBIncrementar.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
						return;
					}

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
			addNumericFilter(txfValorA3,6);
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
			lblValorB3.setForeground(Color.blue);
		    lblValorB3.setBounds(25, 60, 200, 35);
			pnl3.add(lblValorB3);

			txfValorB3 = new JTextField();
			txfValorB3.setBounds(117, 60, 200, 35);
			addNumericFilter(txfValorB3,6);
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

					if (txfValorA3.getText().isEmpty() || txfValorB3.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
						return;
					}

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

		lblValorA4 = new JLabel("Total[a]:");
		lblValorA4.setForeground(Color.red);
		lblValorA4.setBounds(65, 20, 200, 35);
		pnl4.add(lblValorA4);


		txfValorA4 = new JTextField();
		txfValorA4.setBounds(117, 20, 200, 35);
		addNumericFilter(txfValorA4,6);
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

		lblValorB4 = new JLabel("Parte[b]:");
		lblValorB4.setForeground(Color.blue);
		lblValorB4.setBounds(65, 60, 200, 35);
		pnl4.add(lblValorB4);

		txfValorB4 = new JTextField();
		txfValorB4.setBounds(117, 60, 200, 35);
		addNumericFilter(txfValorB4,6);
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

				if (txfValorA4.getText().isEmpty() || txfValorB4.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
					return;
				}

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
		addNumericFilter(txfValorA5,6);
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

		lblValorB5 = new JLabel("Valor c/desconto[b]:");
		lblValorB5.setForeground(Color.blue);
		lblValorB5.setBounds(2, 60, 200, 35);
		pnl5.add(lblValorB5);

		txfValorB5 = new JTextField();
		txfValorB5.setBounds(117, 60, 200, 35);
		addNumericFilter(txfValorB5,6);
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

				if (txfValorA5.getText().isEmpty() || txfValorB5.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
					return;
				}

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
		addNumericFilter(txfValorA6,6);
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

		lblValorB6 = new JLabel("Valor final[b]:");
		lblValorB6.setForeground(Color.blue);
		lblValorB6.setBounds(40, 60, 200, 35);
		pnl6.add(lblValorB6);

		txfValorB6 = new JTextField();
		txfValorB6.setBounds(117, 60, 200, 35);
		addNumericFilter(txfValorB6,6);
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

				if (txfValorA6.getText().isEmpty() || txfValorB6.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
					return;
				}

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
		addNumericFilter(txfValorA7,6);
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

		lblValorB7 = new JLabel("% Desconto[b]:");
		lblValorB7.setForeground(Color.blue);
		lblValorB7.setBounds(30, 60, 200, 35);
		pnl7.add(lblValorB7);

		txfValorB7 = new JTextField();
		txfValorB7.setBounds(117, 60, 200, 35);
		addNumericFilter(txfValorB7,6);
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

				if (txfValorA7.getText().isEmpty() || txfValorB7.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
					return;
				}

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
		addNumericFilter(txfValorA8,5);
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
		lblValorB8.setForeground(Color.blue);
		lblValorB8.setBounds(5, 60, 200, 35);
		pnl8.add(lblValorB8);

		txfValorB8 = new JTextField();
		txfValorB8.setBounds(20, 60, 135, 35);
		addNumericFilter(txfValorB8,5);
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
		addNumericFilter(txfValorR1,5);
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

				if (txfValorA8.getText().isEmpty() || txfValorB8.getText().isEmpty()|| txfValorR1.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
					return;
				}

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

	private void setimokaueh() {

		pnl9 = new JPanel();
		pnl9.setLayout(null);
		pnl9.setBounds(520, 410, 330, 200);
		pnl9.setBorder(BorderFactory.createTitledBorder("Gerador de senhas"));

		cbMa = new JCheckBox();
		cbMa.setBounds(10,30,20,15);
		pnl9.add(cbMa);

		cbMi = new JCheckBox();
		cbMi.setBounds(110,30,20,15);
		pnl9.add(cbMi);

		cbNu = new JCheckBox();
		cbNu.setBounds(10,59,20,15);
		pnl9.add(cbNu);

		cbSim = new JCheckBox();
		cbSim.setBounds(110,59,20,15);
		pnl9.add(cbSim);


		lblMaiuscula9 = new JLabel("Maiúsculas");
		lblMaiuscula9.setBounds(30, 20, 200, 35);
		pnl9.add(lblMaiuscula9);

		lblMinuscula9 = new JLabel("Minusculas");
		lblMinuscula9.setBounds(130, 20, 200, 35);
		pnl9.add(lblMinuscula9);

		lblNumeros9 = new JLabel("Números");
		lblNumeros9.setBounds(30, 50, 200, 35);
		pnl9.add(lblNumeros9);

		lblSimbulos9 = new JLabel("Símbulos");
		lblSimbulos9.setBounds(130, 50, 200, 35);
		pnl9.add(lblSimbulos9);

		lblTamanho9 = new JLabel("Tamanho");
		lblTamanho9.setBounds(15, 95, 200, 35);
		pnl9.add(lblTamanho9);

		SpinnerNumberModel model = new SpinnerNumberModel(8, 8, 18, 1);
		spiTamanhi = new JSpinner(model);
		spiTamanhi.setBounds(75, 100, 80, 25);
		pnl9.add(spiTamanhi);


		btnResultado9 = new JButton(new AbstractAction("CALCULAR") {

			@Override
			public void actionPerformed(ActionEvent e) {

				if ( !cbMa.isSelected() && !cbMi.isSelected() && !cbNu.isSelected() && !cbSim.isSelected()) {
					JOptionPane.showMessageDialog(null, "Por favor, Ecolha pelo menos uma das opções", "Erro", JOptionPane.ERROR_MESSAGE);
					return;
				}

				int a = (Integer) spiTamanhi.getValue();

				boolean maiu = cbMa.isSelected();
				boolean minu = cbMi.isSelected();
				boolean nume = cbNu.isSelected();
				boolean simb = cbSim.isSelected();

				String resultado = calculusMatematicus.gerarsenha(a,maiu,minu,simb,nume);

				txfResultado9.setText(""+resultado);

			}
		});

		JLabel lblValorResultado9 = new JLabel("Gerar:");
		lblValorResultado9.setBounds(10, 90, 200, 35);
		getContentPane().add(lblValorResultado9);

		btnResultado9.setBounds(210, 96, 100, 30);
		pnl9.add(btnResultado9);

		txfResultado9 = new JTextField();
		txfResultado9.setBounds(15, 150, 280, 30);
		txfResultado9.setEditable(false);
		pnl9.add(txfResultado9);

		getContentPane().add(pnl9);
	}

	private void addNumericFilter(JTextField textField, int limit) {
		((AbstractDocument) textField.getDocument()).setDocumentFilter(new NumericFilter(limit));
	}

	static class NumericFilter extends DocumentFilter {

			private int limit;

			public NumericFilter(int limit)
			{
			this.limit = limit;
			}
		@Override
		public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {

			if (string != null && string.matches("[0-9,.]*" )) {
				if ((fb.getDocument().getLength() + string.length()) <= limit) {
					super.insertString(fb, offset, string, attr);
				}
			}
		}

		@Override
		public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
			if (text != null && text.matches("[0-9,.]*")) {
				if ((fb.getDocument().getLength() - length + text.length()) <= limit) {
					super.replace(fb, offset, length, text, attrs);
				}
			}
		}

		@Override
		public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
			super.remove(fb, offset, length);
		}
	}

	public static void main(String[] args) {
		new AtividadeWindow();
	}

}




