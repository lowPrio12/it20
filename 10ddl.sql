-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 10, 2025 at 06:12 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `10ddl`
--

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `Order_ID` int(50) NOT NULL,
  `Employee_ID` int(50) NOT NULL,
  `Customer_ID` int(50) NOT NULL,
  `customer` varchar(100) NOT NULL,
  `Order_date` date DEFAULT NULL,
  `Shipped_date` date DEFAULT NULL,
  `Shipper_ID` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `order_details`
--

CREATE TABLE `order_details` (
  `Product_ID` int(30) NOT NULL,
  `Order_ID` int(50) NOT NULL,
  `Quantity` int(50) NOT NULL,
  `Unit_price` int(50) NOT NULL,
  `Discount` int(50) DEFAULT NULL,
  `Status_ID` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `Product_ID` int(30) NOT NULL,
  `Product_code` int(30) NOT NULL,
  `Product_name` varchar(100) NOT NULL,
  `Description` text DEFAULT NULL,
  `Standard_cost` int(100) NOT NULL,
  `List_price` int(100) NOT NULL,
  `Reoder_level` int(100) NOT NULL,
  `Target_level` int(100) NOT NULL,
  `Quantity_per_unit` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`Order_ID`);

--
-- Indexes for table `order_details`
--
ALTER TABLE `order_details`
  ADD KEY `Product_ID` (`Product_ID`),
  ADD KEY `Order_ID` (`Order_ID`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`Product_ID`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `order_details`
--
ALTER TABLE `order_details`
  ADD CONSTRAINT `order_details_ibfk_1` FOREIGN KEY (`Product_ID`) REFERENCES `products` (`Product_ID`),
  ADD CONSTRAINT `order_details_ibfk_2` FOREIGN KEY (`Order_ID`) REFERENCES `orders` (`Order_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
