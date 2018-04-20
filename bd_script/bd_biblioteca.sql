CREATE DATABASE IF NOT EXISTS biblioteca; 
USE biblioteca;

CREATE TABLE IF NOT EXISTS anaisCongresso(
	id int NOT NULL AUTO_INCREMENT,
	tipo VARCHAR(6), 
    titulo VARCHAR(140),
    autor VARCHAR(100), 
    nomeCongresso VARCHAR(100), 
    anoPublicacao DATE, 
	localEvento VARCHAR(100),
    
    PRIMARY KEY(id)
    
);
		
CREATE TABLE IF NOT EXISTS jornal(
	id int NOT NULL AUTO_INCREMENT,
	titulo VARCHAR(140), 
	dataPublicacao DATE,  
    edicao INT, 
    
    PRIMARY KEY(id)
); 

CREATE TABLE IF NOT EXISTS livro(
	isbn VARCHAR(17), 
    titulo VARCHAR(140), 
    autor VARCHAR(100), 
    editora VARCHAR(40), 
    anoDefesaPublicacao DATE, 
    edicao INT, 
    numeroPagina INT, 
    areaConhecimento VARCHAR(40),
    tema VARCHAR(40), 
    
    PRIMARY KEY(isbn)
);

CREATE TABLE IF NOT EXISTS midiaEletronica(
	id int NOT NULL AUTO_INCREMENT,
	titulo VARCHAR(140), 
    tipo VARCHAR(3), 
    dataGravacao DATE,
    
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS revista(
	id int NOT NULL AUTO_INCREMENT,
	titulo VARCHAR(140), 
    editora VARCHAR(40), 
    dataPublicacao DATE,  
    edicao INT, 
    numeroPagina INT,
    
    PRIMARY KEY(id)

);

CREATE TABLE IF NOT EXISTS trabalhoConclusao(
	id int NOT NULL AUTO_INCREMENT,
	tipo VARCHAR(30), 
    autor VARCHAR(100), 
    orientador VARCHAR(100), 
    titulo VARCHAR(140), 
    anoDefesa DATE, 
    localDefesa VARCHAR(100),
    
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS curso(
	nome VARCHAR(40), 
    areaCurso VARCHAR(30), 
    tipo VARCHAR(30),
    
    PRIMARY KEY(nome)
);

CREATE TABLE IF NOT EXISTS funcionario(
	tipoFuncionario VARCHAR(13), 
    cpf BIGINT(11), 
    nomeCompleto VARCHAR(140), 
    rg BIGINT(7), 
    naturalidade VARCHAR(100), 
    endereco VARCHAR(100), 
    telefone VARCHAR(10),
    email VARCHAR(100), 
	nomeUsuario VARCHAR(100), 
    senha VARCHAR(20), 


	PRIMARY KEY(cpf,nomeUsuario)
);


CREATE TABLE IF NOT EXISTS aluno(
	nome VARCHAR(150),
	matricula VARCHAR(10), 

	PRIMARY KEY(matricula)
);

