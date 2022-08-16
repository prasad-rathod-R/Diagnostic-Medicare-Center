-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: localhost    Database: diagnosticmedicarecenter
-- ------------------------------------------------------
-- Server version	8.0.11

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
-- Table structure for table `admin_details`
--

DROP TABLE IF EXISTS `admin_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `admin_details` (
  `Admin_Id` varchar(10) NOT NULL,
  `First_Name` varchar(50) NOT NULL,
  `Last_Name` varchar(50) NOT NULL,
  `age` int(2) NOT NULL,
  `gender` varchar(30) DEFAULT NULL,
  `DoB` varchar(10) DEFAULT NULL,
  `Contact_Number` bigint(10) NOT NULL,
  `Alt_Contact_Number` bigint(10) DEFAULT NULL,
  `Email_ID` varchar(50) NOT NULL,
  `pass_word` varchar(15) NOT NULL,
  PRIMARY KEY (`Admin_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin_details`
--

LOCK TABLES `admin_details` WRITE;
/*!40000 ALTER TABLE `admin_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `admin_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `booking_details`
--

DROP TABLE IF EXISTS `booking_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `booking_details` (
  `Booking_id` bigint(10) NOT NULL,
  `Booking_date` varchar(10) DEFAULT NULL,
  `Patient_Id` varchar(10) DEFAULT NULL,
  `Doctor_ID` varchar(10) DEFAULT NULL,
  `Booking_status` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Booking_id`),
  KEY `Patient_Id` (`Patient_Id`),
  KEY `Doctor_ID` (`Doctor_ID`),
  CONSTRAINT `booking_details_ibfk_1` FOREIGN KEY (`Patient_Id`) REFERENCES `patient_details` (`patient_id`),
  CONSTRAINT `booking_details_ibfk_2` FOREIGN KEY (`Doctor_ID`) REFERENCES `doctor_details` (`doctor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booking_details`
--

LOCK TABLES `booking_details` WRITE;
/*!40000 ALTER TABLE `booking_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `booking_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doctor_details`
--

DROP TABLE IF EXISTS `doctor_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `doctor_details` (
  `Doctor_Id` varchar(10) NOT NULL,
  `First_Name` varchar(50) NOT NULL,
  `Last_Name` varchar(50) NOT NULL,
  `age` int(2) NOT NULL,
  `gender` varchar(30) DEFAULT NULL,
  `DoB` varchar(10) DEFAULT NULL,
  `Contact_Number` bigint(10) NOT NULL,
  `Alt_Contact_Number` bigint(10) DEFAULT NULL,
  `Email_ID` varchar(50) NOT NULL,
  `pass_word` varchar(15) NOT NULL,
  `Address_Line_1` varchar(100) NOT NULL,
  `Address_Line_2` varchar(100) DEFAULT NULL,
  `City` varchar(50) NOT NULL,
  `State` varchar(50) NOT NULL,
  `Zip_Code` bigint(10) NOT NULL,
  `Degree` varchar(50) NOT NULL,
  `Speciality` varchar(50) NOT NULL,
  `working_Hours` varchar(30) DEFAULT NULL,
  `Hospital_Name` varchar(100) NOT NULL,
  `Medicare_Service_ID` bigint(10) NOT NULL,
  `Status` varchar(20) NOT NULL,
  PRIMARY KEY (`Doctor_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctor_details`
--

LOCK TABLES `doctor_details` WRITE;
/*!40000 ALTER TABLE `doctor_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `doctor_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medical_test_history`
--

DROP TABLE IF EXISTS `medical_test_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `medical_test_history` (
  `Report_ID` bigint(10) NOT NULL,
  `Patient_Id` varchar(10) DEFAULT NULL,
  `Doctor_ID` varchar(10) DEFAULT NULL,
  `Medicare_Service_ID` bigint(10) DEFAULT NULL,
  `Service_date` varchar(10) NOT NULL,
  `Test_Result_date` varchar(10) NOT NULL,
  `Diag_1Actual_Value` bigint(10) NOT NULL,
  `Diag_1NormaL_Range` bigint(10) NOT NULL,
  `Diag_2Actual_Value` bigint(10) DEFAULT NULL,
  `Diag_2NormaL_Range` bigint(10) DEFAULT NULL,
  `Diag_3Actual_Value` bigint(10) DEFAULT NULL,
  `Diag_3NormaL_Range` bigint(10) DEFAULT NULL,
  `Diag_4Actual_Value` bigint(10) DEFAULT NULL,
  `Diag_4NormaL_Range` bigint(10) DEFAULT NULL,
  `Diag_5Actual_Value` bigint(10) DEFAULT NULL,
  `Diag_5NormaL_Range` bigint(10) DEFAULT NULL,
  `Diag_6Actual_Value` bigint(10) DEFAULT NULL,
  `Diag_6NormaL_Range` bigint(10) DEFAULT NULL,
  `Doctors_Comments` varchar(300) DEFAULT NULL,
  `Other_info` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`Report_ID`),
  KEY `Patient_Id` (`Patient_Id`),
  KEY `Doctor_ID` (`Doctor_ID`),
  CONSTRAINT `medical_test_history_ibfk_1` FOREIGN KEY (`Patient_Id`) REFERENCES `patient_details` (`patient_id`),
  CONSTRAINT `medical_test_history_ibfk_2` FOREIGN KEY (`Doctor_ID`) REFERENCES `doctor_details` (`doctor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medical_test_history`
--

LOCK TABLES `medical_test_history` WRITE;
/*!40000 ALTER TABLE `medical_test_history` DISABLE KEYS */;
/*!40000 ALTER TABLE `medical_test_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicare_services_details`
--

DROP TABLE IF EXISTS `medicare_services_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `medicare_services_details` (
  `Medicare_Service_ID` bigint(10) NOT NULL,
  `Medicare_Service` varchar(50) NOT NULL,
  `Service_Description` varchar(200) NOT NULL,
  `Amount` bigint(10) NOT NULL,
  PRIMARY KEY (`Medicare_Service_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicare_services_details`
--

LOCK TABLES `medicare_services_details` WRITE;
/*!40000 ALTER TABLE `medicare_services_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `medicare_services_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient_details`
--

DROP TABLE IF EXISTS `patient_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `patient_details` (
  `Patient_Id` varchar(10) NOT NULL,
  `First_Name` varchar(50) NOT NULL,
  `Last_Name` varchar(50) NOT NULL,
  `age` int(2) NOT NULL,
  `gender` varchar(30) DEFAULT NULL,
  `DoB` varchar(10) DEFAULT NULL,
  `Contact_Number` bigint(10) NOT NULL,
  `Alt_Contact_Number` bigint(10) DEFAULT NULL,
  `Email_ID` varchar(50) NOT NULL,
  `pass_word` varchar(15) NOT NULL,
  `Address_Line_1` varchar(100) NOT NULL,
  `Address_Line_2` varchar(100) DEFAULT NULL,
  `City` varchar(50) NOT NULL,
  `State` varchar(50) NOT NULL,
  `Zip_Code` bigint(10) NOT NULL,
  `Status` varchar(20) NOT NULL,
  PRIMARY KEY (`Patient_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient_details`
--

LOCK TABLES `patient_details` WRITE;
/*!40000 ALTER TABLE `patient_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `patient_details` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-02-14 11:12:01
