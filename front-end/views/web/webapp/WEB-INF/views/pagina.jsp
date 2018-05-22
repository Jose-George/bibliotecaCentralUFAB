<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <title>UFAB - Biblioteca Central</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="rating" content="mature">
    <link type="text/css" href="resources/css/style.css" rel="stylesheet">
</head>
<body class="center">
    <header>
        <nav id = "menu">
            <img src="resources/img/logo2.png" alt ="UFAB">
            <ul class="menu"> <!-- Esse é o 1 nivel ou o nivel principal -->
                <li><a href="index.jsp">Inicio</a></li>
                <li><a c:import url=emprestimo.jsp>Realizar Emprestimo</a></li>
                <li><a href="devolucao.jsp" target="iframeguia">Devolucao</a></li>
                <li><a href="#">Cadastrar</a>
                    <ul class="submenu-1"> <!-- Esse é o 2 nivel ou o primeiro Drop Down -->
                       <li><a href="alunoCadastro.jsp" target="iframeguia">Aluno</a></li>
                       <li><a href="usuarioCadastro.jsp" target="iframeguia">Funcionario</a></li>
                       <li><a href="cursoCadastro.jsp" target="iframeguia">Curso</a></li>
                       <li><a href="anaisCadastro.jsp" target="iframeguia">Anais</a></li>
                       <li><a href="livroCadastro.jsp" target="iframeguia">Livro</a></li>
                       <li><a href="jornalCadastro.jsp" target="iframeguia">Jornal</a></li> 
                       <li><a href="revistaCadastro.jsp" target="iframeguia">Revista</a></li>
                       <li><a href="trabalhoCadastro.jsp" target="iframeguia">Trabalho</a></li> 
                       <li><a href="midiaCadastro.jsp" target="iframeguia">Midia</a></li> 
                   </ul>
               </li>
               <li><a href="#">Atualizar</a></li>
               <ul class="submenu-1"> <!-- Esse é o 2 nivel ou o primeiro Drop Down -->
                   <li><a href="#" target="iframeguia">Aluno</a></li>
                   <li><a href="#">Funcionario</a></li>
                   <li><a href="#">Curso</a></li>
                   <li><a href="#">Anais</a></li>
                   <li><a href="#">Livro</a></li>
                   <li><a href="#">Livro</a></li>
                   <li><a href="#">Jornal</a></li> 
                   <li><a href="#">Revista</a></li>
                   <li><a href="#">Trabalho</a></li>
                   <li><a href="#">Acervo</a></li> 
               </ul>
               <li><a href="#">Buscar</a></li>    
           </nav><!-- fim nav -->

           <section class="conteiner">
            <iframe src="" id="iframeguia" name="iframeguia">

            </iframe> 
        </section>
    </header>
    

    
    <footer>
        <small class="copyright">

            <p>Copyright 2018 desenvolvedores Caio & Jose </p>
        </small>
    </footer>
</body>
</html>
