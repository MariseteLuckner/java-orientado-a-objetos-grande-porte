package grandePorteAula9;

public class Relogio {
	
	private int hora;
	private int minuto;
	private int segundo;

	public Relogio() {
		super();
	}

	public Relogio(int hora, int minuto, int segundo) {
		super();
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	public void adiantar(int qtdSegundos) {
		 int totalSegundos;
		 
		 totalSegundos = hora * 3600 + minuto * 60 + segundo;
		 totalSegundos += qtdSegundos % 86400;
		 totalSegundos %= 86400;
		 this.hora = totalSegundos / 3600;
		 totalSegundos %= 3600;
		 this.minuto = totalSegundos / 60;
		 totalSegundos %=60;
		 this.segundo = totalSegundos;		       
	}

	public void atrasar(int qtdSegundos) {
		int totalSegundos;
		
		totalSegundos = hora * 3600 + minuto * 60 + segundo;
		totalSegundos -= qtdSegundos % 86400;
		 totalSegundos += 86400;
		 totalSegundos %= 86400;
		 this.hora = totalSegundos / 3600;
		 totalSegundos %= 3600;
		 this.minuto = totalSegundos / 60;
		 totalSegundos %=60;
		 this.segundo = totalSegundos;
	}
	
	public String geteHorario() {
		
		return this.hora + ":" + this.minuto + ":" + this.segundo;
	}
}
