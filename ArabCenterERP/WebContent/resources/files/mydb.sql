-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jan 19, 2020 at 11:48 PM
-- Server version: 10.4.10-MariaDB
-- PHP Version: 5.6.40

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mydb`
--

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
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
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `email`, `password`, `role`, `phone`, `image`, `active`, `lastUpdate`, `createdDate`, `name`, `userName`, `about`, `city`, `facebookLink`, `moneyreportLink`, `nationalId`, `postalCodeName`, `vodafoneCashLink`, `whatsupLink`, `workRegLink`, `workSampleLink`, `otherPaymentMethods`) VALUES
(1, 'ahmed@gmail.com', '535bd51ae59ed800950b4dea6bfdbfe0', 0, '01061690939', NULL, 1, '2020-01-19 23:02:08', NULL, 'ahmed', 'ahmedDakrory', 'asdlasdlasdkmlasdkml', 'EG', 'aksdkm', 'wqwekl', '1212312312', 'askmlasdklm', '992323', 'ahmed-000-', 'asdasdasdqw', 'asdasdasd', 'lkmasmdmlkasdm');

-- --------------------------------------------------------

--
-- Table structure for table `work_field`
--

DROP TABLE IF EXISTS `work_field`;
CREATE TABLE IF NOT EXISTS `work_field` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `field` varchar(1024) CHARACTER SET utf8 DEFAULT NULL,
  `mainField` int(11) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `tagmain_tagmain_idx` (`mainField`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `work_field`
--

INSERT INTO `work_field` (`id`, `field`, `mainField`, `type`) VALUES
(29, 'برمجة', NULL, 0),
(30, 'ديزاين', NULL, 0),
(31, 'مطبخ', NULL, 0),
(42, 'زراعة', NULL, 0),
(43, 'تجارة', NULL, 0),
(44, 'تسويق', NULL, 0),
(45, 'ثقافة عامة', NULL, 0),
(46, 'photoshop', 30, 1),
(47, 'php', 29, 1),
(48, 'python', 29, 1),
(49, 'java', 29, 1),
(50, 'oracle', 29, 1),
(51, 'mysql', 29, 1),
(52, 'android', 29, 1);

-- --------------------------------------------------------

--
-- Table structure for table `work_field_user`
--

DROP TABLE IF EXISTS `work_field_user`;
CREATE TABLE IF NOT EXISTS `work_field_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) DEFAULT NULL,
  `work_fieldId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `work_field_user_workFieldId_idx` (`work_fieldId`),
  KEY `work_field_user_userId_idx` (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `work_field_user`
--

INSERT INTO `work_field_user` (`id`, `userId`, `work_fieldId`) VALUES
(10, 1, 29),
(11, 1, 30),
(12, 1, 42),
(13, 1, 47),
(14, 1, 46);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `work_field`
--
ALTER TABLE `work_field`
  ADD CONSTRAINT `fieldRelatedTo` FOREIGN KEY (`mainField`) REFERENCES `work_field` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `work_field_user`
--
ALTER TABLE `work_field_user`
  ADD CONSTRAINT `work_field_user_userId` FOREIGN KEY (`userId`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `work_field_user_workFieldId` FOREIGN KEY (`work_fieldId`) REFERENCES `work_field` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
