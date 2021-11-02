import java.util.Scanner;

public class FigurasGeometricas {

	public static void main(String[] args) {
		// Scanner para ler o teclado
		Scanner lerTeclado = new Scanner (System.in);
		
		// instanciando objeto das classes
		Circulo c = new Circulo();
		Triangulo t = new Triangulo();
		
		// solicitando os dados
		System.out.println("*---------------------------------------------*");
		System.out.println("              Figuras Geométricas              ");
		System.out.println("*---------------------------------------------*");
		
		// solicitandpo o raio do Círculo
		System.out.print("Raio do Círculo: ");
		double raio = Double.parseDouble(lerTeclado.nextLine());
		c.setRaio(raio);
		
		// solicitando base o Triangulo
		System.out.print("Base do Tringulo: ");
		double base = Double.parseDouble(lerTeclado.nextLine());
		t.setBase(base);
		
		// solicitando altura o Triangulo
		System.out.print("Altura do Tringulo: ");
		double altura = Double.parseDouble(lerTeclado.nextLine());
		t.setAltura(altura);
		
		//exibindo os atributos, area e perimetro do Circulo
        c.exibeCirculo();
        System.out.println("Area.:"+c.getArea());
        System.out.println("Perímetro.:"+c.getPerimetro());
        System.out.println("*---------------------------------------------*");
		
        
      //exibindo os atributos, area e perimetro do Triangulo
        t.exibeTriangulo();
        System.out.println("Area.:"+t.getArea());
        System.out.println("Perímetro.:"+t.getPerimetro());
        System.out.println("*---------------------------------------------*");
	}

}
