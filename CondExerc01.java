import java.util.Scanner;

public class CondExerc01 {

	public static void main(String[] args) {
		
Scanner leitor = new Scanner (System.in);
		
		int x;
		
		System.out.println("Escolha um número e veja se ele está compreendido entre 20 e 90:");
		
		x= leitor.nextInt();
		
		if (x>=20 && x<=90)
			
		System.out.println(" Está compreendido entre 20 e 90!");
		
		
		else 
			
		System.out.println("Esse número é menor que 20 ou maior que 90!");
		
		
		
		
	}

}
