-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.7.29-log


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema cheque_management_system
--

CREATE DATABASE IF NOT EXISTS cheque_management_system;
USE cheque_management_system;

--
-- Definition of table `cheque_detail`
--

DROP TABLE IF EXISTS `cheque_detail`;
CREATE TABLE `cheque_detail` (
  `cheque_detail_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `cheque_detail_current_date` date DEFAULT NULL,
  `cheque_detail_cheque_number` varchar(50) DEFAULT NULL,
  `cheque_detail_bank` varchar(50) DEFAULT NULL,
  `cheque_detail_amount` decimal(10,2) DEFAULT NULL,
  `cheque_detail_effective_date` date DEFAULT NULL,
  `cheque_detail_account_pay_only` tinyint(1) DEFAULT NULL,
  `cheque_detail_client_id` int(10) unsigned NOT NULL,
  `cheque_detail_user_id` int(10) unsigned NOT NULL,
  `cheque_detail_status` tinyint(1) unsigned DEFAULT '1',
  `cheque_detail_detail` varchar(450) DEFAULT NULL,
  PRIMARY KEY (`cheque_detail_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cheque_detail`
--

/*!40000 ALTER TABLE `cheque_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `cheque_detail` ENABLE KEYS */;


--
-- Definition of table `client_detail`
--

DROP TABLE IF EXISTS `client_detail`;
CREATE TABLE `client_detail` (
  `client_detail_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `client_detail_name` varchar(200) DEFAULT NULL,
  `client_detail_contact_no` varchar(10) DEFAULT NULL,
  `client_detail_status` tinyint(1) unsigned DEFAULT '1',
  `client_detail_detail` varchar(450) DEFAULT NULL,
  PRIMARY KEY (`client_detail_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `client_detail`
--

/*!40000 ALTER TABLE `client_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `client_detail` ENABLE KEYS */;


--
-- Definition of table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_name` varchar(450) DEFAULT NULL,
  `user_email` varchar(100) DEFAULT NULL,
  `user_password` varchar(100) DEFAULT NULL,
  `user_status` tinyint(1) unsigned DEFAULT '1',
  `user_detail` varchar(450) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
