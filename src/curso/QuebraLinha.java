package curso;
import java.util.Scanner;

public class QuebraLinha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		int x = sc.nextInt();
		sc.nextLine(); // Porque tem nextLine e nextIn 
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = sc.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		
		
		
		sc.close();
		

	}

}
