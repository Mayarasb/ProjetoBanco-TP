CREATE DATABASE USUARIO
GO

USE LOGIN
GO

CREATE TABLE USUARIO(
	ID	VARCHAR(8) PRIMARY KEY NOT NULL,
	NOME VARCHAR(80) NOT NULL,
	CPF VARCHAR(20) NOT NULL,
	EMAIL VARCHAR(100)NOT NULL,
	SENHA VARCHAR(80)NOT NULL,
	
	)
	select * from LOGIN
