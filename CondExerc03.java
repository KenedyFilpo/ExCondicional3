         import java.util.Scanner;

         public class CondExerc03 {

	     public static void main(String[] args) {
	 	
         Scanner leitor = new Scanner (System.in);
		
	   	 float S;
		
		 System.out.println("Qual era o seu antigo salário :");
		
		 S=leitor.nextFloat();
		
		 if (S>=0 && S<=1000)
			
		 System.out.println("Você terá 15% de aumento, então passará a receber "+ (S+(S/100*15)));	
		
		 if (S>=1000.01 && S<=2500)
			
		 System.out.println("Você terá 7% de aumento, então passará a receber "+ (S+(S/100*7)));
		
		 if (S>2500)
			
		 System.out.println("Seu salário continuará o mesmo.");	
	}

}
