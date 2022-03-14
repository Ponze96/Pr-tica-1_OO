package questao3;

public class NotaAluno {
	private int matricula;
	private String nome;
	private double notaAV1;
	private double notaAV2;
	private double notaAE;
	private String curso;
	private int periodo;
		
	

	public NotaAluno(int matricula, String nome, double notaAV1, double notaAV2, double notaAE, String curso,
			int periodo) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.notaAV1 = notaAV1;
		this.notaAV2 = notaAV2;
		this.notaAE = notaAE;
		this.curso = curso;
		this.periodo = periodo;
	}

	public int getMatricula() {
		return matricula;
		
	}
	
	public void setMatricula(int matricula) {
		this.matricula =  matricula;
		
	}
	
	public String getNome() {
		return nome;
		
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public double getNotaAV1() {
		return notaAV1;
		
	}
	
	
	public void setNotaAV1 (double notaAV1) {
		this.notaAV1 = notaAV1;
		
	}
	
	public double getNovaAV2() {
		return notaAV2;
		
	}
	
	
	public void setnotaAV2 (double notaAV2) {
		this.notaAV2 = notaAV2;	
		
	}		
		
	
	public boolean notaAE(double notaAE) {
        if (this.notaAE < 60) {
            return false;
 
        } else {
            this.notaAE > 60)
            return true;            
	}
        
        
