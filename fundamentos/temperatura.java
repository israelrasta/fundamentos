package fundamentos;

public class temperatura {
	public static void main(String[] args) {
		 // (f-32) x 5/9= C
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;
		
		double FAHRE = 65;
		double celsius = (FAHRE - AJUSTE) * FATOR;
		 
		System.out.println( "A Temperatura Em Celsius É: " + celsius + " c." );
	}
}
 