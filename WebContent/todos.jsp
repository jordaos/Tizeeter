<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
         "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="pt-br">
    <head>
       	<c:import url="/comum/head.html"></c:import>
    </head>
    <body>

        <c:import url="/comum/cabecalho.jsp"></c:import>

        <div id="conteudo">
        
        	<c:import url="/comum/informacaoDoUsuario.jsp"></c:import>
              
            <div id="principal" class="module">
            	<table>
            		<thead>
            			<tr>
	            			<th>Nome do usu&aacute;rio</th>
	            			<th>Email</th>
	            			<th>Data de nascimento</th>
            			</tr>
            		</thead>
            		<tbody>
            		<c:forEach var="usuario" items="${usuarios }">
            			<tr>
							<td>${usuario.nomeDeUsuario } </td>
							<td>${usuario.email}</td>
							<td>${usuario.dataDeNascimento }</td>
						</tr>
            		</c:forEach>           			
            		</tbody>
            	</table>
            </div>
            
            <c:import url="/comum/tendencias.jsp"></c:import>
			<c:import url="/comum/rodape.jsp" ></c:import>
        </div>
    </body>
</html>
