package grafc;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.Random;

public class calculusMatematicus {

	public static double soma(double a, double b) {
		if (a == 0 && b== 0) return 0;
		if (a < 0)
		{
			JOptionPane.showMessageDialog(null, "Não faz sentido, o produto ter preço negativo você foi pago para comprar?", "Erro", JOptionPane.ERROR_MESSAGE);
			return 0;
		}
		if (b < 0)
		{
			JOptionPane.showMessageDialog(null, "Não faz sentido, o desconto ter preço negativo isso é um acréscimo então", "Erro", JOptionPane.ERROR_MESSAGE);

		}
		return a - (a * (b/100));
	}

	public static double acrementar(double a, double b) {
		if (a == 0 && b== 0) return 0;
		return a + (a * (b/100));
	}
	public static double amostragem(double a, double b) {
		if (a == 0 && b== 0) return 0;
		return (a*b)/100;
	}
	public static double amostragem2(double a, double b) {
		if (a == 0 && b== 0) return 0;
		if (a == 0) return 0;
		return (100*b)/a;
	}
	public static double pagueiavalorb(double a, double b) {
		if (a == 0 && b== 0) return 0;
		if (a == 0) return 0;
		return ((a-b)/a)*100;
	}
	public static double deltadiff(double a, double b) {

		if (a == 0 && b== 0) return 0;
		if (a == 0) return 0;
		return ((b-a)/a)*100;
	}
	public static double valoorg(double a, double b) {
		if (a == 0 && b== 0) return 0;
		if (b == 100 && a !=0)
		{
			JOptionPane.showMessageDialog(null, "Não faz sentido, se você ganhou um desconto de 100% como que o produto final ainda tem preço?", "Erro", JOptionPane.ERROR_MESSAGE);
			return 0;
		}
		return ((a*100)/(100-b));
	}
	public static double regrade3(double a, double b,double r1) {
		if (a == 0 || b == 0) {

			return 0;
	}
		return (b*r1) / a;
	}
	public static String gerarsenha(int a, boolean maiu, boolean minu, boolean simb, boolean nume) {

		String letrasmau = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String letrasminu = "abcdefghijklmnopqrstuvwxyz";
		String numero = "0123456789";
		String simbulo = "!@#$%^&*_+-=<>?";

		StringBuilder caracteresPermitidos = new StringBuilder();

		if (maiu) {
			caracteresPermitidos.append(letrasmau);
		}
		if (minu) {
			caracteresPermitidos.append(letrasminu);
		}
		if (simb) {
			caracteresPermitidos.append(simbulo);
		}
		if (nume) {
			caracteresPermitidos.append(numero);
		}

		StringBuilder stringAleatoria = new StringBuilder(a);
		Random random = new Random();

		for (int i = 0; i < a; i++) {
			int indiceAleatorio = random.nextInt(caracteresPermitidos.length());
			char caractereAleatorio = caracteresPermitidos.charAt(indiceAleatorio);
			stringAleatoria.append(caractereAleatorio);
		}

		return stringAleatoria.toString();
	}


}