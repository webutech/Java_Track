# SQL Manager 2005 Lite for MySQL 3.7.7.1
# ---------------------------------------
# Host     : localhost
# Port     : 3306
# Database : contact_app_db12


SET FOREIGN_KEY_CHECKS=0;

CREATE DATABASE `contact_app_db12`
    CHARACTER SET 'latin1'
    COLLATE 'latin1_swedish_ci';

USE `contact_app_db12`;

#
# Structure for the `user` table : 
#

CREATE TABLE `user` (
  `userId` int(11) NOT NULL auto_increment,
  `name` varchar(20) default NULL,
  `phone` varchar(50) default NULL,
  `email` varchar(50) default NULL,
  `address` varchar(100) default NULL,
  `loginName` varchar(20) NOT NULL,
  `password` varchar(20) default NULL,
  PRIMARY KEY  (`userId`),
  UNIQUE KEY `loginName` (`loginName`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

#
# Structure for the `contact` table : 
#

CREATE TABLE `contact` (
  `contactId` int(11) NOT NULL auto_increment,
  `userId` int(11) default NULL,
  `name` varchar(50) default NULL,
  `email` varchar(50) default NULL,
  `phone` varchar(50) default NULL,
  `address` varchar(50) default NULL,
  `category` varchar(15) default 'FRIEND' COMMENT 'FRIEND, FAMILY, BUSINESS, OTHER',
  PRIMARY KEY  (`contactId`),
  KEY `userId` (`userId`),
  CONSTRAINT `contact_fk` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;

#
# Data for the `user` table  (LIMIT 0,500)
#

INSERT INTO `user` (`userId`, `name`, `phone`, `email`, `address`, `loginName`, `password`) VALUES 
  (1,'Vikram','9303580884','vikram@ezeonterch.com','Bhopal','v','v'),
  (2,'Amit','78787788','amit@gmail.com','Delhi','a','a'),
  (3,'Amit','45454','amit@gmail.com','Mumbai','amit','amit'),
  (4,'Rajeev','45454','amit@gmail.com','Mumbai','Rajeev','amit'),
  (5,'Lokesh','4545454','lokesh@gmail.com','Bhopal','lokesh','lokesh'),
  (6,'dfsdf','453','fdf','fsdfsdf','sdfsdf','dfs'),
  (7,'fsdfdf','sfdfs','sdfdf','fsdfs','dsdfsd','sdf'),
  (8,'aaa','45345','aasdas','dasd','aaaa','aaaa'),
  (9,'Raj','4444','raj@gmail.com','Bhopal','raj','raj');

COMMIT;

#
# Data for the `contact` table  (LIMIT 0,500)
#

INSERT INTO `contact` (`contactId`, `userId`, `name`, `email`, `phone`, `address`, `category`) VALUES 
  (1,1,'Pankaj','pabkaj@gmal.com','78787873','Delhi','FRIEND'),
  (10,2,'Amit Singh','Amit@ezeontech.com','7878','Mumbai','BUSINESS'),
  (11,2,'Pankaj','pankaj@ezeontech.com','7878787','Delhi','FAMILY'),
  (12,1,'Anurag Tiwari','anurag@gmail.com','4545','Bhopal, India','FRIEND'),
  (13,2,'Kaushak','kau@gmail.com','45455454545','Bhopal','BUSINESS'),
  (16,9,'sdfsdf','fsdfsd','sdfsdfsd','fdfsdfsdfd','FRIEND'),
  (17,9,'fsdfsdf','sdfsdfsd','sdfsdf','fsdfsdf','FRIEND');

COMMIT;

