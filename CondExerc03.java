         import java.util.Scanner;

         public class CondExerc03 {

	     public static void main(String[] args) {
	 	
         Scanner leitor = new Scanner (System.in);
		
	   	 float S;
		
		 System.out.println("Qual era o seu antigo sal�rio :");
		
		 S=leitor.nextFloat();
		
		 if (S>=0 && S<=1000)
			
		 System.out.println("Voc� ter� 15% de aumento, ent�o passar� a receber "+ (S+(S/100*15)));	
		
		 if (S>=1000.01 && S<=2500)
			
		 System.out.println("Voc� ter� 7% de aumento, ent�o passar� a receber "+ (S+(S/100*7)));
		
		 if (S>2500)
			
		 System.out.println("Seu sal�rio continuar� o mesmo.");	
	}

}
