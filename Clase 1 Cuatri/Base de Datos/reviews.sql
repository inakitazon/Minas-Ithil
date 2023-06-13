-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 06-11-2022 a las 13:07:17
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
-- Base de datos: `sergio_viejo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reviews`
--

DROP TABLE IF EXISTS `reviews`;
CREATE TABLE IF NOT EXISTS `reviews` (
  `Lista` int NOT NULL AUTO_INCREMENT,
  `Nombre` text NOT NULL,
  `Director` text NOT NULL,
  `Desarrolladora` enum('Ubisoft','Sony','Devolver Digital','Microsoft','Mojang','Valve','Overkill','Fatshark','Capcom','Konami','Kojima Production','From Software','Rocksteady') CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Fecha de Lanzamiento` date NOT NULL,
  `Valoracion` decimal(65,0) NOT NULL,
  `Representacion` varchar(65) NOT NULL,
  `Caratula` longblob NOT NULL,
  PRIMARY KEY (`Lista`)
) ENGINE=MyISAM AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `reviews`
--

INSERT INTO `reviews` (`Lista`, `Nombre`, `Director`, `Desarrolladora`, `Fecha de Lanzamiento`, `Valoracion`, `Representacion`, `Caratula`) VALUES
(1, 'Assasin Creed II', 'Patrick Plourde', 'Ubisoft', '2009-11-17', '10', '👥', ''),
(2, 'Ratchet & Clank: Before the Nexus', 'Brian Allgeier', 'Sony', '2013-12-19', '8', '🔧', ''),
(3, 'Mother Russia Bleeds', 'Alexanre Muttoni', 'Devolver Digital', '2016-09-05', '9', '💉', ''),
(4, 'Age of Empires IV', 'James Agay', 'Microsoft', '2021-10-28', '6', '🤴', ''),
(5, 'Minecraft', 'Markus Persson', 'Mojang', '2011-11-18', '10', '🟩', ''),
(6, 'CS:GO', 'Jess Cliffe', 'Valve', '2012-08-21', '9', '👳‍', ''),
(7, 'Payday 2', 'Ulf Andersson', 'Valve', '2013-08-13', '8', '💰', ''),
(8, 'Warhammer:Vermintide', 'Joakim Setterberg', 'Fatshark', '2018-03-08', '7', '🐭', ''),
(9, 'Resident Evil 2', 'Noboru Sugimura', 'Capcom', '1998-01-21', '10', '💊', ''),
(10, 'Metal Gear 3', 'Hideo Kojima', 'Konami', '2004-11-17', '10', '🐍', ''),
(11, 'Metal Gear 3', 'Hideo Kojima', 'Konami', '2004-11-17', '10', '🐍', ''),
(12, 'Death Stranding', 'Hideo Kojima', 'Kojima Production', '2019-11-08', '6', '🚶', ''),
(13, 'Dark Souls III', 'Hidetaka Miyazaki', 'From Software', '2016-03-24', '9', '🔥', ''),
(14, 'Batman: Arkham Knight', 'Sefton Hill', 'Rocksteady', '2015-06-23', '9', '🦇', '');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
