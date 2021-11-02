import java.util.Scanner;

public class MinhaEmpresa {

	public static void main(String[] args) {
		// Scanner para ler o teclado
		Scanner lerTeclado = new Scanner (System.in);
		
		// instanciando objeto da classe Funcionário
		Funcionario f1 = new Funcionario();
		
		// Solicitando os dados
		System.out.println("*------------------------------------------*");
		System.out.println("             Cadastro Funcionario           ");
		System.out.println("*------------------------------------------*");
		
		// Solicitando o nome
		System.out.print("Nome......: ");		
		String nomeFunc = lerTeclado.nextLine();
		f1.setNomeFunc(nomeFunc);
		
		// Solicitando o salario mensal como uma String e
		// convertendo para double com Double.parceDouble()
		System.out.print("Salario Mensal.: ");
		double salarioMensal = Double.parseDouble(lerTeclado.nextLine());
		f1.setSalarioMensal(salarioMensal);
		
		// exibindo os atributos do funcionário
		f1.exibeFuncionario();
		
		// solicitando o percentual de aumento como umna string e 
		// convertendo para double com Double.parseDouble()
		System.out.print("% de aumento..: ");
		double per = Double.parseDouble(lerTeclado.nextLine());
		f1.setAumento(per);
		
		//exibindo os atributos do funcionário e o salario anual
		f1.exibeFuncionario();
		System.out.println("Salário Anual..: " + f1.getSalarioAnual());
		System.out.println("*--------------------------------------*");
		

	}

}
