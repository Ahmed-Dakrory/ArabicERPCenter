-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jan 20, 2020 at 09:58 PM
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
-- Table structure for table `field_like`
--

DROP TABLE IF EXISTS `field_like`;
CREATE TABLE IF NOT EXISTS `field_like` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userIdMarker` int(11) DEFAULT NULL,
  `fieldUserId` int(11) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `dateTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=85 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `field_like`
--

INSERT INTO `field_like` (`id`, `userIdMarker`, `fieldUserId`, `type`, `dateTime`) VALUES
(74, 1, 29, 2, '2020-01-20 20:33:03'),
(77, 1, 28, 1, '2020-01-20 20:32:58'),
(78, 1, 37, 2, '2020-01-20 20:33:31'),
(80, 1, 27, 1, '2020-01-20 21:07:17'),
(82, 1, 40, 1, '2020-01-20 21:32:06'),
(83, 1, 44, 1, '2020-01-20 21:32:15'),
(84, 1, 49, 2, '2020-01-20 21:58:11');

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
  `vacationState` int(11) DEFAULT 1,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `email`, `password`, `role`, `phone`, `image`, `active`, `lastUpdate`, `createdDate`, `name`, `userName`, `about`, `city`, `facebookLink`, `moneyreportLink`, `nationalId`, `postalCodeName`, `vodafoneCashLink`, `whatsupLink`, `workRegLink`, `workSampleLink`, `otherPaymentMethods`, `vacationState`) VALUES
(1, 'ahmed@gmail.com', '535bd51ae59ed800950b4dea6bfdbfe0', 0, '01061690939', 'img1466355600126947681.jpg', 1, '2020-01-20 09:28:48', NULL, 'أحمد محمد سيد الدكرورى', 'ahmedDakrory', 'asdlasdlasdkmlasdkml', 'eg', 'aksdkm', 'wqwekl', '1212312312', 'askmlasdklm', '992323', 'ahmed-000-', 'asdasdasdqw', 'asdasdasd', 'lkmasmdmlkasdm', 1),
(2, 'ahedm', NULL, NULL, '01061690911', 'img1622783197046873794.jpg', 1, '2020-01-20 17:08:32', NULL, 'محمد على', 'mohamed123', 'سيبسيبسيبسيبسيبسيب', 'sa', 'asdasd', 'سيبسيب', '', '', '651651', '36516516', 'سيبسيب', 'سيبسيب', '', 1),
(3, '321as@asdasd', NULL, 3, '010121321332', 'img5082349970771700951.jpg', 1, '2020-01-20 21:24:14', NULL, 'sayed ahmed mohamed', 'sayed', 'masdmasdmklasdkmlaskdmlalsmkdkmlasdasd', 'ae', '3213asdasd32', 'lkmlklkm', '321321', '21221', '213213213', '32132132', 'lk', 'asdasd', 'asdasd', NULL),
(4, 'asdasd321', 'a0e67e0f998217c490dc8b0c267abd3b', 3, '010101321553233', 'img8236687467410890223.png', 1, '2020-01-20 21:32:45', '2020-01-20 21:29:01', 'kamel mohamed', 'kamel', 'kmasdklasmdlkm', 'jo', '321asd321', 'kmlkmlkm', '32132132asd', 'asdasd', '3213213213', '321321321', 'lkmlkml', 'lkmasldkmasldkm', 'asdasdasd', NULL),
(5, 'hamed', 'fd674794a7d07b45ab07c0a174540bc2', 3, '132132132', 'img8874612067743812806.jpg', 1, '2020-01-20 21:57:19', '2020-01-20 21:57:19', 'asdasdasd', 'mousa', 'asdasdasd', 'kw', '1321321', 'lkmlkm', '32132132', 'sdfsdffd', '21321321', '32132132', 'lkmlkm', 'sdfsdf', 'sdfsdf', 1);

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
  `good` int(11) DEFAULT NULL,
  `bad` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `work_field_user_workFieldId_idx` (`work_fieldId`),
  KEY `work_field_user_userId_idx` (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `work_field_user`
--

INSERT INTO `work_field_user` (`id`, `userId`, `work_fieldId`, `good`, `bad`) VALUES
(37, 2, 29, 0, 1),
(38, 2, 30, 0, 0),
(39, 2, 45, 0, 0),
(40, 3, 29, 1, 0),
(41, 3, 30, 0, 0),
(42, 3, 48, 0, 0),
(43, 3, 49, 0, 0),
(48, 4, 29, 0, 0),
(49, 5, 29, 0, 1),
(50, 5, 30, 0, 0),
(51, 5, 47, 0, 0),
(52, 5, 48, 0, 0);

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
