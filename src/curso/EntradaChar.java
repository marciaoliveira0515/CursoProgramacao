package curso;
import java.util.Scanner;

public class EntradaChar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char x;
		
		x = sc.next().charAt(1);
		
		System.out.println("Voc� Digitou: " + x);
		
		
		
		
		sc.close();

	}

}
