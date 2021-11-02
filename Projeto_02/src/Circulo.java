
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

	// método
	public void exibeCirculo() {
		System.out.println("*--------------------------------------*");
		System.out.println("      Informações de um Circulo     ");
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
