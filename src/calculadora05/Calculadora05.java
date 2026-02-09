package calculadora05;

public class Calculadora05 {
	public int sumar(int a, int b) { 
		return a + b; 
	}
	
	public int restar(int a, int b) { 
		return a - b; 
	}
	
	public int multiplicar(int a, int b) {
		return a * b;
	}

	public double dividir(int a, int b) {
		 if (b == 0) {
		 System.out.println("Error: división entre cero");
		 return 0;
		 }
		 return (double) a / b;
		}

	public int potencia(int base, int exponente) {
		int resultado = 1;
		for (int i = 0; i < exponente; i++) {
			resultado *= base;
		}
		return resultado;
	}

	public int modulo(int a, int b) {
		return a % b;        
	}

	
}
