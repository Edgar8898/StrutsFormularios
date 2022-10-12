package org.action.alta;

import org.dao.usercap.DaoUsercap;
import org.modelo.usercap.Usercap;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/*
 * ARQUITECTURA
 * 
 * PRESENTACIÓN    APLICACIÓN    SERV. NEGOCIO      PERSISTENCIA
 *     JSP           FILTER      org.action.alta    org.modelo.usercap
 *                               ActionAlta.java    org.dao.usercap
 */

@SuppressWarnings("serial")
public class ActionAlta extends ActionSupport implements ModelDriven<Usercap> {

	private Usercap usercap = new Usercap();
	private DaoUsercap dao = new DaoUsercap();
	
	public String execute() {
		return SUCCESS;
	}
	
	public String addUsercap() {
		dao.addUsercap(usercap);
		return SUCCESS;
	}

	@Override
	public Usercap getModel() {
		// TODO Auto-generated method stub
		return usercap;
	}
}
