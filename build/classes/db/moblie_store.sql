-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 07, 2024 at 11:23 AM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `moblie_store_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `id` int(11) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `total_price` int(11) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `status` varchar(100) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`id`, `address`, `phone`, `user_id`, `quantity`, `total_price`, `date`, `status`, `product_id`) VALUES
(1, 'Haf Noi', '321321321', 2, 1, 300000, '2024-01-04', 'Đã Nhận', 52),
(2, 'Nguyễn Sỹ Long', 'ewqeqe', 2, 1, 2000000, '2024-01-19', 'Duyệt Đơn', 52),
(3, 'hà Nội', '321321321', 2, 1, 2000000, '2024-01-11', 'Chờ Duyệt', 52),
(4, '3213', '321312', 2, 2, 4000000, '2024-01-13', 'Chờ Duyệt', 52),
(5, '321', '312', 2, 33, 66000000, '2024-01-11', 'Chờ Duyệt', 52);

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `id` int(11) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`id`, `title`, `image`, `description`, `price`, `quantity`) VALUES
(52, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 88),
(53, 'Iphone 12', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\iphone12-1.png', 'Nice', 2000000, 123),
(54, 'Iphone 13', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\iphone13promax.png', 'Nice', 2000000, 123),
(55, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\iphone13promax.png', 'Nice', 2000000, 123),
(56, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(57, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(58, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(59, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(60, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(61, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(62, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(63, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(64, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(65, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(66, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(67, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(68, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(69, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(70, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(71, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(72, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(73, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(74, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(75, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(76, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(77, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(78, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(79, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(80, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(81, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(82, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(83, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(84, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(85, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(86, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(87, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(88, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(89, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(90, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(91, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(92, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(93, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(94, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(95, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(96, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(97, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(98, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(99, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(100, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123),
(101, 'Iphone 11', 'C:\\Users\\longc\\Documents\\MoblieStore\\src\\images\\11pmx.jpg', 'Nice', 2000000, 123);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `fullname` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `fullname`, `email`, `password`, `role`) VALUES
(1, 'admin', 'Admin', 'Admin@gmail.com', '1', 'Admin'),
(2, 'longcanh2k3', 'Nguyễn Sỹ Long', 'longcanh2k3@gmail.com', '1', 'User'),
(3, 'Long', 'long', 'long', '1', 'User');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=102;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
