import java.util.Scanner;

public class CondExerc02 {

	public static void main(String[] args) {
		
Scanner leitor = new Scanner (System.in);
		
		int idade;
		
		System.out.println(" Diga a idade para sabera categoria do nadador:");
		idade=leitor.nextInt();
		
		if (idade>=5 && idade<=10)
			System.out.println("Categoria> � INFANTIL.");
		if  (idade>=11 && idade<=17)
			System.out.println("Categoria> � JUVENIL.");
		if  (idade>17)
			System.out.println("Categoria> � ADULTO.");
		if (idade<5) 
			 System.out.println("Categoria n�o encontrada");

	
	}

}
