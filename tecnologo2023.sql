-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-05-2023 a las 04:32:48
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tecnologo2023`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `aprendiz`
--

CREATE TABLE `aprendiz` (
  `id` int(11) NOT NULL,
  `Docu` int(11) NOT NULL,
  `Nombreap` varchar(45) NOT NULL,
  `Apellidoap` varchar(45) NOT NULL,
  `Correoap` varchar(45) NOT NULL,
  `Teleap` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `aprendiz`
--

INSERT INTO `aprendiz` (`id`, `Docu`, `Nombreap`, `Apellidoap`, `Correoap`, `Teleap`) VALUES
(32, 789, 'Kevin', 'Jimenez', 'Kevin@gmail.com', 311428),
(34, 103427841, 'Laura', 'Salazar', 'laura@gmail.com', 314468),
(35, 1103424, 'daniela', 'rodriguez', 'rodriguez@gmail.com', 32546);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ficha`
--

CREATE TABLE `ficha` (
  `id` int(11) NOT NULL,
  `codficha` int(11) NOT NULL,
  `cantapre` int(11) NOT NULL,
  `codpro` int(11) NOT NULL,
  `codaprendiz` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `programa`
--

CREATE TABLE `programa` (
  `id` int(11) NOT NULL,
  `codprograma` int(11) NOT NULL,
  `nombrepro` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `programa`
--

INSERT INTO `programa` (`id`, `codprograma`, `nombrepro`) VALUES
(1, 10, 'adso'),
(2, 12345, 'ola'),
(3, 66, 'jnfmn'),
(4, 66, 'jnfmn'),
(5, 66, 'jnfmn'),
(6, 66, 'jnfmn'),
(7, 2532155, 'ADSO'),
(8, 2532155, 'ADSO2023'),
(9, 123, 'adso'),
(10, 123, 'adso'),
(11, 55, '55'),
(12, 55, '55'),
(13, 5566, 'analisis'),
(14, 5566, 'analisis'),
(15, 1223, 'fff'),
(16, 1223, 'fff'),
(17, 1223, 'fff'),
(18, 345, 'desarrollo'),
(19, 55, 'software '),
(20, 6667, 'ANALISIS'),
(21, 678, 'hola'),
(22, 688, 'ttt'),
(23, 123, 'fff');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `aprendiz`
--
ALTER TABLE `aprendiz`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `ficha`
--
ALTER TABLE `ficha`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `programa`
--
ALTER TABLE `programa`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `aprendiz`
--
ALTER TABLE `aprendiz`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- AUTO_INCREMENT de la tabla `ficha`
--
ALTER TABLE `ficha`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `programa`
--
ALTER TABLE `programa`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `ficha`
--
ALTER TABLE `ficha`
  ADD CONSTRAINT `ficha_ibfk_1` FOREIGN KEY (`codpro`) REFERENCES `programa` (`codprograma`),
  ADD CONSTRAINT `ficha_ibfk_2` FOREIGN KEY (`codaprendiz`) REFERENCES `aprendiz` (`Docu`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
