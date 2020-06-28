import java.util.Scanner;

public class CondExerc04 {

	public static void main(String[] args) {
		
Scanner leitor = new Scanner (System.in);
		
		int n,m,d;
		
		System.out.println("digite em ordem decrescente o tamanho dos lados do seu triângulo e verá qual é o seu tipo:");
		n=leitor.nextInt();
		m=leitor.nextInt();
		d=leitor.nextInt();
		
		if (n==m&&m==d)
			System.out.println("Esse é um triângulo equilátero.");
		if (n==m&&m!=d)
			System.out.println("Esse é um triângulo isósceles.");
		if (n!=m&&m!=d&&n!=d)
			System.out.println("Esse é um triângulo escaleno.");	

	}

}
