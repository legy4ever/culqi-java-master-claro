package culqi.ejemplos;

public class Token {
	private String correo_electronico;
	
	private String nombre;
	
	private String apellido;
	
	private String numero;
	
	private String cvv;
	
	private String m_exp;
	
	private String a_exp;
	
	private boolean guardar;

	public String getCorreo_electronico() {
		return correo_electronico;
	}

	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getM_exp() {
		return m_exp;
	}

	public void setM_exp(String m_exp) {
		this.m_exp = m_exp;
	}

	public String getA_exp() {
		return a_exp;
	}

	public void setA_exp(String a_exp) {
		this.a_exp = a_exp;
	}

	public boolean getGuardar() {
		return guardar;
	}

	public void setGuardar(boolean guardar) {
		this.guardar = guardar;
	}

	public String toString() {
		return "Token [correo_electronico=" + correo_electronico + ", nombre="
				+ nombre + ", apellido=" + apellido + ", numero=" + numero
				+ ", cvv=" + cvv + ", m_exp=" + m_exp + ", a_exp=" + a_exp
				+ ", guardar=" + guardar + "]";
	}
	
	
}
