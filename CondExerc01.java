import java.util.Scanner;

public class CondExerc01 {

	public static void main(String[] args) {
		
Scanner leitor = new Scanner (System.in);
		
		int x;
		
		System.out.println("Escolha um n�mero e veja se ele est� compreendido entre 20 e 90:");
		
		x= leitor.nextInt();
		
		if (x>=20 && x<=90)
			
		System.out.println(" Est� compreendido entre 20 e 90!");
		
		
		else 
			
		System.out.println("Esse n�mero � menor que 20 ou maior que 90!");
		
		
		
		
	}

}
