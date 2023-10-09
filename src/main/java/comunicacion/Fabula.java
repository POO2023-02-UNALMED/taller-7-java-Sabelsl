package comunicacion;

public class Fabula extends Escrito{
	private String ensenanza;
	private String interpretacion;
	private int Paginas;
	
	
	
	public Fabula(String origen, String titulo, String autor, int paginas,String ensenanza,String interpretacion) {
		super(origen,titulo,autor,paginas);
		this.ensenanza=ensenanza;
		this.interpretacion = interpretacion;
		this.Paginas = getPaginas();
	}
	public String getEnsenanza() {
		return this.ensenanza;
	}
	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}
	public String getInterpretacion() {
		return this.interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	public String interpretacion() {
		return this.interpretacion;
	}
	@Override
	public int palabrasTotales(int palabrasPagina) {
		int Factor = 1;
		int resultado = this.Paginas * palabrasPagina * Factor;
		return resultado;
	}
	
	public  String toString() {
		 
		 String origen = getOrigen();
		 String Titulo = getTitulo();
		 String Autor = getAutor();
		 
		 
		return origen+"\n"+ Titulo+"\n"+ Autor+"\n"+ Paginas+"\n"+ this.ensenanza+"\n"+ this.interpretacion;
	}
	
}
