-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 30-10-2022 a las 13:10:25
-- Versión del servidor: 8.0.27
-- Versión de PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `student`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `negocio`
--

DROP TABLE IF EXISTS `negocio`;
CREATE TABLE IF NOT EXISTS `negocio` (
  `ID` varchar(5) CHARACTER SET latin1 COLLATE latin1_spanish_ci NOT NULL,
  `name` char(65) NOT NULL,
  `building` enum('Watson','Taylor','Painter','Packard') NOT NULL,
  `media_claificacion` decimal(65,0) NOT NULL,
  `day_beign_university` int NOT NULL,
  `day_born` int NOT NULL,
  `year_born` year NOT NULL,
  `day_month` int NOT NULL,
  `day_week` int NOT NULL,
  `icon_born` text CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish2_ci NOT NULL,
  `Insertado` datetime NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `negocio`
--

INSERT INTO `negocio` (`ID`, `name`, `building`, `media_claificacion`, `day_beign_university`, `day_born`, `year_born`, `day_month`, `day_week`, `icon_born`, `Insertado`) VALUES
('34ER5', 'Iñigo Montoya Morales', 'Watson', '75', 12, 23, 0000, 6, 2, '☔', '2022-10-30 12:40:42'),
('87UI4', 'Lara Medina Diaz', 'Painter', '100', 5, 8, 2002, 3, 1, '🌞', '2022-10-30 13:00:17'),
('92CL1', 'Carlos Rodriguez Santiago', 'Packard', '48', 22, 15, 1990, 6, 2, '🌞', '2022-10-30 13:01:36'),
('88DJ3', 'Manuel Gonzalez Hervas', 'Taylor', '66', 2, 8, 2006, 10, 1, '🌞', '2022-10-30 13:06:11');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
