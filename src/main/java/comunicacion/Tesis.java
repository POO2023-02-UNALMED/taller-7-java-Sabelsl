package comunicacion;

public class Tesis extends Escrito {
	private String idea;
	private String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	private int Paginas;
	
	public Tesis (String origen, String titulo, String autor, int paginas,String idea,String[] argumentos,String conclusion,String referencias,String interpretacion) {
		super(origen,titulo,autor,paginas);
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
		this.idea = idea;
		this.Paginas = getPaginas();
	}
	public String getIdea() {
		return this.idea;
	}
	public void setIdea(String idea) {
		this.idea = idea;
	}
	public String[] getArgumentos() {
		return this.argumentos;
	}
	public void setArgumentos(String[] argumentos) {
		this.argumentos = argumentos;
	}
	public String getConclusion() {
		return this.conclusion;
	}
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
	public String getRefrencias() {
		return this.referencias;
	}
	public void setRefrencias(String refrencias) {
		this.referencias = refrencias;
	}
	public String getInterpretacion() {
		return this.interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	@Override
	public int palabrasTotales(int palabrasPagina) {
		int Factor = 5;
		int resultado = this.Paginas* palabrasPagina * Factor;
		return resultado;}
	public String interpretacion() {
		return interpretacion;
	}
	public String toString() {
		String origen = getOrigen();
		String Titulo = getTitulo();
		String Autor = getAutor();
		 
		return origen+"\n"+ Titulo+"\n"+ Autor+"\n"+Paginas+"\n"+idea+"\n" +this.argumentos+"\n"+this.conclusion+"\n"+this.referencias+"\n"+this.interpretacion;
	}
	}

