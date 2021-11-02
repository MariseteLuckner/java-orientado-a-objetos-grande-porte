
public class Circulo {
	// atributo
	private double raio;
	
	public Circulo() {
		super();
	}

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	// m�todo
	public void exibeCirculo() {
		System.out.println("*--------------------------------------*");
		System.out.println("      Informa��es de um Circulo     ");
		System.out.println("*--------------------------------------*");
		System.out.println("Raio.: " + raio);
		System.out.println("*--------------------------------------*");
	}
	
	public double getArea() {
		return Math.pow(raio, 2) * Math.PI;
		
	}
	
	public double getPerimetro() {
		return 2 * Math.PI * raio;
	}

}
