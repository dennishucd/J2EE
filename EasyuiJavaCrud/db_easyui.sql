/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.1.49-community : Database - db_easyui
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_easyui` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `db_easyui`;

/*Table structure for table `t_user` */

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `qq` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

/*Data for the table `t_user` */

insert  into `t_user`(`id`,`name`,`phone`,`email`,`qq`) values (1,'张三1','1234567','1234567@qq.com','1234567'),(2,'张三2','1234567','1234567@qq.com','1234567'),(3,'张三3','1234567','1234567@qq.com','1234567'),(4,'张三4','1234567','1234567@qq.com','1234567'),(5,'张三5','1234567','1234567@qq.com','1234567'),(6,'张三6','1234567','1234567@qq.com','1234567'),(7,'张三7','1234567','1234567@qq.com','1234567'),(8,'张三8','1234567','1234567@qq.com','1234567'),(9,'张三9','1234567','1234567@qq.com','1234567'),(10,'张三10','1234567','1234567@qq.com','1234567'),(11,'张三11','1234567','1234567@qq.com','1234567'),(12,'张三12','1234567','1234567@qq.com','1234567'),(13,'张三13','1234567','1234567@qq.com','1234567'),(14,'张三14','1234567','1234567@qq.com','1234567'),(15,'张三15','1234567','1234567@qq.com','1234567');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
