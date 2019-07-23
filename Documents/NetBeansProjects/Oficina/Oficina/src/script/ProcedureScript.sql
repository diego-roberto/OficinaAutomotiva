


-- CATEGORIA DAO

DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_insert_categoria`(IN descricaoCategoria VARCHAR(25))
BEGIN
	INSERT INTO categoria(
		descricao_categoria)
	VALUES(
		descricaoCategoria);
END$$
DELIMITER ;
--
DELIMITER $$
CREATE PROCEDURE sp_search_categoria_all()
BEGIN
	SELECT *FROM categoria;
END $$
DELIMITER $$








-- CLIENTE DAO

DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_insert_cliente`(
	IN nomeRazaoCliente VARCHAR(60),
	IN cpfCnpjCliente VARCHAR(14),
	IN telefoneCliente VARCHAR(11),
	IN tipoCliente CHAR(2))
BEGIN
	INSERT INTO cliente(
		nome_razao_cliente,
		cpf_cnpj_cliente,
		telefone_cliente,
		tipo_cliente)
		VALUES(
			nomeRazaoCliente,
			cpfCnpjCliente,
			telefoneCliente,
			tipoCliente);
END$$
DELIMITER ;
--
DELIMITER $$
CREATE PROCEDURE sp_update_cliente(
	IN nomeRazaoCliente VARCHAR(70),
    IN cpfCnpjCliente VARCHAR(14),
    IN telefoneCliente VARCHAR(11),
    IN tipoCliente CHAR(2),
    IN codigoCliente INT)
BEGIN
	UPDATE cliente 
    SET nome_razao_cliente = nomeRazaoCliente,
        cpf_cnpj_cliente = cpfCnpjCliente,
        telefone_cliente = telefoneCliente,
        tipo_cliente = tipoCliente
		WHERE idcliente = codigoCliente;
END $$
DELIMITER $$
--
DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_search_cliente_name`(IN nomeRazaoCliente VARCHAR(60))
BEGIN
	SELECT *FROM cliente
	WHERE nome_razao_cliente 
	LIKE nomeRazaoCliente;
END$$
DELIMITER ;
--
DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_search_cliente_all`()
BEGIN
	SELECT *FROM cliente;
END$$
DELIMITER ;






-- FORNECEDOR DAO

DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_insert_fornecedor`(
		IN razaoFornecedor VARCHAR(100),
		IN cnpjFornecedor VARCHAR(14),
		IN emailFornecedor VARCHAR(70),
		IN telefoneFornecedor VARCHAR(11))
BEGIN
	INSERT INTO fornecedor(
		razao_fornecedor,
		cnpj_fornecedor,
		email_fornecedor,
		telefone_fornecedor)
		VALUES(
			razaoFornecedor,
			cnpjFornecedor,
			emailFornecedor,
			telefoneFornecedor);
END$$
DELIMITER ;
--
DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_update_fornecedor`(
	IN razaoFornecedor VARCHAR(100),
	IN cnpjFornecedor VARCHAR(14),
	IN emailFornecedor VARCHAR(70),
	IN telefoneFornecedor VARCHAR(11),
	IN codigoFornecedor INT)
BEGIN
	UPDATE fornecedor
	SET	cnpj_fornecedor = cnpjFornecedor,
		razao_fornecedor = razaoFornecedor,
		cnpj_fornecedor = cnpjFornecedor,
		email_fornecedor = emailFornecedor,
		telefone_fornecedor = telefoneFornecedor
		WHERE idfornecedor = codigoFornecedor;
END$$
DELIMITER ;
--
DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_delete_fornecedor`(
	IN codigoFornecedor INT)
BEGIN
	DELETE FROM fornecedor
	WHERE idfornecedor = codigoFornecedor;
END$$
DELIMITER ;
--
DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_search_fornecedor_cnpj`(IN cnpjFornecedor VARCHAR(14))
BEGIN
	SELECT *FROM fornecedor
	WHERE cnpj_fornecedor 
    LIKE cnpjFornecedor;
END$$
DELIMITER ;
--
DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_search_fornecedor_all`()
BEGIN
	SELECT *FROM fornecedor;
END$$
DELIMITER ;








-- FUNCIONARIO DAO

DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_insert_funcionario`(
		IN nomeFuncionario VARCHAR(60),
		IN cpfFuncionario VARCHAR(11),
		IN telefoneFuncionario VARCHAR(11))
BEGIN
	INSERT INTO funcionario(
		nome_funcionario,
		cpf_funcionario,
		telefone_funcionario)		
		VALUES(
			nomeFuncionario,
			cpfFuncionario,
			telefoneFuncionario);			
END$$
DELIMITER ;
--
DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_update_funcionario`(
	IN nomeFuncionario VARCHAR(60),
	IN cpfFuncionario VARCHAR(11),
	IN telefoneFuncionario VARCHAR(11),
	IN codigoFuncionario INT)
BEGIN
	UPDATE funcionario
	SET	nome_funcionario = nomeFuncionario,
		cpf_funcionario = cpfFuncionario,		
		telefone_funcionario = telefoneFuncionario
		WHERE idfuncionario = codigoFuncionario;
END$$
DELIMITER ;
--
DELIMITER $$
CREATE PROCEDURE sp_delete_funcionario(
	IN codigoFuncionario INT)
BEGIN
	DELETE FROM funcionario
	WHERE idfuncionario = codigoFuncionario;
END $$
DELIMITER $$	
--
DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_search_funcionario_name`(IN nomeFuncionario VARCHAR(70))
BEGIN
	SELECT *FROM funcionario
	WHERE nome_funcionario 
	LIKE nomeFuncionario;
END$$
DELIMITER ;
--
DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_search_funcionario_all`()
BEGIN
	SELECT *FROM funcionario;
END$$
DELIMITER ;









-- PECA DAO

DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_insert_peca`(
		IN valorPeca DECIMAL(7,2),
		IN descricaoPeca VARCHAR(50),
		IN descricaoCategoria VARCHAR(50))
BEGIN
	INSERT INTO peca(
		valor_peca,
		descricao_peca,
		categoria_idcategoria)		
		VALUES(
			valorPeca,
			descricaoPeca,
			(SELECT idcategoria FROM categoria WHERE descricao_categoria LIKE descricaoCategoria));			
END$$
DELIMITER ;
--
DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_update_peca`(
	IN valorPeca DECIMAL(5,2),
	IN descricaoPeca VARCHAR(45),
	IN descricaoCategoria VARCHAR(25),
	IN codigoPeca INT)
BEGIN
	UPDATE peca
	SET	valor_peca = valorPeca,
		descricao_peca = descricaoPeca,		
		categoria_idcategoria = (SELECT idcategoria FROM categoria WHERE descricao_categoria LIKE descricaoCategoria)
		WHERE idpeca = codigoPeca;
END$$
DELIMITER ;
--
DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_search_peca_code`(IN codigoPeca INT)
BEGIN
	SELECT *FROM view_all_peca
	WHERE idpeca = codigoPeca;
END$$
DELIMITER ;
--
DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_search_peca_all`()
BEGIN
	SELECT *FROM peca;
END$$
DELIMITER ;
--
DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_search_peca_categoria`()
BEGIN
	SELECT	idpeca,
			descricao_peca,
            valor_peca,
            quantidade_peca,
            categoria_idcategoria,
			descricao_categoria            
    FROM peca
    INNER JOIN categoria
    ON categoria_idcategoria = idcategoria;					
END$$
DELIMITER ;







-- SERVICO DAO

DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_insert_servico`(		
		IN descricaoServico VARCHAR(50),
        IN valorServico DECIMAL(5,2))
BEGIN
	INSERT INTO servico(
		valor_servico,
		descricao_servico)		
		VALUES(
			valorServico,
			descricaoServico);			
END$$
DELIMITER ;
--
DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_update_servico`(	
	IN descricaoServico VARCHAR(45),
	IN valorServico DECIMAL(5,2),
	IN codigoServico INT)
BEGIN
	UPDATE servico
	SET	descricao_servico = descricaoServico,
        valor_servico = valorServico
		WHERE idservico = codigoServico;
END$$
DELIMITER ;
--
DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_delete_servico`(
	IN codigoServico INT)
BEGIN
	DELETE FROM servico
	WHERE idservico = codigoServico;
END$$
DELIMITER ;
--
DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_search_servico_code`(
	IN codigoServico INT)
BEGIN
	SELECT *FROM servico
	WHERE idservico = codigoServico;
END$$
DELIMITER ;
--
DELIMITER $$
CREATE PROCEDURE sp_search_servico_all()
BEGIN
	SELECT *FROM servico;
END $$
DELIMITER $
--








-- USUARIO DAO
DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_insert_usuario`(
	IN matriculaUsuario INT,
	IN senhaUsuario VARCHAR(12),
	IN nivelUsuario INT,
	IN nomeUsuario VARCHAR(60))
BEGIN
	INSERT INTO usuario(
		matricula_usuario,
		senha_usuario,
		nivel_usuario,
		funcionario_idfuncionario)
		VALUES(
			matriculaUsuario,
			senhaUsuario,
			nivelUsuario,
			(SELECT idfuncionario 
			FROM funcionario			
			WHERE nome_funcionario LIKE nomeUsuario));
END$$
DELIMITER ;
--
DELIMITER $$
CREATE PROCEDURE sp_update_usuario(	
	IN senhaUsuario VARCHAR(12),
    IN nivelUsuario INT,
    IN matriculaUsuario INT)
BEGIN
	UPDATE usuario
	SET senha_usuario = senhaUsuario,
		nivel_usuario = nivelUsuario
		WHERE matricula_usuario = matriculaUsuario;
END $$
DELIMITER
--
DELIMITER $$
CREATE PROCEDURE sp_delete_usuario(
	IN matriculaUsuario INT)
BEGIN
	DELETE FROM usuario
    WHERE matricula_usuario = matriculaUsuario;
END $$
DELIMITER $$
--
DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_search_usuario_enrollment`(
	IN matriculaUsuario INT,
    IN senhaUsuario VARCHAR(12))
BEGIN
	SELECT 	idusuario,
			matricula_usuario,
            senha_usuario,
            nivel_usuario,
            nome_funcionario
	FROM usuario
    INNER JOIN funcionario
    ON funcionario_idfuncionario = idfuncionario
    WHERE matricula_usuario = matriculaUsuario
    AND senha_usuario
    LIKE senhaUsuario;
END$$
DELIMITER ;












-- VEICULO DAO
DELIMITER $$
CREATE PROCEDURE sp_insert_veiculo(
	IN modeloVeiculo VARCHAR(50),
    IN placaVeiculo VARCHAR(8),
    IN clienteCodigoCliente INT)
BEGIN
	INSERT INTO veiculo(
		modelo_veiculo, 
        placa_veiculo, 
        cliente_idcliente)
        VALUES(
			modeloVeiculo,
            placaVeiculo,
            clienteCodigoCliente);	
END $$
DELIMITER $$
--
DELIMITER $$
CREATE PROCEDURE sp_delete_veiculo(
	IN codigoVeiculo INT)
BEGIN
	DELETE FROM veiculo
    WHERE idveiculo = codigoVeiculo;
END $$
DELIMITER $$
--
DELIMITER $$
CREATE PROCEDURE sp_search_veiculo_cliente_code(
	IN clienteCodigoCliente INT)
BEGIN
	SELECT *FROM veiculo
	WHERE cliente_idcliente = clienteCodigoCliente;
END $$
DELIMITER $$
--
DELIMITER $$
CREATE PROCEDURE sp_search_veiculo_license(
	IN placaVeiculo VARCHAR(8))
BEGIN
	SELECT *FROM veiculo
    WHERE placa_veiculo
    LIKE placaVeiculo;
END $$
DELIMITER $$








-- ENTRADA DAO

DELIMITER $$
CREATE PROCEDURE sp_insert_entrada(
	IN quantidadeEntrada INT,
    IN valorUnitarioEntrada DECIMAL(7,2),
    IN codigoPeca INT,
    IN codigoFornecedor INT)
BEGIN
	INSERT INTO entrada(
		quantidade_entrada,
        valor_unitario_entrada,
        valor_total_entrada,
        peca_idpeca,
        fornecedor_idfornecedor)
        VALUES(
			quantidadeEntrada,
            valorUnitarioEntrada,
            (SELECT quantidadeEntrada * valorUnitarioEntrada),
            codigoPeca,
            codigoFornecedor);
END $$
DELIMITER $$
--
DELIMITER $$
CREATE PROCEDURE sp_adicionar_estoque(
	IN codigoPeca INT,
    IN quantidadePeca INT)
BEGIN
	UPDATE peca
	SET quantidade_peca = quantidade_peca + quantidadePeca;
END $$
DELIMITER $$
--
DELIMITER $$
CREATE TRIGGER tr_entrada_ai
AFTER INSERT
ON entrada
FOR EACH ROW
BEGIN
	CALL sp_adicionar_estoque(
		new.peca_idpeca,
        new.quantidade_peca);
END $$
DELIMITER $$
--
DELIMITER $$
CREATE PROCEDURE sp_search_entrada_all()
BEGIN
	SELECT 	identrada,
			quantidade_entrada,
            valor_unitario_entrada,
            valor_total_entrada,
            idpeca,
            descricao_peca,
            idfornecedor,
            razao_fornecedor
    FROM entrada
    INNER JOIN peca
    ON peca_idpeca = idpeca
    INNER JOIN fornecedor
    ON fornecedor_idfornecedor = idfornecedor;
END $$
DELIMITER $$
--
















-- ORDEM SERVICO DAO

DELIMITER $$
CREATE PROCEDURE sp_insert_ordem_sem_cliente(
	IN descricaoOrdem TEXT(700))
BEGIN
	INSERT INTO ordem(
		descricao_ordem)
        VALUES(
			descricaoOrdem);
END $$
DELIMITER $$
--
DELIMITER $$
CREATE PROCEDURE sp_insert_ordem_com_cliente(
	IN descricaoOrdem TEXT(700),
    IN codigoCliente INT,
    IN placaVeiculo VARCHAR(8))
BEGIN
	INSERT INTO ordem(
		descricao_ordem,
        cliente_idcliente,
		placa_veiculo_ordem)
        VALUES(
			descricaoOrdem,
            codigoCliente,
            placaVeiculo);
END $$
DELIMITER $$
--
DELIMITER $$
CREATE PROCEDURE sp_search_ordem_all()
BEGIN
	SELECT *FROM ordem;
END $$
DELIMITER $$
--
DELIMITER $$
CREATE PROCEDURE sp_update_ordem_oficina(
	IN codigoOrdem INT,
    IN descricaoOrdem TEXT(700))
BEGIN
	UPDATE ordem
    SET status_ordem = 1,
		descricao_ordem = descricaoOrdem
    WHERE idordem = codigoOrdem;
END $$
DELIMITER $$
--
DELIMITER $$
CREATE PROCEDURE sp_search_ordem_code(
	IN codigoOrdem INT)
BEGIN
	SELECT *FROM ordem
    WHERE idordem = codigoOrdem;
END $$
DELIMITER $$








-- pdv

DELIMITER $$
CREATE PROCEDURE sp_update_ordem_pdv(
	IN codigoOrdem INT,
    IN valorTotal DECIMAL(7,2),
    IN codigoPagamento INT,
    IN codigoProduto INT,
    IN tipoProduto INT,
    IN quantidadeProduto INT)
BEGIN
	UPDATE ordem
    SET valor_total_ordem = valorTotal,
		pagamento_idpagamento = codigoPagamento
        WHERE idordem = codigoOrdem;
        IF tipoProduto = 1 THEN
			INSERT INTO ordem_has_peca(
				ordem_idordem,
                peca_idpeca,
                quantidade_saida,
                valor_subtotal_saida)
                VALUES(
					codigoOrdem,
                    codigoProduto,
                    quantidadeProduto,
                    (SELECT quantidadeProduto * (SELECT valor_peca FROM peca WHERE idpeca = codigoProduto)));
						UPDATE peca
						SET quantidade_peca = quantidade_peca - quantidadeProduto;
						END IF;
						IF tipoProduto = 2 THEN
							INSERT INTO ordem_has_servico(
								ordem_idordem,
								servico_idservico,
								valor_subtotal_servico)
								VALUES(
									codigoOrdem,
									codigoProduto,
									(SELECT quantidadeProduto * (SELECT valor_servico FROM servico WHERE idservico = codigoProduto)));
									END IF;
                                
END $$
DELIMITER $$