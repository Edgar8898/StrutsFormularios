package org.action.ciudad;

import java.util.ArrayList;
import java.util.List;

import org.dao.usercap.DaoUsercap;
import org.modelo.ciudad.Ciudad;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public class ActionCiudad extends ActionSupport implements ModelDriven<Ciudad>{

	private Ciudad ciudad = new Ciudad();
	private DaoUsercap dao = new DaoUsercap();
	private List<Ciudad> listCiudades = new ArrayList<Ciudad>(); //GET AND SET
	private List<String> nombresCiudades = new ArrayList<String>(); //GET AND SET
	
	public String execute() {
		return SUCCESS;
	}
	
	public String catalogoCiudad() {
		setListCiudades(dao.listCiudad());
		for (Ciudad x : listCiudades) {
			nombresCiudades.add(x.getNombre());
		}
		return SUCCESS;
	}
	
	@Override
	public Ciudad getModel() {
		// TODO Auto-generated method stub
		return ciudad;
	}	
	
	
	//GETTERS AND SETTERS OF LISTCIUDADES AND NOMBRES CIUDADES.
	public List<Ciudad> getListCiudades() {
		return listCiudades;
	}
	public void setListCiudades(List<Ciudad> listCiudades) {
		this.listCiudades = listCiudades;
	}
	public List<String> getNombresCiudades() {
		return nombresCiudades;
	}
	public void setNombresCiudades(List<String> nombresCiudades) {
		this.nombresCiudades = nombresCiudades;
	}


	
	
}















