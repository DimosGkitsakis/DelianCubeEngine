CREATE DATABASE  IF NOT EXISTS `adult_no_dublic_star` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `adult_no_dublic_star`;
-- MySQL dump 10.13  Distrib 5.7.9, for Win32 (AMD64)
--
-- Host: localhost    Database: adult_no_dublic
-- ------------------------------------------------------
-- Server version	5.7.10-log

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


SET FOREIGN_KEY_CHECKS=0;

TRUNCATE TABLE adult;


TRUNCATE TABLE age;
LOAD DATA INFILE  'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/adult_star/age.csv'
INTO TABLE age FIELDS TERMINATED BY ';' LINES TERMINATED BY '\r\n'  IGNORE 1 LINES;



TRUNCATE TABLE c1;
LOAD DATA INFILE  'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/adult_star/c1.csv'
INTO TABLE c1 CHARACTER SET latin1 FIELDS TERMINATED BY ';' LINES TERMINATED BY '\r\n'  IGNORE 1 LINES;

TRUNCATE TABLE c2;
LOAD DATA INFILE  'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/adult_star/c2.csv'
INTO TABLE c2 CHARACTER SET latin1 FIELDS TERMINATED BY ';' LINES TERMINATED BY '\r\n'  IGNORE 1 LINES;

TRUNCATE TABLE c3;
LOAD DATA INFILE  'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/adult_star/c3.csv'
INTO TABLE c3 CHARACTER SET latin1 FIELDS TERMINATED BY ';' LINES TERMINATED BY '\r\n'  IGNORE 1 LINES;

TRUNCATE TABLE e1;
LOAD DATA INFILE  'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/adult_star/e1.csv'
INTO TABLE e1 CHARACTER SET latin1 FIELDS TERMINATED BY ';' LINES TERMINATED BY '\r\n'  IGNORE 1 LINES;

TRUNCATE TABLE e2;
LOAD DATA INFILE  'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/adult_star/e2.csv'
INTO TABLE e2 CHARACTER SET latin1 FIELDS TERMINATED BY ';' LINES TERMINATED BY '\r\n'  IGNORE 1 LINES;

TRUNCATE TABLE e3;
LOAD DATA INFILE  'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/adult_star/e3.csv'
INTO TABLE e3 CHARACTER SET latin1 FIELDS TERMINATED BY ';' LINES TERMINATED BY '\r\n'  IGNORE 1 LINES;


TRUNCATE TABLE education;
LOAD DATA INFILE  'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/adult_star/education.csv'
INTO TABLE education FIELDS TERMINATED BY ';' LINES TERMINATED BY '\r\n'  IGNORE 1 LINES;

TRUNCATE TABLE gender;
LOAD DATA INFILE  'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/adult_star/gender.csv'
INTO TABLE gender FIELDS TERMINATED BY ';' LINES TERMINATED BY '\r\n'  IGNORE 1 LINES;

TRUNCATE TABLE marital_status;
LOAD DATA INFILE  'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/adult_star/marital_status.csv'
INTO TABLE marital_status FIELDS TERMINATED BY ';' LINES TERMINATED BY '\r\n'  IGNORE 1 LINES;

TRUNCATE TABLE native_country;
LOAD DATA INFILE  'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/adult_star/native_country.csv'
INTO TABLE native_country FIELDS TERMINATED BY ';' LINES TERMINATED BY '\r\n'  IGNORE 1 LINES;

TRUNCATE TABLE occupation;
LOAD DATA INFILE  'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/adult_star/occupation.csv'
INTO TABLE occupation FIELDS TERMINATED BY ';' LINES TERMINATED BY '\r\n'  IGNORE 1 LINES;

TRUNCATE TABLE race;
LOAD DATA INFILE  'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/adult_star/race.csv'
INTO TABLE race FIELDS TERMINATED BY ';' LINES TERMINATED BY '\r\n'  IGNORE 1 LINES;

TRUNCATE TABLE s1;
LOAD DATA INFILE  'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/adult_star/s1.csv'
INTO TABLE s1 FIELDS TERMINATED BY ';' LINES TERMINATED BY '\r\n'  IGNORE 1 LINES;

TRUNCATE TABLE s2;
LOAD DATA INFILE  'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/adult_star/s2.csv'
INTO TABLE s2 FIELDS TERMINATED BY ';' LINES TERMINATED BY '\r\n'  IGNORE 1 LINES;


TRUNCATE TABLE work_class;
LOAD DATA INFILE  'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/adult_star/work_class.csv'
INTO TABLE work_class FIELDS TERMINATED BY ';' LINES TERMINATED BY '\r\n'  IGNORE 1 LINES;


LOAD DATA INFILE  'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/adult_star/adult.csv'
INTO TABLE adult FIELDS TERMINATED BY ';' LINES TERMINATED BY '\r\n'  IGNORE 1 LINES;


--
-- Dumping events for database 'adult_no_dublic'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-03-22 12:31:59