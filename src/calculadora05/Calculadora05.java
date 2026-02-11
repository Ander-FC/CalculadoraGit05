package calculadora05;

/**
	@author
	Esta clase es utilizada como calculadora, incluyendo opciones para:
	sumar, restar, multiplicar, dividir, potencias y módulo.
*/
/**
 * Suma dos números enteros.
 *
 * @param a el primer número
 * @param b el segundo número
 * @return la suma de a y b
 */
public class Calculadora05 {
	/**
	Esta clase suma dos enteros.
	*/
	public int sumar(int a, int b) { 
		return a + b; 
	}
	/**
	Esta clase resta dos enteros.
	*/
	public int restar(int a, int b) { 
		return a - b; 
	}
	/**
	Esta clase multiplica dos enteros.
	*/
	public int multiplicar(int a, int b) {
		return a * b;
	}
	/**
	Esta clase divide dos enteros.
	*/
	public double dividir(int a, int b) {
		 if (b == 0) {
		 System.out.println("Error: división entre cero");
		 return 0;
		 }
		 return (double) a / b;
		}
	/**
	Esta clase eleva un entero a un exponente determinado.
	*/
	public int potencia(int base, int exponente) {
		int resultado = 1;
		for (int i = 0; i < exponente; i++) {
			resultado *= base;
		}
		return resultado;
	}
	/**
	Esta clase extrae el módulo/resto de una división entre enteros.
	*/
	public int modulo(int a, int b) {
		return a % b;        
	}

	
}
