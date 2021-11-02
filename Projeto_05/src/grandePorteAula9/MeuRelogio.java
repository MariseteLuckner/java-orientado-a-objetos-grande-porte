package grandePorteAula9;

import java.util.Scanner;

public class MeuRelogio {

	public static void main(String[] args) {
		Scanner lerTeclado = new Scanner(System.in);
		Relogio r = new Relogio();
		System.out.println("Informe a hora inicial (0 a 23)...: ");
		r.setHora(Integer.parseInt(lerTeclado.nextLine()));
		System.out.println("Informe o minuto inicial (0 a 59)...: ");
		r.setMinuto(Integer.parseInt(lerTeclado.nextLine()));
		System.out.println("Informe o segundo inicial (0 a 59)...: ");
		r.setSegundo(Integer.parseInt(lerTeclado.nextLine()));
		System.out.println("Horário no relogio..: " + r.geteHorario());
		System.out.println("Informe qtde de segundos para adiantar..: ");
		r.adiantar(Integer.parseInt(lerTeclado.nextLine()));
		System.out.println("Horário no relogio..: " + r.geteHorario());
		System.out.println("Informe qtde de segundos para atrasar..: ");
		r.atrasar(Integer.parseInt(lerTeclado.nextLine()));
		System.out.println("Horário no relogio..: " + r.geteHorario());
		
	}
	
}
