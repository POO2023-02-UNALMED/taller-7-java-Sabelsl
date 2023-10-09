package comunicacion;

public class Periodico extends Escrito{
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	public Periodico (String origen, String titulo, String autor, int paginas,String fecha,String primicia,String interpretacion) {
		super(origen,titulo,autor,paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
	}
	
	public String getFecha() {
		return this.fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getPrimicia() {
		return this.primicia;
	}
	public void setPrimicia(String primicia) {
		this.primicia = primicia;
	}
	public String getInterpretacion() {
		return this.interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	@Override
	public int palabrasTotales(int palabrasPagina) {
		int Factor = 10;
		int resultado = this.getPaginas() * palabrasPagina * Factor;
		return resultado;}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	public String toString() {
		String origen = getOrigen();
		String Titulo = getTitulo();
		String Autor = getAutor();
		int Paginas = getPaginas();
		 
		return origen+"\n"+ Titulo+"\n"+ Autor+"\n"+ Paginas+"\n"+ this.fecha+"\n"+this.primicia;
	}
}
