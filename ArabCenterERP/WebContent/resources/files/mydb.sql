-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: mydb
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.10-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  `password` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  `role` int(11) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `image` varchar(45) DEFAULT NULL,
  `active` int(11) DEFAULT NULL,
  `lastUpdate` datetime DEFAULT NULL,
  `createdDate` datetime DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `userName` varchar(45) DEFAULT NULL,
  `about` varchar(1024) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `facebookLink` varchar(45) DEFAULT NULL,
  `moneyreportLink` varchar(45) DEFAULT NULL,
  `nationalId` varchar(45) DEFAULT NULL,
  `postalCodeName` varchar(45) DEFAULT NULL,
  `vodafoneCashLink` varchar(45) DEFAULT NULL,
  `whatsupLink` varchar(45) DEFAULT NULL,
  `workRegLink` varchar(45) DEFAULT NULL,
  `workSampleLink` varchar(45) DEFAULT NULL,
  `otherPaymentMethods` varchar(1024) DEFAULT NULL,
  `vacationState` int(11) DEFAULT 1,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'ahmed@gmail.com','535bd51ae59ed800950b4dea6bfdbfe0',0,'01061690939',NULL,1,'2020-01-20 09:28:48',NULL,'أحمد محمد سيد الدكرورى','ahmedDakrory','asdlasdlasdkmlasdkml','eg','aksdkm','wqwekl','1212312312','askmlasdklm','992323','ahmed-000-','asdasdasdqw','asdasdasd','lkmasmdmlkasdm',1),(2,'ahedm',NULL,NULL,'01061690911',NULL,NULL,'2020-01-20 14:08:00',NULL,'محمد على','mohamed123','سيبسيبسيبسيبسيبسيب','sa','asdasd','سيبسيب','','','651651','36516516','سيبسيب','سيبسيب','',NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `work_field`
--

DROP TABLE IF EXISTS `work_field`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `work_field` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `field` varchar(1024) CHARACTER SET utf8 DEFAULT NULL,
  `mainField` int(11) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `tagmain_tagmain_idx` (`mainField`),
  CONSTRAINT `fieldRelatedTo` FOREIGN KEY (`mainField`) REFERENCES `work_field` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `work_field`
--

LOCK TABLES `work_field` WRITE;
/*!40000 ALTER TABLE `work_field` DISABLE KEYS */;
INSERT INTO `work_field` VALUES (29,'برمجة',NULL,0),(30,'ديزاين',NULL,0),(31,'مطبخ',NULL,0),(42,'زراعة',NULL,0),(43,'تجارة',NULL,0),(44,'تسويق',NULL,0),(45,'ثقافة عامة',NULL,0),(46,'photoshop',30,1),(47,'php',29,1),(48,'python',29,1),(49,'java',29,1),(50,'oracle',29,1),(51,'mysql',29,1),(52,'android',29,1);
/*!40000 ALTER TABLE `work_field` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `work_field_user`
--

DROP TABLE IF EXISTS `work_field_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `work_field_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) DEFAULT NULL,
  `work_fieldId` int(11) DEFAULT NULL,
  `good` int(11) DEFAULT NULL,
  `bad` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `work_field_user_workFieldId_idx` (`work_fieldId`),
  KEY `work_field_user_userId_idx` (`userId`),
  CONSTRAINT `work_field_user_userId` FOREIGN KEY (`userId`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `work_field_user_workFieldId` FOREIGN KEY (`work_fieldId`) REFERENCES `work_field` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `work_field_user`
--

LOCK TABLES `work_field_user` WRITE;
/*!40000 ALTER TABLE `work_field_user` DISABLE KEYS */;
INSERT INTO `work_field_user` VALUES (27,1,29,1,3),(28,1,30,3,5),(29,1,47,5,3),(30,1,48,9,1),(31,1,46,5,3),(32,2,29,0,0),(33,2,30,0,0),(34,2,45,0,0),(35,2,47,0,0),(36,2,48,0,0);
/*!40000 ALTER TABLE `work_field_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-20 16:13:38
