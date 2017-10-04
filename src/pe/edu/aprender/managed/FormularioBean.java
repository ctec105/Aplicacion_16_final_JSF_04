package pe.edu.aprender.managed;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import pe.edu.aprender.entity.Empleado;

@ManagedBean(name = "formulario")
public class FormularioBean {

	/*
	 * Creamos una variable de instancia de tipo “Empleado” y una lista de
	 * empleados con sus respectivos getter/setter.
	 */
	private Empleado empleado = new Empleado();
	private List<Empleado> empleados;

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	// Añadimos un Action Method
	public String procesar() {
		// Invocar capa de negocio
		FacesMessage facesMessage = new FacesMessage("Registro completo ");
		FacesContext.getCurrentInstance().addMessage(null, facesMessage);
		return "resultado";
	}

	// Añadimos un Action Method
	public String listar() {
		empleados = new ArrayList<Empleado>();
		empleados.add(new Empleado(1, "Ramirez", "Jorge"));
		empleados.add(new Empleado(2, "Gomez", "Maria"));
		empleados.add(new Empleado(3, "Rodriguez", "Lucia"));
		return "listado";
	}

}