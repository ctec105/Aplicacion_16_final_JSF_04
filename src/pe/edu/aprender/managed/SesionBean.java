package pe.edu.aprender.managed;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

@ManagedBean(name = "listado")
@SessionScoped
public class SesionBean {

	// Con SesionBean almacenaremos listados en la sesión
	private List<SelectItem> casilleros;
	private List<SelectItem> cargos;

	public List<SelectItem> getCasilleros() {
		return casilleros;
	}

	public void setCasilleros(List<SelectItem> casilleros) {
		this.casilleros = casilleros;
	}

	public List<SelectItem> getCargos() {
		return cargos;
	}

	public void setCargos(List<SelectItem> cargos) {
		this.cargos = cargos;
	}

	public String inicializar() {
		casilleros = new ArrayList<SelectItem>();
		casilleros.add(new SelectItem(1, "A-01"));
		casilleros.add(new SelectItem(2, "A-02"));
		casilleros.add(new SelectItem(3, "A-03"));

		cargos = new ArrayList<SelectItem>();
		cargos.add(new SelectItem(1, "Secretaria"));
		cargos.add(new SelectItem(2, "Gerente"));
		cargos.add(new SelectItem(3, "Tesorero"));

		return "formulario";
	}

}