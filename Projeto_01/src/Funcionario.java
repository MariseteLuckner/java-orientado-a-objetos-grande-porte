
public class Funcionario {
    //Atributos
	private static int idFunc;
	private int codFunc;
	private String nomeFunc;
	private double salarioMensal;
	
	public Funcionario() {
	    codFunc = ++ idFunc;
	}
	
	
	public Funcionario(String nomeFunc, double salarioMensal) {
		this.codFunc = ++ idFunc;
	    this.nomeFunc = nomeFunc;
		this.salarioMensal = salarioMensal;
		
		
	}

	public int getCodFunc() {
		return codFunc;
	}

	
	public String getNomeFunc() {
		return nomeFunc;
	}

	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

	//Metodos
	public void exibeFuncionario() {
		System.out.println("*--------------------------------------*");
		System.out.println("      Informações de um Funcionário     ");
		System.out.println("*--------------------------------------*");
		System.out.println("Código..........: " + codFunc);
		System.out.println("Nome............: " + nomeFunc);
		System.out.println("Salário Mensal..: " + salarioMensal);
		System.out.println("*--------------------------------------*");
	}
	
	public double getSalarioAnual() {
		return salarioMensal * 12;
	}
	
	public void setAumento(double per) {
		salarioMensal *= (1.0 + per / 100.0); 
		
	}
	
}
