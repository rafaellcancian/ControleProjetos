CREATE DATABASE  IF NOT EXISTS `bdcontrole` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `bdcontrole`;
-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: bdcontrole
-- ------------------------------------------------------
-- Server version	8.0.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `alocacao`
--

DROP TABLE IF EXISTS `alocacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alocacao` (
  `idAlocacao` int NOT NULL AUTO_INCREMENT,
  `idProjeto` int NOT NULL,
  `idColaborador` int NOT NULL,
  `dataInicio` date NOT NULL,
  `dataFim` date DEFAULT NULL,
  `horasSemana` decimal(6,1) DEFAULT NULL,
  `valorHora` decimal(11,2) NOT NULL,
  PRIMARY KEY (`idAlocacao`),
  KEY `fk_Projeto_has_Colaborador_Colaborador1_idx` (`idColaborador`),
  KEY `fk_Alocacao_Projeto1_idx` (`idProjeto`),
  CONSTRAINT `fk_Alocacao_Projeto1` FOREIGN KEY (`idProjeto`) REFERENCES `projeto` (`idProjeto`),
  CONSTRAINT `fk_Projeto_has_Colaborador_Colaborador1` FOREIGN KEY (`idColaborador`) REFERENCES `colaborador` (`idColaborador`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alocacao`
--

LOCK TABLES `alocacao` WRITE;
/*!40000 ALTER TABLE `alocacao` DISABLE KEYS */;
/*!40000 ALTER TABLE `alocacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `idCliente` int NOT NULL AUTO_INCREMENT,
  `endereco` varchar(100) NOT NULL,
  `email` varchar(50) NOT NULL,
  `fone` varchar(14) NOT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'Rua Aureliano de Figueiredo Pinto','rafael.londero@ufn.edu.br','5555996149643'),(2,'Rua dos Andradas','guilherme.kuhn@ufn.edu.br','5555999999999'),(3,'Av. N. Sra. das Dores','contato@cancianimoveis.com','553033400');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `colaborador`
--

DROP TABLE IF EXISTS `colaborador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `colaborador` (
  `idColaborador` int NOT NULL AUTO_INCREMENT,
  `matricula` varchar(15) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `dataAdmissao` date NOT NULL,
  `dataDesligamento` date DEFAULT NULL,
  PRIMARY KEY (`idColaborador`),
  UNIQUE KEY `matricula_UNIQUE` (`matricula`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `colaborador`
--

LOCK TABLES `colaborador` WRITE;
/*!40000 ALTER TABLE `colaborador` DISABLE KEYS */;
INSERT INTO `colaborador` VALUES (1,'20408095','Paulo Machado','2021-05-25','2022-05-25');
/*!40000 ALTER TABLE `colaborador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pessoafisica`
--

DROP TABLE IF EXISTS `pessoafisica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pessoafisica` (
  `idPessoaFisica` int NOT NULL,
  `cpf` varchar(14) NOT NULL,
  `nome` varchar(50) NOT NULL,
  PRIMARY KEY (`idPessoaFisica`),
  UNIQUE KEY `cpf_UNIQUE` (`cpf`),
  KEY `fk_PessoaFisica_Cliente1_idx` (`idPessoaFisica`),
  CONSTRAINT `fk_PessoaFisica_Cliente1` FOREIGN KEY (`idPessoaFisica`) REFERENCES `cliente` (`idCliente`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pessoafisica`
--

LOCK TABLES `pessoafisica` WRITE;
/*!40000 ALTER TABLE `pessoafisica` DISABLE KEYS */;
INSERT INTO `pessoafisica` VALUES (1,'031.355.900-70','Rafael Londero Cancian'),(2,'123.456.789-99','Guilherme da Silva Kuhn');
/*!40000 ALTER TABLE `pessoafisica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pessoajuridica`
--

DROP TABLE IF EXISTS `pessoajuridica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pessoajuridica` (
  `idPessoaJuridica` int NOT NULL,
  `cnpj` varchar(18) NOT NULL,
  `nomeFantasia` varchar(50) NOT NULL,
  `razaoSocial` varchar(50) NOT NULL,
  PRIMARY KEY (`idPessoaJuridica`),
  UNIQUE KEY `cnpj_UNIQUE` (`cnpj`),
  KEY `fk_PessoaJuridica_Cliente1_idx` (`idPessoaJuridica`),
  CONSTRAINT `fk_PessoaJuridica_Cliente1` FOREIGN KEY (`idPessoaJuridica`) REFERENCES `cliente` (`idCliente`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pessoajuridica`
--

LOCK TABLES `pessoajuridica` WRITE;
/*!40000 ALTER TABLE `pessoajuridica` DISABLE KEYS */;
INSERT INTO `pessoajuridica` VALUES (3,'17.221.031/0001-75','Cancian Imóveis','Imobiliária');
/*!40000 ALTER TABLE `pessoajuridica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `projeto`
--

DROP TABLE IF EXISTS `projeto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `projeto` (
  `idProjeto` int NOT NULL AUTO_INCREMENT,
  `idCliente` int NOT NULL,
  `idLider` int NOT NULL,
  `matricula` varchar(15) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `escopo` varchar(20) NOT NULL,
  `dataInicio` date NOT NULL,
  `dataPrevConclusao` date DEFAULT NULL,
  `dataConclusao` date DEFAULT NULL,
  `tipoCliente` tinyint NOT NULL,
  PRIMARY KEY (`idProjeto`),
  UNIQUE KEY `matricula_UNIQUE` (`matricula`),
  KEY `fk_Projeto_Colaborador1_idx` (`idLider`),
  KEY `fk_Projeto_Cliente1_idx` (`idCliente`),
  CONSTRAINT `fk_Projeto_Cliente1` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`) ON DELETE CASCADE,
  CONSTRAINT `fk_Projeto_Colaborador1` FOREIGN KEY (`idLider`) REFERENCES `colaborador` (`idColaborador`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `projeto`
--

LOCK TABLES `projeto` WRITE;
/*!40000 ALTER TABLE `projeto` DISABLE KEYS */;
INSERT INTO `projeto` VALUES (2,1,1,'20704045','Projeto de teste','Descrição','2021-06-06','2021-06-08','2021-06-09',0);
/*!40000 ALTER TABLE `projeto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tarefa`
--

DROP TABLE IF EXISTS `tarefa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tarefa` (
  `idTarefa` int NOT NULL AUTO_INCREMENT,
  `idColaborador` int NOT NULL,
  `idProjeto` int NOT NULL,
  `descricao` varchar(45) NOT NULL,
  `dataInicio` date NOT NULL,
  `dataFim` date DEFAULT NULL,
  `status` varchar(10) NOT NULL,
  `previsaoHoras` decimal(6,1) NOT NULL,
  `qtdHoras` decimal(6,1) DEFAULT NULL,
  PRIMARY KEY (`idTarefa`),
  KEY `fk_Colaborador_has_Projeto_Projeto1_idx` (`idProjeto`),
  KEY `fk_Colaborador_has_Projeto_Colaborador1_idx` (`idColaborador`),
  CONSTRAINT `fk_Colaborador_has_Projeto_Colaborador1` FOREIGN KEY (`idColaborador`) REFERENCES `colaborador` (`idColaborador`) ON DELETE CASCADE,
  CONSTRAINT `fk_Colaborador_has_Projeto_Projeto1` FOREIGN KEY (`idProjeto`) REFERENCES `projeto` (`idProjeto`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tarefa`
--

LOCK TABLES `tarefa` WRITE;
/*!40000 ALTER TABLE `tarefa` DISABLE KEYS */;
/*!40000 ALTER TABLE `tarefa` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-09 12:15:52
