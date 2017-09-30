package pe.edu.aprender.managed;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

// Anotaciones
@ManagedBean(name = "formulario")
public class FormularioBean {

	// Atributos
	private String nombre;
	private String apellido;

	// Getter/Setter
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

	public String procesar() {
		FacesContext.getCurrentInstance().addMessage(
				null,
				new FacesMessage("Su nombre completo es: ".concat(getNombre())
						.concat(" ").concat(getApellido()), ":)"));
		return "resultado"; // donde resultado = formulario.xhtml
	}

}