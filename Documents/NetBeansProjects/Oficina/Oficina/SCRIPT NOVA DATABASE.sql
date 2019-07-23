-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema oficina
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema oficina
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `oficina` DEFAULT CHARACTER SET utf8 ;
USE `oficina` ;

-- -----------------------------------------------------
-- Table `oficina`.`funcionario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `oficina`.`funcionario` (
  `idfuncionario` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome_funcionario` VARCHAR(70) NOT NULL,
  `cpf_funcionario` VARCHAR(11) NOT NULL,
  `telefone_funcionario` VARCHAR(11) NULL,
  PRIMARY KEY (`idfuncionario`),
  UNIQUE INDEX `idfuncionario_UNIQUE` (`idfuncionario` ASC),
  UNIQUE INDEX `cpf_funcionario_UNIQUE` (`cpf_funcionario` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `oficina`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `oficina`.`usuario` (
  `idusuario` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `matricula_usuario` INT UNSIGNED NOT NULL,
  `senha_usuario` VARCHAR(12) NOT NULL,
  `nivel_usuario` TINYINT UNSIGNED NOT NULL,
  `funcionario_idfuncionario` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`idusuario`, `funcionario_idfuncionario`),
  UNIQUE INDEX `idusuario_UNIQUE` (`idusuario` ASC),
  UNIQUE INDEX `matricula_usuario_UNIQUE` (`matricula_usuario` ASC),
  INDEX `fk_usuario_funcionario1_idx` (`funcionario_idfuncionario` ASC),
  CONSTRAINT `fk_usuario_funcionario1`
    FOREIGN KEY (`funcionario_idfuncionario`)
    REFERENCES `oficina`.`funcionario` (`idfuncionario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `oficina`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `oficina`.`cliente` (
  `idcliente` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome_razao_cliente` VARCHAR(70) NOT NULL,
  `cpf_cnpj_cliente` VARCHAR(14) NOT NULL,
  `telefone_cliente` VARCHAR(11) NULL,
  `tipo_cliente` CHAR(2) NOT NULL,
  `data_cadastro_cliente` DATE NOT NULL,
  PRIMARY KEY (`idcliente`),
  UNIQUE INDEX `idcliente_UNIQUE` (`idcliente` ASC),
  UNIQUE INDEX `cpf_cnpj_cliente_UNIQUE` (`cpf_cnpj_cliente` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `oficina`.`veiculo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `oficina`.`veiculo` (
  `idveiculo` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `modelo_veiculo` VARCHAR(50) NOT NULL,
  `placa_veiculo` VARCHAR(8) NOT NULL,
  `cliente_idcliente` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`idveiculo`, `cliente_idcliente`),
  UNIQUE INDEX `idveiculo_UNIQUE` (`idveiculo` ASC),
  UNIQUE INDEX `placa_veiculo_UNIQUE` (`placa_veiculo` ASC),
  INDEX `fk_veiculo_cliente_idx` (`cliente_idcliente` ASC),
  CONSTRAINT `fk_veiculo_cliente`
    FOREIGN KEY (`cliente_idcliente`)
    REFERENCES `oficina`.`cliente` (`idcliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `oficina`.`fornecedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `oficina`.`fornecedor` (
  `idfornecedor` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `razao_fornecedor` VARCHAR(100) NOT NULL,
  `cnpj_fornecedor` VARCHAR(14) NOT NULL,
  `email_fornecedor` VARCHAR(70) NULL,
  `telefone_fornecedor` VARCHAR(11) NULL,
  PRIMARY KEY (`idfornecedor`),
  UNIQUE INDEX `idfornecedor_UNIQUE` (`idfornecedor` ASC),
  UNIQUE INDEX `cnpj_fornecedor_UNIQUE` (`cnpj_fornecedor` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `oficina`.`servico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `oficina`.`servico` (
  `idservico` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `descricao_servico` VARCHAR(50) NOT NULL,
  `valor_servico` DECIMAL(5,2) UNSIGNED NOT NULL,
  PRIMARY KEY (`idservico`),
  UNIQUE INDEX `idservico_UNIQUE` (`idservico` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `oficina`.`peca`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `oficina`.`peca` (
  `idpeca` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `descricao_peca` VARCHAR(50) NOT NULL,
  `valor_peca` DECIMAL(6,2) UNSIGNED NOT NULL DEFAULT 0,
  PRIMARY KEY (`idpeca`),
  UNIQUE INDEX `idpeca_UNIQUE` (`idpeca` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `oficina`.`entrada`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `oficina`.`entrada` (
  `identrada` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `quantidade_entrada` INT UNSIGNED NOT NULL,
  `valor_unitario_entrada` DECIMAL(6,2) UNSIGNED NOT NULL,
  `valor_total_entrada` DECIMAL(7,2) UNSIGNED NOT NULL,
  `peca_idpeca` INT UNSIGNED NOT NULL,
  `fornecedor_idfornecedor` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`identrada`, `peca_idpeca`, `fornecedor_idfornecedor`),
  UNIQUE INDEX `identrada_UNIQUE` (`identrada` ASC),
  INDEX `fk_entrada_peca1_idx` (`peca_idpeca` ASC),
  INDEX `fk_entrada_fornecedor1_idx` (`fornecedor_idfornecedor` ASC),
  CONSTRAINT `fk_entrada_peca1`
    FOREIGN KEY (`peca_idpeca`)
    REFERENCES `oficina`.`peca` (`idpeca`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_entrada_fornecedor1`
    FOREIGN KEY (`fornecedor_idfornecedor`)
    REFERENCES `oficina`.`fornecedor` (`idfornecedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `oficina`.`pagamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `oficina`.`pagamento` (
  `idpagamento` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `descricao_pagamento` VARCHAR(30) NOT NULL,
  PRIMARY KEY (`idpagamento`),
  UNIQUE INDEX `idpagamento_UNIQUE` (`idpagamento` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `oficina`.`ordem`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `oficina`.`ordem` (
  `idordem` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `descricao_ordem` TEXT(700) NOT NULL,
  `valor_total_ordem` DECIMAL(7,2) UNSIGNED NOT NULL,
  `status_ordem` TINYINT NOT NULL,
  `data_entrada_ordem` DATE NOT NULL,
  `data_saida_ordem` DATE NULL,
  `pagamento_idpagamento` INT UNSIGNED NOT NULL,
  `cliente_idcliente` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`idordem`, `pagamento_idpagamento`, `cliente_idcliente`),
  UNIQUE INDEX `idordem_UNIQUE` (`idordem` ASC),
  INDEX `fk_ordem_pagamento_idx` (`pagamento_idpagamento` ASC),
  INDEX `fk_ordem_cliente_idx` (`cliente_idcliente` ASC),
  CONSTRAINT `fk_ordem_pagamento`
    FOREIGN KEY (`pagamento_idpagamento`)
    REFERENCES `oficina`.`pagamento` (`idpagamento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ordem_cliente`
    FOREIGN KEY (`cliente_idcliente`)
    REFERENCES `oficina`.`cliente` (`idcliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `oficina`.`ordem_has_servico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `oficina`.`ordem_has_servico` (
  `ordem_idordem` INT UNSIGNED NOT NULL,
  `servico_idservico` INT UNSIGNED NOT NULL,
  `valor_subtotal_servico` DECIMAL(6,2) UNSIGNED NOT NULL,
  PRIMARY KEY (`ordem_idordem`, `servico_idservico`),
  INDEX `fk_ordem_has_servico_servico_idx` (`servico_idservico` ASC),
  INDEX `fk_ordem_has_servico_ordem_idx` (`ordem_idordem` ASC),
  CONSTRAINT `fk_ordem_has_servico_ordem1`
    FOREIGN KEY (`ordem_idordem`)
    REFERENCES `oficina`.`ordem` (`idordem`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ordem_has_servico_servico`
    FOREIGN KEY (`servico_idservico`)
    REFERENCES `oficina`.`servico` (`idservico`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `oficina`.`ordem_has_peca`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `oficina`.`ordem_has_peca` (
  `ordem_idordem` INT UNSIGNED NOT NULL,
  `peca_idpeca` INT UNSIGNED NOT NULL,
  `quantidade_saida` INT UNSIGNED NOT NULL,
  `valor_subtotal_saida` DECIMAL(6,2) UNSIGNED NOT NULL,
  PRIMARY KEY (`ordem_idordem`, `peca_idpeca`),
  INDEX `fk_ordem_has_peca_peca_idx` (`peca_idpeca` ASC),
  INDEX `fk_ordem_has_peca_ordem_idx` (`ordem_idordem` ASC),
  CONSTRAINT `fk_ordem_has_peca_ordem`
    FOREIGN KEY (`ordem_idordem`)
    REFERENCES `oficina`.`ordem` (`idordem`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ordem_has_peca_peca`
    FOREIGN KEY (`peca_idpeca`)
    REFERENCES `oficina`.`peca` (`idpeca`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `oficina`.`ordem_has_funcionario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `oficina`.`ordem_has_funcionario` (
  `ordem_idordem` INT UNSIGNED NOT NULL,
  `ordem_pagamento_idpagamento` INT UNSIGNED NOT NULL,
  `funcionario_idfuncionario` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`ordem_idordem`, `ordem_pagamento_idpagamento`, `funcionario_idfuncionario`),
  INDEX `fk_ordem_has_funcionario_funcionario_idx` (`funcionario_idfuncionario` ASC),
  INDEX `fk_ordem_has_funcionario_ordem_idx` (`ordem_idordem` ASC, `ordem_pagamento_idpagamento` ASC),
  CONSTRAINT `fk_ordem_has_funcionario_ordem`
    FOREIGN KEY (`ordem_idordem` , `ordem_pagamento_idpagamento`)
    REFERENCES `oficina`.`ordem` (`idordem` , `pagamento_idpagamento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ordem_has_funcionario_funcionario`
    FOREIGN KEY (`funcionario_idfuncionario`)
    REFERENCES `oficina`.`funcionario` (`idfuncionario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
