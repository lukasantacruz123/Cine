-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-06-2025 a las 01:22:32
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `cine_db`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asientos_blanca`
--

CREATE TABLE `asientos_blanca` (
  `asiento_id` int(25) NOT NULL,
  `sala_id` int(25) NOT NULL,
  `fila` varchar(25) NOT NULL,
  `numero` int(25) NOT NULL,
  `estado` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `asientos_blanca`
--

INSERT INTO `asientos_blanca` (`asiento_id`, `sala_id`, `fila`, `numero`, `estado`) VALUES
(1, 2, 'A', 1, 'libre'),
(2, 2, 'A', 2, 'libre'),
(3, 2, 'A', 3, 'libre'),
(4, 2, 'A', 4, 'libre'),
(5, 2, 'A', 5, 'libre');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asientos_lilo`
--

CREATE TABLE `asientos_lilo` (
  `asiento_id` int(25) NOT NULL,
  `sala_id` int(25) NOT NULL,
  `fila` varchar(25) NOT NULL,
  `numero` int(25) NOT NULL,
  `estado` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `asientos_lilo`
--

INSERT INTO `asientos_lilo` (`asiento_id`, `sala_id`, `fila`, `numero`, `estado`) VALUES
(1, 4, 'A', 1, 'libre'),
(2, 4, 'A', 2, 'libre'),
(3, 4, 'A', 3, 'libre'),
(4, 4, 'A', 4, 'libre'),
(5, 4, 'A', 5, 'libre');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asientos_mine`
--

CREATE TABLE `asientos_mine` (
  `asiento_id` int(11) NOT NULL,
  `sala_id` int(11) NOT NULL,
  `fila` char(1) NOT NULL,
  `numero` int(11) NOT NULL,
  `estado` varchar(20) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `asientos_mine`
--

INSERT INTO `asientos_mine` (`asiento_id`, `sala_id`, `fila`, `numero`, `estado`, `id`) VALUES
(5, 1, 'A', 5, 'libre', 5),
(1, 1, 'A', 1, 'libre', 6),
(2, 1, 'A', 2, 'libre', 7),
(3, 1, 'A', 3, 'libre', 8),
(4, 1, 'A', 4, 'libre', 9);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asientos_rescate`
--

CREATE TABLE `asientos_rescate` (
  `asiento_id` int(11) NOT NULL,
  `sala_id` int(11) NOT NULL,
  `fila` char(11) NOT NULL,
  `numero` int(11) NOT NULL,
  `estado` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `asientos_rescate`
--

INSERT INTO `asientos_rescate` (`asiento_id`, `sala_id`, `fila`, `numero`, `estado`) VALUES
(1, 3, 'A', 1, 'libre'),
(2, 3, 'A', 2, 'libre'),
(3, 3, 'A', 3, 'libre'),
(4, 3, 'A', 4, 'libre'),
(5, 3, 'A', 5, 'libre');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compras`
--

CREATE TABLE `compras` (
  `id_compra` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `dni` varchar(15) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `metodo_pago` varchar(20) NOT NULL,
  `monto_total` decimal(10,2) NOT NULL,
  `fecha_compra` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `compras`
--

INSERT INTO `compras` (`id_compra`, `nombre`, `apellido`, `dni`, `email`, `metodo_pago`, `monto_total`, `fecha_compra`) VALUES
(58, 'tati', 'rengifo', '12313', 'tatiana123@gmail.com', 'Debito', 10800.00, '2025-06-16 18:37:21'),
(66, 'tati', 'rengifo', '48287189', 'tatiana123@gmail.com', 'Credito', 10800.00, '2025-06-16 20:35:37'),
(67, 'asd', 'dasfa', '12313', 'lukasantacruz@gmail.com', 'Credito', 10800.00, '2025-06-16 20:53:53'),
(68, 'luka', 'dasfa', '54155213214', 'lukasantacruz@gmail.com', 'Debito', 23400.00, '2025-06-16 21:59:25'),
(69, 'luka', 'dasfa', '12313', 'tatiana123@gmail.com', 'Credito', 11000.00, '2025-06-16 22:00:18'),
(70, 'dsacas', 'rengifo', '42412512', 'fsagaga@gmail.com', 'Debito', 3500.00, '2025-06-16 22:01:03'),
(71, 'tati', 'rengifo', '4124124', 'tatiana123@gmail.com', 'Credito', 21100.00, '2025-06-16 22:11:04'),
(72, 'tati', 'rengifo', '421421', 'tatiana123@gmail.com', 'Transferencia', 17100.00, '2025-06-16 22:23:34'),
(73, 'fsssdf', 'fsdfds', '421415', 'tatiana123@gmail.com', 'Credito', 14800.00, '2025-06-17 02:24:07'),
(74, 'luka', 'rengifo', '48287189', 'cardoteleredijido@gmail.com', 'Debito', 14800.00, '2025-06-17 02:48:20'),
(75, 'luka', 'rengifo', '423562366432', 'benjaminsantacruz542@gmail.com', 'Debito', 14800.00, '2025-06-17 02:50:26'),
(76, 'tati', 'rengifo', '48287189', 'tatiana123@gmail.com', 'Debito', 10800.00, '2025-06-17 04:11:17');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `funcion`
--

CREATE TABLE `funcion` (
  `sala_id` int(25) NOT NULL,
  `Fecha` date NOT NULL,
  `Horario` time(6) NOT NULL,
  `Precio` int(25) NOT NULL,
  `id` int(11) NOT NULL,
  `Pelicula` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `funcion`
--

INSERT INTO `funcion` (`sala_id`, `Fecha`, `Horario`, `Precio`, `id`, `Pelicula`) VALUES
(1, '2025-06-09', '12:00:00.000000', 7300, 2, 'Minecraft'),
(1, '2025-06-10', '14:30:00.000000', 7300, 3, 'Minecraft'),
(1, '2025-06-11', '17:00:00.000000', 7300, 5, 'Minecraft'),
(1, '2025-06-12', '19:35:00.000000', 7300, 6, 'Minecraft'),
(1, '2025-06-09', '14:30:00.000000', 7300, 7, 'Minecraft'),
(1, '2025-06-09', '17:00:00.000000', 7300, 8, 'Minecraft'),
(1, '2025-06-09', '19:35:00.000000', 7300, 9, 'Minecraft'),
(1, '2025-06-10', '12:00:00.000000', 7300, 10, 'Minecraft'),
(1, '2025-06-10', '17:00:00.000000', 7300, 11, 'Minecraft'),
(1, '2025-06-10', '19:35:00.000000', 7300, 12, 'Minecraft'),
(1, '2025-06-11', '12:00:00.000000', 7300, 13, 'Minecraft'),
(1, '2025-06-11', '14:30:00.000000', 7300, 14, 'Minecraft'),
(1, '2025-06-11', '19:35:00.000000', 7300, 15, 'Minecraft');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ticket`
--

CREATE TABLE `ticket` (
  `id_ticket` int(11) NOT NULL,
  `monto_total` decimal(10,2) NOT NULL,
  `butacas` text NOT NULL,
  `combos` text DEFAULT NULL,
  `fecha_ticket` timestamp NOT NULL DEFAULT current_timestamp(),
  `pelicula` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ticket`
--

INSERT INTO `ticket` (`id_ticket`, `monto_total`, `butacas`, `combos`, `fecha_ticket`, `pelicula`) VALUES
(17, 7500.00, '', '{\"Pop Mega Recargable\":{\"precio\":7500,\"cantidad\":1}}', '2025-06-17 02:23:48', ''),
(18, 7500.00, '', '{\"Pop Mega Recargable\":{\"precio\":7500,\"cantidad\":1}}', '2025-06-17 02:31:15', ''),
(19, 7500.00, '', '{\"Pop Mega Recargable\":{\"precio\":7500,\"cantidad\":1}}', '2025-06-17 02:33:14', ''),
(20, 7500.00, '', '{\"Pop Mega Recargable\":{\"precio\":7500,\"cantidad\":1}}', '2025-06-17 02:47:46', ''),
(21, 7500.00, '', '{\"Pop Mega Recargable\":{\"precio\":7500,\"cantidad\":1}}', '2025-06-17 02:49:12', ''),
(22, 7500.00, '', '{\"Pop Mega Recargable\":{\"precio\":7500,\"cantidad\":1}}', '2025-06-17 02:50:03', ''),
(23, 3500.00, '', '{\"Pop Mega Individual\":{\"precio\":3500,\"cantidad\":1}}', '2025-06-17 04:10:57', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `usuario` varchar(100) NOT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `usuario`, `password`) VALUES
(1, 'tatiana123@gmail.com', 'tati123'),
(2, 'luka', 'luka123'),
(3, 'micaela', '123'),
(4, 'laia', '123'),
(5, 'gsdgs', '12345'),
(6, 'Lukaaa', '12345'),
(8, 'fafsd', '123'),
(9, '11111', '2121e3'),
(10, 'leandro', '123'),
(11, 'tatiana', '123');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `asientos_blanca`
--
ALTER TABLE `asientos_blanca`
  ADD PRIMARY KEY (`asiento_id`);

--
-- Indices de la tabla `asientos_lilo`
--
ALTER TABLE `asientos_lilo`
  ADD PRIMARY KEY (`asiento_id`);

--
-- Indices de la tabla `asientos_mine`
--
ALTER TABLE `asientos_mine`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `asientos_rescate`
--
ALTER TABLE `asientos_rescate`
  ADD PRIMARY KEY (`asiento_id`);

--
-- Indices de la tabla `compras`
--
ALTER TABLE `compras`
  ADD PRIMARY KEY (`id_compra`);

--
-- Indices de la tabla `funcion`
--
ALTER TABLE `funcion`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `ticket`
--
ALTER TABLE `ticket`
  ADD PRIMARY KEY (`id_ticket`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `nombre_usuario` (`usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `asientos_blanca`
--
ALTER TABLE `asientos_blanca`
  MODIFY `asiento_id` int(25) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `asientos_lilo`
--
ALTER TABLE `asientos_lilo`
  MODIFY `asiento_id` int(25) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `asientos_mine`
--
ALTER TABLE `asientos_mine`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `asientos_rescate`
--
ALTER TABLE `asientos_rescate`
  MODIFY `asiento_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `compras`
--
ALTER TABLE `compras`
  MODIFY `id_compra` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=77;

--
-- AUTO_INCREMENT de la tabla `funcion`
--
ALTER TABLE `funcion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de la tabla `ticket`
--
ALTER TABLE `ticket`
  MODIFY `id_ticket` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
