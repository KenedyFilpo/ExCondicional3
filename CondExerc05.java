import java.util.Scanner;

public class CondExerc05 {

	public static void main(String[] args) {
	
Scanner leitor = new Scanner (System.in);
		
		float x,y,z,c,m;
		int mat;
		
		System.out.println("Para saber seu resultado na materia de F�sica! Digite sua matr�cula:");
		
		mat=leitor.nextInt();
		
		System.out.println(" A primeira nota:");
		
		x=leitor.nextFloat();
		
		System.out.println(" A segunda nota:");
		
				y=leitor.nextFloat();
				
		System.out.println(" A terceira nota:");
		
				z=leitor.nextFloat();
				
		System.out.println(" A quarta nota:");
		
		c=leitor.nextFloat();
		
		m=((x+y+z+c)/4);
		
		System.out.println("Voc� obteve a m�dia "+m);
		
		if (m>=7)
			
		    System.out.println("Voc� "+mat+" foi aprovado.");
		
		if (m>=3.5&&m<=7)
			
			System.out.println("Voc�, aluno com � matr�cula "+mat+" est� de recupera��o.");
		if (m<3.5)
			
			System.out.println("Voc�, aluno com � matr�cula "+mat+" foi reprovado.");

	}

}
