CREATE DATABASE IF NOT EXISTS biblioteca; 
USE biblioteca;

CREATE TABLE IF NOT EXISTS anaisCongresso(

    id INT NOT NULL AUTO_INCREMENT,
    codigo INT,
    tipo VARCHAR(6), 
    titulo VARCHAR(140),
    autor VARCHAR(100), 
    nomeCongresso VARCHAR(100), 
    anoPublicacao DATE, 
    localEvento VARCHAR(100),
    
    PRIMARY KEY(id)
    
);
        
CREATE TABLE IF NOT EXISTS jornal(

    id INT NOT NULL AUTO_INCREMENT,
    codigo INT,
    titulo VARCHAR(140), 
    dataPublicacao DATE,  
    edicao INT, 
    
    PRIMARY KEY(id)
); 

CREATE TABLE IF NOT EXISTS livro(

    id INT NOT NULL AUTO_INCREMENT,
    codigo INT,
    isbn VARCHAR(17), 
    titulo VARCHAR(140), 
    autor VARCHAR(100), 
    editora VARCHAR(40), 
    anoDefesaPublicacao DATE, 
    edicao INT, 
    numeroPagina INT, 
    areaConhecimento VARCHAR(40),
    tema VARCHAR(40), 
    
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS midiaEletronica(
    id int NOT NULL AUTO_INCREMENT,
    codigo INT,
    titulo VARCHAR(140), 
    tipo VARCHAR(3), 
    dataGravacao DATE,
    
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS revista(
    id int NOT NULL AUTO_INCREMENT,
    codigo INT,
    titulo VARCHAR(140), 
    editora VARCHAR(40), 
    dataPublicacao DATE,  
    edicao INT, 
    numeroPagina INT,
    
    PRIMARY KEY(id)

);

CREATE TABLE IF NOT EXISTS trabalhoConclusao(
    id int NOT NULL AUTO_INCREMENT,
    codigo INT,
    tipo VARCHAR(30), 
    autor VARCHAR(100), 
    orientador VARCHAR(100), 
    titulo VARCHAR(140), 
    anoDefesa DATE, 
    localDefesa VARCHAR(100),
    
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS curso(

    id int NOT NULL AUTO_INCREMENT,
    codigo INT,
    nome VARCHAR(40), 
    areaCurso VARCHAR(30), 
    tipo VARCHAR(30),
    sigla VARCHAR(2),
    
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS funcionario(

    id int NOT NULL AUTO_INCREMENT,
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


    PRIMARY KEY(id)
);
        

CREATE TABLE IF NOT EXISTS aluno(
    
    id int NOT NULL AUTO_INCREMENT,
    nome VARCHAR(150),
    nomeMae VARCHAR(150),
    matricula VARCHAR(10), 
    cpf BIGINT(11),  
    rg BIGINT(7), 
    naturalidade VARCHAR(100), 
    endereco VARCHAR(100), 
    telefone VARCHAR(10),
    email VARCHAR(100), 
    senha VARCHAR(20), 
    nomeCurso VARCHAR(40),
    anoIngresso INT , 
    periodoIngresso VARCHAR(6), 
    
    PRIMARY KEY(id), 
    FOREIGN KEY (nomeCurso) REFERENCES curso(nome)
);

CREATE DATABASE IF NOT EXISTS biblioteca; 
USE biblioteca;

CREATE TABLE IF NOT EXISTS anaisCongresso(

    id INT NOT NULL AUTO_INCREMENT,
    codigo INT,
    tipo VARCHAR(6), 
    titulo VARCHAR(140),
    autor VARCHAR(100), 
    nomeCongresso VARCHAR(100), 
    anoPublicacao DATE, 
    localEvento VARCHAR(100),
    
    PRIMARY KEY(id)
    
);
        
CREATE TABLE IF NOT EXISTS jornal(

    id INT NOT NULL AUTO_INCREMENT,
    codigo INT,
    titulo VARCHAR(140), 
    dataPublicacao DATE,  
    edicao INT, 
    
    PRIMARY KEY(id)
); 

CREATE TABLE IF NOT EXISTS livro(

    id INT NOT NULL AUTO_INCREMENT,
    codigo INT,
    isbn VARCHAR(17), 
    titulo VARCHAR(140), 
    autor VARCHAR(100), 
    editora VARCHAR(40), 
    anoDefesaPublicacao DATE, 
    edicao INT, 
    numeroPagina INT, 
    areaConhecimento VARCHAR(40),
    tema VARCHAR(40), 
    
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS midiaEletronica(
    id int NOT NULL AUTO_INCREMENT,
    codigo INT,
    titulo VARCHAR(140), 
    tipo VARCHAR(3), 
    dataGravacao DATE,
    
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS revista(
    id int NOT NULL AUTO_INCREMENT,
    codigo INT,
    titulo VARCHAR(140), 
    editora VARCHAR(40), 
    dataPublicacao DATE,  
    edicao INT, 
    numeroPagina INT,
    
    PRIMARY KEY(id)

);

CREATE TABLE IF NOT EXISTS trabalhoConclusao(
    id int NOT NULL AUTO_INCREMENT,
    codigo INT,
    tipo VARCHAR(30), 
    autor VARCHAR(100), 
    orientador VARCHAR(100), 
    titulo VARCHAR(140), 
    anoDefesa DATE, 
    localDefesa VARCHAR(100),
    
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS curso(

    id int NOT NULL AUTO_INCREMENT,
    codigo INT,
    nome VARCHAR(40), 
    areaCurso VARCHAR(30), 
    tipo VARCHAR(30),
    sigla VARCHAR(2),
    
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS funcionario(

    id int NOT NULL AUTO_INCREMENT,
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


    PRIMARY KEY(id)
);
        

CREATE TABLE IF NOT EXISTS aluno(
    
    id int NOT NULL AUTO_INCREMENT,
    nome VARCHAR(150),
    nomeMae VARCHAR(150),
    matricula VARCHAR(10), 
    cpf BIGINT(11),  
    rg BIGINT(7), 
    naturalidade VARCHAR(100), 
    endereco VARCHAR(100), 
    telefone VARCHAR(10),
    email VARCHAR(100), 
    senha VARCHAR(20), 
    nomeCurso VARCHAR(40),
    anoIngresso INT , 
    periodoIngresso VARCHAR(6), 
    
    PRIMARY KEY(id), 
    FOREIGN KEY (nomeCurso) REFERENCES curso(nome)
);

