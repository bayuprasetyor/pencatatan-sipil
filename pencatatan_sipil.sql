-- phpMyAdmin SQL Dump
-- version 4.8.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 07, 2019 at 11:40 AM
-- Server version: 10.1.33-MariaDB
-- PHP Version: 7.2.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pencatatan_sipil`
--

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(4);

-- --------------------------------------------------------

--
-- Table structure for table `pelaporan`
--

CREATE TABLE `pelaporan` (
  `id` int(11) NOT NULL,
  `alamat_ayah` varchar(255) DEFAULT NULL,
  `alamat_ibu` varchar(255) DEFAULT NULL,
  `alamat_pelapor` varchar(255) DEFAULT NULL,
  `alamat_saksi` varchar(255) DEFAULT NULL,
  `anak_ke_bayi` int(11) DEFAULT NULL,
  `berat_bayi_bayi` int(11) DEFAULT NULL,
  `jenis_kelahiran_bayi` int(11) DEFAULT NULL,
  `jenis_kelamin_bayi` int(11) DEFAULT NULL,
  `kebangsaan_ayah` varchar(255) DEFAULT NULL,
  `kebangsaan_ibu` varchar(255) DEFAULT NULL,
  `kelahiran_ke_bayi` int(11) DEFAULT NULL,
  `keturunan_ayah` int(11) DEFAULT NULL,
  `keturunan_ibu` int(11) DEFAULT NULL,
  `kewarganegaraan_ayah` int(11) DEFAULT NULL,
  `kewarganegaraan_ibu` int(11) DEFAULT NULL,
  `nama_bayi` varchar(255) DEFAULT NULL,
  `nama_lengkap_ayah` varchar(255) DEFAULT NULL,
  `nama_lengkap_ibu` varchar(255) DEFAULT NULL,
  `nama_lengkap_pelapor` varchar(255) DEFAULT NULL,
  `nama_lengkap_saksi` varchar(255) DEFAULT NULL,
  `nik_ayah` int(11) DEFAULT NULL,
  `nik_ibu` int(11) DEFAULT NULL,
  `nik_pelapor` int(11) DEFAULT NULL,
  `nik_saksi` int(11) DEFAULT NULL,
  `pekerjaan_ayah` varchar(255) DEFAULT NULL,
  `pekerjaan_ibu` varchar(255) DEFAULT NULL,
  `penolong_kelahiran_bayi` int(11) DEFAULT NULL,
  `tanggal_lahir_ayah` varchar(255) DEFAULT NULL,
  `tanggal_lahir_bayi` varchar(255) DEFAULT NULL,
  `tanggal_lahir_ibu` varchar(255) DEFAULT NULL,
  `tanggal_perkawinan_ibu` varchar(255) DEFAULT NULL,
  `tempat_dilahirkan_bayi` int(11) DEFAULT NULL,
  `tempat_kelahiran_bayi` varchar(255) DEFAULT NULL,
  `k_bidang` int(11) DEFAULT NULL,
  `k_dinas` int(11) DEFAULT NULL,
  `k_seksi` int(11) DEFAULT NULL,
  `nama_kepala_keluarga` varchar(255) DEFAULT NULL,
  `nkk` int(11) DEFAULT NULL,
  `petugas` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pelaporan`
--

INSERT INTO `pelaporan` (`id`, `alamat_ayah`, `alamat_ibu`, `alamat_pelapor`, `alamat_saksi`, `anak_ke_bayi`, `berat_bayi_bayi`, `jenis_kelahiran_bayi`, `jenis_kelamin_bayi`, `kebangsaan_ayah`, `kebangsaan_ibu`, `kelahiran_ke_bayi`, `keturunan_ayah`, `keturunan_ibu`, `kewarganegaraan_ayah`, `kewarganegaraan_ibu`, `nama_bayi`, `nama_lengkap_ayah`, `nama_lengkap_ibu`, `nama_lengkap_pelapor`, `nama_lengkap_saksi`, `nik_ayah`, `nik_ibu`, `nik_pelapor`, `nik_saksi`, `pekerjaan_ayah`, `pekerjaan_ibu`, `penolong_kelahiran_bayi`, `tanggal_lahir_ayah`, `tanggal_lahir_bayi`, `tanggal_lahir_ibu`, `tanggal_perkawinan_ibu`, `tempat_dilahirkan_bayi`, `tempat_kelahiran_bayi`, `k_bidang`, `k_dinas`, `k_seksi`, `nama_kepala_keluarga`, `nkk`, `petugas`) VALUES
(2, 'Balige', 'Balige', 'Balige', 'Balige', NULL, 25, NULL, NULL, 'Indonesia', 'Indonesia', NULL, NULL, NULL, NULL, NULL, 'Asta', 'Suko Raharjo', 'knee', 'ruins leon', 'ace', 123, 1234, 12345, 123456, 'Pos', 'Bri', NULL, '', '', '', '', NULL, '1', 1, 2, 2, 'Suko Raharjo', 12345678, 1),
(3, 'sacascsaca', 'sdfsdhsdg', 'asvzvzvz', 'czxczxczxc', NULL, 21, NULL, NULL, 'afsadasdsa', 'dsfdsfdfsa', NULL, NULL, NULL, NULL, NULL, 'sasafsaf', 'fassadsadsad', 'asscvdsdvs', 'sadascas', 'afdasf', 4324234, 14536435, 423524, 24356, 'sacacsa', 'dsvsdbsdv', NULL, '2019-01-31', '2019-01-17', '2019-01-30', '2019-01-22', NULL, 'sdassaca', 1, NULL, 1, 'eriv', 1232214, 1);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `password`, `role`, `username`) VALUES
(1, 'asd', 'asd', 'asd'),
(2, 'zxczx', 'zxczx', 'zxczx');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pelaporan`
--
ALTER TABLE `pelaporan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_sb8bbouer5wak8vyiiy4pf2bx` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
