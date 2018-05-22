<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
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
                <li><a href=emprestimo.jsp target="iframeguia">Realizar Emprestimo</a></li>
                <li><a href="devolucao.jsp" target="iframeguia">Devolucao</a></li>
                <li><a href="#">Cadastrar</a>
                    <ul class="submenu-1"> <!-- Esse é o 2 nivel ou o primeiro Drop Down -->
                       <li><a href="#" target="iframeguia">Aluno</a></li>
                       <li><a href={usuarioCadastro.html} target="iframeguia">Funcionario</a></li>
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
