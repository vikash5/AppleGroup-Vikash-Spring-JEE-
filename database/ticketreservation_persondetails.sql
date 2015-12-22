CREATE DATABASE  IF NOT EXISTS `ticketreservation` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `ticketreservation`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win64 (x86_64)
--
-- Host: localhost    Database: ticketreservation
-- ------------------------------------------------------
-- Server version	5.6.24-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `persondetails`
--

DROP TABLE IF EXISTS `persondetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `persondetails` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `firstname` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `emailaddress` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `createdby` varchar(45) DEFAULT NULL,
  `updatedby` varchar(45) DEFAULT NULL,
  `createddate` varchar(45) DEFAULT NULL,
  `updateddate` varchar(45) DEFAULT NULL,
  `Role_id` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persondetails`
--

LOCK TABLES `persondetails` WRITE;
/*!40000 ALTER TABLE `persondetails` DISABLE KEYS */;
INSERT INTO `persondetails` VALUES (1,'pandi','pandi','vignesh','pandi','vig@com.com','zxcvbgfd','pandi','pandi','2015-11-25 21:39:09','2015-11-25 21:39:09','1'),(2,'santhosh','santhosh','santhosh','vimal','san@gsb.cjc','qwert','santhosh','santhosh','2015-11-26 01:29:58','2015-11-26 01:29:58','1'),(3,'sasi','sasi','sasi','kumar','sas@vims.sjj','asderf','sasi','sasi','2015-11-26 08:21:45','2015-11-26 08:21:45','1'),(4,'vinoth','vinoth','vino','kumar','vig@com.com','asdfg','vinoth','vinoth','2015-11-26 09:37:12','2015-11-26 09:37:12','2'),(5,'satheish','satheish','satheish','kumar','sasthiesh@com.com','qsdfb','satheish','satheish','2015-11-26 10:13:51','2015-11-26 10:13:51','2'),(6,'srini','srini','srini','vasan','sri@rfvuj.cfg','sdfghjk','srini','srini','2015-11-26 10:14:29','2015-11-26 10:14:29','2'),(7,'saiRam','sai','sai','Ram','sai@gik.co','asdfg','saiRam','saiRam','2015-11-29 19:44:25','2015-11-29 19:44:25','1');
/*!40000 ALTER TABLE `persondetails` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-12-22 10:28:44
