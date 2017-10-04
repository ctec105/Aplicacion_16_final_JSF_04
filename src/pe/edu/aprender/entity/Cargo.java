package pe.edu.aprender.entity;

import java.io.Serializable;
import java.util.Collection;

public class Cargo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int codigo;
	private String descripcion;
	private Collection<Empleado> empleados; // Relación 1 a M

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Collection<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Collection<Empleado> empleados) {
		this.empleados = empleados;
	}

	@Override
	public String toString() {
		return "Cargo [codigo=" + codigo + ", descripcion=" + descripcion+ ", empleados=" + empleados + "]";
	}

}