package culqi.ejemplos;

public class Venta {
	private String token;
	
	private String codigo_comercio;
	
	private String moneda;
	
	private String monto;
	
	private String descripcion;
	
	private String pedido;
	
	private String codigo_pais;
	
	private String ciudad;
	
	private String usuario;
	
	private String direccion;
	
	private String telefono;
	
	private String nombres;
	
	private String apellidos;
	
	private String correo_electronico;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getCodigo_comercio() {
		return codigo_comercio;
	}

	public void setCodigo_comercio(String codigo_comercio) {
		this.codigo_comercio = codigo_comercio;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public String getMonto() {
		return monto;
	}

	public void setMonto(String monto) {
		this.monto = monto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPedido() {
		return pedido;
	}

	public void setPedido(String pedido) {
		this.pedido = pedido;
	}

	public String getCodigo_pais() {
		return codigo_pais;
	}

	public void setCodigo_pais(String codigo_pais) {
		this.codigo_pais = codigo_pais;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo_electronico() {
		return correo_electronico;
	}

	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}

	public String toString() {
		return "Venta [token=" + token + ", codigo_comercio=" + codigo_comercio
				+ ", moneda=" + moneda + ", monto=" + monto + ", descripcion="
				+ descripcion + ", pedido=" + pedido + ", codigo_pais="
				+ codigo_pais + ", ciudad=" + ciudad + ", usuario=" + usuario
				+ ", direccion=" + direccion + ", telefono=" + telefono
				+ ", nombres=" + nombres + ", apellidos=" + apellidos
				+ ", correo_electronico=" + correo_electronico + "]";
	}
	
	
}
