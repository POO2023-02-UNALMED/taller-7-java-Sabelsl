package comunicacion;

public class Libro extends Escrito{
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;

	public Libro(String origen, String titulo, String autor, int paginas,String co_autor, String editorial,String edicion,String interpretacion) {
		super(origen,titulo,autor,paginas);
		this.co_autor = co_autor;
		this.editorial = editorial;
		this.edicion = edicion;
		this.interpretacion = interpretacion;
		
	}
	public String getCo_autor() {
		return this.co_autor;
	}
	public void setCo_autor(String co_autor) {
		this.co_autor = co_autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getEdicion() {
		return this.edicion;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	public String getInterpretacion() {
		return this.interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	@Override
	public int palabrasTotales(int palabrasPagina){
		int Factor = 2;
		int resultado = this.getPaginas() * palabrasPagina * Factor;
		return resultado;
	}
	public String interpretacion() {
		return this.interpretacion;
	}
	public String toString(){
		String origen = getOrigen();
		String Titulo = getTitulo();
		String Autor = getAutor();
		int Paginas = getPaginas();
		 
		return origen+"\n"+ Titulo+"\n"+ Autor+"\n"+ Paginas+"\n"+ this.co_autor+"\n"+this.editorial+"\n"+this.edicion;
	}
	}
