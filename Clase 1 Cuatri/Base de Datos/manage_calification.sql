-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:13006
-- Tiempo de generación: 27-11-2022 a las 16:58:38
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
-- Base de datos: `lazaro gear 3`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `manage_calification`
--

DROP TABLE IF EXISTS `manage_calification`;
CREATE TABLE IF NOT EXISTS `manage_calification` (
  `id` int NOT NULL AUTO_INCREMENT,
  `enunciado` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `equivalente_ar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `sintaxis_ar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `query` text NOT NULL,
  `respuesta` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `correcta` text NOT NULL,
  `calification` int NOT NULL,
  `created_in` date NOT NULL,
  `updated_in` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `manage_calification`
--

INSERT INTO `manage_calification` (`id`, `enunciado`, `equivalente_ar`, `sintaxis_ar`, `query`, `respuesta`, `correcta`, `calification`, `created_in`, `updated_in`) VALUES
(1, 'Determine el nombre del estudiante que se haya matriculado en alguna asignatura del departamento de Comp, cuyo nombre empieze con Z. Sci.Asegurese de que no existen nombres duplicados en el resultado.', 'π name.student(σdept_name.student=Comp. Sci.∧name.student=Z%)(student)', '%', 'SELECT `name` FROM student WHERE `dept_name` = \'Comp. Sci.\' AND `name` LIKE\'Z%\'', '2', '2', 10, '0000-00-00', '0000-00-00 00:00:00'),
(2, 'Seleccione el ID del estudiante que ha matriculado asignaturas tanto en Otoño como en Primavera y su ID termina en 46.', 'π ID.takes (σ semester = Spring, Fall ∧ ID.takes = %45)(takes)', '\nDos condiciones de una columna', 'SELECT `ID` FROM takes WHERE `semester` = \'Spring\'*\'Fall\' AND `ID` LIKE \'%45\'', '2', '2', 10, '0000-00-00', '0000-00-00 00:00:00'),
(3, 'Seleccione el Id de estudiante que ha matriculado asignaturas en Primavera y tiene la clase en el edificio Watson.', 'π ID.takes(σsemester.takes=Spring∧Building.section=Watson)(takes⨝section)', 'Join', '\nSELECT `ID` FROM takes\nNATURAL JOIN section\nWHERE `semester` = \'Spring\' AND `Building` = \'Watson\'', '2', '2', 10, '0000-00-00', '0000-00-00 00:00:00'),
(4, 'Encuentre estudiantes que no hayan matriculado ninguna asignatura. ', 'π name.student (σtot_credit.student= 0)(student)', '\nIgualar a un número', 'SELECT `name` FROM student  WHERE `tot_cred` = 0', '1', '1', 10, '0000-00-00', '0000-00-00 00:00:00'),
(5, 'Encuentre la media de créditos de  los estudiantes en los distintos departamentos.', 'π tot_credit.student(σAVG)(student)', '\nAVG', 'SELECT AVG(`tot_cred`) FROM student', '2', '2', 10, '0000-00-00', '0000-00-00 00:00:00');

--
-- Disparadores `manage_calification`
--
DROP TRIGGER IF EXISTS `NOTA_BU`;
DELIMITER $$
CREATE TRIGGER `NOTA_BU` BEFORE UPDATE ON `manage_calification` FOR EACH ROW BEGIN
IF NEW.respuesta = OLD.correcta OR OLD.respuesta = NEW.correcta OR OLD.respuesta = OLD.correcta THEN
SET NEW.`calification` = 10;
END IF;
END
$$
DELIMITER ;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
