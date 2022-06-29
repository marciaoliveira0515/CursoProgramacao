package curso;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Digite a largura: ");
		double largura = sc.nextDouble();
		System.out.print("Digite o comprimento: ");
		double comprimento = sc.nextDouble();
		System.out.print("Digite o valor do metro quadrado: ");
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = metroQuadrado * area;
		
		
		System.out.printf("Area = %.2f%n", area);
		System.out.printf("Pre�o = %.2f%n",  preco);
				
				
				
		sc.close();

	}

}
