package org.dao.usercap;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.modelo.ciudad.Ciudad;
import org.modelo.cuenta.Cuenta;
import org.modelo.usercap.Usercap;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;

public class DaoUsercap {
	
	@SessionTarget
	private Session session;
	
	@TransactionTarget
	private Transaction transaction;
	
	public void addUsercap(Usercap usercap) {
		try {
			session.save(usercap);
		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Cuenta> listCuentas(){
		List<Cuenta> cuentas = null;
		try {
			cuentas = (List<Cuenta>) session.createQuery("from Cuenta").list();
		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
		}
		return cuentas;
	}
	
	@SuppressWarnings("unchecked")
	public List<Ciudad> listCiudad(){
		List<Ciudad> ciudades = null;
		try {
			ciudades = (List<Ciudad>) session.createQuery("from Ciudad").list();
		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
		}
		return ciudades;
	}

}














