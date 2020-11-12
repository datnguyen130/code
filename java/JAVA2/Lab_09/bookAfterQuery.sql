-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th10 12, 2020 lúc 01:16 PM
-- Phiên bản máy phục vụ: 10.4.14-MariaDB
-- Phiên bản PHP: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `libary`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `books`
--

CREATE TABLE `books` (
  `IdBook` int(11) NOT NULL,
  `NameBook` varchar(50) DEFAULT NULL,
  `Author` varchar(50) DEFAULT NULL,
  `YearPushlish` year(4) DEFAULT NULL,
  `Category` varchar(50) DEFAULT NULL,
  `Price` decimal(10,0) DEFAULT NULL,
  `Qty` int(11) DEFAULT NULL,
  `Status` int(11) DEFAULT NULL,
  `Created` date DEFAULT NULL,
  `Updated` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `books`
--

INSERT INTO `books` (`IdBook`, `NameBook`, `Author`, `YearPushlish`, `Category`, `Price`, `Qty`, `Status`, `Created`, `Updated`) VALUES
(101, 'Book_1', 'Author_1', 2000, 'Category_1', '200', 0, 1, '2020-11-12', NULL),
(102, 'Book_2', 'Author_2', 2010, 'Category_1', '300', 0, 0, '2020-11-12', NULL),
(103, 'Book_3', 'Author_3', 2000, 'Category_1', '250', 0, 2, '2020-11-12', NULL),
(104, 'Book_4', 'Author_4', 2002, 'Category_2', '200', 50, 1, '2020-11-12', NULL),
(105, 'Book_5', 'Author_5', 2003, 'Category_2', '400', 200, 1, '2020-11-12', NULL),
(106, 'Book_6', 'Author_6', 2004, 'Category_2', '250', 20, 1, '2020-11-12', NULL),
(107, 'Book_7', 'Author_7', 2005, 'Category_1', '200', 60, 1, '2020-11-12', NULL),
(108, 'Book_8', 'Author_1', 2006, 'Category_3', '350', 70, 1, '2020-11-12', NULL),
(109, 'Book_9', 'Author_2', 2000, 'Category_4', '200', 0, 2, '2020-11-12', NULL),
(110, 'Book_10', 'Author_1', 2001, 'Category_5', '300', 50, 1, '2020-11-12', NULL),
(111, 'Book_11', 'Author_8', 2001, 'Category_5', '200', 15, 1, '2020-11-12', NULL),
(112, 'Book_12', 'Author_3', 2010, 'Category_1', '500', 100, 1, '2020-11-12', NULL),
(113, 'Book_13', 'Author_2', 2005, 'Category_2', '100', 50, 1, '2020-11-12', NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `categorys`
--

CREATE TABLE `categorys` (
  `Idcate` int(11) DEFAULT NULL,
  `Category` varchar(50) NOT NULL,
  `Created` date DEFAULT NULL,
  `Updated` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `categorys`
--

INSERT INTO `categorys` (`Idcate`, `Category`, `Created`, `Updated`) VALUES
(1, 'Category_1', '2020-11-12', NULL),
(2, 'Category_2', '2020-11-12', NULL),
(3, 'Category_3', '2020-11-12', NULL),
(4, 'Category_4', '2020-11-12', NULL),
(5, 'Category_5', '2020-11-12', NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `customer`
--

CREATE TABLE `customer` (
  `IdCus` int(11) NOT NULL,
  `NameCus` varchar(50) DEFAULT NULL,
  `Address` varchar(50) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Phone` int(11) DEFAULT NULL,
  `level` int(11) DEFAULT NULL CHECK (`level` in (1,2,3)),
  `Created` date DEFAULT NULL,
  `Updated` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `customer`
--

INSERT INTO `customer` (`IdCus`, `NameCus`, `Address`, `Email`, `Phone`, `level`, `Created`, `Updated`) VALUES
(501, 'Customer_1', 'Address_1', 'Email_1@email.com', 123456789, 1, '2020-11-12', NULL),
(502, 'Customer_2', 'Address_2', 'Email_2@email.com', 223456789, 1, '2020-11-12', NULL),
(503, 'Customer_3', 'Address_3', 'Email_3@email.com', 323456789, 2, '2020-11-12', NULL),
(504, 'Customer_4', 'Address_4', 'Email_4@email.com', 423456789, 2, '2020-11-12', NULL),
(505, 'Customer_5', 'Address_5', 'Email_5@email.com', 523456789, 3, '2020-11-12', NULL),
(506, 'Customer_6', 'Address_6', 'Email_6@email.com', 623456789, 1, '2020-11-12', NULL),
(507, 'Customer_7', 'Address_7', 'Email_7@email.com', 723456789, 1, '2020-11-12', NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `orderdetail`
--

CREATE TABLE `orderdetail` (
  `IdOrder` int(11) NOT NULL,
  `IdBook` int(11) DEFAULT NULL,
  `Qty` int(11) DEFAULT NULL,
  `Price` decimal(10,0) DEFAULT NULL,
  `Created` date DEFAULT NULL,
  `Updated` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `orderdetail`
--

INSERT INTO `orderdetail` (`IdOrder`, `IdBook`, `Qty`, `Price`, `Created`, `Updated`) VALUES
(1001, 101, 2, '180', '2020-11-12', NULL),
(1001, 102, 1, '150', '2020-11-12', NULL),
(1001, 103, 1, '250', '2020-11-12', NULL),
(1008, 104, 1, '220', '2020-11-12', NULL),
(1002, 105, 1, '300', '2020-11-12', NULL),
(1003, 106, 2, '150', '2020-11-12', NULL),
(1004, 107, 2, '180', '2020-11-12', NULL),
(1005, 108, 2, '180', '2020-11-12', NULL),
(1006, 101, 4, '180', '2020-11-12', NULL),
(1007, 102, 2, '180', '2020-11-12', NULL),
(1008, 101, 2, '180', '2020-11-12', NULL),
(1010, 101, 50, '200', '2020-11-12', NULL),
(1010, 104, 50, '200', '2020-11-12', NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `orders`
--

CREATE TABLE `orders` (
  `IdOrders` int(11) NOT NULL,
  `IdCus` int(11) DEFAULT NULL,
  `Status` int(11) DEFAULT NULL,
  `Total` decimal(10,0) DEFAULT NULL,
  `TimeOrder` date DEFAULT NULL,
  `Created` date DEFAULT NULL,
  `Updated` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `orders`
--

INSERT INTO `orders` (`IdOrders`, `IdCus`, `Status`, `Total`, `TimeOrder`, `Created`, `Updated`) VALUES
(1001, 501, 1, '1200', '2020-10-30', '2020-11-12', NULL),
(1002, 501, 0, '2000', '2020-10-20', '2020-11-12', NULL),
(1003, 501, 2, '1500', '2020-10-25', '2020-11-12', NULL),
(1004, 502, 2, '500', '2020-10-28', '2020-11-12', NULL),
(1005, 503, 3, '2500', '2020-10-26', '2020-11-12', NULL),
(1006, 504, 4, '900', '2020-10-30', '2020-11-12', NULL),
(1007, 501, 5, '1500', '2020-09-20', '2020-11-12', NULL),
(1008, 502, 5, '2500', '2020-09-10', '2020-11-12', NULL),
(1009, 502, 5, '2500', '2020-09-10', '2020-11-12', NULL),
(1010, 505, 1, '20000', '2020-11-12', '2020-11-12', NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `users`
--

CREATE TABLE `users` (
  `IdUser` int(11) NOT NULL,
  `Username` varchar(20) NOT NULL,
  `Password` varchar(20) DEFAULT NULL,
  `Role` int(11) DEFAULT NULL CHECK (`Role` in (1,2)),
  `Created` date DEFAULT NULL,
  `Updated` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `users`
--

INSERT INTO `users` (`IdUser`, `Username`, `Password`, `Role`, `Created`, `Updated`) VALUES
(501, 'User_name_1', 'dvefdf', 1, '2020-11-12', NULL),
(502, 'User_name_2', 'fvernr', 2, '2020-11-12', NULL),
(503, 'User_name_3', 'ferq3fg', 2, '2020-11-12', NULL),
(504, 'User_name_4', '13rergg5', 2, '2020-11-12', NULL),
(505, 'User_name_5', 'e45wefd', 2, '2020-11-12', NULL),
(506, 'User_name_6', '4t4erg5', 2, '2020-11-12', NULL),
(507, 'User_name_7', 'e45wefd', 2, '2020-11-12', NULL),
(508, 'User_name_8', 'e45wefd', 2, '2020-11-12', NULL),
(509, 'User_name_9', 'e45wefd', 2, '2020-11-12', NULL),
(510, 'User_name_10', 'e45wefd', 2, '2020-11-12', NULL),
(511, 'User_name_11', '24gv342', 2, '2020-11-12', NULL);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`IdBook`),
  ADD KEY `Category` (`Category`);

--
-- Chỉ mục cho bảng `categorys`
--
ALTER TABLE `categorys`
  ADD PRIMARY KEY (`Category`);

--
-- Chỉ mục cho bảng `customer`
--
ALTER TABLE `customer`
  ADD KEY `IdCus` (`IdCus`);

--
-- Chỉ mục cho bảng `orderdetail`
--
ALTER TABLE `orderdetail`
  ADD KEY `Fk_IdOrder` (`IdOrder`),
  ADD KEY `Fk_IdBook` (`IdBook`);

--
-- Chỉ mục cho bảng `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`IdOrders`),
  ADD KEY `IdCus` (`IdCus`);

--
-- Chỉ mục cho bảng `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`IdUser`),
  ADD UNIQUE KEY `Username` (`Username`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `orders`
--
ALTER TABLE `orders`
  MODIFY `IdOrders` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1011;

--
-- AUTO_INCREMENT cho bảng `users`
--
ALTER TABLE `users`
  MODIFY `IdUser` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=512;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `books`
--
ALTER TABLE `books`
  ADD CONSTRAINT `books_ibfk_1` FOREIGN KEY (`Category`) REFERENCES `categorys` (`Category`);

--
-- Các ràng buộc cho bảng `customer`
--
ALTER TABLE `customer`
  ADD CONSTRAINT `customer_ibfk_1` FOREIGN KEY (`IdCus`) REFERENCES `users` (`IdUser`);

--
-- Các ràng buộc cho bảng `orderdetail`
--
ALTER TABLE `orderdetail`
  ADD CONSTRAINT `Fk_IdBook` FOREIGN KEY (`IdBook`) REFERENCES `books` (`IdBook`),
  ADD CONSTRAINT `Fk_IdOrder` FOREIGN KEY (`IdOrder`) REFERENCES `orders` (`IdOrders`);

--
-- Các ràng buộc cho bảng `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`IdCus`) REFERENCES `users` (`IdUser`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
