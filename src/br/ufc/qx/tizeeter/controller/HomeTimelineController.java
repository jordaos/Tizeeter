package br.ufc.qx.tizeeter.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufc.qx.tizeeter.dao.TizeetDAO;

@WebServlet(urlPatterns={""})
public class HomeTimelineController extends TizeeterGenericBaseHttpServlet<TizeetDAO> {
	
	
	private static final long serialVersionUID = -9190372911923612234L;

	public HomeTimelineController() {
		setDAO(new TizeetDAO());
	}
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
