
public class Triangulo {
	// atributos
	private double base;
	private double altura;
	
	public Triangulo() {
		super();
	}

	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// método
	public void exibeTriangulo() {
		System.out.println("*--------------------------------------*");
		System.out.println("      Informações de um Triangulo     ");
		System.out.println("*--------------------------------------*");
		System.out.println("Base..........: " + base);
		System.out.println("Altura........: " + altura);
		System.out.println("*--------------------------------------*");
	}
	
	public double getArea() {
		return (base * altura) / 2;
		
	}
	
	public double getPerimetro() {
		return this.getBase() + this.getAltura() +
                Math.sqrt(Math.pow(this.getBase(),2) + Math.pow(this.getBase(),2));
	}

}
