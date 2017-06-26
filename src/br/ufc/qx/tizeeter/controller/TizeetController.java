package br.ufc.qx.tizeeter.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufc.qx.tizeeter.dao.TizeetDAO;

public class TizeetController extends TizeeterGenericBaseHttpServlet<TizeetDAO> {
	
	private static final long serialVersionUID = 5288235092948947056L;
	
	public TizeetController() {
		setDAO(new TizeetDAO());
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
