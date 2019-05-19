-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 23, 2019 at 02:22 AM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pinjam_sepeda`
--

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `nrp_mahasiswa` char(14) NOT NULL PRIMARY KEY,
  `nama` varchar(30) NOT NULL,
  `password` varchar(128) NOT NULL,
  `nomorhp` char(13) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `departemen` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `notifikasi`
--

CREATE TABLE `notifikasi` (
  `id_notifikasi` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `petugas` char(5) NOT NULL,
  `user` char(14) NOT NULL,
  `isi` longtext NOT NULL,
  `waktu_kirim` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `status` binary(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `peminjaman`
--

CREATE TABLE `peminjaman` (
  `id_peminjaman` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `peminjam` char(14) NOT NULL,
  `petugas` char(5) NOT NULL,
  `id_sepeda` char(5) NOT NULL,
  `pos_peminjaman` char(5) NOT NULL,
  `tanggal_meminjam` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `tanggal_mengembalikan` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `keterangan` varchar(128) NOT NULL,
  `status` binary(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `petugas`
--

CREATE TABLE `petugas` (
  `id_petugas` char(5) NOT NULL PRIMARY KEY,
  `id_pos` char(5) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `password` varchar(128) NOT NULL,
  `nomorhp` char(13) NOT NULL,
  `alamat` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pos`
--

CREATE TABLE `pos` (
  `id_pos` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `petugas` char(5) NOT NULL,
  `lokasi` varchar(30) NOT NULL,
  `is_active` binary(1) NOT NULL,
  `jumlah_sepeda` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `sepeda`
--

CREATE TABLE `sepeda` (
  `id_sepeda` char(6) NOT NULL, 
  `id_pos` char(5) NOT NULL,
  `model` varchar(30) NOT NULL,
  `tanggal_beli` date NOT NULL,
  `is_available` binary(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`nrp_mahasiswa`);

--
-- Indexes for table `notifikasi`
--
ALTER TABLE `notifikasi`
  ADD PRIMARY KEY (`id_notifikasi`),
  ADD UNIQUE KEY `petugas` (`petugas`);

--
-- Indexes for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD UNIQUE KEY `peminjam` (`peminjam`),
  ADD UNIQUE KEY `petugas` (`petugas`,`id_sepeda`,`pos_peminjaman`),
  ADD KEY `pos_peminjaman` (`pos_peminjaman`),
  ADD KEY `id_sepeda` (`id_sepeda`);

--
-- Indexes for table `petugas`
--
ALTER TABLE `petugas`
  ADD PRIMARY KEY (`id_petugas`),
  ADD UNIQUE KEY `id_pos` (`id_pos`);

--
-- Indexes for table `pos`
--
ALTER TABLE `pos`
  ADD PRIMARY KEY (`id_pos`),
  ADD UNIQUE KEY `petugas` (`petugas`);

--
-- Indexes for table `sepeda`
--
ALTER TABLE `sepeda`
  ADD PRIMARY KEY (`id_sepeda`),
  ADD UNIQUE KEY `id_pos` (`id_pos`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `notifikasi`
--
ALTER TABLE `notifikasi`
  ADD CONSTRAINT `notifikasi_ibfk_1` FOREIGN KEY (`petugas`) REFERENCES `petugas` (`id_petugas`);

--
-- Constraints for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD CONSTRAINT `peminjaman_ibfk_1` FOREIGN KEY (`peminjam`) REFERENCES `mahasiswa` (`nrp_mahasiswa`),
  ADD CONSTRAINT `peminjaman_ibfk_2` FOREIGN KEY (`pos_peminjaman`) REFERENCES `pos` (`id_pos`),
  ADD CONSTRAINT `peminjaman_ibfk_3` FOREIGN KEY (`petugas`) REFERENCES `petugas` (`id_petugas`),
  ADD CONSTRAINT `peminjaman_ibfk_4` FOREIGN KEY (`id_sepeda`) REFERENCES `sepeda` (`id_sepeda`);

--
-- Constraints for table `petugas`
--
ALTER TABLE `petugas`
  ADD CONSTRAINT `petugas_ibfk_1` FOREIGN KEY (`id_pos`) REFERENCES `pos` (`id_pos`);

--
-- Constraints for table `pos`
--
ALTER TABLE `pos`
  ADD CONSTRAINT `pos_ibfk_1` FOREIGN KEY (`petugas`) REFERENCES `petugas` (`id_petugas`);

--
-- Constraints for table `sepeda`
--
ALTER TABLE `sepeda`
  ADD CONSTRAINT `sepeda_ibfk_1` FOREIGN KEY (`id_pos`) REFERENCES `pos` (`id_pos`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
