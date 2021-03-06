package modelo.fichadas.subte;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LineaSubte {
	
	private String nombre;
	private List<EstacionSubte> recorridoSubte;
	private BigDecimal precioViaje;
	
	public LineaSubte(String nombre, BigDecimal precioViaje) {
		super();
		this.nombre = nombre;
		this.recorridoSubte = new ArrayList<EstacionSubte>();
		this.precioViaje = precioViaje;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public List<EstacionSubte> getRecorridoSubte() {
		return recorridoSubte;
	}
	
	public void setRecorridoSubte(List<EstacionSubte> recorridoSubte) {
		this.recorridoSubte = recorridoSubte;
	}
	
	public BigDecimal getPrecioViaje() {
		return precioViaje;
	}
	
	public void setPrecioViaje(BigDecimal precioViaje) {
		this.precioViaje = precioViaje;
	}

}
