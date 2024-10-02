package grafc;

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
	public static double gerarsenha(double a, double b) {

		return (b)/a;
	}


}