package comunicacion;

public class Alfabeto extends Pictograma{
	private String[] letras;
	private String interpretacion;
	
	
	public Alfabeto(String origen,String[] letras,String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
		
	}
	public String[] getLetras() {
		return this.letras;
	}


	public void setLetras(String[] letras) {
		this.letras = letras;
	}


	public String getInterpretacion() {
		return this.interpretacion;
	}


	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public int cantidadLetras() {
		int cantidad = letras.length;
		return cantidad;
	}
	@Override
	public String interpretacion() {
	return this.interpretacion;
	}
	public String toString() {
		String resultado = "";

        for (int i = 0; i < letras.length - 1; i++) {
            resultado += letras[i] + ", ";
        }
        resultado += letras[letras.length - 1];
        return resultado;
			}
	}
