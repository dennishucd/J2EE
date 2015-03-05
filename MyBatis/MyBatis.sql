-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.6.15 - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             9.1.0.4867
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping database structure for db_easyui
CREATE DATABASE IF NOT EXISTS `db_easyui` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `db_easyui`;


-- Dumping structure for table db_easyui.students
CREATE TABLE IF NOT EXISTS `students` (
  `stud_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `dob` date DEFAULT NULL,
  PRIMARY KEY (`stud_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- Dumping data for table db_easyui.students: ~2 rows (approximately)
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` (`stud_id`, `name`, `email`, `dob`) VALUES
	(1, 'Student1', 'student1@gmail.com', '1983-06-25'),
	(2, 'Student2', 'student2@gmail.com', '1983-06-25');
/*!40000 ALTER TABLE `students` ENABLE KEYS */;

