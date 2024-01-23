-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-01-2024 a las 09:22:44
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `movieserve`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asientos`
--

CREATE TABLE `asientos` (
  `idAsiento` int(11) NOT NULL,
  `NumAsientos` int(11) NOT NULL,
  `id_Sala` int(11) NOT NULL,
  `id_Reserva` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `idCliente` int(11) NOT NULL,
  `Telefono` varchar(150) NOT NULL,
  `Nombre` varchar(120) NOT NULL,
  `Apellido` varchar(120) NOT NULL,
  `DNI` varchar(9) NOT NULL,
  `Gmail` varchar(180) NOT NULL,
  `id_Sala` int(11) NOT NULL,
  `id_Pelicula` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `peliculas`
--

CREATE TABLE `peliculas` (
  `idPelicula` int(11) NOT NULL,
  `Genero` varchar(120) NOT NULL,
  `Duracion` int(11) NOT NULL,
  `Titulo` varchar(120) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reservas`
--

CREATE TABLE `reservas` (
  `idReserva` int(11) NOT NULL,
  `FechaResrva` date NOT NULL,
  `CantPersonas` int(11) NOT NULL,
  `id_Cliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reservas_pelicula`
--

CREATE TABLE `reservas_pelicula` (
  `idReservas_Pelicula` int(11) NOT NULL,
  `idReserva` int(11) NOT NULL,
  `idPelicula` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reservas_salas`
--

CREATE TABLE `reservas_salas` (
  `idReservas_Salas` int(11) NOT NULL,
  `idReserva` int(11) NOT NULL,
  `idSala` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `salas`
--

CREATE TABLE `salas` (
  `idSala` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `salas_peliculas`
--

CREATE TABLE `salas_peliculas` (
  `idSalas_Peliculas` int(11) NOT NULL,
  `idSala` int(11) NOT NULL,
  `idPelicula` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `asientos`
--
ALTER TABLE `asientos`
  ADD PRIMARY KEY (`idAsiento`),
  ADD KEY `id_Sala` (`id_Sala`),
  ADD KEY `id_Reserva` (`id_Reserva`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`idCliente`),
  ADD KEY `id_Sala` (`id_Sala`),
  ADD KEY `id_Pelicula` (`id_Pelicula`);

--
-- Indices de la tabla `peliculas`
--
ALTER TABLE `peliculas`
  ADD PRIMARY KEY (`idPelicula`);

--
-- Indices de la tabla `reservas`
--
ALTER TABLE `reservas`
  ADD PRIMARY KEY (`idReserva`),
  ADD KEY `id_Cliente` (`id_Cliente`);

--
-- Indices de la tabla `reservas_pelicula`
--
ALTER TABLE `reservas_pelicula`
  ADD PRIMARY KEY (`idReservas_Pelicula`),
  ADD KEY `idPelicula` (`idPelicula`),
  ADD KEY `idReserva` (`idReserva`);

--
-- Indices de la tabla `reservas_salas`
--
ALTER TABLE `reservas_salas`
  ADD PRIMARY KEY (`idReservas_Salas`),
  ADD KEY `idReserva` (`idReserva`),
  ADD KEY `idSala` (`idSala`);

--
-- Indices de la tabla `salas`
--
ALTER TABLE `salas`
  ADD PRIMARY KEY (`idSala`);

--
-- Indices de la tabla `salas_peliculas`
--
ALTER TABLE `salas_peliculas`
  ADD PRIMARY KEY (`idSalas_Peliculas`),
  ADD KEY `idSala` (`idSala`),
  ADD KEY `idPelicula` (`idPelicula`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `asientos`
--
ALTER TABLE `asientos`
  MODIFY `idAsiento` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `peliculas`
--
ALTER TABLE `peliculas`
  MODIFY `idPelicula` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `reservas`
--
ALTER TABLE `reservas`
  MODIFY `idReserva` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `reservas_pelicula`
--
ALTER TABLE `reservas_pelicula`
  MODIFY `idReservas_Pelicula` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `reservas_salas`
--
ALTER TABLE `reservas_salas`
  MODIFY `idReservas_Salas` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `salas`
--
ALTER TABLE `salas`
  MODIFY `idSala` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `salas_peliculas`
--
ALTER TABLE `salas_peliculas`
  MODIFY `idSalas_Peliculas` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `asientos`
--
ALTER TABLE `asientos`
  ADD CONSTRAINT `asientos_ibfk_1` FOREIGN KEY (`id_Sala`) REFERENCES `salas` (`idSala`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `asientos_ibfk_2` FOREIGN KEY (`id_Reserva`) REFERENCES `reservas` (`idReserva`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD CONSTRAINT `clientes_ibfk_1` FOREIGN KEY (`id_Pelicula`) REFERENCES `peliculas` (`idPelicula`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `reservas`
--
ALTER TABLE `reservas`
  ADD CONSTRAINT `reservas_ibfk_1` FOREIGN KEY (`id_Cliente`) REFERENCES `clientes` (`idCliente`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `reservas_pelicula`
--
ALTER TABLE `reservas_pelicula`
  ADD CONSTRAINT `reservas_pelicula_ibfk_1` FOREIGN KEY (`idReserva`) REFERENCES `reservas` (`idReserva`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `reservas_pelicula_ibfk_2` FOREIGN KEY (`idPelicula`) REFERENCES `peliculas` (`idPelicula`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `reservas_salas`
--
ALTER TABLE `reservas_salas`
  ADD CONSTRAINT `reservas_salas_ibfk_1` FOREIGN KEY (`idReserva`) REFERENCES `reservas` (`idReserva`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `reservas_salas_ibfk_2` FOREIGN KEY (`idSala`) REFERENCES `salas` (`idSala`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `salas`
--
ALTER TABLE `salas`
  ADD CONSTRAINT `salas_ibfk_1` FOREIGN KEY (`idSala`) REFERENCES `clientes` (`id_Sala`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `salas_peliculas`
--
ALTER TABLE `salas_peliculas`
  ADD CONSTRAINT `salas_peliculas_ibfk_1` FOREIGN KEY (`idSala`) REFERENCES `salas` (`idSala`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `salas_peliculas_ibfk_2` FOREIGN KEY (`idPelicula`) REFERENCES `peliculas` (`idPelicula`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
