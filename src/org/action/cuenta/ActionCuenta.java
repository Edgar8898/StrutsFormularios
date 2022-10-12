package org.action.cuenta;

import com.opensymphony.xwork2.ModelDriven;

import java.util.ArrayList;
import java.util.List;

import org.dao.usercap.DaoUsercap;
import org.modelo.cuenta.Cuenta;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ActionCuenta extends ActionSupport implements ModelDriven<Cuenta>{
	
	private Cuenta cuenta = new Cuenta();
	private DaoUsercap dao = new DaoUsercap();
	private List<Cuenta> listCuenta = new ArrayList<Cuenta>(); //GET Y SET

	public String execute() {
		return ERROR;
	}
	
	public String autentica() {
		setListCuenta(dao.listCuentas());
		for (Cuenta x : listCuenta) {
			if (cuenta.getLogin().equals(x.getLogin()) && 
				cuenta.getPassword().equals(x.getPassword())) {
				return SUCCESS;
			}
		}
		return ERROR;
	}

	@Override
	public Cuenta getModel() {
		// TODO Auto-generated method stub
		return cuenta;
	}
	
	//GET AND SET OF LISTCUENTA
	public List<Cuenta> getListCuenta() {
		return listCuenta;
	}
	public void setListCuenta(List<Cuenta> listCuenta) {
		this.listCuenta = listCuenta;
	}


}









