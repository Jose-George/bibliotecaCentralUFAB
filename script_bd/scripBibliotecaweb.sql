CREATE DATABASE IF NOT EXISTS bibliotecaWeb; 
USE bibliotecaWeb;

CREATE TABLE IF NOT EXISTS livro(

    isbn BIGINT(13), 
    titulo VARCHAR(100), 
    autor VARCHAR(100), 
    editora VARCHAR(40), 
    ano_publicacao INT(4), 
    edicao INT(2), 
    num_pagina INT(5),  
    area_conhecimento VARCHAR(100), 
    tema_livro VARCHAR (100),
    
	PRIMARY KEY(isbn)
);

CREATE TABLE IF NOT EXISTS revista(
	
    titulo VARCHAR(100), 
    editora VARCHAR(40),
    data_publicacao DATE, 
    edicao INT(2), 
    num_pagina INT(5), 
    
    PRIMARY KEY(titulo,edicao)
    
    
);

CREATE TABLE IF NOT EXISTS jornal(
	
    titulo VARCHAR(100), 
    data_publicacao DATE, 
    edicao INT(2), 
    
    PRIMARY KEY(titulo,edicao)
    
    
);

	
CREATE TABLE IF NOT EXISTS anais_congresso(
	
    tipo VARCHAR(10), 
    titulo VARCHAR(100),
    autor VARCHAR(100),
    nome_congresso VARCHAR (40), 
    ano_publicacao INT(4),
    local VARCHAR(100),
    
    PRIMARY KEY(titulo, ano_publicacao, autor)
);

CREATE TABLE IF NOT EXISTS trabalho_conclusao(
	
    titulo VARCHAR(100), 
    autor VARCHAR(100),
    orientador VARCHAR(100),
    tipo VARCHAR(20),
    ano_defesa INT(4), 
    local VARCHAR(100),
    codigo INT(4),
    
    PRIMARY KEY(codigo)
    
);
CREATE TABLE IF NOT EXISTS midia_eletronica(
	
     titulo VARCHAR(100), 
     tipo VARCHAR(20),
     data_gravacao DATE, 
     codigo INT(4), 
     
     PRIMARY KEY(codigo)
     
);

CREATE TABLE IF NOT EXISTS curso(
	
    nome VARCHAR(50), 
    area VARCHAR(20),
    tipo VARCHAR(20),
    
    PRIMARY KEY(nome)
    
);

CREATE TABLE IF NOT EXISTS aluno(
	
    nome VARCHAR(100), 
    matricula BIGINT(8), 
    curso VARCHAR(50), 
    
    PRIMARY KEY(matricula), 
    FOREIGN KEY (curso) REFERENCES curso(nome)
);


CREATE TABLE IF NOT EXISTS funcionario(
	
    nome VARCHAR(100), 
    matricula BIGINT(8), 
    tipo TINYINT(1),
    
    PRIMARY KEY(matricula)
);



