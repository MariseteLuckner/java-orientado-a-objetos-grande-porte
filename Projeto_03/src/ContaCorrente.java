
public class ContaCorrente {
	// atributos
	private int numCC;
	private double saldoCC;
	
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(int numCC, double saldoCC) {
		super();
		this.numCC = numCC;
		this.saldoCC = saldoCC;
	}

	public int getNumCC() {
		return numCC;
	}

	public double getSaldoCC() {
		return saldoCC;
	}

	public void setNumCC(int numCC) {
		this.numCC = numCC;
	}

	public void setSaldoCC(double saldoCC) {
		this.saldoCC = saldoCC;
	}

	//Metodos
	public void exibeContaCorrente() {
		System.out.println("*--------------------------------------*");
		System.out.println("    Informações de uma Conta Corrente   ");
		System.out.println("*--------------------------------------*");
		System.out.println("Numero..: " + numCC);
		System.out.println("Saldo...: " + saldoCC);
		System.out.println("*--------------------------------------*");
	}
	
	public void depositar(double valor) {
        saldoCC += valor;
	}
	public void sacar(double valor) {
	    saldoCC -= valor;
	}
}
