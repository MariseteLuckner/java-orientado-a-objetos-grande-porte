package grandePorteAula9;

public class AlunoDisciplina {
	
	private int idAluno;
	private String nomeAluno;
	private int idDisciplina;
	private String nomeDisciplina;
	private double notaB1;
	private double notaB2;
	
	public AlunoDisciplina() {
		super();
	}

	public AlunoDisciplina(int idAluno, String nomeAluno, int idDisciplina, String nomeDisciplina, double notaB1,
			double notaB2) {
		super();
		this.idAluno = idAluno;
		this.nomeAluno = nomeAluno;
		this.idDisciplina = idDisciplina;
		this.nomeDisciplina = nomeDisciplina;
		this.notaB1 = notaB1;
		this.notaB2 = notaB2;
	}



	public int getIdAluno() {
		return idAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public int getIdDisciplina() {
		return idDisciplina;
	}

	public double getNotaB1() {
		return notaB1;
	}

	public double getNotaB2() {
		return notaB2;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}

	public void setNotaB1(double notaB1) {
		this.notaB1 = notaB1;
	}

	public void setNotaB2(double notaB2) {
		this.notaB2 = notaB2;
	}
	
	public void exibeAlunoDisciplina() {
		System.out.println("*---------------------------------------------*");
		System.out.println("           Informações de um Aluno           ");
		System.out.println("Aluno........: (" + idAluno + ") - " +  nomeAluno);
		System.out.println("Disciplinas..: (" + idDisciplina+") - " + nomeDisciplina);
		System.out.println("Médias (A/P).: (" + mediaAritmetica() + "/" + mediaPonderada() + ")");
		System.out.println("*---------------------------------------------*");
	
	}
	public double mediaAritmetica() {
		return (notaB1+notaB2) / 2.0;
	}

	public double mediaPonderada() {
		return (notaB1*4.0 + notaB2*6.0)/10.0;
	}
}
