package pe.edu.aprender.entity;

import java.util.Date;

public class Empleado {

	private Integer id;
	private String apellido;
	private String nombre;
	private Integer edad;
	private String area;
	private Date fechaIngreso;
	private Boolean estado;
	private Cargo cargo; // Relación M a 1
	private Casillero casillero; // Relación 1 a 1

	// Importante: Para poder acceder a las propiedades de Cargo y Casillero
	public Empleado() {
		cargo = new Cargo();
		casillero = new Casillero();
	}

	// Para listar empleados
	public Empleado(Integer id, String apellido, String nombre) {
		this.id = id;
		this.apellido = apellido;
		this.nombre = nombre;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Casillero getCasillero() {
		return casillero;
	}

	public void setCasillero(Casillero casillero) {
		this.casillero = casillero;
	}

}