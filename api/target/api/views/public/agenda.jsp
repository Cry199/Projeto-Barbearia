<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="../../assets/css/styles.css">
        <title>Barbearia MTK - Agenda</title>
    </head>
    
    <body>
        <header class="header">

            <div id="area-cabecalho">

                <div id="area-logo">      
                    <h1>Aesthetics</h1>
                </div>
            
                <div id="area-menu">
                    <a href="#">Home</a>
                    <a href="#">Agenda</a>
                    <a href="#">Contato</a>
                    <a href="#">Login/Cadastro</a>
                </div>
            </div>

        </header>

        <main>
            <div id="area-principal">

                <div id="area-conteudo">
                    
                    <div class="conteudo">

                        <jsp:useBean id="agendaDAO" class="com.barbearia.dao.AgendaDAO" />

                        <table>
                            <c:forEach var="agenda" items="${agendaDAO.listarAgendas()}">
                              
                              <tr>
                                <td>${agenda.nomeCliente}</td> 
                                <td>${agenda.funcionarioNome}</td>
                                <td>${agenda.dataHora}</td>
                              </tr>
                            
                            </c:forEach>           
                        </table>
                    </div>
                </div>

            </div>
        </main>

        <div id="rodape">
            <footer>
                <p id="rodape">&copy; 2023 Barbearia MTK. Todos os direitos reservados.</p>
            </footer>
        </div>

        <script src="../../assets/javascript/script.js"></script>
    
    </body>
</html>