--Criando Tabelas
CREATE TABLE cliente(
    cCpf varchar(14),
    CNome varchar(40),
    Rua varchar(30),
    Bairro varchar(20),
	Cidade varchar(20),
	Numero integer,
    Telefone integer,
    Email varchar(40),
	primary key (cCpf)
);

CREATE TABLE Funcionario (
    cpf varchar(14),
    Nome varchar(45),
    login varchar(20),
    senha varchar(20),
	primary key(cpf)
);


CREATE TABLE Venda (
    idVenda integer,
    Funcionario_cpf varchar(14),
    Cliente_cCpf varchar(14),
	Valor real,
	enderecoEntrega varchar(60),
	primary key(idVenda),
	foreign key (Cliente_cCpf) references Cliente(cCpf),
	foreign key (Funcionario_cpf) references Funcionario(cpf)
);

CREATE TABLE Produto (
    idProduto integer,
    Nome varchar(30),
    preco real,
    material varchar(30),
	cor varchar(20),
	design varchar(30),
    QuantidadeEmEstoque integer,
    primary key (idProduto)
);


CREATE TABLE Venda_Nota (
    Quantidade integer,
    Venda_idVenda integer ,
    Produto_idProduto integer,
	foreign key (Venda_idVenda) references Venda(idVenda),
	foreign key (Produto_idProduto) references Produto(idProduto)
);

--Inserindo Cliente
INSERT INTO cliente VALUES ('101.902.176-99', 'Romulo', 'Rua c','Jardim Primavera', 'Rio Paranaíba', 123, 92855826, 'romulo.ipker@gmail.com');
INSERT INTO cliente VALUES ('456.322.134-76', 'Nalbert', 'Rua d','Jardim Primavera', 'Rio Paranaíba', 4435, 92761583, 'nalbert.ipker@gmail.com');
INSERT INTO cliente VALUES ('653.384.424-67', 'Ana', 'Rua e','Jardim Primavera', 'Rio Paranaíba', 1543, 92134574, 'Aana@gmail.com');
INSERT INTO cliente VALUES ('123.956.853-14', 'Daniel', 'Rua f','Jardim Primavera', 'Rio Paranaíba', 543, 92976478, 'Daniel@gmail.com');



--Inserindo Produto
INSERT INTO produto VALUES (12,'cama',1200,'madeira','branca','esportivo',20);
INSERT INTO produto VALUES (5,'Armario',400,'aço','branca','itatiaia',30);
INSERT INTO produto VALUES (10,'Geladeira',2000,'aço','preta','BRM53HK',15);
INSERT INTO produto VALUES (6,'Foguão Brastemp',1000,'aço','preto','BFS5NCRUNA',17);
SELECT * FROM produto;

--Inserindo Funcionario
INSERT INTO funcionario VALUES ('134.465.724.45','Roberto','102','rm2456');
INSERT INTO funcionario VALUES ('240.929.916-49','Magna','103', 'oioi123');
INSERT INTO funcionario VALUES ('123.456.432-12','Ana','104','dsf312');
SELECT * FROM funcionario;

--Realizando Venda
CREATE OR REPLACE RULE rl_baixar_estoque 
AS ON INSERT TO venda_nota DO
UPDATE produto SET quantidadeemestoque = quantidadeemestoque - new.quantidade
WHERE idproduto = new.produto_idproduto;
--INSERT INTO venda VALUES (1, '123.456.432-12', '101.902.176-99', '10/05/2019', 1000, 'rua c');
--INSERT INTO venda_nota VALUES (5,1,12);
--SELECT * FROM produto;

--Excluindo um cliente
--SELECT * FROM cliente;
--DELETE FROM cliente
--WHERE cnome = 'romulo';
--SELECT * FROM cliente;

--Excluindo Funcionario
--SELECT * FROM funcionario;
--DELETE FROM funcionario
--WHERE cpf = '240.929.916-49';
--SELECT * FROM funcionario;

