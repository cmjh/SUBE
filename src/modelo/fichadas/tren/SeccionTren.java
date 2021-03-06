package modelo.fichadas.tren;

import java.math.BigDecimal;

public class SeccionTren {
	
	private String nombre;
	private BigDecimal importe;
	
	public SeccionTren(String nombre, BigDecimal importe) {
		super();
		this.nombre = nombre;
		this.importe = importe;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public BigDecimal getImporte() {
		return importe;
	}
	
	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}

}
