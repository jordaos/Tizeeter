package br.ufc.qx.tizeeter.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/*")
public class AutenticacaoFilter implements Filter{

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String path = ((HttpServletRequest)request).getRequestURI();
		System.out.println(path);
		if(path.equals("/Tizeeter_2/index.jsp")){
			HttpSession sessao = ((HttpServletRequest)request).getSession(true);
			if(sessao.getAttribute("usuario") != null && sessao.getAttribute("autenticado") != null && (boolean)sessao.getAttribute("autenticado")){
				chain.doFilter(request, response);
				return;
			}else{
				((HttpServletResponse)response).sendRedirect("/Tizeeter_2/login.jsp");
			}
		}
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}

}
