package grandePorteAula9;
import java.util.Scanner;

public class MinhaFaculdade {
	public static void main(String[] args) {
		Scanner lerTeclado = new Scanner(System.in);
		
		//Solicitando os dados do Aluno
		System.out.println("Insira os dados do Aluno");
		System.out.print("Id.: ");
		int idAluno = Integer.parseInt(lerTeclado.nextLine());
		System.out.print("Nome.: ");
		String nomeAluno = lerTeclado.nextLine();
		
		//solicitando os dados da primeira disciplina
		System.out.println("\nInsira os dados da primeira disciplina");
		System.out.print("Id.: ");
		int idDisciplina = Integer.parseInt(lerTeclado.nextLine());
		System.out.print("Nome.: ");
		String nomeDisciplina = lerTeclado.nextLine();
		System.out.print("Nota B1.: ");
		double notaB1 = Double.parseDouble(lerTeclado.nextLine());
		System.out.print("Nota B2.: ");
		double notaB2 = Double.parseDouble(lerTeclado.nextLine());
		
		// instanciando o primeiro objeto AlunoDisciplina
		AlunoDisciplina d1 = new AlunoDisciplina(idAluno, nomeAluno, 
				        idDisciplina, nomeDisciplina, notaB1, notaB2);
		
		// solicitando os dados da segunda disciplina
		System.out.println("\nInsira os dados da segunda disciplina");
		System.out.print("Id.: ");
		idDisciplina = Integer.parseInt(lerTeclado.nextLine());
		System.out.print("Nome.: ");
		nomeDisciplina = lerTeclado.nextLine();
		System.out.print("Nota B1.: ");
		notaB1 = Double.parseDouble(lerTeclado.nextLine());
		System.out.print("Nota B2.: ");
		notaB2 = Double.parseDouble(lerTeclado.nextLine());
		
		// instanciando o segundo objeto AluniDisciplina
		AlunoDisciplina d2 = new AlunoDisciplina(idAluno, nomeAluno, 
				        idDisciplina, nomeDisciplina, notaB1, notaB2);
		
		
		// exibindo os dados dos objetos
		System.out.print("\n");
		d1.exibeAlunoDisciplina();
		System.out.print("\n");
		d2.exibeAlunoDisciplina();

	}
}
