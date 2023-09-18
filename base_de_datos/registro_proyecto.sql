-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 18-09-2023 a las 04:12:43
-- Versión del servidor: 8.0.31
-- Versión de PHP: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `registro_proyecto`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historial`
--

DROP TABLE IF EXISTS `historial`;
CREATE TABLE IF NOT EXISTS `historial` (
  `mensaje` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Cedula` int NOT NULL,
  `FECHA` varchar(45) NOT NULL,
  `HORA` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `historial`
--

INSERT INTO `historial` (`mensaje`, `Cedula`, `FECHA`, `HORA`) VALUES
('Fue Registrado el Estudiante con cedula', 932282288, '2023-08-04', '22:05:37 PM'),
('Fue Registrado el Estudiante con cedula', 932282288, '2023-08-04', '22:08:12 PM'),
('Fue Registrado el Estudiante con cedula', 932282288, '2023-08-04', '22:09:17 PM'),
('Fue Registrado el Estudiante con cedula', 932282288, '2023-08-04', '22:10:34 PM'),
('Fue Registrado el Estudiante con cedula', 932282288, '2023-08-04', '22:11:39 PM'),
('Fue Registrado el Estudiante con cedula', 932282288, '2023-08-04', '22:13:04 PM'),
('Fue Registrado el Estudiante con cedula', 932282288, '2023-08-16', '19:51:15 PM'),
('Fue registrado el estudiante con cédula', 932282288, '2023-08-16', '20:03:46 PM'),
('Fue registrado el estudiante con cédula', 932282288, '2023-08-16', '20:25:45 PM'),
('Fue registrado el estudiante con cédula', 932282288, '2023-08-16', '20:27:25 PM'),
('Fue registrado el estudiante con cédula', 932282288, '2023-08-16', '20:29:16 PM'),
('Fue registrado el estudiante con cédula', 932282288, '2023-08-16', '20:31:38 PM'),
('Fue registrado el estudiante con cédula', 932292299, '2023-08-16', '20:40:56 PM'),
('Fue registrado el estudiante con cédula', 932282288, '2023-08-16', '20:56:33 PM'),
('Fue registrado el estudiante con cédula', 932282288, '2023-08-16', '21:03:46 PM'),
('Fue Registrado el Estudiante con cedula', 932282288, '2023-08-22', '20:43:19 PM'),
('Fue Registrado el Estudiante con cedula', 932282281, '2023-08-22', '20:45:26 PM'),
('Fue Registrado el Estudiante con cedula', 932282288, '2023-08-26', '21:56:04 PM'),
('Fue Editado el Estudiante con cedula', 932282288, '2023-08-26', '21:58:13 PM'),
('Fue Eliminado el Estudiante con cedula', 932282288, '2023-08-26', '22:00:13 PM');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE IF NOT EXISTS `usuarios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `pass` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `username`, `pass`, `email`) VALUES
(1, 'admin', '1234', 'eo');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
