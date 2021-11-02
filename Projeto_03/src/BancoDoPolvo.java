import java.util.Scanner;

public class BancoDoPolvo {

	public static void main(String[] args) {
		// Scanner para ler o teclado
		Scanner lerTeclado = new Scanner(System.in);
		
		// instanciando objeto da classe ContaCorrente
		ContaCorrente cc = new ContaCorrente();
		
		//solicitando os dados da ContaCorrente
		System.out.println("*---------------------------------------------------");
		System.out.println("             Cadastro de Conta Corrente             ");
		System.out.println("*---------------------------------------------------");
		
		//solicitando o numCC
		System.out.print("Número.: ");
		int numCC = Integer.parseInt(lerTeclado.nextLine());
		cc.setNumCC(numCC);
		
		// solicitando o saldoCC como uma string e
		// convertendo para double com Double.parseDouble()
		System.out.print("Saldo.: ");
		double saldoCC = Double.parseDouble(lerTeclado.nextLine());
		cc.setSaldoCC(saldoCC);
		
		// exibindo atributos de Conta Corrente
		cc.exibeContaCorrente();
		
		// solicitando o valor para depositar como uma string e
		// convertendo para double com Double.parseDouble()
		System.out.print("Valor para depositar.: ");
		double valorDeposito = Double.parseDouble(lerTeclado.nextLine());
		cc.depositar(valorDeposito);
		
		//solicitando o valor para sacar como uma string e
		// convertendo para double com Double.parseDouble()
		System.out.print("Valor para sacar.: ");
		double valorSacar = Double.parseDouble(lerTeclado.nextLine());
		cc.sacar(valorSacar);
		
		// exibindo atributos de Conta Corrente
				cc.exibeContaCorrente();

	} 

}
