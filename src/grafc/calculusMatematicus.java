package grafc;

import java.util.Random;

public class calculusMatematicus {

	public static double soma(double a, double b) {
		
		return a - (a * (b/100));
	}

	public static double acrementar(double a, double b) {
		
		return a + (a * (b/100));
	}
	public static double amostragem(double a, double b) {

		return (a*b)/100;
	}
	public static double amostragem2(double a, double b) {

		return (100*b)/a;
	}
	public static double pagueiavalorb(double a, double b) {

		return ((a-b)/a)*100;
	}
	public static double deltadiff(double a, double b) {

		return ((b-a)/a)*100;
	}
	public static double valoorg(double a, double b) {

		return ((a*100)/(100-b));
	}
	public static double regrade3(double a, double b,double r1) {

		return (r1*b)/a;
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