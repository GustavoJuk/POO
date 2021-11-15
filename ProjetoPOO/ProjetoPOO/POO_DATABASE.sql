CREATE DATABASE poo_project;
USE poo_project;

CREATE TABLE Contato (
	id INT NOT NULL,
	ddd INT,
	telefone INT,
	email VARCHAR(50) NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE Filial (
	id INT NOT NULL,
	nome VARCHAR(50) NOT NULL,
	contato INT NOT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (contato) REFERENCES Contato(id)
);

CREATE TABLE Empresa (
	id INT NOT NULL,
	nome VARCHAR(50) NOT NULL,
	contato INT NOT NULL,
	filial INT NOT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (contato) REFERENCES Contato(id),
	FOREIGN KEY (filial) REFERENCES Filial(id)
);

CREATE TABLE Endereco (
	id INT NOT NULL,
	pais VARCHAR(50) NOT NULL,
	uf CHAR(2) NOT NULL,
	cidade VARCHAR(50) NOT NULL,
	bairro VARCHAR(50) NOT NULL,
	rua VARCHAR(50) NOT NULL,
	complemento VARCHAR(50) NOT NULL,
	numero VARCHAR(50) NOT NULL,
	PRIMARY KEY (id)
);